import {players} from "./ListofPlayers";
export function OddEvenPlayers(){
    return(
        <div>
            <h2>List of Even Players</h2>
            <div>
                {players.map((player, index) =>
                    index % 2 === 0 ? <li key={index}>Mr. {player.name} <span>{player.score}</span></li> : null
                )}
            </div>
            <h2>List of Odd Players</h2>
            <div>
                {players.map((player, index) =>
                    index % 2 === 1 ? <li key={index}>Mr. {player.name} <span>{player.score}</span></li> : null
                )}
            </div>

        </div>
    )
}

export default OddEvenPlayers;