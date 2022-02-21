package com.knoldus.learning.java.repository;

import com.knoldus.learning.java.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {


}
