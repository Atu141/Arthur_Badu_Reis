let primeiroNum = 30;
let segundoNum = 20;

console.log(primeiroNum, segundoNum);

// operadores aritímeticos
let resultado = primeiroNum + segundoNum
console.log(`${primeiroNum} + ${segundoNum} = ${resultado}`);

resultado = primeiroNum - segundoNum
console.log(`${primeiroNum} - ${segundoNum} = ${resultado}`);

resultado = primeiroNum * segundoNum
console.log(`${primeiroNum} * ${segundoNum} = ${resultado}`);

resultado = primeiroNum / segundoNum
console.log(`${primeiroNum} / ${segundoNum} = ${resultado}`);

resultado = primeiroNum % segundoNum
console.log(`${primeiroNum} % ${segundoNum} = ${resultado}`);

resultado = primeiroNum ** segundoNum
console.log(`${primeiroNum} ** ${segundoNum} = ${resultado}`);

//Operadores Relacionais =RETORNO TRUE / FALSE
resultado = primeiroNum > segundoNum
console.log(`${primeiroNum} > ${segundoNum} = ${resultado}`);

resultado = primeiroNum >= segundoNum
console.log(`${primeiroNum} >= ${segundoNum} = ${resultado}`);

resultado = primeiroNum < segundoNum
console.log(`${primeiroNum} < ${segundoNum} = ${resultado}`);

resultado = primeiroNum <= segundoNum
console.log(`${primeiroNum} <= ${segundoNum} = ${resultado}`);

primeiroNum = 30;
segundoNum = '30';

resultado = primeiroNum === segundoNum
console.log(`${primeiroNum} === ${segundoNum} = ${resultado}`);

resultado = primeiroNum !== segundoNum
console.log(`${primeiroNum} !== ${segundoNum} = ${resultado}`);

// operador de incremento
primeiroNum = 20;
segundoNum = 40;
console.log(primeiroNum, segundoNum);

primeiroNum++;
segundoNum++;
console.log(primeiroNum, segundoNum);

primeiroNum--;
segundoNum--;
console.log(primeiroNum, segundoNum);

// operção pós-fixada
resultado = primeiroNum++ + segundoNum++
console.log(resultado);
console.log(primeiroNum, segundoNum);

// operação pre-fixado
resultado = ++primeiroNum + ++segundoNum
console.log(resultado);
console.log(primeiroNum, segundoNum);

// Operador de Atribuição
primeiroNum += 100;
console.log(primeiroNum);

primeiroNum -= 100;
console.log(primeiroNum);

primeiroNum *= 100;
console.log(primeiroNum);