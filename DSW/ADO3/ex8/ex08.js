import {media, situacao} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log('\nDigite a primeira nota: ')
let nota1 = Number(ler())

console.log('\nDigite a segunda nota: ')
let nota2 = Number(ler())

console.log('\nDigite a terceira nota: ')
let nota3 = Number(ler())

let mediaFinal = media(nota1, nota2, nota3)
console.log('\nA média do aluno é '+mediaFinal.toFixed(1)+'\nSituação: '+situacao(mediaFinal))