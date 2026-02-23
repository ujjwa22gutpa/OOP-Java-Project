import { useState } from "react"


export default function Counter(){
    const [count,setCount] = useState(0)
    function countChange(){
        count=count+1;
        setCount(count)
    }
    return(
        <>
       <div className="parent" >
        <div className="child">
           <h2>Count {count}</h2>
        </div>
       </div>
       <div className="con">
        <div className="secCon">
            <button onClick={()=>setCount(count+1)}> Hit Me</button>
        </div>
       </div>
       </>
       
    )
}