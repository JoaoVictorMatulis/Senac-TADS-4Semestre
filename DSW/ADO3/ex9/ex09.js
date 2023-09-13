import {imc, situacao} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log('Digite sua altura em metros: ')
let alt = Number(ler())

console.log('Digite seu peso em Kg: ')
let peso = Number(ler())

let valorImc = imc(alt, peso)

console.log('Seu IMC é '+valorImc.toFixed(2)+'\nSua classificação é '+situacao(valorImc))