package com.run.pojo;

import com.mysql.cj.jdbc.SuspendableXAConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author edxuanlen
 * @PROJECT questionnaire
 * @Date 2019/11/8 下午4:54
 * @Version 1.0
 **/
class UserTest {
//    private User user;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getid() throws Exception{
        final User user = new User();
        final Field filed = user.getClass().getDeclaredField("id");
        filed.setAccessible(true);
        filed.set(user, "root");

        final String result = user.getUsername();
        assertEquals("root", result, "don't match");

    }

    @Test
    void getpassword() {
    }

    @Test
    void setid() {
        final User user = new User();
        user.setUsername("root");
//        final Field filed = user.getClass().getDeclaredField("id");
//        filed.setAccessible(true);
        assertEquals("root", user.getUsername(), "don't match");
    }

    @Test
    void setpassword() {
    }
}