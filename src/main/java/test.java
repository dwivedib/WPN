import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class test extends HttpServlet {

    public void service(HttpServletRequest reqq , HttpServletResponse ress) throws IOException {
        PrintWriter out = ress.getWriter();
        out.println("testing");
    }
}