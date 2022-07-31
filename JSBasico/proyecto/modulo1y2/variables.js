// constantes
const constante = "constante";

console.log(constante);

// difencia var - let 
// var afecta a todo el codigo
// let afecta solo donde esta declarado

var variable = "Variable";
for (var i = 0; i < 3; i++){
    var variable = "variable 2";
}
console.log(variable);


let variableLet = "Variable let";
for (var i = 0; i < 3; i++){
    let variableLet = "variable let  2";
}
console.log(variableLet);
