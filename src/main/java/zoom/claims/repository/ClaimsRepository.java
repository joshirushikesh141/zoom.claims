package zoom.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zoom.claims.entity.Claims;

@Repository
public interface ClaimsRepository extends JpaRepository<Claims, Integer>{

}
