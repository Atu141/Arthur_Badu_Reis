// pegando o elemento button
const botao = document.getElementById('botaoArray');
console.log(botao);

// atribuir uma função ao elemento botao
botao.addEventListener('click', function(){
    // criando o Array
    const numeros = [];
// for para preencher o Array
    for(let i = 0; i <= 9; i++){

        numeros.push(parseInt(Math.random()*100));

    }

    document.getElementById('numeros').textContent = numeros;

});