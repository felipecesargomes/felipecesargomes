let salarioDoAmigo = 1000
let meuSalario = "2999aa"
let meuSalarioCorrigido = Number(meuSalario) //"é um cast"
let novosalario = String(salarioDoAmigo)

//Quando é utilizado + com string e number, o string sobresai sobre o number
//e acaba concatenando como ambos fosse um texto.

console.log(typeof salarioDoAmigo, typeof meuSalarioCorrigido, typeof meuSalarioCorrigido, typeof novosalario)

//typeof verifica o tipo da variável

console.log(salarioDoAmigo + meuSalarioCorrigido)

console.log(
  isNaN(meuSalario) //isNan - verifica se é um number
)

//Template String