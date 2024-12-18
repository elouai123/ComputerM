package ma.emsi.elouai.compds.dao.repositories;

import ma.emsi.elouai.compds.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProce(String proce);
}
