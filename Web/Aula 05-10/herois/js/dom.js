// pegar pelo id
const getId1 = document.getElementById('herois');
console.log(getId1);

// Retorna o primeiro elemento encontrado
// Seletor global = pode pegar qualquer coisa com ele
const getId2 = document.querySelector('#heroi-um');
console.log(getId2);

// Pegar pela class
const getClass1 = document.getElementsByClassName('nome');
console.log(getClass1);
console.log(getClass1[3]);
console.log(getClass1[3].textContent);

const getClass2 = document.querySelectorAll('.nome');
console.log(getClass2);
console.log(getClass2[3]);
console.log(getClass2[3].textContent);
getClass2[3].textContent = 'Mulher Maravilha';

//pegar pela tag
const getTag1 = document.getElementsByTagName('td');
console.log(getTag1);

const getTag2 = document.querySelectorAll('td');
console.log(getTag2);