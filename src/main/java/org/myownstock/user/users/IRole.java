package org.myownstock.user.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRole extends JpaRepository<Role, Long> {
}
