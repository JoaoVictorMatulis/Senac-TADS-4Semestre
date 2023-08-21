let nome = prompt("Digite seu nome","Alcides");
alert("Seja bem vindo "+nome);

function sair(){
    let confirmar = confirm("Gostaria de sair?")
    if(confirmar){
        window.close()
    }
}