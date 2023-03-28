package mypackage.mvc.repositories;

import mypackage.mvc.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByOwner_FirstName(String firstNameOwner);
}
