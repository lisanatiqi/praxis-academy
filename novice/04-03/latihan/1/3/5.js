try {
    setTimeout(function() {
        noSuchVariable; // scrpt will die here
    }, 1000);
} catch (e) {
    alert( "won't work" );
}