import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(urlPatterns = {"/submit"})
public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        try{
            String email = request.getParameter("name");
            response.getWriter().println(email);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
