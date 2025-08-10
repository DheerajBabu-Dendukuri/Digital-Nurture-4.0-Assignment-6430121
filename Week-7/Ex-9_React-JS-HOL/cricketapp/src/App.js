import './App.css';
import ListofPlayers from './components/ListofPlayers';
import { OddEvenPlayers } from './components/OddEvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';

var flag = true;


function App() {
  return (
    <div className="App">
      {flag ? 
        <><OddEvenPlayers/><ListofIndianPlayers /></> :
        <><ListofPlayers /></>
      }
      
    </div>
  );
}

export default App;
