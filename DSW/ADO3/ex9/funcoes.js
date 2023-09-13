export function imc(alt, peso){
    return peso/(alt*alt)
}

export function situacao(imc){
    if(imc > 40){
        return 'Obesidade Grau III'
    }
    if(imc >= 35 && imc < 40){
        return 'Obesidade Grau II'
    }
    if(imc >= 30 && imc < 35){
        return 'Obesidade Grau I'
    }
    if(imc >= 25 && imc < 30){
        return 'Sobrepeso'
    }
    if(imc >= 18.5 && imc < 25){
        return 'Peso Normal'
    }
    if(imc < 18.5){
        return 'Abaixo do Peso'
    }
}