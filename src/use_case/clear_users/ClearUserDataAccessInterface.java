package use_case.clear_users;

// TODO Complete me
import entity.User;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    void save(User user);

    User get(String username);
}
