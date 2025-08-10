import './App.css';
const offices = [
  {
    id: 1,
    name: 'Urban Hive',
    rent: 55000,
    address: 'Hyderabad, Telangana',
    image: './office-image-1.jpeg'
  },
  {
    id: 2,
    name: 'TechSpace',
    rent: 65000,
    address: 'Bangalore, Karnataka',
    image: './office-image-2.jpeg'
  },
  {
    id: 3,
    name: 'Cowork Den',
    rent: 48000,
    address: 'Pune, Maharashtra',
    image: './office-image-3.jpeg'
  }
];

function App() {
  return (
    <div className="App">
      <h1 className="main-heading">Office Space Rental App</h1>
      <div className="office-container">
        {offices.map((office) => (
          <div key={office.id} className="office-card">
            <img src={office.image} alt={office.name} />
            <h3>Name: {office.name}</h3>
            <p className={office.rent <= 60000 ? 'green' : 'red'}>
              <strong>Rent:</strong> ₹{office.rent}
            </p>
            <p><strong>Address:</strong> {office.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
