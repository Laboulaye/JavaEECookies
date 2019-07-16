import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;

@WebServlet("/delete-cookies")
public class DeleteCookiesServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //перезаписываем полученные куки с именем id
        Cookie cookie  = new Cookie("id", "");
        //и устанавливаем время жизни куки 0 сек.
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
