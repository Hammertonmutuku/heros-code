package models;

import java.util.ArrayList;

public class Hero {
    private int id;
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private int squad;
    private static ArrayList<Hero> heroInstance = new ArrayList<>();

    //private static ArrayList<Hero> instances= new ArrayList<>();

    public Hero(String name, int age, String specialPower, String weakness, int squad) {
        this.id = heroInstance.size();
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.squad = squad;
        this.heroInstance.add(this);
    }

    public Hero (String content){
        this.content = content;
        instances.add(this);
    }
    public String getContent() {
        return content;
    }
    public static ArrayList<Hero> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }


}
