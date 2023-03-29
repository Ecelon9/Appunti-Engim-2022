/*********** ESERCIZIO LEZIONE 5 ***********/

// DESCRIZIONE:
// Nella serie "Il trono di spade" ai figli illegittimi viene assengnato un congnome standard, specifico della regione in cui sono nati.
// Es: nel NORD tutti i figli illegittimi hanno cognome 'Snow'.
// Modificare in questo file la funzione fullName (analoga alla funzione nomeCompleto vista a lezione) di modo che
// se alla funzione non viene passato il cognome venga utilizzato quello in uso nella regione corrispondente.
// Nella funzione Trovate un oggetto (bastardNamesByRegion) che ha come chiave il nome della regione
// e come valore il cognome assegnato di figli illegittimi nati in quella regione.

// DETTAGLI:
// nel caso in cui cognome non sia definito o sia null:
//   Controlla se nell'oggetto bastardNamesByRegion esiste una chiave uguale al valore di regione
//   se esiste usa il valore corripondente come cognome,
//   se non esite usa 'Doe' come congnome.
// nel caso in cui nome non sia definito o sia null usare 'John' come nome.

// ESEMPI:
// fullName(null, null, 'North') dovrebbe restituire 'John Snow'
// fullName() dovrebbe restituire 'John Doe'
// fullName(null, 'Wayne') dovrebbe restituire 'John Wayne'
// fullName('Bruce', 'Wayne') dovrebbe restituire 'Bruce Wayne'

function fullName(nome, cognome, regione){

    let bastardNamesByRegion = {
        'Reach': 'Flowers',
        'Westerlands': 'Hill',
        'Iron Islands': 'Pyke',
        'Riverlands': 'Rivers',
        'Dorne': 'Sand',
        'North': 'Snow',
        'Arryn': 'Stone',
        'Stormlands': 'Storm',
        'Crownlands': 'Waters',
        'undefined': 'Doe'
    }

    if (nome == undefined || nome == null) {
        nome = "John";

    } 

    if (bastardNamesByRegion != undefined) {
        if(cognome == undefined || cognome == null) {
            cognome = bastardNamesByRegion[regione];
    
        } 
    } else {
        console.log("Regione insesistente.");
        congome = "Doe";

    }
    
    return nome + ' ' + cognome
}


fullName(null, null, 'North');
fullName();
fullName(null, 'Wayne');
fullName('Bruce', 'Wayne');

