
/*
 * I primitivi sono boolean, byte,  char, numeri (short, int, long, float e double)
 * 
 * Esistono due sezioni nella memoria, per i dati: Stack e Heap. 
 * 
 * Nella Stack, vengono impilati tutti i primitivi, come un numero, un carattere
 * mentre nella Heap vengono buttati a caso tutti gli oggetti complessi,
 * come una stringa, oggetti etc...
 *  
 * Gli array sono di tipo primitivo - indipendentemente da quello che contengono.
 * Quando si sfora la lunghezza dell'array, siccome è a dimensione fissa, viene lanciato
 * un'eccezione a "tempo di esecuzione", ovvero che durante il tentativo di eseguzione
 * si è verificato un errore.
 *
 * per convezione: le costanti (final) si scrivono 
 * IN_MAIUSCOLO_CON_GLI_UNDERSCORE
 * 
 * 	public final static String NOME_PERSONALE = "Matteo";
 *
 * Un metodo o funzione, è un blocco di codice richiamabile che esegue 
 * una porzione di codice, in base alle chiamate.
 * 
 * La sua firma è composta da: il tipo di accesso, il tipo restituito(se c'è)
 * il suo nome, i parametri che possono essere di due tipi: par Formali, ovvero
 * il nome che assume la variabile passata al suo interno, e par Attuali, ovvero
 * i parametri passati in chiamata.
 * 
 * Un metodo si dice ricorsivo quando nella firma c'è la chiamata a se stesso
 * Attenzione che è come se fosse un while->true
 * C'è bisogno di una condizione di base wrappata in una condizione di uscita
 * E ogni volta che arriva la chiamata, si crea una nuova stack che va in pila
 * fin quando non si arriva alla condizione d'uscita.
 * A quel punto, la stack viene svuotata dall'alto, verso il basso.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/
