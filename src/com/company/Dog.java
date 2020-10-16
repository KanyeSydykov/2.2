package com.company;

public   class Dog  extends Wolf{

    private String name ;
    private String getName(){

        return name;
    }

    public Dog(com.company.gender gender, int height) {
        super(gender, height);
    }

    static int num(int sa, int wa){
        return sa + wa;
    }

    static int num2(int wa, int sa){
        return wa + sa;
    }

}
