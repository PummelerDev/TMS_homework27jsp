import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("Username");
        String password = req.getParameter("Password");

        TxtWriter txtWriter = new TxtWriter(name, password);
        req.setAttribute("Username", name);
        req.setAttribute("Password", password);

        getServletContext().getRequestDispatcher("/signin").forward(req,resp);

    }
}
