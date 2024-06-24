package org.josec.webapp.jaxws.models;

public class Person {
    String name;



    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}