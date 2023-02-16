
let pulsante = document.getElementById("invia");

pulsante.addEventListener("click", log);


let nome = document.getElementById("nome");

let psw = document.getElementById("password");

let box = document.getElementById("box");

box.style = "display: none";


function log() {
    let nome = document.getElementById("nome").value;
    let psw = document.getElementById("password").value;

    box.style = "display: block";

    box.value = "Nome inserito: " + nome + "      Password inserita: " + psw;

    nome = document.getElementById("nome").value = "";
    psw = document.getElementById("password").value = "";
}

