package practice.work.projectwork.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.work.projectwork.models.Limit;

@Repository
@Transactional
public interface LimitRepository extends JpaRepository<Limit, Long> {
}
