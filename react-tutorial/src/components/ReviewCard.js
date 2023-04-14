import { useState } from "react";
import Button from "./Button";
import ErrorSpan from "./ErrorSpan";
import Input from "./Input";




const ReviewCard = (props) => {
  const { title } = props;
  const [opinion, setOpinion] = useState("");
  const [disabled, setDisabled] = useState(true);
  const [error, setAlert] = useState();

  const errorColor = "border-red-500";
  const defaulftColor = "border-gray-100";
  const [borderColor, setBorderColor] = useState(defaulftColor)

  const [textColor, setTextColor] = useState("");

  const [rating, setRating] = useState(0);


  /**
   * Riceviamo il cambiamento nell'input attraverso "event" del DOM
   * e lo passiamo a useState per creare una variabile che contiene
   * la modifica effettuata nell'input.
   * @param {*} event evento del DOM
   */
  function changeHandler(event) {
    const { value } = event.target;
    setOpinion(value)

    if (value.trim() !== "" && value.length > 5) {
      setDisabled(false);

    } else {
      setBorderColor(defaulftColor);
      setAlert("")
      setDisabled(true);

    }
  }

  function clickHandler() {
    if (opinion.length < 8) {
      setBorderColor(errorColor);
      setTextColor("text-red-600");
      setAlert("Devi inserire almeno 8 caratteri.");

    } else {
      setBorderColor(defaulftColor);
      setTextColor("text-green-700");
      setAlert("Hai inserito: " + opinion);

    }

  }

  function removeClickHandler() {
    setOpinion("");
    setDisabled(true);
    setBorderColor(defaulftColor);
    setTextColor();
    setAlert("Testo cancellato...")

  }

  // const clickHandler = number => {
  //   console.log(number);
  // };

  // const inputHandler = e => {
  //   console.log(e.target.value);
  // };

  // const inputClickHandler = () => {
  //   console.log("input button clicked");
  // };

  const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  const renderedRating = [...array].map((number, index) => {
    return (
      <button
        key={index}
        className="border-2 border-black-200 mx-1 rounded-50 text-sm md:text-base w-6 h-6 md:w-8 md:h-8 cursor-pointer transition-all ease-in duration-150 bg-slate-100 hover:bg-dark-green"
        onClick={() => setRating(number)}
        disabled={false}>
        {index + 1}
      </button>
    );
  });

  return (
    <div className="w-full flex justify-center items-center p-1">
      <div className="w-11/12 md:w-4/5 lg:w-2/5 flex flex-col p-8 mt-10 mb-5 border-2 border-gray-100 rounded-sm shadow-dark">
        <div>
          <h2 className="font-medium font-Itim text-3xl my-4 text-center">{title}</h2>
          <div className="flex justify-between my-4">{renderedRating}</div>
          <div className={`w-full flex justify-center items-center p-1 mt-4 rounded-md border-2 ${borderColor}`}>

            <Input text={opinion} onChange={changeHandler} />
            <Button onClick={clickHandler} disabled={disabled} text="Conferma" marginRight="mr-1" />
            <Button onClick={removeClickHandler} disabled={disabled} text="Elimina" color="bg-red-300" />

          </div>

          <ErrorSpan textColor={textColor} text={error} />

          {/* <div className="text-red-500 font-semibold h-3 mt-2 text-center">error</div> */}
        </div>
      </div>
    </div>
  );
};

export default ReviewCard;