package com.springapp.mvc.model.user;

import javax.persistence.*;

/**
 * Created by Anton on 18.02.2016.
 */
@Entity
@Table(name = "user_roles")
public class user_roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_roles")
    private Integer id_user_roles;

    @Column(name = "user_role")
    private String user_role;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private user user;

    public Integer getId_user_roles() {
        return id_user_roles;
    }

    public void setId_user_roles(Integer id_user_roles) {
        this.id_user_roles = id_user_roles;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public com.springapp.mvc.model.user.user getUser() {
        return user;
    }

    public void setUser(com.springapp.mvc.model.user.user user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "user_roles{" +
                "id_user_roles=" + id_user_roles +
                ", user_role='" + user_role + '\'' +
                ", user=" + user +
                '}';
    }
}
