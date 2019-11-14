let json = '{ "age":30 }'; // incomplete data

try {

    let user = JSON.parse(json); // <-- no errors

    if (!user.name) {
        throw new SyntaxError("Incomplete data: no name"); // (*)
    }

    alert( user.name );

} catch(e) {
    alert( "JSON Error: " + e.message ); // JSON Error: INcomplete data: no name
}