function Button(props) {

    const bgColor = props.color ? props.color : "bg-slate-300";

    return (
        <button
            className={`border-none rounded-md px-2 py-2 cursor-pointer font-normal transition-all ease-in duration-100 disabled:cursor-default disabled:bg-slate-100 disabled:text-slate-500 hover:enabled:bg-dark-green hover:enabled:text-white ${bgColor} ${props.marginRight}`}
            disabled={props.disabled}
            onClick={props.onClick}>
            {props.text}
        </button>

    );
}

export default Button;