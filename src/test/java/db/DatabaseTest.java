package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    БазаДаних baza;
    Database db;

    @BeforeEach
    void setUp() {
        baza = new БазаДаних();
        db = new Database();
    }

    @Test
    void getUserData() {
        assertEquals(db.getUserData(), baza.отриматиДаніКористувача());
    }

    @Test
    void getStatistics() {
        assertEquals(db.getStatistics(), baza.отриматиСтатистичніДані());
    }
}