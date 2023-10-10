//Console
console.log('Olá, sou o console');
console.log('Usando JS')

//Variaveis
let nome = 'Arthur Badu';
let idade = 18;
let logado = true;
const DATA_NASCIMENTO = '08/07';

console.log(nome, idade);
console.log(logado);
console.log(DATA_NASCIMENTO);

//Js é Fracamnete tipado
// Js tem tipagem dinamica 
// confome a atribuição de valor

console.log(typeof (nome), nome);
console.log(typeof (idade), idade);
console.log(typeof (logado), logado);
console.log(typeof (DATA_NASCIMENTO), DATA_NASCIMENTO);


// Template String ==== Template Literal
// INICAR E TERMINAR COM CRASE ``
// PLACEHOLDER ==== ${VARIAVEL - METODO...}

console.log(`nome: ${nome} idade: ${idade}`);