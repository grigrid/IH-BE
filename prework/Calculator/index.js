

const pressBtn = (btn) => {
    display = document.querySelector('#actualValue').innerHTML += btn;
    console.log(btn);
}

//  Try to use this method to the up 
let btnClean = document.querySelector('#clean');
btnClean.addEventListener('click', function () {
    display = document.querySelector("#actualValue").innerHTML = "";

})

// Not working 
const pressClean = () => {
    display = document.querySelector("#actualValue").innerHTML = "";
}

