package task3;

public class Authorization {
    public boolean authorize(Database db) {
        db.getUserInfo();
        return true;
    }
}
