package practice.work.projectwork.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.work.projectwork.models.ExchangeValue;

@Repository
@Transactional
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
}
