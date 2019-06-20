package com.wangsu.web.repository;

import com.wangsu.web.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author linhz
 * @version 1.0 2019/6/9
 * @since 1.0
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
