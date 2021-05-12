package com.workFromHome.expensetrackerapi.Repository;

import com.workFromHome.expensetrackerapi.Models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    
}
