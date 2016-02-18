package com.springapp.mvc.converter;

/**
 * Created by Anton on 02.02.2016.
 */
import com.springapp.mvc.model.user.user_phones;
import com.springapp.mvc.services.user.UserPhonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;


public class phonesToClientPhones implements Converter<Object, user_phones> {

    @Autowired
    UserPhonesService clientsPhonesService;

    public user_phones convert(Object o) {
        Integer id = Integer.parseInt((String) o);
        user_phones profile = clientsPhonesService.findById(id);
        return profile;
    }
}
