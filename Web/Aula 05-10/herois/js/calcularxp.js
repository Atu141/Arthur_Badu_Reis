// pegando o btn do html
const botao = document.querySelector('#calcular');

// atribuir um escutador de eventos - click
// charmar a função ao clicar
botao.addEventListener('click',() =>{
    // buscando os herois
    const herois = document.querySelectorAll('.heroi');

    // Usando o forEach para percorrer o Array
    herois.forEach(heroi => {
        const forca = Number(heroi.querySelector('.forca').textContent);
        const velocidade = Number(heroi.querySelector('.velocidade').textContent);
        const agilidade = Number(heroi.querySelector('.agilidade').textContent);
        const xpFinal = (forca + velocidade + agilidade)/3;

        heroi.querySelector('.xp').textContent = xpFinal.toFixed(0);

        if(xpFinal < 80){
            heroi.classList.add('bg-danger', 'text-light','fs-6');
        }

    }) 

});


