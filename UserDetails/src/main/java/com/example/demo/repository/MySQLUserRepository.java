package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public class MySQLUserRepository implements UserRepository {

	@Autowired
	JdbcTemplate template;

	@Override
	public User getUserById(int user_id) {
		// TODO Auto-generated method stub
		String sql = "SELECT user_id, user_name, pan, email, phone, cash, equity_value FROM User WHERE user_id=?";
		return template.queryForObject(sql, new UserRowMapper(), user_id);
	}

	@Override
	public User editUser(User user) {
		// TODO Auto-generated method stub
		String sql = "UPDATE User SET user_id = ?, user_name = ?, pan = ?, email = ?, phone = ?, cash = ?, equity_value = ?"
				+ "WHERE id = ?";
		template.update(sql, sql, user.getUser_id(), user.getUser_name(), user.getPan(), user.getEmail(), user.getPhone(), user.getCash(), user.getEquity_value());
		return user;
	}

	@Override
	public int deleteUser(int user_id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Trade WHERE user_id = ?";
		template.update(sql, user_id);
		return user_id;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO User(user_id, user_name, pan, email, phone, cash, equity_value) "
				+ "VALUES(?,?,?,?,?,?,?)";
		System.out.println(sql);
		template.update(sql, user.getUser_id(), user.getUser_name(), user.getPan(), user.getEmail(), user.getPhone(), user.getCash(), user.getEquity_value());
		return user;
	}

}

class UserRowMapper implements RowMapper<User> {
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("pin"), rs.getString("email"),
				rs.getString("phone"), rs.getDouble("cash"), rs.getDouble("equity_value"));
	}
}