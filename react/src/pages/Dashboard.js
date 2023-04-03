import Header from "../components/Header";
import { FiLogIn } from "react-icons/fi";


function Dashboard(props) {
    console.log({FiLogIn})
    return (
        <>
            <Header title="Hello there!" login={<FiLogIn />}/>
        </>
    );
}

export default Dashboard;
