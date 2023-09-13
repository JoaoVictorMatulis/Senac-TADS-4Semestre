export function media(nota1, nota2, nota3){
    return (nota1 + nota2 + nota3)/3
}

export function situacao(media){
    if(media >= 8){
        return 'Aprovado com Sucesso'
    }
    if(media >= 6 && media < 8){
        return 'Aprovado'
    }
    if(media >= 3 && media < 6){
        return 'Recuperação'
    }
    if(media < 3 && media > 0){
        return 'Reprovado'
    }
    if(media == 0){
        return 'Desistente'
    }
}