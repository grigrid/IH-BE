



const pressBtn = (btn) => {
    if (btn !== "c") {
        display = document.querySelector('#actualValue').innerHTML += btn;
        console.log(btn);
    }
}

document.querySelector('#clean').addEventListener('click', function () {
    screen.value = '';
})

const pressClean = () => {
    display = document.querySelector("#actualValue").innerHTML = "";
}

