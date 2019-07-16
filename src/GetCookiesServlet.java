import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get-cookies")
public class GetCookiesServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //получаем куки от клиента из запроса браузера
        Cookie[] cookies = request.getCookies();

        //и выводим их на экран
        PrintWriter pw = response.getWriter();
        pw.println("<html>");

        for(Cookie cookie : cookies){
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        }
        pw.println("</html>");
    }
}
