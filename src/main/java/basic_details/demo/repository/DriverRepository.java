package basic_details.demo.repository;

import basic_details.demo.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, String> {
    boolean existsByEmail(String email); // 👈 Add this line
}
