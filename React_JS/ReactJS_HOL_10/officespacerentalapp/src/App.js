import officeImage from "./images/office.jpg";

function App() {
    const office = {
        name: "Tech Park Office",
        rent: 55000,
        address: "Bengaluru, Karnataka"
    };

    const officeSpaces = [
        {
            id: 1,
            name: "Tech Park Office",
            rent: 55000,
            address: "Bengaluru, Karnataka"
        },
        {
            id: 2,
            name: "Business Hub",
            rent: 75000,
            address: "Hyderabad, Telangana"
        },
        {
            id: 3,
            name: "Corporate Tower",
            rent: 45000,
            address: "Pune, Maharashtra"
        }
    ];

    return (
        <div style={{ margin: "20px" }}>
            <h1>Office Space Rental App</h1>

            <img
                src={officeImage}
                alt="Office Space"
                width="400"
                height="250"
            />

            <h2>Featured Office</h2>

            <p><strong>Name:</strong> {office.name}</p>

            <p>
                <strong>Rent:</strong>{" "}
                <span
                    style={{
                        color: office.rent < 60000 ? "red" : "green"
                    }}
                >
                    ₹{office.rent}
                </span>
            </p>

            <p><strong>Address:</strong> {office.address}</p>

            <hr />

            <h2>Available Office Spaces</h2>

            {officeSpaces.map((item) => (
                <div
                    key={item.id}
                    style={{
                        border: "1px solid gray",
                        padding: "10px",
                        marginBottom: "15px",
                        width: "420px"
                    }}
                >
                    <p><strong>Name:</strong> {item.name}</p>

                    <p>
                        <strong>Rent:</strong>{" "}
                        <span
                            style={{
                                color: item.rent < 60000 ? "red" : "green"
                            }}
                        >
                            ₹{item.rent}
                        </span>
                    </p>

                    <p><strong>Address:</strong> {item.address}</p>
                </div>
            ))}
        </div>
    );
}

export default App;