let json = '{ "age": 30 }'; // Incomplete data

try {
    user = JSON.parse(json); // <-- forgot to put "let" before user

    // ...
} catch(err) {
    alert("JSON Error: "); // JSON Error: ReferenceError: user is not defined
    // (no JSON Error actually)
}