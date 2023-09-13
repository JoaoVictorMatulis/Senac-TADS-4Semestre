import { orcamento } from './funcoes.js'

import prompt from 'prompt-sync'
const ler = prompt()

console.log('Digite quanto você ganha: ')
let ganho = Number(ler())

console.log('\nDigite quanto você gasta: ')
let gasto = Number(ler())

console.log(orcamento (ganho, gasto))