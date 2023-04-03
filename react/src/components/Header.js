import { useState } from "react";
import Icon from "./Icon";
import PropTypes from "prop-types";

function Header(props) {

    const [title, setTitle] = useState(props.title); //destrutturo gli elementi di useState
    /**
     * tramite il click, triggeriamo la funz clickHandler che passa alla funz di useState
     * "setTitle" il nuovo titolo e lo aggiorna sulla pagina, SENZA ricaricarla.
     * 
     * Notare che l'abbiamo dichiarato come const, quindi non dovrebbe essere possibile
     * modificarlo - quello che fa react è creare una nuova variabile const e passargli
     * il valore desiderato.
     */
    const [login, setIcon] = useState(props.login);

    function clickHandler() {
        setTitle("General Kenobi!");
        setIcon("Kill him...");
    }


    /**
     * Per poter usare le variabili di react su front-end, bisogna metterle fra 
     * parentesi graffe. Esempio: {title}
     */
    return (
        <>
            <header className="w-full h-10vh flex justify-end items-center text-4xl font-bold text-white bg-dark-green">
                <div className="w-full flex justify-center">
                    <h1>{title}</h1> 
                </div>
                <div>
                    <span className="cursor-pointer">
                        <Icon login={login} />
                    </span>
                </div>

            </header>
            <div className="flex justify-center items-center m-3">
                <button className="p-3 text-white bg-dark-green rounded-md"
                    onClick={clickHandler}>Click me!</button>
            </div>
        </>
    );
};

/**
 * Qui creiamo un prototipo per il modulo Header dove stabiliamo 
 * il tipo di oggetto per le variabili che ci servono
 */
Header.ropTypes = {
    title: PropTypes.string.isRequired, //titolo deve essere una stringa ed è anche obbligatorio
    login: PropTypes.element
}

export default Header;