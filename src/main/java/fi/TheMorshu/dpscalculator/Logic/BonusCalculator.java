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
    
    private ArrayList<WornItem> wornItems;
    private Weapon weapon;

    public BonusCalculator() {
        this.wornItems = new ArrayList();
        this.weapon = new Weapon("none", 6, 0,0,0,0);
    }
    
    public void changeWeapon(Weapon newWep) {
        this.weapon = newWep;
    }
    
    public void clearItems() {
        this.weapon = new Weapon("none", 6, 0,0,0,0);
        this.wornItems.clear();
    }
    
    public void addWornItem(WornItem newItem) {
        this.wornItems.add(newItem);
    }
    
    public int getStrBonus() {
        //laskee kaikkien listassa olevien ja aseen str bonuksen yhteen
        return 0;
    }
    
    public int getAttackBonus(String style) {
        //parametrin avulla laskee oikean tyylin bonukset yhteen aseesta ja muista itemeistä
        return 0;
    }
    public int getAttackSpeed() {
        return this.weapon.getAttackSpeed();
    }

    
    
}
