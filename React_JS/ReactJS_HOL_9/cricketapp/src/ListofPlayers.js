function ListofPlayers() {
    const players = [
        { name: "Virat Kohli", score: 82 },
        { name: "Rohit Sharma", score: 91 },
        { name: "Shubman Gill", score: 65 },
        { name: "KL Rahul", score: 74 },
        { name: "Hardik Pandya", score: 68 },
        { name: "Ravindra Jadeja", score: 77 },
        { name: "R Ashwin", score: 61 },
        { name: "Mohammed Shami", score: 59 },
        { name: "Jasprit Bumrah", score: 73 },
        { name: "Mohammed Siraj", score: 66 },
        { name: "Kuldeep Yadav", score: 71 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            <h3>All Players</h3>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

            <h3>Players with Score Below 70</h3>
            <ul>
                {below70.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListofPlayers;