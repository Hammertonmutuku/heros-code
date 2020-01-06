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

    private final String content;
    private static ArrayList<Hero> instances= new ArrayList<>();

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
