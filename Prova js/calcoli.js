/* calcoli per stampante */

let baseFrame = 72; //dev'essere pari per la spaziatura, e va aggiunto il bordo da entrambi i lati;
let altezzaFrame = 46; 

//trova centro di lavoro e numero di pistoni

let numeroPistoniPerBaseFrame = baseFrame /2;
let centroZonaLavorabile = (altezzaFrame /2) -2//il saldatore;

console.log("Sulla base del frame servono " + numeroPistoniPerBaseFrame + " pistoni.");
console.log("e la zona lavorabile è " + centroZonaLavorabile + " blocchi.");

//suddividi zona lavorabile per l'estensione dei pistoni

let numeroPistoniRitratti = centroZonaLavorabile / 6;
   
console.log("Dato che i pistoni hanno una base di 2 blocchi e si estendono di 4") 
console.log("più il saldatore al centro lungo 2, servono " + numeroPistoniRitratti + " pistoni per lato.");
console.log("Quindi la zona non lavorabile è di " + ((numeroPistoniRitratti *2) +2) + " blocchi, per lato.");

