import Icon from "./Icon";
let title = "Feedback ui";

function Header(props) {

    function clickHandler() {
        title = "new Title!";
    }

    return (
        <>
            <header className="w-full h-10vh flex justify-end items-center text-4xl font-bold text-white bg-dark-green">
                <div className="w-full flex justify-center">
                    <h1>{title}</h1>
                </div>
                <div>
                    <span className="cursor-pointer">
                        <Icon login="LogIn" />
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

export default Header;