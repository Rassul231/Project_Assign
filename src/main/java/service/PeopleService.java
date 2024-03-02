package service;

import models.People;
import org.springframework.stereotype.Service;
import repositories.PeopleRepositoryInterface;
import service.interfaces.PeopleServiceInterface;

import java.util.List;

@Service
public class PeopleService implements PeopleServiceInterface {
    private final PeopleRepositoryInterface peopleRepository;

    public PeopleService(PeopleRepositoryInterface peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public People getById(int id){
        People people =  peopleRepository.findById(id).orElse(null);
        if(people!=null){
            people.setCount(people.getCount()+1);
            peopleRepository.save(people);
            return people;
        }else{
            return null;
        }
    }
    @Override
    public void deleteById(int id) {
        peopleRepository.deleteById(id);
    }

    @Override
    public People create(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public List<People> findByName(String name) {
        return peopleRepository.findByFullname(name);
    }

    @Override
    public List<People> findByPhone(String phone) {
        return peopleRepository.findByPhone(phone);
    }
}