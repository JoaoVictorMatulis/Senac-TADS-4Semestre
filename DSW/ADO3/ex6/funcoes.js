export function calcular(gramas){
    let valor = 0
    if(gramas>=1000){
        valor = 3
    }else{
        valor = 3.5
    }
    return (gramas/100) * valor
}