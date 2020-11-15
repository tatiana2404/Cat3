package com.company;

public class Cat {
    private String name;
    private int age;
    private String color;
    private int weight;
    private String breed;

    public Cat(){}

    public Cat(String name, int age, String color, int weight, String breed){
        this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;
        this.breed=breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getWeight(){
        return  weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }
    public String oldest()
    {
        if(age>5){
            return name+" old cat";
        }
        else {
            return name+ " young cat";
        }
    }
}
