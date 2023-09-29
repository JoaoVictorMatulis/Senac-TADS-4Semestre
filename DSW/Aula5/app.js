function meufilter(vetor, acao){
    let filter = []
    for(let item of vetor){
        if(acao){
            filter.push()
        }
    }
    console.log(filter)
}

let vetor = [2, 3, 4, 1, 4, 7, 5 ,3]

meufilter(vetor, acao=>(vetor >3 && vetor < 5))

/*
let vetor = [2, 3, 4, 1, 4, 7, 5 ,3]

let a = vetor.filter(vetor => (vetor >3 && vetor < 5))

console.log(a);
console.log(vetor);
*/