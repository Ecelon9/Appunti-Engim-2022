

// carosello

let immagini = [
    "https://media.contentapi.ea.com/content/dam/eacom/dead-space/images/2022/10/dead-space-featured-image.adapt.crop191x100.1200w.",
    "https://media-assets.wired.it/photos/63d7428d043886780ac8e5f5/master/w_1920,h_1080,c_limit/DeadSpace_Remake.jpg",
    "https://www.spaziogames.it/images/images/2022/10/dead-space-51429.768x432.jpg"
];

let sfondo = document.getElementById("immagine");

sfondo.style.width = "100%";
sfondo.style.maxHeight = "800px";

let i = 0;

function cambio() {
    if(i >= immagini.length) {
        i = 0;

    }
    sfondo.src = immagini[i];
    i++;

}

setInterval(cambio, 4000);


/* ===================================================================================================== */


//Creare un paragrafo con il testo "ciao engim" ed inserirlo nel div con id uguale a "hero"

let paragrafo = document.createElement("p");

paragrafo.textContent = "Ciao Engim!";

let contenitore = document.getElementById("hero");

contenitore.append(paragrafo);


// creo un nuovo elemento e lo appendo a body

let body = document.getElementsByTagName("body"); //restituisce un array
//console.log(body) 

let nuovoCont = document.createElement("div");

nuovoCont.className = "contenuto";

nuovoCont.append(document.createElement("p").className = "testo");

body[0].append(nuovoCont.getElementsByClassName("testo").textContent = "Hello There!");
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

let pulsante = document.getElementById("toggle");

pulsante.addEventListener("click", function() {
    document.getElementById("content").style.display = "block"
});





