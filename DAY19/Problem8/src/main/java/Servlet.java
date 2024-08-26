import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(urlPatterns = {"/submit"})
public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        String email = request.getParameter("email");
        int age = Integer.parseInt(request.getParameter("age"));

        try{
            response.getWriter().println(email+" : "+age);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
