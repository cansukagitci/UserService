package com.example.UserService.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_user")
    private int id_user;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "last_modified")
    private String last_modified;

    @Column(name = "create_time")
    private String create_time;


    public User() {
    }

    public User(int id_user, String user_name, String first_name, String last_name, String password, String email, boolean deleted, String phone_number, String last_modified, String create_time) {
        this.id_user = id_user;
        this.user_name = user_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.deleted = deleted;
        this.phone_number = phone_number;
        this.last_modified = last_modified;
        this.create_time = create_time;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", user_name='" + user_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", deleted=" + deleted +
                ", phone_number='" + phone_number + '\'' +
                ", last_modified='" + last_modified + '\'' +
                ", create_time='" + create_time + '\'' +
                '}';
    }
}
