package com.github.sttraeger.quarkus.control;

import com.github.sttraeger.quarkus.entity.Order;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class OrderService {

    @Inject
    private EntityManager em;

    public void createOrder(final String orderName) {
        final Order order = new Order();
        order.setName(orderName);
        em.persist(order);
    }
}
