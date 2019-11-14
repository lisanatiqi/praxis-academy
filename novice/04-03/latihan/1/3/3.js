try {

    alert('Start of try runs'); // (1) <--

    lalala; // error, variale is not defened!

    alert('End of try (never reached)'); // (2)

} catch(err) {

    alert('Error has occured!'); // (3) <--
    
}