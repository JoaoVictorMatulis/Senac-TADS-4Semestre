/**
 * * @author joao.vmatulis
 * Esta servlet gerenciará tudo referente ao usuario
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EmpresaDao;
import model.Usuario;

@WebServlet(name = "ControleUsuario", urlPatterns = {"/ControleUsuario"})
public class ControleUsuario extends HttpServlet {
    
    private EmpresaDao dao;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String flag, user, pass, mensagem, arquivo;
        flag = request.getParameter("flag");
        if(flag.equals("login")){
            //aqui vem a parte de verificação de login
            user = request.getParameter("usuario");
            pass = request.getParameter("senha"); 
            dao = new EmpresaDao();
            Usuario usuario = dao.validarLogin(user, pass);
            if(usuario == null){// não achou o usuario no BD
                mensagem = "Usuário e/ou senha inválidos";
                request.setAttribute("mensagem", mensagem);
                RequestDispatcher disp = request.getRequestDispatcher("mensagens.jsp");
                disp.forward(request, response);
            } else { //achou o usuario no BD
                String nome = usuario.getFuncionario().getNomeFun();
                String cargo = usuario.getFuncionario().getCargoFun();
                if(cargo.equalsIgnoreCase("gerente")){
                    arquivo = "acesso_admin.jsp";
                }else{
                    arquivo = "acesso_outros.jsp";
                }
                request.setAttribute("nome", nome);
                RequestDispatcher disp = request.getRequestDispatcher(arquivo);
                disp.forward(request, response);
            }
        }else if(flag.equals("cadastroUsuario")){
            //aqui vem a parte de cadastro do usuario
        
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
