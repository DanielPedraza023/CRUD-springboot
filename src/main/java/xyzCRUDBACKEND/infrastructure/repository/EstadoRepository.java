package xyzCRUDBACKEND.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyzCRUDBACKEND.domain.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
