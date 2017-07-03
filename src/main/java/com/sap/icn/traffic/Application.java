package com.sap.icn.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by I321761 on 2017/7/3.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        jdbcTemplate.execute("select current_timestamp()");
    }
}
