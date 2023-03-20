
/*
Vediamo come trattare i dati utente:

Utilizzando i metodi GET e POST, possiamo ricevere o inviare dei dati, facendo una richiesta
*/

fetch("https://reqres.in/api/users", {      //API che contiene la lista di utenti
    method: "POST",                         //il tipo di metodo 
    body: JSON.stringify({ a: 1, b: 1 })

}
)

    .then((response) => response.json())          //Qui riceviamo il tipo di risposta dal server 
    .then((data) => console.log(data))            //e poi mostriamo i dati in console

/*
Quando dobbiamo inviare o ricevere dati si usa sempre il formato JSON
*/

let newUser = {
    mail: "pippo@qualcosa.it",
    first_name: "pippo",
    last_name: "pluto",
    avatar: "img"
}

fetch("https://reqres.in/api/users", {
    method: "POST"

}
)
    .then((response) => response.json())


/*
da un form html si raccolgono i dati utente e quando viene submittato, un action all'interno del form
punta ad un file che deve ricevere i dati (in formato json), preoccuparsi della connessione col DB
e inviare una query SQL con i dati ricevuti - controllare se esistono nel DB e a quel punto, in base
alla risposta, ricaricare la pagina con la risposta ricevuta dal DB
*/


