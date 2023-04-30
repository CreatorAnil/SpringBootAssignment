package com.gl.boot.SpringBootDemo.database;

import org.springframework.data.repository.CrudRepository;

import com.gl.boot.SpringBootDemo.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, String>{
}
