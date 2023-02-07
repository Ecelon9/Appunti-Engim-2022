
let immagini = [
    "https://media.contentapi.ea.com/content/dam/eacom/dead-space/images/2022/10/dead-space-featured-image.adapt.crop191x100.1200w.",
    "https://media-assets.wired.it/photos/63d7428d043886780ac8e5f5/master/w_1920,h_1080,c_limit/DeadSpace_Remake.jpg",
    "https://www.spaziogames.it/images/images/2022/10/dead-space-51429.768x432.jpg"
];

let sfondo = document.getElementById("immagine");

let i = 0;

function cambio() {
    if(i >= immagini.length) {
        i = 0;

    }
    sfondo.src = immagini[i];
    i++;

}

setInterval(cambio, 4000);

