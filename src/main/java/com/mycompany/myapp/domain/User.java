package com.mycompany.myapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A User.
 */

@Document(collection = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("first_name")
    private String first_name;

    @Field("last_name")
    private String last_name;

    @Field("psw")
    private String psw;

    @Field("basket")
    private Integer basket;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public User first_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public User last_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPsw() {
        return psw;
    }

    public User psw(String psw) {
        this.psw = psw;
        return this;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Integer getBasket() {
        return basket;
    }

    public User basket(Integer basket) {
        this.basket = basket;
        return this;
    }

    public void setBasket(Integer basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        if (user.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", first_name='" + first_name + "'" +
            ", last_name='" + last_name + "'" +
            ", psw='" + psw + "'" +
            ", basket='" + basket + "'" +
            '}';
    }
}
