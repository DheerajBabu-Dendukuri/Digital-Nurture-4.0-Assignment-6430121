import React from 'react';
const books = [
    { title: 'Pro Node.js', price: 750 },
    { title: 'JavaScript: The Good Parts', price: 600 },
    { title: 'React Up & Running', price: 680 }
];

const BookDetails = () => {

    return (
        <div className="column">
            <h2>Book Details</h2>
            {books.map((book, idx) => (
                <div key={idx}>
                    <strong>{book.title}</strong>
                    <p>{book.price}</p>
                </div>
            ))}
        </div>
    );
};

export default BookDetails;