function Input(props) {
    return (
        <input
            type="text"
            value={props.text}
            className="w-full focus:outline-none border-none text-xl p-1"
            placeholder="la tua opinione..."
            onChange={props.onChange}
            style={{ width: "100%", border: "none", fontSize: "1rem", padding: "5px" }}
        />
    );
}

export default Input;