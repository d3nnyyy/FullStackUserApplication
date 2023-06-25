package ua.dtsebulia.FullStackUserApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dtsebulia.FullStackUserApplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
