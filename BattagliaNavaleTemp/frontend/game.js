// Classe Ship
class Ship {
  constructor(length) {
    this.length = length;
    this.position = null;
    this.isVertical = true;
    this.isPlaced = false;
    this.element = null;
  }

  setPosition(position) {
    this.position = position;
  }

  setVertical(isVertical) {
    this.isVertical = isVertical;
  }

  setElement(element) {
    this.element = element;
  }

  placeShip() {
    this.isPlaced = true;
    this.element.classList.add('placed');
    this.element.style.top = `${this.position}px`;
    this.element.style.left = `${this.position}px`;
  }

  rotateShip() {
    this.isVertical = !this.isVertical;
    this.element.classList.toggle('vertical');
  }
}

const myField = document.getElementsByClassName('my');
const avvField = document.getElementsByClassName('avv');
const ships = Array.from(document.getElementsByClassName('ship'));
const start = document.getElementById('start')
let selectedShip = null;
const placedShips = []; // array che tiene traccia delle navi piazzate

// Aggiunge un event listener a ogni nave disponibile
ships.forEach(shipElement => {
  let ship;
  switch (parseInt(shipElement.dataset.length)) {
    case 1:
      ship = new Ship(1);
      break;
    case 2:
      ship = new Ship(2);
      break;
    default:
      console.error(`Lunghezza nave non valida: ${shipElement.dataset.length}`);
      return;
  }
  ship.setElement(shipElement);

  shipElement.addEventListener("click", function () {
    // Rimuove la classe "selected" da tutte le navi
    ships.forEach(shipElement => {
      shipElement.classList.remove("selected");
    });

    // Aggiunge la classe "selected" alla nave selezionata
    this.classList.add("selected");
    selectedShip = ship;
    console.log("Nave selezionata:", selectedShip);
  });
});

Array.from(myField).forEach((square, index) => {
  square.onclick = () => {
    if (selectedShip) {
      const position = {
        MyIndex: index
      };
      console.log(`Position: ${JSON.stringify(position)}`);
      if (!selectedShip.element.classList.contains('placed')) {
        selectedShip.element.classList.add('placed');
        selectedShip.element.style.top = `${square.offsetTop}px`;
        selectedShip.element.style.left = `${square.offsetLeft}px`;
        selectedShip.element.position = index;
        selectedShip.placeShip(); // aggiungiamo il metodo per piazzare la nave
        placedShips.push(selectedShip); // aggiungiamo la nave all'array delle navi piazzate
      }
      selectedShip = null;

      // verifichiamo se tutte le navi sono state piazzate
      const allShipsPlaced = placedShips.every(ship => ship.isPlaced);
      if (placedShips.length == 4) {
        console.log('Tutte le navi sono state piazzate! Premi Start per iniziare');
        start.disabled = false;
      }
    } else {
      console.log('Seleziona prima una nave!');
    }
  };
});

start.onclick = function(){
  let positionAvv = shipAvv(64);
  let indexAvv = []
  for(let i = 0; i < positionAvv.length; i++){
    indexAvv.push(positionAvv[i].index)
  } 
  console.log(indexAvv);

  // Crea un nuovo array di indici degli avversari
  const avvIndexArray = indexAvv.map(pos => pos.index);

  Array.from(avvField).forEach((square, index) => {
    square.onclick = () => {
        const attack = index;
        console.log(attack);

        if (avvIndexArray.includes(attack)) {
          console.log('colpito');
        } else {
          console.log('mancato');
        }
      }
  })
}

function shipAvv(numSquares){
    const shipLengths = [2, 2, 1, 1]; // lunghezza delle navi avversarie
    const positions = [];
  
    // genera la posizione di ogni nave
    for (let i = 0; i < shipLengths.length; i++) {
      const shipLength = shipLengths[i];
      let position = null;
      let isVertical = false;
  
      // genera la posizione e l'orientamento della nave in modo casuale
      while (position === null) {
        const randomIndex = Math.floor(Math.random() * numSquares);
        const isVerticalRandom = Math.random() >= 0.5;
        const endPosition = isVerticalRandom ? randomIndex + shipLength * 10 : randomIndex + shipLength;
        
        // controlla che la nave non esca dai bordi del campo di gioco
        if (endPosition % 10 <= randomIndex % 10 || endPosition >= numSquares) {
          continue;
        }
  
        // controlla che la nave non venga sovrapposta ad altre navi
        let isOverlapping = false;
        for (let j = 0; j < positions.length; j++) {
          const existingPosition = positions[j];
          const existingEndPosition = existingPosition.isVertical ? existingPosition.index + existingPosition.length * 10 : existingPosition.index + existingPosition.length;
          if (isVerticalRandom === existingPosition.isVertical) {
            if (randomIndex === existingPosition.index || randomIndex === existingEndPosition) {
              isOverlapping = true;
              break;
            }
            if (endPosition === existingPosition.index || endPosition === existingEndPosition) {
              isOverlapping = true;
              break;
            }
            if (randomIndex < existingEndPosition && endPosition > existingPosition.index) {
              isOverlapping = true;
              break;
            }
          } else {
            if (randomIndex % 10 === existingPosition.index % 10 && Math.abs(randomIndex - existingPosition.index) < existingPosition.length * 10) {
              isOverlapping = true;
              break;
            }
            if (randomIndex % 10 === existingEndPosition % 10 && Math.abs(randomIndex - existingEndPosition) < existingPosition.length * 10) {
              isOverlapping = true;
              break;
            }
          }
        }
  
        if (!isOverlapping) {
          position = randomIndex;
          isVertical = isVerticalRandom;
        }
      }
  
      positions.push({index: position, length: shipLength, isVertical: isVertical});
    }
  console.log(positions);
    return positions;
  
  }
