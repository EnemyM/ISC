package com.springapp.mvc.services.clients;

import com.springapp.mvc.dao.client.ClientPhonesDAO;
import com.springapp.mvc.model.clients.clients_phones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Anton on 27.01.2016.
 */
@Service("clientsPhonesService")
@Transactional
public class ClientsPhonesServiceImpl implements ClientsPhonesService {

    @Autowired
    ClientPhonesDAO dao;

    public List<clients_phones> findAllPhones() {
        return dao.findAllPhones();
    }

    public clients_phones findById(int id_phone) {
        return dao.findById(id_phone);
    }

    public clients_phones findByNumber(String phone_number) {
        return dao.findByNumber(phone_number);
    }
}
