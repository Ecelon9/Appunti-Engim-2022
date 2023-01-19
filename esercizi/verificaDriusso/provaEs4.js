let jsonInput = [
    { id: 1, studente: "pippo", italiano: 9, storia: 5, geografia: 6, informatica: 8 },
    { id: 1, studente: "pluto", italiano: 4, storia: 2, geografia: 9, informatica: 3 },
    { id: 1, studente: "paperino", italiano: 6, storia: 9, geografia: 4, informatica: 7 },
    { id: 1, studente: "minnie", italiano: 7, storia: 7, geografia: 8, informatica: 6 },
    { id: 1, studente: "paperina", italiano: 4, storia: 6, geografia: 8, informatica: 8 },
];

let jsonOutput = []

function avviaValutazione() {

    let i = 0;

    if (i == jsonInput.lenght) {
        function prossimoStudente() {
            let studente;

            for (let i = 0; i < jsonInput.lenght; i++) {

                studente = jsonInput[i];

            }
            return studente
            prossimaMateria(studente)

        }


        function prossimaMateria() {

            let materia = [studente.italiano, studente.storia, studente.geografia, studente.informatica];

            for (let i = 0; i < materia.lenght; i++) {

                let materiaDaValutare = materia[i]

            }

            return materiaDaValutare;
            valutazione(materiaDaValutare)

        }


        function valutazione() {
            prossimoStudente(jsonInput)
            i++;



            let sufficienze;
            let insufficienze;

            if (materiaDaValutare >= 6) {
                sufficienze++;

            } else {
                insufficienze++;
            }

            let studenteValutato = {
                nomeStud: studente.studente,
                numero_materie_suff: sufficienze,
                numero_materie_insuff: insufficienze
            };

                jsonOutput = studenteValutato; //Sistemare la costruzione del Json

        }
    }
}

avviaValutazione(jsonInput)

console.log(jsonOutput)

