package com.company.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

    public static void main(String[] args) {

        List<Dictionary> allItems = new ArrayList<>();
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "Apple is red");
        d.newEntry("Banana", "Banana is yellow");
        d.newEntry("Hi", "");
        d.newEntry("", "");
        allItems.forEach(System.out::println);
        System.out.println(d.look("Apple"));
        System.out.println(d.look("Hi"));
        System.out.println(d.look("test"));
        System.out.println(d.look("Banana"));


    }

    /*

    private HashMap<String, String> map;
    public Dictionary() {
        map = new HashMap<>();
    }
    public void newEntry(String key, String value) {
        map.put(key, value);
    }
    public String look(String key) {
        return map.getOrDefault(key, "Cant find entry for " + key);
    }

    */


    String name;
    String description;
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Dictionary(){};
    List<Dictionary> allItems = new ArrayList<>();

    public Dictionary(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Dictionary newEntry (String name, String description) {
        Dictionary d = new Dictionary(name, description);
        allItems.add(d);
        return d;
    }

    public String look (String find){
        String output = "";
        for (Dictionary d: allItems) {
            if ((d.getName().equals(find)) && d.getDescription()!=""){
                output =  d.getDescription();
                break;
            } else {
                output =  "Cant find entry for " + find;
            }
        }
        return output;
    }
    }




