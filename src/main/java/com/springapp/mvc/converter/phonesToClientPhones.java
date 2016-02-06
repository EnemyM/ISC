package com.springapp.mvc.converter;

/**
 * Created by Anton on 02.02.2016.
 */
import com.springapp.mvc.model.clients.clients_phones;
import com.springapp.mvc.services.clients.ClientsPhonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;


public class phonesToClientPhones implements Converter<Object, clients_phones> {

    @Autowired
    ClientsPhonesService clientsPhonesService;

    public clients_phones convert(Object o) {
        Integer id = Integer.parseInt((String) o);
        clients_phones profile = clientsPhonesService.findById(id);
        return profile;
    }
}
