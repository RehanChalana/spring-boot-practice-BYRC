package com.rehan.ch13ex1.repository;

import com.rehan.ch13ex1.model.Account;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet resultSet , int i) throws SQLException {
        Account a = new Account();
        a.setId(resultSet.getInt("id"));
        a.setAmount(resultSet.getBigDecimal("amount"));
        a.setName(resultSet.getString("name"));
        return a;
    }
}
