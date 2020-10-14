package com.example.sweater.repos;

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User repo.
 */
public interface UserRepo extends JpaRepository<User, Long> {

    /**
     * Find by username user.
     *
     * @param username the username
     * @return the user
     */
    User findByUsername(String username);

    /**
     * Find by activation code user.
     *
     * @param code the code
     * @return the user
     */
    User findByActivationCode(String code);
}
