
/*
 * I primitivi sono boolean, byte  char, numeri (short, int, long, float e double)
 * 
 * Esistono due stati per gli oggetti: Stack e Heap. 
 * 
 * Nella Stack, vengono impilati tutti i primitivi, come un numero, un carattere
 * mentre nella Heap vengono buttati a caso tutti gli oggetti complessi,
 * come una stringa, array, oggetti etc...
 *  
 * per convezione: le costanti (final) si scrivono 
 * IN_MAIUSCOLO_CON_GLI_UNDERSCORE
 * 
 * 	public final static String NOME_PERSONALE = "Matteo";
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
 * 
*/
