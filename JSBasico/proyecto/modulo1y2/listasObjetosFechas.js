// listas, arrays, arreglos
const listaNum = [1,2,3,4];
const listaRandom = [1, "string", 'a', null]; 
const listaNueva = new Array();
listaNueva.push(1, "string", 'a', null);

console.log("Lista nueva " + listaNueva, 
            "\nLista num " + listaNum, 
            "\nLista Random " + listaRandom);


// objetos

/*
cuando se define como constante, lo que no se puede cambiar es el tipo, no se puede tener
const auto = "Corsa"
Pero si se puede modificar el contenido, las propiedades del objeto.

*/
const auto = {
    modelo: "corsa",
    puertas: 5,
    motor: "v8",
    asientos: ["as1", "as2", "as3", "as4", "as5"],
    ventilacion: {
        tipo: "frio",
        marca: "ventilacion",
        modelo: 2022
    }
}
auto.anyo = 2020;
console.log(auto.anyo);
console.log(auto.modelo);
console.log(auto.asientos);
console.log(auto.ventilacion.tipo);

// fechas
// librerias Moment.js
const ahora = new Date();
console.log(ahora);

const dia = ahora.getDate();
const mes = ahora.getMonth();
const anio = ahora.getFullYear();

console.log(dia, mes, anio);