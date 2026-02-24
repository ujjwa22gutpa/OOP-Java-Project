import { useState } from 'react'
import './App.css'
import LoginFrom from './Componets/LoginForm'
import RegistrationForm from './Componets/RegistrationForm'
import Counter from './Componets/Counter'
import DashBoard from './Componets/DashBoard'
import { useEffect } from 'react'

export default function App() {
useEffect(()=>{

async function fetchData(){

const data = await fetch("https://jsonplaceholder.typicode.com/users")

const jsonData = await data.json()

console.log(jsonData)

}

fetchData()

},[])

useEffect(()=>{

fetch("https://jsonplaceholder.typicode.com/users")
.then(res=>res.json())
.then(data=>console.log(data))

},[])

  return (
    <>
   {/* <LoginFrom/>
   <hr />
  <RegistrationForm />
  <hr />
 <Counter /> */}
 <LoginFrom />
  </>
  )
}
