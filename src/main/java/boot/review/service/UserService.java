package boot.review.service;

import boot.review.entity.User;
import java.util.List;

public interface UserService {
    List<User> getUsers();

    User addUser(User user);

    User getByEmail(String email);
}
