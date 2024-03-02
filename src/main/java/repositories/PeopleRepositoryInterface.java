package repositories;

import models.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepositoryInterface extends JpaRepository<People, Integer> {
    List<People> findByFullname(String name);
    List<People> findByPhone(String phone);
}