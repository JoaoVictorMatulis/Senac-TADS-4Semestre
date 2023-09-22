package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Departamento;
import model.EmpresaDao;

@WebServlet(name = "ControleDepartamento", urlPatterns = {"/ControleDepartamento"})
public class ControleDepartamento extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //aqui que vou programar
        String flag, idDep, nomeDep, telDep, mensagem="";
        RequestDispatcher disp;
        flag = request.getParameter("flag");
        if(flag.equals("cad_Dep")){
            //Aqui vamos fazer o cadastro
            //recebe os dados digitados no formulário
            idDep = request.getParameter("idDep");
            nomeDep = request.getParameter("nomeDep");
            telDep = request.getParameter("telefoneDep");
            /*encapsula os dados recebidos em um obj
              da classe Departamento*/
            Departamento dep = new Departamento(idDep, nomeDep, telDep);
            //cadastrar os dados via método cadastrarDep
            //da classe EmpresaDao
            EmpresaDao dao = new EmpresaDao();
            int errorLevel = dao.cadastrarDep(dep);
            switch(errorLevel){
                case 1:
                    mensagem = "Departamento cadastrado com sucesso";
                    break;
                case 0:
                    mensagem = "Erro ao tentar salvar o departamento";
                    break;
            }
            request.setAttribute("mensagem", mensagem);
            disp = request.getRequestDispatcher("mensagens.jsp");
            disp.forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
