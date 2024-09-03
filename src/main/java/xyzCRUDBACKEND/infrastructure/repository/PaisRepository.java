package xyzCRUDBACKEND.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyzCRUDBACKEND.domain.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

}
