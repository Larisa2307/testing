package ro.esolutions.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.esolutions.testing.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
