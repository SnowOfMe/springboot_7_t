package com.wkcto.multidb.service;

import com.wkcto.multidb.model.Person;

/**
 * ClassName:PersonService
 * package:com.wkcto.multiple.service
 * Description:
 *
 * @Data:2018/8/7 10:02
 * @Auther:wangxin
 */
public interface PersonService {
    Person getPersonById(Integer id);

    int updatePerson(Person person);
}
