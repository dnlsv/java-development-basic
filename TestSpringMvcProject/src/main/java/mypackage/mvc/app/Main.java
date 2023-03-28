package mypackage.mvc.app;

import mypackage.mvc.dao.UsersDao;
import mypackage.mvc.dao.UsersDaoJdbcTemplate;
import mypackage.mvc.models.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/testdatabase");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        UsersDao usersDao = new UsersDaoJdbcTemplate(dataSource);

        List<User> users = usersDao.findAll();
        System.out.println(users);
    }
}
