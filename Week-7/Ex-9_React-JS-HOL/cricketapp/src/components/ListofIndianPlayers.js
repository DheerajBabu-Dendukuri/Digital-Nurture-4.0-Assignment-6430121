import React from 'react';
const T20Players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];

const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

function ListofIndianPlayers() {

  return (
    <div>
      <h2>Merged List of Indian Players</h2>
      <ul>
        {mergedPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofIndianPlayers;