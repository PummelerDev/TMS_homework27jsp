import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signin")
public class SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("Username");
        String password = req.getParameter("Password");
        UserChecker userChecker = new UserChecker(name, password);
        req.setAttribute("Username", name);
        req.setAttribute("Password", password);
        if(userChecker.result){
            getServletContext().getRequestDispatcher("/page1.jsp").forward(req,resp);
        } else {
            getServletContext().getRequestDispatcher("/noRegistration.jsp").forward(req,resp);
        }

    }
}
