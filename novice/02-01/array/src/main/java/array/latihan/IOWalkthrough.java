// IO is just a container to defer a computation (lazy), with the intention
// to encapsulate computations that either consume and/or produce side-effects
// the computation is not (yet) executed on creation hence it can be trated
// like a value

final IO<Unit> askName = () -> {
    System.out.println("Hai, What's your name?");
    return Unit.unit();
};

// fj.data.IOFunctions contains a lot of convenience functions regarding IO, the
// above example could be rewritten with IOFunction.stdoutPrintln
// we now create an IO value to prompt for the name if executed

IO<Unit> askAndPromptName = IOFunction.append(askName, PromptName);

// now we create an IO value to read a line from stdin

final IO<String> readName = () -> new BufferedReader(new InputStreamReader(System.in)).readLine();

// this is the same as IOFunctions.stdinReadLine()

// now we create a function wich takes a string, upper case it and creates
// an IO value that would print the upper cased string if executed

final F<String, IO<Unit>> upperCaseAndPrint = F1Functions.<String, IO<Unit>, String>o(IOFunction::stdoutPrintln).f(String::toUpperCase);

// we now want to compose reading the name with printing it, for that we need to
// have access to the runtime value that is retuened when the
// IO value for read is executed, hence we use fj.data.IOFunctions.bind instead
// of fj.data.IOFunctions.append

final IO<Unit> readAndPrintUpperCaseName = IOFunctions.bind(readName, UpperCaseAndPrint);

// so append is really just a specialised form of bind, ignoring the runtime
// value of the IO execution that was composed before us

final IO<Unit> program = IOFunctions.bind(askAndPromptname, Ignored -> readAndPrintUpperCasedName);

// this is the same as writing IOFunctions.append(askAndPromptName, readAndPrintUpperCasedName)

// we have recorded the entire program, but have not run anything yet
// now we get to the small dirty part at the end of our program where we actually
// execute it

// we can either choose to just call program.run(), which allows the execution to escape
// or we use safe to receive an fj.data.Either with the potential exception on the left side

toSafeValidation(program).run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });

// doing function composition like this can be quite cumbersome, since you will end
// up nesting parenthesis unless you flatten it out by
// assigning the functions to variables like above, but you can use the fj.F1W
// syntax wrapper for composing single-argument functions and fj.data.IOW
// for composing IO values instead, the entire program can be written like so:

IOW.lift(stdoutPrintln("What's your name again?"))
        .append(stdoutPrint("Name : "))
        .append(stdinReadLine())
        .bind(F1W.lift((String s) -> s.toUpperCase()))
        .andThen(IOFunctions::stdoutPrintln)
        .safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });