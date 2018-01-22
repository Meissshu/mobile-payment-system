package com.epam.lab.mobilepaymentsystem.model;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_serivces",
            joinColumns = {@JoinColumn (name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn (name = "service_id", referencedColumnName = "id")}
    )
    private List<ServiceUnit> serviceUnits;

    public List<ServiceUnit> getServiceUnits() {
        return serviceUnits;
    }

    public void setServiceUnits(List<ServiceUnit> serviceUnits) {
        this.serviceUnits = serviceUnits;
    }

    public boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean getLocked() {
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
