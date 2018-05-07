/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.themorshu.dpscalc.ui;

import en.themorshu.dpscalc.logic.BonusCalculator;
import en.themorshu.dpscalc.logic.DPScalc;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ilmar
 */

public class MainUI extends Application {
    
    @Override
    public void start(Stage window) throws FileNotFoundException {

        DPScalc dpsCalc = new DPScalc();
        BonusCalculator bonusCalc = new BonusCalculator();
        
         
        //Teksielementit ja kentät
        Label attackLabel = new Label("Attack lvl: ");
        TextField attackInput = new TextField();
        Label strLabel = new Label("Str lvl: ");
        TextField strInput = new TextField();
        Label attackBonusLabel = new Label("Attack bonus: ");
        TextField attackBonusInput = new TextField();
        Label strBonusLabel = new Label("Str bonus: ");
        TextField strBonusInput = new TextField();
        Label speedLabel = new Label("Weapon speed (check from wiki): ");
        
        Label styleLabel = new Label("Attack style: ");
        Label potionLabel = new Label("Potion: ");
        Label prayerLabel = new Label("Prayer: ");
        Label slayerLabel = new Label("Slayer task (y/n): ");
        Label typeLabel = new Label("Attack type: ");
        Label weaponLabel = new Label("Weapon: ");
        Label helmLabel = new Label("Helmet: ");
        Label amuletLabel = new Label("Amulet: ");
        Label bodyLabel = new Label("Body: ");
        Label legsLabel = new Label("Legs: ");
        Label bootsLabel = new Label("Boots: ");
        Label capeLabel = new Label("Cape: ");
        Label shieldLabel = new Label("Shield: ");
        Label glovesLabel = new Label("Gloves: ");
        Label ringLabel = new Label("Ring: ");
        TextField slayerInput = new TextField();
        
        ComboBox attackStyleBox = new ComboBox();
        attackStyleBox.getItems().addAll("Accurate", "aggressive", "controlled", "defencive");
        attackStyleBox.setValue("Accurate");
        
        ComboBox potionBox = new ComboBox();
        potionBox.getItems().addAll("none", "combat", "supercombat");
        potionBox.setValue("none");
        
        ComboBox prayerBox = new ComboBox();
        prayerBox.getItems().addAll("none", "burstOfStr", "superHumanStr", "ultimateStr", "Chivarly", "Piety");
        prayerBox.setValue("none");
        
        ComboBox attackSpeedBox = new ComboBox();
        attackSpeedBox.getItems().addAll("3", "4", "5", "6", "7");
        attackSpeedBox.setValue("6");
        
        ComboBox weaponBox = new ComboBox();
        weaponBox.getItems().addAll(bonusCalc.getAllWeapons());
        weaponBox.setValue(weaponBox.getItems().get(0));
        
        ComboBox typeBox = new ComboBox();
        typeBox.getItems().addAll("stab", "slash", "crush");
        typeBox.setValue("stab");
        
        ComboBox helmetBox = new ComboBox();
        helmetBox.getItems().addAll(bonusCalc.getAllHelms());
        helmetBox.setValue(helmetBox.getItems().get(0));
        
        ComboBox amuletBox = new ComboBox();
        amuletBox.getItems().addAll(bonusCalc.getAllAmulets());
        amuletBox.setValue(amuletBox.getItems().get(0));
        
        ComboBox bodyBox = new ComboBox();
        bodyBox.getItems().addAll(bonusCalc.getAllBodies());
        bodyBox.setValue(bodyBox.getItems().get(0));
        
        ComboBox legsBox = new ComboBox();
        legsBox.getItems().addAll(bonusCalc.getAllLegs());
        legsBox.setValue(legsBox.getItems().get(0));
        
        ComboBox bootsBox = new ComboBox();
        bootsBox.getItems().addAll(bonusCalc.getAllBoots());
        bootsBox.setValue(bootsBox.getItems().get(0));
        
        ComboBox capeBox = new ComboBox();
        capeBox.getItems().addAll(bonusCalc.getAllCapes());
        capeBox.setValue(capeBox.getItems().get(0));
        
        ComboBox glovesBox = new ComboBox();
        glovesBox.getItems().addAll(bonusCalc.getAllGloves());
        glovesBox.setValue(glovesBox.getItems().get(0));
        
        ComboBox ringBox = new ComboBox();
        ringBox.getItems().addAll(bonusCalc.getAllRings());
        ringBox.setValue(ringBox.getItems().get(0));
        
        ComboBox shieldBox = new ComboBox();
        shieldBox.getItems().addAll(bonusCalc.getAllShields());
        shieldBox.setValue(shieldBox.getItems().get(0));

        Label maxHit = new Label("Max hit: ");
        Label hitChance = new Label("Hit chance: ");
        Label dps = new Label("Dps: ");
        
        Label defLabel = new Label("Opponents def lvl: ");
        TextField defInput = new TextField();
        Label defBonusLabel = new Label("Opponents def bonus: ");
        TextField defBonusInput = new TextField();
        
        attackInput.setText("1");
        strInput.setText("1");
        defInput.setText("1");
        attackBonusInput.setText("0");
        strBonusInput.setText("0");
        defBonusInput.setText("0");
        slayerInput.setText("n");
        
        //Napit
        Button calculate = new Button("Calculate!");
        Button getBonuses = new Button("<-- Get bonuses!");
        
        //Asettelut
        GridPane dpsGUI = new GridPane();
        
        //Asettelujen määrittely
        dpsGUI.add(attackLabel, 0, 0);
        dpsGUI.add(attackInput, 1, 0);
        dpsGUI.add(strLabel, 0, 1);
        dpsGUI.add(strInput, 1, 1);
        dpsGUI.add(attackBonusLabel, 0, 2);
        dpsGUI.add(attackBonusInput, 1, 2);
        dpsGUI.add(strBonusLabel, 0, 3);
        dpsGUI.add(strBonusInput, 1, 3);
        dpsGUI.add(defLabel, 0, 4);
        dpsGUI.add(defInput, 1, 4);
        dpsGUI.add(defBonusLabel, 0, 5);
        dpsGUI.add(defBonusInput, 1, 5);
        dpsGUI.add(speedLabel, 0, 6);
        dpsGUI.add(attackSpeedBox, 1, 6);
        dpsGUI.add(styleLabel, 0, 7);
        dpsGUI.add(potionLabel, 0, 8);
        dpsGUI.add(potionBox, 1, 8);
        dpsGUI.add(prayerLabel, 0, 9);
        dpsGUI.add(prayerBox, 1, 9);
        dpsGUI.add(slayerLabel, 0, 10);
        dpsGUI.add(slayerInput, 1, 10);
        dpsGUI.add(attackStyleBox, 1, 7);
        dpsGUI.add(calculate, 0, 11);
        dpsGUI.add(maxHit, 0, 12);
        dpsGUI.add(hitChance, 0, 13);
        dpsGUI.add(dps, 0, 14);
        dpsGUI.add(typeLabel, 4, 0);
        dpsGUI.add(typeBox, 5, 0);
        dpsGUI.add(weaponLabel, 4, 1);
        dpsGUI.add(weaponBox, 5, 1);
        dpsGUI.add(helmLabel, 4, 2);
        dpsGUI.add(helmetBox, 5, 2);
        dpsGUI.add(amuletLabel, 4, 3);
        dpsGUI.add(amuletBox, 5, 3);
        dpsGUI.add(bodyLabel, 4, 4);
        dpsGUI.add(bodyBox, 5, 4);
        dpsGUI.add(legsLabel, 4, 5);
        dpsGUI.add(legsBox, 5, 5);
        dpsGUI.add(bootsLabel, 4, 6);
        dpsGUI.add(bootsBox, 5, 6);
        dpsGUI.add(glovesLabel, 4, 7);
        dpsGUI.add(glovesBox, 5, 7);
        dpsGUI.add(ringLabel, 4, 8);
        dpsGUI.add(ringBox, 5, 8);
        dpsGUI.add(capeLabel, 4, 9);
        dpsGUI.add(capeBox, 5, 9);
        dpsGUI.add(shieldLabel, 4, 10);
        dpsGUI.add(shieldBox, 5, 10);
        dpsGUI.add(getBonuses, 3, 2);
        dpsGUI.setHgap(10);
        dpsGUI.setVgap(10);
        
        //Näkymät
        Scene dpsScene = new Scene(dpsGUI, 1000, 500);
        
        calculate.setOnAction((event) -> {
            dpsCalc.clear();
            dpsCalc.setAttLvl(Integer.parseInt(attackInput.getText()));
            dpsCalc.setAttBonus(Integer.parseInt(attackBonusInput.getText()));
            dpsCalc.setStrLvl(Integer.parseInt(strInput.getText()));
            dpsCalc.setStrBonus(Integer.parseInt(strBonusInput.getText()));
            dpsCalc.setDefLvl(Integer.parseInt(defInput.getText()));
            dpsCalc.setDefBonus(Integer.parseInt(defBonusInput.getText()));
            dpsCalc.setWepSpeed(Integer.parseInt(attackSpeedBox.getValue().toString()));
            dpsCalc.setPrayer(prayerBox.getValue().toString());
            dpsCalc.setPotion(potionBox.getValue().toString());
            dpsCalc.setStyle(attackStyleBox.getValue().toString());
            dpsCalc.setSlayer(slayerInput.getText());
            maxHit.setText("Max hit: "+ dpsCalc.getMaxHit());
            hitChance.setText("Hit chance: "+dpsCalc.round(100*dpsCalc.getHitChance(), 3)+"%");
            dps.setText("Dps: "+dpsCalc.round(dpsCalc.getDps(),4));

        });
        
        getBonuses.setOnAction((event) -> {
            bonusCalc.clearWornItems();
            
            bonusCalc.setType(typeBox.getValue().toString());
            
            bonusCalc.changeWeapon(weaponBox.getValue().toString());
            bonusCalc.changeHelm(helmetBox.getValue().toString());
            bonusCalc.changeAmulet(amuletBox.getValue().toString());
            bonusCalc.changeBody(bodyBox.getValue().toString());
            bonusCalc.changeLegs(legsBox.getValue().toString());
            bonusCalc.changeBoots(bootsBox.getValue().toString());
            bonusCalc.changeGloves(glovesBox.getValue().toString());
            bonusCalc.changeRing(ringBox.getValue().toString());
            bonusCalc.changeShield(shieldBox.getValue().toString());
            bonusCalc.changeCape(capeBox.getValue().toString());
            
            attackBonusInput.setText(""+bonusCalc.getAttackBonus(typeBox.getValue().toString()));
            strBonusInput.setText(""+bonusCalc.getStrBonus());
            attackSpeedBox.setValue(""+bonusCalc.getAttackSpeed());
        });
        
        window.setTitle("DPS calculator by Sijoittaja");
        window.setScene(dpsScene);
        window.show();
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        launch(MainUI.class);
    }
    
}