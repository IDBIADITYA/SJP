package com.sjp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjp.Model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
