package model;

import annotation.AfterCurrentDate;
import annotation.NonNull;
import annotation.Size;

import java.time.LocalDate;

public class Person {

    @Size(max = 15, min = 2)
    private String surname;

    @NonNull
    @Size(max = 10, min = 1)
    private String name;

    @AfterCurrentDate
    private LocalDate birthDate;

    public Person(String surname, String name, LocalDate birthDate) {
        this.surname = surname;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
