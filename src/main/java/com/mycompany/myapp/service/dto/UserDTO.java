package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the User entity.
 */
public class UserDTO implements Serializable {

    private String id;

    private String first_name;

    private String last_name;

    private String psw;

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

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    public Integer getBasket() {
        return basket;
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

        UserDTO userDTO = (UserDTO) o;

        if ( ! Objects.equals(id, userDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
            "id=" + id +
            ", first_name='" + first_name + "'" +
            ", last_name='" + last_name + "'" +
            ", psw='" + psw + "'" +
            ", basket='" + basket + "'" +
            '}';
    }
}
