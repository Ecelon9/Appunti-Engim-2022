
const json1 = {prima:"coppia" , quinta:"coppia"};
const json2 = {seconda:"coppia"};
const json3 = {terza:"coppia"};
const json4 = {quarta:"coppia"};

let arrayJson = [json1, json2, json3, json4];

console.log(arrayJson);



/* dato un json, clonarlo e fare in modo che
le informazioni al suo interno siano per valore */


const mioJson = {var1:"pippo"};

const mioJson2 = function clonaJson() {
    
    JSON.parse(JSON.stringify(mioJson))
    mioJson2.var1 = "pluto";
    
    return mioJson2;
    
}

mioJson2(mioJson);

console.log("Json originale: " + mioJson.var1);
console.log("Copia: " + mioJson2.var1);





