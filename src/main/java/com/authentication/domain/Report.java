package com.authentication.domain;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Отчеты
 */
@Data
public class Report {

    private int id;

    private String name;

    private Timestamp created;

    private Person person;

    /**
     * т.е. при каждом запросе на формирование отчета у нас будет генерироваться новый отчет с новой датой.
     *
     * @param id
     * @param name
     * @param person
     * @return
     */
    public static Report of(int id, String name, Person person) {
        Report r = new Report();
        r.id = id;
        r.name = name;
        r.person = person;
        r.created = new Timestamp(System.currentTimeMillis());
        return r;
    }
}
