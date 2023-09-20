package com.project;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

	@Query("select m from Manager m where m.managerUsername = :managerUsername and m.password = :password")
	Manager findByUsernameAndPassword(@Param("managerUsername") String username, @Param("password") String password);

}

