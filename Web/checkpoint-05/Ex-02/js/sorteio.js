let numAleatorio = 0;

function gerarNumAleatorio (){
    return Math.floor(Math.random()*999);
}

function colocarNumAleatorio (){
    numAleatorio = gerarNumAleatorio();
    document.getElementById('numero').textContent = numAleatorio;
}

window.onload = colocarNumAleatorio;

//Soma 1 numero
function somar1() {
    numAleatorio ++;
    document.getElementById('numero').textContent = numAleatorio;
}

//Subtração 1 numero
function sub1() {
    numAleatorio --;
    document.getElementById('numero').textContent = numAleatorio;
}

document.getElementById('soma').addEventListener('click', somar1);
document.getElementById('subtração').addEventListener('click', sub1);