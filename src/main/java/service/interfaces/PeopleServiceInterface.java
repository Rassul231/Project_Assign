package service.interfaces;

import models.People;

import java.util.List;

public interface PeopleServiceInterface {

    People getById(int id);
    void deleteById(int id);
    People create(People people);
    List<People> findByName(String name);
    List<People> findByPhone(String phone);
}