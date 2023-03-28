package mypackage.repositories;

import mypackage.models.User;
import mypackage.single.FakeStorage;

import java.util.List;

public class UsersRepositoryInMemory implements UsersRepository{
    @Override
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String firstName, String password) {
        for (User user: FakeStorage.storage().users()) {
            if (user.getFirstName().equals(firstName) &&
                    user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
