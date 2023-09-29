/*
# TERMINAL
npm init -y
npm i express cors dotenv nodemon


# CONFIGURAR O PACKAGE.JSON

... "start": "nodemon index.js"		
... "type": "module",

# Criar .env
digitar dentro dele: port = 5000

# EXECUTAR 
npm start
*/


//# INDEX.JS
import 'dotenv/config';
import express from "express";
import cors from 'cors';

const servidor = express();
servidor.use(express.json());



servidor.get('/somar/:n1/:n2', (req, resp) => {
  let n1 = Number(req.params.n1);
  let n2 = Number(req.params.n2);

  let r = n1 + n2;

  resp.send({
    soma: r
  });

})



servidor.get('/subtrair', (req, resp) => {
  let n1 = Number(req.query.n1);
  let n2 = Number(req.query.n2);

  let r = n1 - n2;

  resp.send({
    subtracao: r
  })
})



servidor.get('/multiplicar', (req, resp) => {
  let n1 = req.body.n1;
  let n2 = req.body.n2;

  let r = n1 * n2;

  resp.send({
    multiplicacao: r
  })

})



servidor.listen(process.env.PORT, () => console.log(`API subiu na porta ${process.env.PORT}!`));