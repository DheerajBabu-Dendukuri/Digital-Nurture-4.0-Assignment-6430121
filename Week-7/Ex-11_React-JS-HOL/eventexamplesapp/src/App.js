import React, { Component } from 'react';
import CurrencyConverter from './CurrencyConverter';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 1
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  }

  sayWelcome = () => {
    alert("Welcome");
  }

  clickHandler = () => {
    alert("I was clicked");
  }

  render() {
    return (
      <div className="app-main">
        <h1>
          <span className="counter-label">Counter:</span>
          <span className="counter-value">{this.state.count}</span>
        </h1>
        <div className="button-group">
          <button onClick={this.increment}>Increment</button>
          <button onClick={this.decrement}>Decrement</button>
        </div>
        <div className="button-group">
          <button onClick={this.sayWelcome}>Say welcome</button>
          <button onClick={this.clickHandler}>Click on me</button>
        </div>
        <hr className="divider" />
        <div className="currency-section">
          <CurrencyConverter />
        </div>
      </div>
    );
  }
}

export default App;