package service;

import bean.User;

public interface ClientService {
    void logIn(User user);
    void signUp(User user);
    void signOut(String login);
}
