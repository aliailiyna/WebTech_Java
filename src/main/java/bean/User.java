package bean;

import java.io.Serializable;

import bean.enums.UserRole;

public class User implements Serializable {
    private int userId;
    private UserRole userRole;
    private String name;
    private String patronymic;
    private String surname;
    private String login;
    private String password;
    private String email;
    private String telephone;
    private String address;

    public User(int userId, UserRole userRole, String name, String patronymic, String surname,
                String login, String password, String email, String telephone, String adress) {
        this.userId = userId;
        this.userRole = userRole;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public UserRole getUserRole()
    {
        return userRole;
    }

    public void setUserRole(UserRole userRole)
    {
        this.userRole = userRole;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPatronymic()
    {
        return patronymic;
    }

    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelephone()
    {
        return name;
    }

    public void setTelephone(String telephone)
    {
        this.name = telephone;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
