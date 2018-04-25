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
public class WornItem {
    
    private String name;
    private int strBonus;
    private int stabBonus;
    private int slashBonus;
    private int crushBonus;

    public WornItem(String name, int strBonus, int stabBonus, int slashBonus, int crushBonus) {
        this.name = name;
        this.strBonus = strBonus;
        this.stabBonus = stabBonus;
        this.slashBonus = slashBonus;
        this.crushBonus = crushBonus;
    }

    public String getName() {
        return name;
    }

    public int getStrBonus() {
        return strBonus;
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
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
}
