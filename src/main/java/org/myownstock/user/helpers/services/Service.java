package org.myownstock.user.helpers.services;

import java.util.List;

public interface Service<T> {
    T add(T t);

    List<T> findAll();
}
