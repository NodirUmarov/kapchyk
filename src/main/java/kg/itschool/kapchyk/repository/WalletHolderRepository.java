package kg.itschool.kapchyk.repository;

import kg.itschool.kapchyk.model.entity.WalletHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletHolderRepository extends JpaRepository<WalletHolder, String> {
}