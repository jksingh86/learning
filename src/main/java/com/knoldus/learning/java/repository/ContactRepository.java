package com.knoldus.learning.java.repository;

import com.knoldus.learning.java.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {


}