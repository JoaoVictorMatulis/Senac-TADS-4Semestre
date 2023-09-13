import {diaSemana} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log("\nDigite um dia da semana: ")
let dia = Number(ler())

diaSemana(dia)