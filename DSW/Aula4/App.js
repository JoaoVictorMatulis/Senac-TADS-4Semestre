import {calcularMedia,verificarMedia} from './Operacoes.js'

import prompt from 'prompt-sync'
const ler = prompt()

console.log('informe a primeira nota: ')
let nota1 = Number(ler())

console.log('informe a segunda nota: ')
let nota2 = Number(ler())

console.log('informe a terceira nota: ')
let nota3 = Number(ler())

let media = calcularMedia(nota1,nota2,nota3)

console.log('A média é: '+media)
console.log(verificarMedia(media))