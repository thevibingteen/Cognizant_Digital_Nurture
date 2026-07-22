import "../Stylesheets/mystyle.css";

function CalculateScore(props) {
  const average = (props.total / props.goal).toFixed(2);

  return (
    <div className="score-card">
      <h2>Student Score Report</h2>

      <table>
        <tbody>
          <tr>
            <td><strong>Name</strong></td>
            <td>{props.name}</td>
          </tr>

          <tr>
            <td><strong>School</strong></td>
            <td>{props.school}</td>
          </tr>

          <tr>
            <td><strong>Total Marks</strong></td>
            <td>{props.total}</td>
          </tr>

          <tr>
            <td><strong>Subjects</strong></td>
            <td>{props.goal}</td>
          </tr>

          <tr>
            <td><strong>Average</strong></td>
            <td>{average}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default CalculateScore;