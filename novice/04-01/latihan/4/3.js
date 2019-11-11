var s = ""; // string
var n = 0; // number
var b = false // boolean
var sn = Symbol() // symbol
var a = []; // array
var o = {}; // object
var f = function () { } // function

console.log('typeof s.constructor ==> ', typeof s.constructor, ', name ==> ', s.constructor.name);
console.log('typeof n.constructor ==> ', typeof n.constructor, ', name ==> ', n.constructor.name);
console.log('typeof b.constructor ==> ', typeof b.constructor, ', name ==> ', b.constructor.name);
console.log('typeof sn.constructor ==> ', typeof sn.constructor, ', name ==> ', sn.constructor.name);
console.log('typeof a.constructor ==> ', typeof a.constructor, ', name ==> ', a.constructor.name);
console.log('typeof o.constructor ==> ', typeof o.constructor, ', name ==> ', o.constructor.name);
console.log('typeof f.constructor ==> ', typeof f.constructor, ', name ==> ', f.constructor.name);