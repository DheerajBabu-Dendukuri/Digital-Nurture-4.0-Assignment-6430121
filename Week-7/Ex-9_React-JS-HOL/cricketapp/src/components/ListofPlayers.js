import React from "react";

export const players = [
    {name : "Jadeja", score : 80},
    {name : "Rohit", score : 90},
    {name : "Virat", score : 75},
    {name : "Dhoni", score : 60},
    {name : "Bumrah", score : 20},
    {name : "Shami", score : 15},
    {name : "Pant", score : 55},
    {name : "Hardik", score : 40},
    {name : "Rahul", score : 65},
    {name : "Shreyas", score : 30},
    {name : "Ashwin", score : 25}
];

const players70 = players.filter((p) => p.score <= 70);
function ListofPlayers(){    

    return (
        <div>
            <h2>List of Players</h2>
            <ul>
                {players.map( (player, index) =>(
                    <li key = {index}>Mr. {player.name} <span>{player.score}</span></li>
                ))}
            </ul>
            <h2>List of Players having score less than 70</h2>
            <ul>
                {players70.map( (player, index) =>(
                    <li key = {index}>Mr. {player.name} <span>{player.score}</span></li>
                ))}
            </ul>
        </div>
    )
}

export default ListofPlayers;