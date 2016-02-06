package com.springapp.mvc.model.clients;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by Anton on 24.01.2016.
 */
@Entity
@Table(name = "clients")
public class clients {

    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_client;

    @NotEmpty
    @Column(name = "name_firm")
    private String name_firm;

    @NotEmpty
    @Column(name = "first_name")
    private String first_name;

    @NotEmpty
    @Column(name = "last_name")
    private String last_name;

    @NotEmpty
    @Column(name = "email_client")
    private String email_client;

    @NotEmpty
    @Column(name = "client_password")
    private String client_password;

    @NotEmpty
    @Column(name = "client_userName")
    private String client_userName;

    @OneToMany(mappedBy = "clients", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<clients_phones> clients_phones = new HashSet<clients_phones>();

//    @OneToMany(mappedBy = "clients",cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<orders> orders = new HashSet<orders>();


    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public String getName_firm() {
        return name_firm;
    }

    public void setName_firm(String name_firm) {
        this.name_firm = name_firm;
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

    public Set<com.springapp.mvc.model.clients.clients_phones> getClients_phones() {
        return clients_phones;
    }

    public void setClients_phones(Set<com.springapp.mvc.model.clients.clients_phones> clients_phones) {
        this.clients_phones = clients_phones;
    }

//    public Set<orders> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Set<orders> orderses) {
//        this.orders = orderses;
//    }

    public String getEmail_client() {
        return email_client;
    }

    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    public String getClient_password() {
        return client_password;
    }

    public void setClient_password(String client_password) {
        this.client_password = client_password;
    }

    public String getClient_userName() {
        return client_userName;
    }

    public void setClient_userName(String client_userName) {
        this.client_userName = client_userName;
    }

    public String toString(){
        return "id client: " + id_client + ", name firm: " + name_firm +
                ", first name: " + ", last_name" + last_name + ", email: " + email_client + ", client password: "
                + client_password + ", client user Name: " + client_userName;
    }
}
