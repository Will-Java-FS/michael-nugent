//Tic-Tac-Toe Tutorial
//https://react.dev/learn/tutorial-tic-tac-toe

import { useState } from 'react';

export default function App() {
  return <>
    <Game />
  </>
}

export function Game() {
  return (
    <div className='game'>
      <div className='game-board'>
        <Board n={3} />
      </div>
      <div className='game-info'>
        <ol>{/*TODO*/}</ol>
      </div>
    </div>
  )
}

export function Board(props: { n: number }) {

  const [playerTurn, setPlayerTurn] = useState(0);

  const characterMarkers = ['X', 'O'];

  const [squares, setSquares] = useState(Array(Math.pow(props.n, 2)).fill(null));

  const winner: string | null = calculateWinner(squares);

  function reportClick(xCoord: number, yCoord: number) {

    const arrayIndex = xCoord % props.n + yCoord * props.n;

    if (squares[arrayIndex] !== null || winner) return;

    const newSquaresArr = squares.slice()
    newSquaresArr.splice(arrayIndex, 1, characterMarkers[playerTurn])
    setSquares(newSquaresArr);

    setPlayerTurn(1 - playerTurn);
  }

  const status = winner ? "Winner: " + winner : "Next player: " + characterMarkers[playerTurn];

  const boardRows = []
  for (let i = 0; i < props.n; i++) {
    boardRows.push(<BoardRow key={i} n={props.n} yCoord={i} reportClick={reportClick} squaresArr={squares} />);
  }
  return <>
    <div className='status'>{status}</div>
    {boardRows}
  </>
}

export function BoardRow(props: { n: number, yCoord: number, reportClick: Function, squaresArr: Array<String> }) {

  const { n, yCoord, reportClick, squaresArr } = props;

  const squares = []

  for (let i = 0; i < n; i++) {
    squares.push(<Square key={i} xCoord={i} yCoord={yCoord} reportClick={reportClick} squaresArr={squaresArr} n={n} />)
  }

  return <div className="board-row">
    {squares}
  </div>
}

export function Square(props: { xCoord: number, yCoord: number, reportClick: Function, squaresArr: Array<String>, n: number }) {

  const { xCoord, yCoord, reportClick, squaresArr, n } = props;

  function handleClick() {
    reportClick(xCoord, yCoord)
  }


  const determineValue = (xCoord: number, yCoord: number, n: number, squaresArr: Array<String>) => {
    const arrIndex = xCoord + yCoord * n;

    return squaresArr[arrIndex];
  }

  const value = determineValue(xCoord, yCoord, n, squaresArr)

  return <>
    <button className='square' onClick={handleClick}>{value}</button>
  </>
}

// function calculateWinner(squares: Array<String>, index: number) {

//   const x: number = Math.sqrt(squares.length)
//   //ToDo: Need to check if X is a whole number, otherwise Array length is not representative of game
//   const y: number = x;

//   const currentPlayerMark = squares[index];

//   for(let i:number = 0;i<x;i++){

//   }

// }

function calculateWinner(squares: Array<string>) {

  const lines = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
  ];
  for (let i = 0; i < lines.length; i++) {
    const [a, b, c] = lines[i];
    if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
      return squares[a];
    }
  }
  return null;
}