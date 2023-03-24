package ru.kata.spring.boot_security.demo.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @NotEmpty(message = "Это поле не должно быть пустым")
    @Size(min = 2, max = 30, message = "Слишком длинное имя")
    @Column(name = "username")
    private String username;
    @NotEmpty(message = "Это поле не должно быть пустым")
    @Size(min = 2, max = 30, message = "Слишком длинная фамилия")
    @Column(name = "lastname")
    private String lastname;
    @Min(value = 0, message = "Возвраст не может быть отрицательным")
    @Column(name = "age")
    private int age;
    @NotEmpty(message = "Это поле не должно быть пустым")
    @Email(message = "Адрес эл.почты некорректный")
    @Column(name = "email")
    private String email;
    @NotEmpty(message = "Password не должен быть пустым")
    @Size(min = 4, message = "Password должен быть не менее 4-х символов")
    @Column(name = "password")
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
