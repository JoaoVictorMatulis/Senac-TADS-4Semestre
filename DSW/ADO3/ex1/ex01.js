import {calcularValor, qtdValida} from './funcoes.js'

import prompt from 'prompt-sync'
const ler = prompt()

console.log('informe o tipo do ingresso:\n(Inteira ou Meia)')
let tipo = ler()

console.log('\ninforme a quantidade de ingressos: ')
let qtd = ler()
qtd = qtdValida(qtd)
let valIngresso = calcularValor(tipo, qtd)

console.log('\nO total a pagar é R$ '+valIngresso.toFixed(2))
