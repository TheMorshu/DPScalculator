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
    
    private ArrayList<WornItem> allWornItems;
    private ArrayList<Weapon> allWeapons;
    
    private ArrayList<WornItem> wornItems;
    private Weapon weapon;
    
    private String attackType;

    public BonusCalculator() {
        this.wornItems = new ArrayList();
        this.allWeapons = new ArrayList();
        init();
    }
    
    public void init() {
        loadWeapons();
        //loadHelms();
        //loadAmulets();
        //...
        
    }
    
    public void loadWeapons() { //fills wep list with all possible weapons
        allWeapons.add(new Weapon("none", 6, 0,0,0,0));
        allWeapons.add(new Weapon("Abyssal whip", 6, 82,0,82,0));
        allWeapons.add(new Weapon("Godsword", 4, 132,0,132,80));
    }
    
    public ArrayList<String> getAllWeapons() {
        ArrayList<String> weaponNames = new ArrayList<>();
        for (int i = 0; i<allWeapons.size(); i++) {
            weaponNames.add(allWeapons.get(i).getName());
        }
        return weaponNames;
    }
    
    public void clearWeaponList() { //clears list of all weapons
        this.allWeapons.clear();
    }
    
    public void clearWornList() { //clears list of all other items
        this.allWornItems.clear();
    }
    
    
    public void clearWeapon() {
        this.weapon = new Weapon("none", 6, 0,0,0,0);
    }
    
    public void clearItems() {
        this.weapon = new Weapon("none", 6, 0,0,0,0);
        this.wornItems.clear();
    }
    
    public void changeWeapon(String wepName, String type) {
        this.attackType = type;
        for (int i = 0; i<allWeapons.size(); i++) {
            if (allWeapons.get(i).getName().equals(wepName)) {
                weapon = allWeapons.get(i);
                return;
            }
        }
    }
    

    
    
    
    
    
    
    public int getStrBonus() {
        int strBonus = 0;
        strBonus += weapon.getStrBonus();
        //laskee kaikkien listassa olevien ja aseen str bonuksen yhteen
        return strBonus;
    }
    
    public int getAttackBonus(String style) {
        int attBonus = 0;
        attBonus += weapon.getAttBonus(this.attackType);
        //parametrin avulla laskee oikean tyylin bonukset yhteen aseesta ja muista itemeistä
        return attBonus;
    }
    public int getAttackSpeed() {
        return this.weapon.getAttackSpeed();
    }

    
    
}
