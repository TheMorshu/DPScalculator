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
        this.weapons = "weapons.csv";
        this.amulets = "amulets.csv";
        this.helms = "helms.csv";
        this.bodies = "bodies.csv";
        this.legs = "legs.csv";
        this.boots = "boots.csv";
        this.gloves = "gloves.csv";
        this.rings = "rings.csv";
        this.capes = "capes.csv";
        this.shields = "shields.csv";
    }
    
    
    private ArrayList<String> readFile(String filename) throws FileNotFoundException {
        ArrayList<String> dataList = new ArrayList();
        Scanner scanner = new Scanner(new File(filename));
        scanner.nextLine();
        while(scanner.hasNext()) {
            dataList.add(scanner.nextLine());
        }
        scanner.close();
        return dataList;
    }
    
    
    public ArrayList<Weapon> getWeapons() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.weapons);
        ArrayList<Weapon> weaponList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            Weapon weapon = new Weapon(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]), Integer.parseInt(unit[5]));
            weaponList.add(weapon);
        }
        return weaponList;
    }
    
    public ArrayList<WornItem> getAmulets() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.amulets);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    
    public ArrayList<WornItem> getHelms() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.helms);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getBodies() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.bodies);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getLegs() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.legs);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getBoots() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.boots);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getGloves() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.gloves);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getRings() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.rings);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getShields() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.shields);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    public ArrayList<WornItem> getCapes() throws FileNotFoundException {
        ArrayList<String> list = readFile(this.capes);
        ArrayList<WornItem> itemList = new ArrayList();
        for (int i = 0; i<list.size(); i++) {
            String[] unit = list.get(i).split(";");
            WornItem item = new WornItem(unit[0], Integer.parseInt(unit[1]), Integer.parseInt(unit[2]), Integer.parseInt(unit[3]), Integer.parseInt(unit[4]));
            itemList.add(item);
        }
        return itemList;
    }
    
    
    
    
    
    
    
}
