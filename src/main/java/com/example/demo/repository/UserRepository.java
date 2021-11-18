package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.vo.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	@Query("update User e set e.isActive=false where e.userId=?1")
	@Modifying
	public void softDelete(int id); 


}