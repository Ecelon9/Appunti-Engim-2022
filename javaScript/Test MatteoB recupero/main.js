console.log("ENGIM FINAL TEST 2023 (recupero)");

// OBBIETTIVO DEL TEST:
// Creare un layout simile a quelo indicato nell immagine layout.png utilizzando i dati forniti dall api 'https://reqres.in/api/users'

// PARTE A1 (obbligatoria) (50 punti)
// Effetture una richiesta http all api 'https://reqres.in/api/users'
// stampare i dati degli utenti ricevuti dal server in console

// PARTE A2 (obbligatoria) (20 punti)
// Utilizzando i dati ricevuti dal server nel punto precedente:
// Per ogni utente ricevuto dal server, creare una card contenente un elemento per le seguenti proprietà dell'utente:
// first_name, last_name, email, avatar

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
        let griglia = document.getElementsByClassName("container")

        data.data.forEach(element => {
            creaCard(griglia[0], element);

        });

    });

function creaCard(section, element) {
    let card = document.createElement("div")
    card.className = "card"
    card.classList = "card"
    card.onclick = select
    //card.addEventListener("click", select);

    let img = document.createElement("img")
    img.className = "avatar"
    img.src = element["avatar"];
    img.alt = "";
    card.append(img);

    let info = document.createElement("div")
    info.className = "info"

    let nome = document.createElement("h3")
    nome.className = "name"
    nome.textContent = element["first_name"] + " " + element["last_name"];
    let mail = document.createElement("h3")
    mail.className = "email"
    mail.textContent = element["email"];

    info.append(nome, mail);

    let cardFooter = document.createElement("footer");
    cardFooter.tagName = "footer"

    let contatti = document.createElement("a")
    contatti.className = "contact"
    contatti.href = "mailto:" + element["email"] //Parte B
    contatti.textContent = "Contatti"

    cardFooter.append(contatti)
    info.append(cardFooter)
    card.append(info);

    section.append(card);


}

function select() {
    let check = document.getElementsByClassName("card");

    if (!this.className.includes("selected")) {
        for (let i = 0; i < check.length; i++) {
            if (check[i].className.includes("selected")) {
                check[i].classList.remove("selected")

            }
        }
        this.classList.add("selected")

    } else {
        for (let i = 0; i < check.length; i++) {
            if (check[i].className.includes("selected")) {
                check[i].classList.remove("selected")

            }
        }
    }

}


// PARTE B (Facoltativa) (10 punti)
// In ogni card creare un elemento cliccabile con un mailto che apra il mailer di default con l'email dell'utente preimpostata
// ES: <a href="mailto:useremail@gmail.com">Contact</a>

// PARTE C (Facoltativa) (20 punti)
// Ripodurre il layout presente nell immagine layout.png presente in questa directory
// Il bottone presente in ogni card deve essere cliccabile e eseguire il mailto con l email dell utente

// Parte D (Facoltativa) (20 punti)
// Creare una paginazione che permetta di visualizzare i 6 utenti successivi e precedenti utilizzando 2 bottoni

// Parte E (Facoltativa) (20 punti)
// Al click su una card, la card diventa selezionata e cambia sitle. Se si clicca su una card selezionata, la card torna allo stato iniziale.
// al massimo ci puo essere una sola card selezionata per volta.
// puoi utilizzare la classe .selected per gestire lo stato selezionato

// NOTE:
// IL massimo punteggio raggiungibile è: 100 punti.
// Le parti A1 e A2 sono obbligatorie, le altre sono facoltative e possono essere svolte indipendentemente tra loro.
// Se non riesci a completare una parte facoltativa, puoi comunque provare a completare le altre.
// Puoi ottenere punti anche se non completi al 100% una parte per cui consiglio di provare comunque.


