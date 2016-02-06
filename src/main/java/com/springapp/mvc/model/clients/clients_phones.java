package com.springapp.mvc.model.clients;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by Anton on 24.01.2016.
 */
@Entity
@Table(name = "clients_phones")
public class clients_phones {
    @Id
    @Column(name = "id_phone")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_phone;

    @NotEmpty
    @Column(name = "phone_number")
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private clients clients;

    public Integer getId_phone() {
        return id_phone;
    }

    public void setId_phone(Integer id_phone) {
        this.id_phone = id_phone;
    }


    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public com.springapp.mvc.model.clients.clients getClients() {
        return clients;
    }

    public void setClients(com.springapp.mvc.model.clients.clients clients) {
        this.clients = clients;
    }

    public  String toString(){
        return "id phone: " + id_phone + ", phone number: " + phone_number +
                ", id client: " + clients.getId_client();
    }
}
