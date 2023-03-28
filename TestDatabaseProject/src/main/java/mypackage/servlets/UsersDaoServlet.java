package mypackage.servlets;

import mypackage.dao.UsersDao;
import mypackage.dao.UsersDaoJdbc;
import mypackage.dao.UsersDaoJdbcTemplate;
import mypackage.models.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@WebServlet("/users")
public class UsersDaoServlet extends HttpServlet {

    private UsersDao usersDao;

    @Override
    public void init(){
        Properties properties = new Properties();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        try {
            properties.load(
                    new FileInputStream(getServletContext().getRealPath("/WEB-INF/classes/db.properties")));

            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String dbDriverClassName = properties.getProperty("db.driverClassName");

            dataSource.setUrl(dbUrl);
            dataSource.setUsername(dbUsername);
            dataSource.setPassword(dbPassword);
            dataSource.setDriverClassName(dbDriverClassName);

            usersDao = new UsersDaoJdbcTemplate(dataSource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersDao.findAll();
        req.setAttribute("dataForServlet", users);
        req.getServletContext().getRequestDispatcher("/jsp/users.jsp").forward(req, resp);
    }
}
