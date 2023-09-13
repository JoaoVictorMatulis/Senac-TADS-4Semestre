export function situacaoFebre(temperatura){
    if(temperatura >= 41){
        console.log('Hipertermia')
    }
    if(temperatura >= 39.6 && temperatura < 41){
        console.log('Febre Alta')
    }
    if(temperatura >= 37.6 && temperatura < 39.6){
        console.log('Febre')
    }
    if(temperatura >= 36 && temperatura < 37.6){
        console.log('Normal')
    }
    if(temperatura < 36){
        console.log('Hipotermia')
    }
}