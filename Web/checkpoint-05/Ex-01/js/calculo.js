document.getElementById('#gerarDados');

gerarDados.addEventListener('click', () => {
    
    const motos = document.querySelectorAll('.moto');
    
    let maiorPreco = 0;
    let maiorGasto = 0;
    let menorGasto = 0;
    let nomeMaior = 0;
    let nomeMenor = 0;
    let indexNome = 0;
    let maiorIndex = 0;

    let gastoMensal = 0;
   
    motos.forEach((moto,index)=> {
        const nome = (moto.querySelector('.modelo').textContent);
        const preco = Number(moto.querySelector('.preco').textContent);
        const tempo = Number(moto.querySelector('.tempo').textContent);
        const autonomia = Number(moto.querySelector('.autonomia').textContent);
        const kilometragem = Number(moto.querySelector('.kilometragem').textContent);
        
        const numCarregamentos = kilometragem/autonomia;
        const gastoMensal = (numCarregamentos*tempo)*1.304;
        
        moto.querySelector('.gasto').textContent = gastoMensal.toFixed(2);

        if(maiorPreco < preco){
            maiorPreco = preco;
            maiorIndex = index;
        }
        if(gastoMensal > maiorGasto){
            maiorGasto = gastoMensal;
            nomeMaior = nome;
        }
        if(gastoMensal < menorGasto || menorGasto==0){
            menorGasto = gastoMensal;
            nomeMenor = nome;
        }

    });

    console.log(maiorGasto+"maior");
    console.log(menorGasto+"menor");


    motos[maiorIndex].classList.add('table-danger'); 


    resultados.querySelector('.maiorGasto').textContent = nomeMaior

    resultados.querySelector('.menorGasto').textContent = nomeMenor
});

