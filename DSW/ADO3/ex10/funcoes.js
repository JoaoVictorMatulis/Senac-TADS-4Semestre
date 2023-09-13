function diaSemanaF(dia){
    switch(dia){
        case(0):
            return 'Domingo'
        case(1):
            return 'Segunda'
        case(2):
            return 'Terça'
        case(3):
            return 'Quarta'
        case(4):
            return 'Quinta'
        case(5):
            return 'Sexta'
        case(6):
            return 'Sábado'
        default:
            return 'Dia da semana inválido'
    }
}

function meses(mes){
    switch(mes){
        case(1):
            return 'Janeiro'
        case(2):
            return 'Fevereiro'
        case(3):
            return 'Março'
        case(4):
            return 'Abril'
        case(5):
            return 'Maio'
        case(6):
            return 'Junho'
        case(7):
            return 'Julho'
        case(8):
            return 'Agosto'
        case(9):
            return 'Setembro'
        case(10):
            return 'Outubro'
        case(11):
            return 'Novembro'
        case(12):
            return 'Dezembro'
        default:
            return 'Mês inválido'
    }
}
//Enviado Domingo, 22 de Outubro de 1989
export function msgEnvio(dia, diaSemana, mes, ano){
    diaSemana = diaSemanaF(diaSemana)
    mes = meses(mes)
    return `Enviado ${diaSemana}, ${dia} de ${mes} de ${ano}`
}