import {diaSemanaF, meses} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log("\nDigite o dia do mês: ")
let dia = Number(ler())

console.log("\nDigite o dia da semana (em numero): ")
let diaSemana = Number(ler())

console.log("\nDigite o mês (em numero): ")
let mes = Number(ler())

console.log("\nDigite o ano (em numero): ")
let ano = Number(ler())