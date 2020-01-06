package models;
import java.util.ArrayList;
import java.util.List;
public class Squad {
    public class Squad {
        private int id;
        private String name;
        private int currentSize;
        private int maxSize;
        private String motive;
        private ArrayList<Hero> heroes = new ArrayList<>();
        private static ArrayList<Squad> squadInstance = new ArrayList<>();
}

    public Squad(String name, int maxSize, String motive) {
        this.id = squadInstance.size();
        this.name = name;
        this.currentSize = 0;
        this.maxSize = maxSize;
        this.motive = motive;
        this.squadInstance.add(this);
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }
