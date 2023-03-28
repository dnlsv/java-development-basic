package mypackage.single;

import mypackage.models.User;

import java.util.ArrayList;
import java.util.List;

public class FakeStorage {

    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        users = new ArrayList<>();
        users.add(new User("Denis", "Lisenkov", "User"));
        users.add(new User("Denis2", "Lisenkov2", "User"));
        users.add(new User("Denis3", "Lisenkov3", "User"));
        users.add(new User("Denis4", "Lisenkov4", "User"));
        users.add(new User("Denis5", "Lisenkov5", "User"));
    }

    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
