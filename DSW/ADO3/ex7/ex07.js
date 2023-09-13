import {situacaoFebre} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log('Digite sua temperatura: ')
let temperatura = Number(ler())

situacaoFebre(temperatura)