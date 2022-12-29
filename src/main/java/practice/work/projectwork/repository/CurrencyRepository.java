package practice.work.projectwork.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.work.projectwork.models.Currency;

@Repository
@Transactional
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
