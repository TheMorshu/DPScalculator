/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.themorshu.dpscalc.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    double prayerDmgBoost;
    double prayerAttBoost;
    double styleDmgBonus;
    double slayerDmgBonus;
    double slayerAttBonus;
    double styleAttBonus;
    
    Boolean slayer;
    String potion;
    String style;
    String prayer;
    
    
    public DPScalc() {
    }

    public void clear() {
        this.strLvl = 1;
        this.attLvl = 1;
        this.defLvl = 1;
        this.attBonus = 0;
        this.strBonus = 0;
        this.defBonus = 0;
        this.wepSpeed = 6;
        this.prayerDmgBoost = 1;
        this.slayerDmgBonus = 1;
        this.styleDmgBonus = 0;
        this.prayerAttBoost = 1;
        this.slayerAttBonus = 1;
        this.styleAttBonus = 0;
        this.prayer = "none";
        this.style = "Accurate";
        this.potion = "none";
        this.slayer = false;
    }
    
    public void setPrayer(String prayer) {
        this.prayer = prayer;
        if (prayer.equals("burstOfStr")) {
            this.prayerDmgBoost = 1.05;
            this.prayerAttBoost = 1.05;
        }
        if (prayer.equals("superHumanStr")) {
            this.prayerDmgBoost = 1.1;
            this.prayerAttBoost = 1.1;
        }
        if (prayer.equals("ultimateStr")) {
            this.prayerDmgBoost = 1.15;
            this.prayerAttBoost = 1.15;
        }
        if (prayer.equals("Chivarly")) {
            this.prayerDmgBoost = 1.18;
            this.prayerAttBoost = 1.15;
        }
        if (prayer.equals("Piety")) {
            this.prayerDmgBoost = 1.23;
            this.prayerAttBoost = 1.20;
        }
    }
    
    public void setPotion(String potion) {
        this.potion = potion;
    }
    
    public void setStyle(String style) {
        this.style = style;
        if (style.equals("aggressive")) {
            this.styleDmgBonus = 3;
        } if (style.equals("controlled")) {
            this.styleDmgBonus = 1;
            this.styleAttBonus = 1;
        } if (style.equals("Accurate")) {
            this.styleAttBonus = 3;
        }
    }
    
    public void setSlayer(String slayer) {
        if (slayer.equals("y")) {
            this.slayer = true;
            this.slayerDmgBonus = 1.166666667;
            this.slayerAttBonus = 1.166666667;
        } else {
            this.slayer = false;
        }
    }
    
    public double getHitsPerSecond() {
        int ticksPerHit = 10 - this.wepSpeed;
        double secsPerHit = 0.6*ticksPerHit;
        double hitsPerSec = 1/secsPerHit;
        return hitsPerSec;
    }

    public void setWepSpeed(int wepSpeed) {
        this.wepSpeed = wepSpeed;
    }

    public void setStrLvl(int strLvl) {
        this.strLvl = strLvl;
    }

    public void setAttLvl(int attLvl) {
        this.attLvl = attLvl;
    }

    public void setDefLvl(int defLvl) {
        this.defLvl = defLvl;
    }

    public void setAttBonus(int attBonus) {
        this.attBonus = attBonus;
    }

    public void setStrBonus(int strBonus) {
        this.strBonus = strBonus;
    }

    public void setDefBonus(int defBonus) {
        this.defBonus = defBonus;
    }
    
    public int getEffectiveStr() {
        Double value = ((this.strLvl+getPotionDmgBonus())*this.prayerDmgBoost*this.slayerDmgBonus)+this.styleDmgBonus;
        return (int)value.doubleValue();
    }
    
    public int getEffectuveAtt() { //toimii confirmed
        Double value = ((this.attLvl+getPotionAttBonus())*this.prayerAttBoost*this.slayerAttBonus);
        value = (double)Math.round(value-0.5);
        value += this.styleAttBonus;
        value += 8;
        return (int)value.doubleValue();
    }
    
    public int getEffectuveDef() {
        return this.defLvl+8;
    }
    
    public Double baseDamage() {
        int effectiveStr = this.getEffectiveStr();
        Double baseDamage = 1.3;
        baseDamage += 1.0*effectiveStr/10;
        baseDamage += 1.0*this.strBonus/80;
        baseDamage += 1.0*(effectiveStr * this.strBonus)/640;
        return baseDamage;
    }    
    
    public int getPotionDmgBonus() {
        if (this.potion.equals("combat")) {
            Double value = 3 + 0.1*this.strLvl;
            return (int)value.doubleValue();
        } if (this.potion.equals("supercombat")) {
            Double value = 5 + 0.15*this.strLvl;
            return (int)value.doubleValue();
        }
        return 0;
    }
    
    public int getPotionAttBonus() {
        if (this.potion.equals("combat")) {
            Double value = 3 + 0.1*this.attLvl;
            return (int)value.doubleValue();
        } if (this.potion.equals("supercombat")) {
            Double value = 5 + 0.15*this.attLvl;
            return (int)value.doubleValue();
        }
        return 0;
    }
    
    public int getMaxHit() {
        return (int)this.baseDamage().doubleValue();
    }
    
    public int attackRoll() {
        return getEffectuveAtt()*(this.attBonus+64);
    }
    
    public int defenceRoll() {
        return getEffectuveDef()*(this.defBonus+64);
    }
    
    public double getHitChance() {
        int defRoll = defenceRoll();
        int attRoll = attackRoll();
        if (attRoll>defRoll) {
            double alapuoli = 2*(attRoll+1);
            double ylapuoli = defRoll+2;
            double jako = ylapuoli/alapuoli;
            double chance = 1 - jako;
            System.out.println("chance: "+chance);
            return chance;
        } else {
            double alapuoli = 2*(defRoll+1);
            double ylapuoli = attRoll;
            double chance = ylapuoli/alapuoli;
            System.out.println("chance: "+chance);
            return chance;
        }    
    }
    
    public double round(double value, int places) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public double getDps() {
        return (1.0*getMaxHit()/2)*getHitChance()*getHitsPerSecond();
    }

}
