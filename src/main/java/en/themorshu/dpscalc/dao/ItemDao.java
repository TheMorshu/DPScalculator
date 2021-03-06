/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.themorshu.dpscalc.dao;

import en.themorshu.dpscalc.logic.Weapon;
import en.themorshu.dpscalc.logic.WornItem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilmar
 */
public class ItemDao {
    
    private String weapons;
    private String amulets;
    private String bodies;
    private String boots;
    private String legs;
    private String capes;
    private String gloves;
    private String helms;
    private String rings;
    private String shields;

    public ItemDao() {
        this.weapons = "csv/weapons.csv";
        this.amulets = "csv/amulets.csv";
        this.helms = "csv/helms.csv";
        this.bodies = "csv/bodies.csv";
        this.legs = "csv/legs.csv";
        this.boots = "csv/boots.csv";
        this.gloves = "csv/gloves.csv";
        this.rings = "csv/rings.csv";
        this.capes = "csv/capes.csv";
        this.shields = "csv/shields.csv";
    }
    
    
    private ArrayList<String> readFile(String filename) {
        ArrayList<String> dataList = new ArrayList();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(filename));
            scanner.nextLine();
            while(scanner.hasNext()) {
                dataList.add(scanner.nextLine());
            }
            scanner.close();
            return dataList;
        } catch (FileNotFoundException ex) {
            return dataList;
        }
    }
    
    
    public ArrayList<Weapon> getWeapons() {
        ArrayList<String> list = readFile(this.weapons);
        ArrayList<Weapon> weaponList = new ArrayList();
        if (list.size() == 0) {
            weaponList.add(new Weapon("none",0,0,0,0,0));
            return weaponList;
        }
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            Weapon weapon = new Weapon(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]), Integer.parseInt(unit[5]));
            weaponList.add(weapon);
        }
        return weaponList;
    }
    
    public ArrayList<WornItem> getAmulets() {
        ArrayList<String> list = readFile(this.amulets);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    
    public ArrayList<WornItem> getHelms() {
        ArrayList<String> list = readFile(this.helms);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getBodies() {
        ArrayList<String> list = readFile(this.bodies);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getLegs() {
        ArrayList<String> list = readFile(this.legs);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getBoots() {
        ArrayList<String> list = readFile(this.boots);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getGloves() {
        ArrayList<String> list = readFile(this.gloves);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getRings() {
        ArrayList<String> list = readFile(this.rings);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getShields() {
        ArrayList<String> list = readFile(this.shields);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getCapes() {
        ArrayList<String> list = readFile(this.capes);
        ArrayList<WornItem> itemList = new ArrayList();
        if (readingFileFailed(list, itemList)) return itemList;
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }

    public boolean readingFileFailed(ArrayList<String> list, ArrayList<WornItem> itemList) {
        if (list.size() == 0) {
            itemList.add(new WornItem("none",0,0,0,0));
            return true;
        }
        return false;
    }

}
