
/*
Loggare in console tutti gli elementi di un array
1 elemento per riga
se order è minore di 0 loggare gli elementi in ordine inverso
rendere il valore predefinito di order uguale a 0
*/

let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function logList(list, order) {
    if (order == undefined || order == null) {
        console.log(order + " Inserire l'ordine.");

    } else {
        if (order >= 0) {
            for (let i = 0; i < list.length; i++) {
                console.log(list[i]);

            }

        } else {

            for (let i = list.length-1; i >= 0; i--) {
                console.log(list[i]);

            }
        }
    }
}

logList(array);

logList(array, 1);

logList(array, 1);






