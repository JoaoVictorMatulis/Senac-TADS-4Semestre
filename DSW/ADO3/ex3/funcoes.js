export function orcamento (ganho, gasto){
    if(ganho >= gasto){
        return '\nVocê está dentro do orçamento!'
    }else{
        return '\nVocê está fora do orçamento! Não gaste mais!'
    }
}