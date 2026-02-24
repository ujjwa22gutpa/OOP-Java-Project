// c7a7a9de1d2b281b61abbfcace55fe73

import WhetherDashBoard from "./WhetherDashboard";
import { useState, useEffect } from "react";
export default function Whether() {
  const [location, setLocation] = useState(''); // for api call
  const [locationData, setLocationData] = useState(null); // to send the response
  const [inputLocation, setInputLocation] = useState(''); // user input updation
  const[loading,setLoading] = useState(false); // to show user data is still getting fetched

  useEffect(() => {
    if (location) {
      async function getLocation() {
        setLoading(true)
        try {
             const response = await fetch(
          `https://api.openweathermap.org/data/2.5/weather?q=${location}&appid=c7a7a9de1d2b281b61abbfcace55fe73&units=metric`,
        );
         if(!response.ok){
          throw new Error("City not found");
        }
        const jsonData = await response.json();
        setLocationData(jsonData);
        } catch (error) {
            console.error("Error Fetching..")
        }
        finally{
            setLoading(false)
        }
      }
      getLocation();
    }
  }, [location]);

  function handleSubmit(event) {
    event.preventDefault();
    setLocation(inputLocation);
    setInputLocation("")
    setLoading(true)
  }

  function handleChange(event) {
    setInputLocation(event.target.value);
  }

  return (
    <>
      <div className="parent">
        <div className="child">
          Whether App
          <form  onSubmit={handleSubmit}>
            <label htmlFor="location">
              Enter Location
              <input
                type="text"
                id="location"
                placeholder="Enter the location "
                name="location"
                value={inputLocation}
                onChange={handleChange}
              />
            </label>
            <button type="submit">Get Location</button>
          </form>
        </div>
      </div>
       {loading? (
          <h2>Loading....</h2>
       ):(
            <WhetherDashBoard WhetherData={locationData}  />
       )}
     
    </>
  );
}
