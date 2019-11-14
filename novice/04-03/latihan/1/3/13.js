let json = '{ "age": 30 }'; // incomplete daata
try {

    let user = JSON.parse(json);
    if (!user.name) {
        throw new SyntaxError("Incomplete data: no name");
    }

    blabla(); // unexpected Error

    alert( user.name );

} catch(e) {

    if (e.name == "SyntaxError") {
        alert( "JSON Error: " + e.message );
    } else {
        throw e; // rethrow (*)
    }
}