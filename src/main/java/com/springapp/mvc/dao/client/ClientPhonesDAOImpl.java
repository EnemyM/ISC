package com.springapp.mvc.dao.client;

import com.springapp.mvc.dao.AbstractDao;
import com.springapp.mvc.model.clients.clients_phones;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anton on 27.01.2016.
 */
@Repository("clientPhonesDAO")
public class ClientPhonesDAOImpl extends AbstractDao<Integer, clients_phones> implements ClientPhonesDAO {

    @SuppressWarnings("unchecked")
    public List<clients_phones> findAllPhones() {
        Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("phone_number"));
        return (List<clients_phones>) criteria.list();
    }

    public clients_phones findById(int id_phone) {
        return getByKey(id_phone);
    }

    public clients_phones findByNumber(String phone_number) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("phone_number", phone_number));
        return (clients_phones) criteria.uniqueResult();
    }
}
