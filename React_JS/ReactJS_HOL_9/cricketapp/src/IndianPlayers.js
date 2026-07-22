function IndianPlayers() {
    const players = [
        "Virat Kohli",
        "Rohit Sharma",
        "Shubman Gill",
        "KL Rahul",
        "Hardik Pandya",
        "Ravindra Jadeja"
    ];

    const oddPlayers = players.filter((_, index) => index % 2 === 0);
    const evenPlayers = players.filter((_, index) => index % 2 !== 0);

    const T20Players = [
        "Surya Kumar",
        "Rinku Singh",
        "Tilak Varma"
    ];

    const RanjiPlayers = [
        "Cheteshwar Pujara",
        "Ajinkya Rahane",
        "Hanuma Vihari"
    ];

    const mergedPlayers = [...T20Players, ...RanjiPlayers];

    return (
        <div>
            <h2>Indian Players</h2>

            <h3>Odd Team Players</h3>
            <ul>
                {oddPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h3>Even Team Players</h3>
            <ul>
                {evenPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h3>Merged Players</h3>
            <ul>
                {mergedPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
}

export default IndianPlayers;