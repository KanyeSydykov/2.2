package com.company;

public class Animal {

   private gender gender  ;
   private int height;

    public Animal(com.company.gender gender, int height) {
        this.gender = gender;
        this.height = height;
    }

    public com.company.gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }
}
