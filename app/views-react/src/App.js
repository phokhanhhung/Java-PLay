import "./App.css";

function App() {
  return (
    <div className="App">
      <form
        className="login-form"
        method="post"
        action="http://localhost:9000/getInfo2"
      >
        <h2 style={{ textAlign: "center" }}>Login</h2>
        <div className="mb-3 row">
          <label htmlFor="inputUsernmae" className="col-sm-2 col-form-label">
            Username
          </label>
          <div className="col-sm-10">
            <input
              type="username"
              className="form-control"
              id="inputUsername"
              name="username"
              placeholder="Your username..."
            />
          </div>
        </div>
        <div className="mb-3 row">
          <label htmlFor="inputPassword" className="col-sm-2 col-form-label">
            Password
          </label>
          <div className="col-sm-10">
            <input
              type="password"
              className="form-control"
              id="inputPassword"
              name="password"
              placeholder="Your password..."
            />
          </div>
        </div>
        <div className="col-12 btn-submit">
          <button className="btn btn-primary" type="submit">
            Submit
          </button>
        </div>
      </form>
    </div>
  );
}

export default App;
