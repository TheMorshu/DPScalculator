/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.TheMorshu.dpscalculator.Logic;

import java.util.ArrayList;

/**
 *
 * @author ilmari
 */
public class BonusCalculator {
    
    private ArrayList<WornItem> allHelms;
    private ArrayList<WornItem> allAmulets;
    private ArrayList<WornItem> allBodies;
    private ArrayList<WornItem> allLegs;
    private ArrayList<WornItem> allBoots;
    private ArrayList<WornItem> allCapes;
    private ArrayList<WornItem> allRings;
    private ArrayList<WornItem> allGloves;
    private ArrayList<WornItem> allShields;
    private ArrayList<Weapon> allWeapons;
    //these are all possible items
    
    
    
    private ArrayList<WornItem> wornItems;
    private Weapon weapon;
    //these are items in use
    
    private String attackType;

    public BonusCalculator() {
        this.wornItems = new ArrayList();
        this.allWeapons = new ArrayList();
        this.allHelms = new ArrayList();
        this.allAmulets = new ArrayList();
        this.allBodies = new ArrayList();
        this.allLegs = new ArrayList();
        this.allBoots = new ArrayList();
        this.allCapes = new ArrayList();
        this.allRings = new ArrayList();
        this.allGloves = new ArrayList();
        this.allShields = new ArrayList();
        init();
    }
    
    public void init() {
        loadWeapons();
        loadHelms();
        loadAmulets();
        //loadHelms();
        //loadAmulets();
        //...
        
    }
    
    public void setType(String type) {
        this.attackType = type;
    }
    
    public void loadWeapons() { //fills wep list with all possible weapons
        allWeapons.add(new Weapon("none", 6, 0,0,0,0));
        allWeapons.add(new Weapon("Abyssal whip", 6, 82,0,82,0));
        allWeapons.add(new Weapon("Godsword", 4, 132,0,132,80));
    }
    
    public ArrayList<Weapon> getAllWeapons() {
        return allWeapons;
    }
    
    public void changeWeapon(String wepName) {
        for (int i = 0; i<allWeapons.size(); i++) {
            if (allWeapons.get(i).getName().equals(wepName)) {
                weapon = allWeapons.get(i);
                return;
            }
        }
    }
    
    
    
    public void loadHelms() {
        allHelms.add(new WornItem("none", 0,0,0,0));
        allHelms.add(new WornItem("Berserker helm", 3,0,0,0));
    }
    
    public ArrayList<WornItem> getAllHelms() {
        return allHelms;
    }
    
    public void changeHelm(String name) {
        for (int i = 0; i<allHelms.size(); i++) {
            if (allHelms.get(i).getName().equals(name)) {
                wornItems.add(allHelms.get(i));
                return;
            }
        }
    }
    
    public void loadAmulets() {
        allAmulets.add(new WornItem("none", 0,0,0,0));
        allAmulets.add(new WornItem("Amulet of Str", 10,0,0,0));
    }
    
    public ArrayList<WornItem> getAllAmulets() {
        return allAmulets;
    }
    
    public void changeAmulet(String name) {
        for (int i = 0; i<allAmulets.size(); i++) {
            if (allAmulets.get(i).getName().equals(name)) {
                wornItems.add(allAmulets.get(i));
                return;
            }
        }
    }

    public ArrayList<WornItem> getAllBodies() {
        return allBodies;
    }

    public ArrayList<WornItem> getAllLegs() {
        return allLegs;
    }

    public ArrayList<WornItem> getAllBoots() {
        return allBoots;
    }

    public ArrayList<WornItem> getAllCapes() {
        return allCapes;
    }

    public ArrayList<WornItem> getAllRings() {
        return allRings;
    }

    public ArrayList<WornItem> getAllGloves() {
        return allGloves;
    }

    public ArrayList<WornItem> getAllShields() {
        return allShields;
    }
    
    
    

    

    
    
    
    public void clearWornItems() {
        this.wornItems.clear();
    }
    
    
    public int getStrBonus() {
        int strBonus = 0;
        strBonus += weapon.getStrBonus();
        for (int i= 0; i<wornItems.size(); i++) {
            strBonus += wornItems.get(i).getStrBonus();
        }
        //laskee kaikkien listassa olevien ja aseen str bonuksen yhteen
        return strBonus;
    }
    
    public int getAttackBonus(String style) {
        int attBonus = 0;
        attBonus += weapon.getAttBonus(this.attackType);
        for (int i= 0; i<wornItems.size(); i++) {
            attBonus += wornItems.get(i).getAttBonus(this.attackType);
        }
        //parametrin avulla laskee oikean tyylin bonukset yhteen aseesta ja muista itemeistä
        return attBonus;
    }
    public int getAttackSpeed() {
        return this.weapon.getAttackSpeed();
    }

    
    
}
