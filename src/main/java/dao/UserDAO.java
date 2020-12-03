package dao;

import bean.User;

public interface UserDAO {
    void signUp(User user);
    void logIn(User user);
}
