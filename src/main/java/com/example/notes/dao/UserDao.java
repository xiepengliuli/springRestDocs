package com.example.notes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.notes.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
