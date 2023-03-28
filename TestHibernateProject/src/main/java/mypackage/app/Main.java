package mypackage.app;

import mypackage.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/testdatabase");
        configuration.setProperty("hibernate.connection.username", "root");
        configuration.setProperty("hibernate.connection.password", "root");
        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        configuration.addResource("User.hbm.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        User user = session.load(User.class, 1);

        System.out.println(user);

        /*
        session.beginTransaction();
        session.save(new User("Row", "Column"));
        session.getTransaction().commit();
        */

        List<User> users = session.createQuery("from User", User.class).list();

        for (User u: users) {
            System.out.println(u);
        }
    }
}
