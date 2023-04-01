package org.example.dao;

import org.example.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public class UsersDaoJdbcTemplate implements UsersDao{
    private final String SQL_SELECT_ALL = "select * from user";
    private final String SQL_SELECT_BY_ID = "select * from user where id = ?";

    private JdbcTemplate template;

    private RowMapper<User> userRowMapper = (ResultSet resultSet, int i ) -> {
        return new User(
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name")
        );
    };

    public UsersDaoJdbcTemplate(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    @Override
    public Optional<User> read(int id) {
        return Optional.empty();
    }

    @Override
    public void create(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public List<User> findAllByFirstName(String firstName) {
        return template.query(SQL_SELECT_BY_ID, userRowMapper, firstName);
    }
}
