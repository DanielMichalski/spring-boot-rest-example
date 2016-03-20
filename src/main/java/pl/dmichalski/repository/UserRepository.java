package pl.dmichalski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
