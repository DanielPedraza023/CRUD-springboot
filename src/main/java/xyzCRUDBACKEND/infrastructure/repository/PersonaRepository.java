package xyzCRUDBACKEND.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyzCRUDBACKEND.domain.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
