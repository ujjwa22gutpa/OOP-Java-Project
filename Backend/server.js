


const express  = require('express');

const app = express();
const port = 8000;

app.get('/',(req,res)=>{
    res.send("heyyyy!!!!")
})
app.get('/about',(req,res)=>{
    res.status(200).json({
        name:"krishna",
        age:21,
        city:"delhi"
    })
})

app.get('/jsonData', async (req,res)=>{
   const data = await fetch('https://jsonplaceholder.typicode.com/users');
   const jsonData = await data.json();
   res.status(200).json(jsonData.age && jsonData.city ? jsonData : {message:"age and city not found"});
})

app.listen(port,()=>{
    console.log(`server is running at port ${port}`);
})