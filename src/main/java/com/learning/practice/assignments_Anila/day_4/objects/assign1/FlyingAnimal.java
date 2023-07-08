package com.learning.practice.assignments_Anila.day_4.objects.assign1;

public class FlyingAnimal implements Animal{

    @Override
    public String speak() {
        return "Flying animals will speak";
    }

    @Override
    public String walk() {
        return "Flying animals will walk";
    }

    public String fly(){
        return "Flying animals will fly";
    }
}
