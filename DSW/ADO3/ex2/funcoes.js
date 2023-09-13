export function verificarCor(cor){
    if(cor == 'Verde' || cor == 'verde'){
        return 'Atravesse'
    } else if(cor == 'Vermelho' || cor == 'vermelho'){
        return 'Espere'
    } else{
        return 'Farol Inoperante'
    }
}