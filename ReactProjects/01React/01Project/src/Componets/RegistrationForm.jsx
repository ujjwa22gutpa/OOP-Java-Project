import React, { useState } from "react";

function UserRegistration() {

  // Step 1: create state
  const [user, setUser] = useState({
    name: "",
    email: "",
    password: "",
    phone: "",
    gender: "",
  });

  // Step 2: handle input change
  function handleChange(event) {

    const { name, value } = event.target;

    setUser({
      ...user,
      [name]: value,
    });
  }

  // Step 3: handle submit
  function handleSubmit(event) {

    event.preventDefault();

    console.log("User Data:", user);

    alert("Registration Successful");

    // Reset form
    setUser({
      name: "",
      email: "",
      password: "",
      phone: "",
      gender: "",
    });

  }

  return (

    <div style={{ width: "400px", margin: "auto" }}>

      <h2>User Registration</h2>

      <form onSubmit={handleSubmit}>

        {/* Name */}
        <input
          type="text"
          name="name"
          placeholder="Enter Name"
          value={user.name}
          onChange={handleChange}
          required
        />

        <br /><br />

        {/* Email */}
        <input
          type="email"
          name="email"
          placeholder="Enter Email"
          value={user.email}
          onChange={handleChange}
          required
        />

        <br /><br />

        {/* Password */}
        <input
          type="password"
          name="password"
          placeholder="Enter Password"
          value={user.password}
          onChange={handleChange}
          required
        />

        <br /><br />

        {/* Phone */}
        <input
          type="text"
          name="phone"
          placeholder="Enter Phone"
          value={user.phone}
          onChange={handleChange}
        />

        <br /><br />

        {/* Gender */}
        <select
          name="gender"
          value={user.gender}
          onChange={handleChange}
        >

          <option value="">Select Gender</option>
          <option value="Male">Male</option>
          <option value="Female">Female</option>

        </select>

        <br /><br />

        <button type="submit">

          Register

        </button>

      </form>

    </div>

  );

}

export default UserRegistration;