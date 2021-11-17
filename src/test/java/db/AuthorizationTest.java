package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Авторизація avt;
    Authorization authorization;
    Database db;

    @BeforeEach
    void setUp() {
        authorization = new Authorization();
        avt = new Авторизація();
        db = new Database();
    }

    @Test
    void authorize() {
        assertEquals(avt.авторизуватися(db), authorization.authorize(db));
    }
}