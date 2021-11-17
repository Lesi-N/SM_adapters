package db;

public class Database extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatistics() {
        return отриматиСтатистичніДані();
    }
}
