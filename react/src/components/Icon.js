function Icon(props) {

    return (
        <div className="w-fullh-10vh flex justify-end items-center text-4xl font-bold text-white">
            <span className="cursor-pointer">
                {props.login}
            </span>
        </div>

    );
};

export default Icon;