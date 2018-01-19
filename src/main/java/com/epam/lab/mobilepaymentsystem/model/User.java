package com.epam.lab.mobilepaymentsystem.model;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User extends AbstractEntity {

    @Column (name = "is_admin")
    private boolean isAdmin;

    @Column (name = "is_locked")
    private boolean isLocked;

    @Column (name = "personal_account")
    private int personalAccount;

    @Column (name = "login")
    private String login;

    @Column (name = "password")
    private String password;

    public User() {

    }

    public User(String login,
                String password,
                int personalAccount,
                boolean isAdmin,
                boolean isLocked) {
        this.login = login;
        this.password = password;
        this.personalAccount = personalAccount;
        this.isAdmin = isAdmin;
        this.isLocked = isLocked;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(int personalAccount) {
        this.personalAccount = personalAccount;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
