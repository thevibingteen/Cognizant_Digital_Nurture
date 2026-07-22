import { useState } from "react";

function Register() {
  const [form, setForm] = useState({
    name: "",
    email: "",
    password: ""
  });

  const [errors, setErrors] = useState({});

  const validate = (values) => {
    const error = {};

    if (values.name.length < 5) {
      error.name = "Name must contain at least 5 characters";
    }

    if (
      !values.email.includes("@") ||
      !values.email.includes(".")
    ) {
      error.email = "Enter a valid email address";
    }

    if (values.password.length < 8) {
      error.password = "Password must contain at least 8 characters";
    }

    return error;
  };

  const handleChange = (event) => {
    const updatedForm = {
      ...form,
      [event.target.name]: event.target.value
    };

    setForm(updatedForm);
    setErrors(validate(updatedForm));
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const validationErrors = validate(form);

    if (Object.keys(validationErrors).length === 0) {
      alert("Registration Successful");
    } else {
      setErrors(validationErrors);
    }
  };

  return (
    <div style={{ margin: "20px" }}>
      <h2>Mail Registration Form</h2>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Name</label>
          <br />
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={handleChange}
          />
          <br />
          <span style={{ color: "red" }}>
            {errors.name}
          </span>
        </div>

        <br />

        <div>
          <label>Email</label>
          <br />
          <input
            type="email"
            name="email"
            value={form.email}
            onChange={handleChange}
          />
          <br />
          <span style={{ color: "red" }}>
            {errors.email}
          </span>
        </div>

        <br />

        <div>
          <label>Password</label>
          <br />
          <input
            type="password"
            name="password"
            value={form.password}
            onChange={handleChange}
          />
          <br />
          <span style={{ color: "red" }}>
            {errors.password}
          </span>
        </div>

        <br />

        <button type="submit">
          Register
        </button>
      </form>
    </div>
  );
}

export default Register;