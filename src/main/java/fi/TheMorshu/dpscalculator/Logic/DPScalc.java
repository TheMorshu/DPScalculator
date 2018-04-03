/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.TheMorshu.dpscalculator.Logic;

/**
 *
 * @author ilmar
 */
public class DPScalc {

    int strLvl;
    int attLvl;
    int defLvl;
    int attBonus;
    int strBonus;
    int defBonus;
    int wepSpeed;
    
    double prayerBoost;
    double styleBonus;
    double otherBonus;
    
    Boolean slayer;
    String potion;
    String style;
    String prayer;
    
    
    
    public DPScalc() {
        this.strLvl = 1;
        this.attLvl = 1;
        this.defLvl = 1;
        this.attBonus = 0;
        this.strBonus = 0;
        this.defBonus = 0;
        this.wepSpeed = 0;
        
        this.prayerBoost = 1;
        this.otherBonus = 1;
        this.styleBonus = 0;
        
        this.prayer = "n";
        this.style = "a";
        this.potion = "n";
        this.slayer = false;
    }

    public void clear() {
        this.strLvl = 1;
        this.attLvl = 1;
        this.defLvl = 1;
        this.attBonus = 0;
        this.strBonus = 0;
        this.defBonus = 0;
        this.wepSpeed = 6;
        this.prayerBoost = 1;
        this.otherBonus = 1;
        this.styleBonus = 0;
        
        this.prayer = "n";
        this.style = "a";
        this.potion = "n";
        this.slayer = false;
    }

    public void setPrayer(String prayer) {
        this.prayer = prayer;
        if (prayer.equals("b")) {
            this.prayerBoost = 1.05;
        }
        if (prayer.equals("s")) {
            this.prayerBoost = 1.1;
        }
        if (prayer.equals("u")) {
            this.prayerBoost = 1.15;
        }
        if (prayer.equals("c")) {
            this.prayerBoost = 1.18;
        }
        if (prayer.equals("p")) {
            this.prayerBoost = 1.23;
        }
    }
    
    public void setPotion(String potion) {
        this.potion = potion;
    }
    
    public void setStyle(String style) {
        this.style = style;
        if (style.equals("a")) {
            this.styleBonus = 3;
        } if (style.equals("c")) {
            this.styleBonus = 1;
        }
    }
    
    public void setSlayer(String slayer) {
        if (slayer.equals("y")) {
            this.slayer = true;
            this.otherBonus = 1.166666667;
        } else {
            this.slayer = false;
        }
        
    }
    
    
    public int getWepSpeed() {
        return wepSpeed;
    }

    public void setWepSpeed(int wepSpeed) {
        this.wepSpeed = wepSpeed;
    }
    
    
    
    public int getStrLvl() {
        return strLvl;
    }

    public void setStrLvl(int strLvl) {
        this.strLvl = strLvl;
    }

    public int getAttLvl() {
        return attLvl;
    }

    public void setAttLvl(int attLvl) {
        this.attLvl = attLvl;
    }

    public int getDefLvl() {
        return defLvl;
    }

    public void setDefLvl(int defLvl) {
        this.defLvl = defLvl;
    }

    public int getAttBonus() {
        return attBonus;
    }

    public void setAttBonus(int attBonus) {
        this.attBonus = attBonus;
    }

    public int getStrBonus() {
        return strBonus;
    }

    public void setStrBonus(int strBonus) {
        this.strBonus = strBonus;
    }

    public int getDefBonus() {
        return defBonus;
    }

    public void setDefBonus(int defBonus) {
        this.defBonus = defBonus;
    }
    
    
    public int getEffectiveStr() {
        Double value = ((getStrLvl()+getPotionBonus())*this.prayerBoost*this.otherBonus)+this.styleBonus;
        System.out.println("Effective str: "+value);
        return (int)value.doubleValue();
    }
    
    public Double baseDamage() {
        int effectiveStr = this.getEffectiveStr();
        Double baseDamage = 1.3;
        System.out.println(baseDamage);
        baseDamage += 1.0*effectiveStr/10;
        System.out.println(baseDamage);
        baseDamage += 1.0*this.strBonus/80;
        System.out.println(baseDamage);
        baseDamage += 1.0*(effectiveStr * this.strBonus)/640;
        System.out.println(baseDamage);
        System.out.println("Base damage: "+baseDamage);
        return baseDamage;
    }
    
    
    public int getPotionBonus() {
        if (this.potion.equals("c")) {
            Double value = 3 + 0.1*this.strLvl;
            return (int)value.doubleValue();
        } if (this.potion.equals("sc")) {
            Double value = 5 + 0.15*this.strLvl;
            return (int)value.doubleValue();
        }
        return 0;
    }
    
    
    public int getMaxHit() {
        return (int)this.baseDamage().doubleValue();
    }
    
    public long getHitChance() {
        return -1;
    }
    
    public long getDps() {
        return -1;
    }
    
    
    
    
    
    
    
    
}
