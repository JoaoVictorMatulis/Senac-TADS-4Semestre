import {meses} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log("\nDigite um mês (numero dele): ")
let mes = Number(ler())

meses(mes)