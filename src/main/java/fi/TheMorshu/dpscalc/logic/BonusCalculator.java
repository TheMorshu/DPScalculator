/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.themorshu.dpscalc.logic;

import fi.TheMorshu.dpscalc.dao.ItemDao;
import java.io.FileNotFoundException;
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
    private ItemDao itemDao;
    //these are items in use
    
    private String attackType;

    public BonusCalculator() throws FileNotFoundException {
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
        this.itemDao = new ItemDao();
        init();
    }
    
    public void init() throws FileNotFoundException {
        loadWeapons();
        loadHelms();
        loadAmulets();
        loadBodies();
        loadLegs();
        loadBoots();
        loadRings();
        loadGloves();
        loadCapes();
        loadShields();
    }
    
    public void setType(String type) {
        this.attackType = type;
    }
    
    public void loadWeapons() throws FileNotFoundException { //fills wep list with all possible weapons
        allWeapons = this.itemDao.getWeapons();
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
    
    
    
    public void loadHelms() throws FileNotFoundException {
        allHelms = this.itemDao.getHelms();
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
    
    public void loadAmulets() throws FileNotFoundException {
        allAmulets = this.itemDao.getAmulets();
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
    
    public void loadBodies() throws FileNotFoundException {
        allBodies = this.itemDao.getBodies();
    }
    
    public void changeBody(String name) {
        for (int i = 0; i<allBodies.size(); i++) {
            if (allBodies.get(i).getName().equals(name)) {
                wornItems.add(allBodies.get(i));
                return;
            }
        }
    }
    
    
    public void loadLegs() throws FileNotFoundException {
        allLegs = this.itemDao.getLegs();
    }
    
    public void changeLegs(String name) {
        for (int i = 0; i<allLegs.size(); i++) {
            if (allLegs.get(i).getName().equals(name)) {
                wornItems.add(allLegs.get(i));
                return;
            }
        }
    }
    
    public void loadBoots() throws FileNotFoundException {
        allBoots = this.itemDao.getBoots();
    }
    
    public void changeBoots(String name) {
        for (int i = 0; i<allBoots.size(); i++) {
            if (allBoots.get(i).getName().equals(name)) {
                wornItems.add(allBoots.get(i));
                return;
            }
        }
    }
    
    public void loadGloves() throws FileNotFoundException {
        allGloves = this.itemDao.getGloves();
    }
    
    public void changeGloves(String name) {
        for (int i = 0; i<allGloves.size(); i++) {
            if (allGloves.get(i).getName().equals(name)) {
                wornItems.add(allGloves.get(i));
                return;
            }
        }
    }
    
    public void loadRings() throws FileNotFoundException {
        allRings = this.itemDao.getRings();
    }
    
    public void changeRing(String name) {
        for (int i = 0; i<allRings.size(); i++) {
            if (allRings.get(i).getName().equals(name)) {
                wornItems.add(allRings.get(i));
                return;
            }
        }
    }
    
    public void loadCapes() throws FileNotFoundException {
        allCapes = this.itemDao.getCapes();
    }
    
    public void changeCape(String name) {
        for (int i = 0; i<allCapes.size(); i++) {
            if (allCapes.get(i).getName().equals(name)) {
                wornItems.add(allCapes.get(i));
                return;
            }
        }
    }
    
    public void loadShields() throws FileNotFoundException {
        allShields = this.itemDao.getShields();
    }
    
    public void changeShield(String name) {
        for (int i = 0; i<allShields.size(); i++) {
            if (allShields.get(i).getName().equals(name)) {
                wornItems.add(allShields.get(i));
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
