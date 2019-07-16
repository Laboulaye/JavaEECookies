import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;

@WebServlet("/set-cookies")
public class SetCookiesServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //Создаем куки
        Cookie cookie1 = new Cookie("id", "123");
        //Устанавливаем время сохранения куки
        cookie1.setMaxAge(24*60*60);


        Cookie cookie2 = new Cookie("name" , "Tom");
        cookie2.setMaxAge(24*60*60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
