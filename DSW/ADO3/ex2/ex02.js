import { verificarCor } from './funcoes.js'
import prompt from 'prompt-sync'
const ler = prompt()

console.log('Digite a cor do semaforo: ')
console.log(verificarCor(ler()))