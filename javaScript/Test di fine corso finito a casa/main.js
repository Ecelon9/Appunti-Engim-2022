console.log("ENGIM FINAL TEST 2023");

// OBBIETTIVO DEL TEST:
// Creare un layout simile a quelo indicato nell immagine layout.png utilizzando i dati forniti dall api 'https://reqres.in/api/users'

// PARTE A1 (obbligatoria) (50 punti)
// Effetture una richiesta http all api 'https://reqres.in/api/users'
// stampare i dati degli utenti ricevuti dal server in console

// PARTE A2 (obbligatoria) (20 punti)
// Utilizzando i dati ricevuti dal server nel punto precedente:
// Per ogni utente ricevuto dal server, creare una card contenente un elemento per ogni proprietà dell'utente:
// first_name, last_name, email, id, avatar

fetch('https://reqres.in/api/users')
    .then(function (response) {
        if (response.status === 200) {
            return response.json()

        }
        else {
            console.log('Error')

        }
    })
    .then(function (data) {
        //parte A1
        console.log(data);

        //parte A2
        let riga = document.getElementById("riga")

        data.data.forEach(element => {
           creaColonna(riga, element);
           
        });

        riga.append(riga);

    });

function creaColonna(section, element) {
    let colonna = document.createElement("div")
    colonna.classList = "colonna"
    colonna.style = "display: flex; flex-direction: column; justify-content: center; align-items: center; border-style: groove; border-radius: 20px; padding: 20px; background-color: white"

    let testo = document.createElement("div")
    testo.style = "display: flex; flex-direction: row; align-items: center;"

    let paragrafoId = document.createElement("p")
    paragrafoId.textContent = element["id"];
    paragrafoId.style = "margin: 10px; padding: 15px; background-color: gray; border-radius: 50%; display: inline-block;"

    testo.append(paragrafoId);

    let divNomeEmail = document.createElement("div");
    divNomeEmail.stiyle = "display: flex; flex-direction: column; align-items: center;"

    let nome = document.createElement("h3")
    nome.textContent = element["first_name"] + " " + element["last_name"];
    let mail = document.createElement("h3")
    mail.textContent = element["email"];
    nome.style = "margin: auto;"
    mail.style = "margin: auto;"


    divNomeEmail.append(nome, mail);
    testo.append(divNomeEmail);
    colonna.append(testo);

    let img = document.createElement("img")
    img.src = element["avatar"];
    img.alt = "";
    img.style = "width: 250px; height: 250px;"
    colonna.append(img);

    let contatti = document.createElement("a")
    contatti.href = "mailto:useremail@gmail.com"
    contatti.textContent = "Contatti"
    contatti.style = "margin-top: 20px; text-decoration: auto; color: blue;"
    colonna.append(contatti)

    section.append(colonna)

}


// PARTE B (Facoltativa) (10 punti)
// In ogni card creare un elemento cliccabile con un mailto che apra il mailer di default con l'email dell'utente preimpostata
// ES: <a href="mailto:useremail@gmail.com">Contact</a>

// PARTE C (Facoltativa) (20 punti)
// Ripodurre il layout presente nell immagine layout.png presente in questa directory
// La scritta contact presente in ogni card deve essere cliccabile e eseguire il mailto con l email dell utente

// Parte D (Facoltativa) (20 punti)
// Creare una paginazione che permetta di visualizzare gli utenti successivi/precedenti utilizzando 2 bottoni

// NOTE:
// IL massimo punteggio raggiungibile è: 100 punti.
// Le parti A1 e A2 sono obbligatorie, le altre sono facoltative e possono essere svolte indipendentemente tra loro.
// Se non riesci a completare una parte facoltativa, puoi comunque provare a completare le altre.
// Puoi ottenere punti anche se non completi al 100% una parte per cui consiglio di provare comunque.


