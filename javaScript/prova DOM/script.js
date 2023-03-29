

// carosello

let immagini = [
    "https://static.mondoxbox.com/shotsnw/150/150209.jpg",
    "https://media-assets.wired.it/photos/63d7428d043886780ac8e5f5/master/w_1920,h_1080,c_limit/DeadSpace_Remake.jpg",
    "https://www.gameinformer.com/s3/files/styles/body_default/s3/legacy-images/imagefeed/Dead%20Space%202%3A%20The%20Evolution%20Of%20A%20Necromorph/8357.banner.jpg"
];

let sfondo = document.getElementById("immagine");

sfondo.style.width = "80%";
sfondo.style.margin = "5%";
sfondo.src = "https://static.mondoxbox.com/shotsnw/150/150209.jpg";

let i = 1;

function cambio() {
    if(i >= immagini.length) {
        i = 0;

    }
    sfondo.src = immagini[i];
    i++;

}

setInterval(cambio, 3000);


/* ===================================================================================================== */


//Creare un paragrafo con il testo "ciao engim" ed inserirlo nel div con id uguale a "hero"

let paragrafo = document.createElement("p");

paragrafo.textContent = "Ciao Engim!";

let contenitore = document.getElementById("hero");

contenitore.append(paragrafo);


// creo un nuovo elemento e lo appendo a body

let body = document.getElementsByTagName("body"); //restituisce un array
//console.log(body) 
body[0].style.backgroundColor = "lightgray";

let nuovoCont = document.createElement("div");

nuovoCont.className = "contenuto";

nuovoCont.append(document.createElement("p").className = "testo");

body[0].append(nuovoCont.getElementsByClassName("testo").textContent = "General Kenobi!");
//body[0].prepend(nuovoCont.getElementsByClassName("testo").textContent = "Hello There!");

/* ===================================================================================================== */

//clonare un elemento

let nuovoP = nuovoCont.cloneNode(true) 
//inserendo true come paramentro, prende tutti i figli e il loro stile al suo interno

//console.log(nuovoP)

nuovoP.className = "nuovoTesto";

nuovoP.textContent = "Ciao Engim, sono l'elemento clonato!"

nuovoP.style.color = "red";

nuovoP.style.fontWeight = "bolder";

body[0].prepend(nuovoP);

/* ===================================================================================================== */

let immagine = document.getElementById("immagine").style;

immagine.display = "none";

let pulsante = document.getElementById("toggle");

pulsante.style.width = "200px";
pulsante.style.height = "40px";
pulsante.style.borderRadius = "20px";
pulsante.style.backgroundColor = "darkred";
pulsante.style.color = "orange";

/*
let stilePulsante = {
    "width" : "200px",
    "height" : "40px",
    "borderRadius" : "20px",
    "backgroundColor" : "darkred",
    "color" : "orange"
}
console.log(stilePulsante)

pulsante.style = stilePulsante;

pulsante.className = "stilePulsante";
*/

function press() {
    immagine.display = "block";

}

function release() {
    immagine.display = "none";

}

function fix() {
    if (immagine.display == "none") {
        immagine.display = "block";

    } else {
        immagine.display = "none";

    }
}







