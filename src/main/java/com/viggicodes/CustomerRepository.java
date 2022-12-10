package com.viggicodes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> { // <Entity, primary key data type>
    // this repo can perform crud operations
}
