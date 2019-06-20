package com.wangsu.web.service;

import com.wangsu.web.domain.Person;
import com.wangsu.web.repository.PersonRepository;

/**
 * @author linhz
 * @version 1.0 2019/6/19
 * @since 1.0
 */
public class PersonServiceBean {
    private PersonRepository personRepository;

    //通过构造器参数，让容器把创建好的依赖对象注入进PersonServiceBean，当然叶也可以使用setter方法进行注入
    public PersonServiceBean(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void save(Person person) {
        personRepository.save(person);
    }
}

