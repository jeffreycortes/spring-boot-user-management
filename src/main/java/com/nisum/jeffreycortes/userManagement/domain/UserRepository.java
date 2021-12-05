package com.nisum.jeffreycortes.userManagement.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    public User findUserByEmail(Email email);
}
