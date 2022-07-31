/*
Exercise One

Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:
    - Tu nombre (string)
    - Tu edad (number)
    - ¿Eres desarrollador? (boolean)
    - Tu fecha de nacimiento (Date)
    - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)
*/

const newList = [
    "Gaston",
    23,
    true,
    new Date(),
    book = {
        title: "Clean Code",
        author: "Rober C. Martin Series",
        date: new Date("July 22 2008"),
        url: "https://github.com/jnguyen095/clean-code/blob/master/Clean.Code.A.Handbook.of.Agile.Software.Craftsmanship.pdf",
    }
]
console.log(
    "title: " + book.title,
    "\nauthor: " + book.author,
    "\nfirst printing: " + book.date,
    "\nget the book here -> " + book.url
    );

console.log(newList);