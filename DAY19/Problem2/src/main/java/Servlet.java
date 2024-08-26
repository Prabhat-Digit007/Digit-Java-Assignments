import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/print"})
public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.println("Hello "+name +" !!!!!!!!!!");

    }
}
