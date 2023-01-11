
/*
BATTAGLIA NAVALE:

valore caselle:
arrProprio
0 (undefined) cella vuota
1 nave posizionata
2 nave affondata
3 sparata

arrAvv
0 undefined
1 colpita
2 affondata

*/

// Creare i giocatori:

let jPlay1 = {
    arrProprio : [[]],
    arrAvversario : [[]],
    naviColpite : 0 
}

let jPlay2 = {
    arrProprio : [[]],
    arrAvversario : [[]],
    naviColpite : 0 
}

let naviTotali = 5

/*
tempo = ?
tempo turno = ?
*/

// Posiziona navi giocatore 1 (0,0 2,1 3,5 4,2 5,5)

/* 
valorizzare arrProprio in base alle posizoni
*/

let coordinateG1 = [[0,0], [2,1], [3,5], [4,2], [5,5]];

let coordinateG2 = [[0,1], [3,2], [4,2], [4,3], [5,5]];

function posiziona(giocatoreCorrente, arrCoord) {

    for (let i = 0; i < arrCoord.length; i++) {
        for (let j = 0; j < i.length; j++) {
        giocatoreCorrente.arrProprio[i][j] = 1
        
        }
        
    }


}


posiziona(jPlay1, coordinateG1)

console.log(jPlay1.arrProprio)