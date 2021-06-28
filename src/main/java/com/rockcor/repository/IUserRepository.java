/**
 * 
 */
package com.rockcor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockcor.model.User;

/**
 * @author ricardodelgadocarreno
 *
 */
public interface IUserRepository extends JpaRepository<User, Integer> {

	/**
	 * The Username is a fiel from user
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
}
