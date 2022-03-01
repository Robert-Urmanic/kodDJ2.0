package cz.vsb.ekf.urm0009.objednavkovyformular2;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ObjService", urlPatterns = {"/ObjService"})
public class ObjService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        out.print("Servlet which redirects to objFormJsp.jsp");
        request.getRequestDispatcher("objFormJsp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try ( PrintWriter out = response.getWriter()) {
        out.print("<h1>Souhrn obejdnávky</h1>");
        String name = request.getParameter("jmeno");
        String prijmeni = request.getParameter("prijmeni");
        out.print("<p>Name: " + name + "</p> <br/>");
        out.print("<p>" + "Surname: " + prijmeni + "</p>");
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
