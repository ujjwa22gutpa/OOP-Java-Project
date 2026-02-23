export default function DashBoard({ user }) {
  return (
    <div className="dashboard-container">

      <div className="profile-card">

        <div className="avatar">
          <img
            src={`https://ui-avatars.com/api/?name=${user.name}&background=4f46e5&color=fff&size=128`}
            alt="avatar"
          />
        </div>

        <h2 className="welcome">
          Welcome, {user.name || "User"} 👋
        </h2>

        <div className="info">

          <div className="info-item">
            <span>Email</span>
            <p>{user.email || "Not provided"}</p>
          </div>

          <div className="info-item">
            <span>Password</span>
            <p>{user.password || "Not provided"}</p>
          </div>

        </div>

        <button className="logout-btn">
          Logout
        </button>

      </div>

    </div>
  );
}