
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
 *                  Patten MVC (Module, View, Controll)
 *
 * è un'architettura, ovvero un modo in cui si strutturano le applicazioni
 * a livello di directory/package
 * Parlando di Dominio, si intente l'intera applicazione
 *      1-Model -> entità dal db: Chi e come  viene rappresento all'interno del dominio
 *      2-View  -> è la sezione di visualizzazione, ciò che si vede via web
 *      3-Controller    -> si occupa dell'interazione fra View e Model interagendo col DB attraverso la repository
 *      4-Repository    -> interfacce che definiscono i metodi CRUD (Create, Remove, Update, Delete)
 *		Impl -> classi che chiamano il DB con metodi statici
 *				
 * Nella repository, per ogni attributo nel DB, si definiscono le interfacce
 * con le quali si interagirà col DB
 *      per esempio: getCategoryByName(String name);
 * Queste quattro sono obbligatorie e i nomi sono importanti
 * ma volendo se ne possono fare quante se ne vuole e i nomi sono liberi
 *      5-Utils
 *      6-Exceptions
 *      7-Enums
 *	8-Constant -> classi di variabili costanti
 *
 * Fino ad adesso abbiamo creato applicazioni MONOLITICHE
 * ovvero, tutte le funzionalità risiedono all'interno dello stesso progetto
 * e presenta il grosso problema che se la connessione al server va giù,
 * l'intera applicazione smette di funzionare
 *
 * In realtà le applicazioni sono divise a MICROSERVIZI
 * dove ogni singola funzionalità ha il proprio progetto staccato dagli altri
 * e qualora dovesse andare giù un servizio, gli altri continuano a funzionare
 * 
 * La prima cosa da fare, è creare la persistenza, ovvero la struttura del DB
 *      (best practice, dopo averla usata, salvarsi la query su un file txt)
 * 
 * Quando si crea la connessione, vanno gestiti le eccezioni:
 * per esempio: problemi di lettura/scrittura di apertura/chiusura della connessione stessa
 * 
 * abbiamo utilizzato tramite JDBC (Java DataBase Connectivity), mySql:
 *  -try ->instauro la connessione con l'oggetto connection che si appoggia alla classe
 *  -DriverManager, con il metodo statico getConnection(URL, USER, PSW)
 *  -Eseguire la query(creo lo statement per il database "SELECT cosa FROM il database")
 *  -gestisco un caso (per esempio db vuoto) lanciando una nuova eccezione
 *  -catch ->in caso qualcosa vada male, blocco il programma, recupero l'eccezione e mostro il messaggio
 * 
 * 
 *
 * 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
*/
