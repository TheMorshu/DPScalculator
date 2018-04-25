/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.TheMorshu.dpscalculator.Logic;

/**
 *
 * @author ilmari
 */
public class Weapon {
    
    private String name;
    private int attackSpeed;
    private int strBonus;
    private int stabBonus;
    private int slashBonus;
    private int crushBonus;

    public Weapon(String name, int attackSpeed, int strBonus, int stabBonus, int slashBonus, int crushBonus) {
        this.name = name;
        this.attackSpeed = attackSpeed;
        this.strBonus = strBonus;
        this.stabBonus = stabBonus;
        this.slashBonus = slashBonus;
        this.crushBonus = crushBonus;
    }

    public String getName() {
        return name;
    }


    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getStrBonus() {
        return strBonus;
    }
    
    public int getAttBonus(String type) {
        if (type.equals("stab")) {
            return getStabBonus();
        }
        if (type.equals("slash")) {
            return getSlashBonus();
        }
        if (type.equals("crush")) {
            return getCrushBonus();
        }
        return 0;
    }


    public int getStabBonus() {
        return stabBonus;
    }


    public int getSlashBonus() {
        return slashBonus;
    }

    public int getCrushBonus() {
        return crushBonus;
    }
    
    @Override
    public String toString() {
        return name;
    }
  
}
