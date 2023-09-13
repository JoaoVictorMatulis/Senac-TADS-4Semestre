import prompt from 'prompt-sync'
const ler = prompt()


export function calcularValor(tipo, qtd){
    let valIngresso = 28.50
    if(tipo == "Meia" || tipo == "meia"){
        return (qtd * valIngresso)/2
    }else{
        return (qtd * valIngresso)
    }
}

export function qtdValida(qtd){
    if(qtd > 0){
        return qtd
    }else{
        console.log("\nQuantidade de ingressos inválido!\nEscolha uma opção:\n(1)Inserir outra quantidade de ingressos\n(2)finalizar operação")
        let escolha = Number(ler());
        while(escolha < 1 || escolha > 2){
            console.log("\nEscolha uma opção:\n(1)Inserir outra quantidade de ingressos\n(2)finalizar operação")
            let escolha = Number(ler());
        }
        if(escolha == 1){
            console.log('\ninforme a quantidade de ingressos: ')
            qtd = ler()
            return qtdValida(qtd);
        }else if(escolha == 2){
            process.exit()
        }
    }
}