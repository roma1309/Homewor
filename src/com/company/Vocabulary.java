package com.company;

import java.util.Objects;
public class Vocabulary {

    private String firstName;


    public Vocabulary(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Vocabulary)) return false;

        Vocabulary person = (Vocabulary) o;

        return firstName.equals(person.firstName);



    }



    @Override

    public int hashCode() {

        return Objects.hash(firstName);

    }


}