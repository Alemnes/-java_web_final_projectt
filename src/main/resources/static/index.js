async function grabData() {
     let lap = document.getElementById("lap");
  try{
     const response = await fetch('http://localhost:3000/api/laptops');
     const responseJSO = await response.json();
     const myObj = responseJSO[0];

    lap.innerText = `The first laptop in my database is ${myObj.brand} and it is ${myObj.color} color.`
  } catch(e){
     console.log( e.message)
  }
}
  
grabData();