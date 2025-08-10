import React, { useState } from 'react';

function CurrencyConvertor() {
    const [amount, setAmount] = useState('');
    const [currency, setCurrency] = useState('USD');

    const handleSubmit = () => {
        let result = 0;
        if (currency === 'USD') {
            result = parseFloat(amount) / 83; // Example: 1 USD ≈ 83 INR
        }
        alert(`Converting to ${currency} Amount is ${result.toFixed(2)}`);
    };

    return (
        <div>
            <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>

            <div style={{ marginBottom: '10px' }}>
                <label style={{ marginRight: '25px' }}>Amount (INR):</label>
                <input
                    type="number"
                    value={amount}
                    onChange={(e) => setAmount(e.target.value)}
                />
            </div>

            <div style={{ marginBottom: '10px' }}>
                <label style={{ marginRight: '20px' }}>Currency:</label>
                <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
                    <option value="USD">USD</option>
                </select>
            </div>

            <div>
                 <label style={{ marginRight: '85px' }}></label>
                <button onClick={handleSubmit}>Submit</button>
            </div>
        </div>
    );
}

export default CurrencyConvertor;