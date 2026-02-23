import { useState } from "react";
import DashBoard from "./DashBoard";

export default function LoginFrom() {
  function handleSubmit(e) {
    e.preventDefault();
    console.log("Form submitted");
    console.log("user Data", user);

    Setuser({
      name: "",
      email: "",
      password: "",
    });
  }

  const [user, Setuser] = useState({
    name: "",
    email: "",
    password: "",
  });
  function handleChange(event) {
    const { name, value } = event.target;
    Setuser({
      ...user,
      [name]: value,
    });
  }
  return (
    <>
    <div className="parent">
      <div className="child">
        <form action="" onSubmit={handleSubmit}>
          <label htmlFor="name">
            Enter Name:
            <input
              type="text"
              name="name"
              id="name"
              value={user.name}
              onChange={handleChange}
              required
            />
          </label>
          <br />
          <br />
          <label htmlFor="password">
            Enter Password:
            <input
              type="password"
              name="password"
              id="password"
              value={user.password}
              onChange={handleChange}
              required
            />
          </label>
          <br />
          <br />
          <label htmlFor="email">
            Enter Email:
            <input
              type="email"
              name="email"
              id="email"
              value={user.email}
              onChange={handleChange}
              required
            />
          </label>
           <button type="submit">Login</button>
        </form>
      </div>
    </div>
    <DashBoard  user={user}/>
    </>
  );
}
