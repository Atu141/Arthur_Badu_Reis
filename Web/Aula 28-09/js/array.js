//Criar Array
//Metodo Construtor
//const meuArray = new Array();

const pessoas = ['Eu','Tu','Ele','Nós','Vós','Eles'];
console.log(pessoas);
console.log(pessoas[3]);
console.log(pessoas.length);
console.log(typeof pessoas);

console.table(pessoas);

// Inserindo um novo indice no inicio do Array
pessoas.unshift('Eu mesmo')
console.table(pessoas);

// Excluir o primeior Indice - cuidado que ele exclui mesmo
pessoas.shift();
console.table(pessoas);

// Inserindo no ultimo Indice - PADRÃO
pessoas.push('Eu mesmo');
console.table(pessoas);

// Excluir o ultimo Indice - PADRÃO
pessoas.pop();
console.table(pessoas);

// Excluindo dois indices parindo do indice 2
pessoas.splice(2,2)
console.table(pessoas);

// Inserir dois novos valores partindo do indice 2
pessoas.splice(2,0,"Ele","Nós")
console.table(pessoas);