package models;

import java.util.ArrayList;

public class Hero {

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
