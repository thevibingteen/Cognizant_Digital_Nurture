import React, { Component } from "react";

class Getuser extends Component {
  constructor(props) {
    super(props);

    this.state = {
      user: null,
      loading: true
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch("https://api.randomuser.me/");
      const data = await response.json();

      this.setState({
        user: data.results[0],
        loading: false
      });
    } catch (error) {
      console.log(error);

      this.setState({
        loading: false
      });
    }
  }

  render() {
    const { user, loading } = this.state;

    if (loading) {
      return <h2>Loading...</h2>;
    }

    if (!user) {
      return <h2>Unable to fetch user data.</h2>;
    }

    return (
      <div style={{ margin: "20px" }}>
        <h2>User Details</h2>

        <img
          src={user.picture.large}
          alt="User"
        />

        <h3>
          {user.name.title} {user.name.first}
        </h3>
      </div>
    );
  }
}

export default Getuser;