import {calcular} from './funcoes.js'
import prompt from 'prompt-sync'
let ler = prompt()

console.log("Digite as gramas do sorvete")
let gramas = Number(ler())
if(gramas <= 0){
    console.log('Peso Inválido')
}else{
    let valorTotal = calcular(gramas)
    console.log('O total a pagar é R$ '+valorTotal)
}