export default function WhetherDashBoard({WhetherData}){
  if (!WhetherData || WhetherData.cod !== 200) {
    return <div>Location not found</div>;
  }
  console.log(WhetherData)
  return(
    <div className="weather-info">
      <h2>{WhetherData.name}</h2>
      <p>Temperature: {WhetherData.main.temp}°C</p>
      <p>Weather: {WhetherData.weather[0].main}</p>
      <p>Humidity: {WhetherData.main.humidity}%</p>
    </div>
  )
}