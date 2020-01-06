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
