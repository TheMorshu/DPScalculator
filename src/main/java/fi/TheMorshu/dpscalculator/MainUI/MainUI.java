/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.TheMorshu.dpscalculator.MainUI;

import fi.TheMorshu.dpscalculator.Logic.BonusCalculator;
import fi.TheMorshu.dpscalculator.Logic.DPScalc;
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
    public void start(Stage window) throws ClassNotFoundException {

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
        helmetBox.setValue(weaponBox.getItems().get(0));
        
        ComboBox amuletBox = new ComboBox();
        amuletBox.getItems().addAll(bonusCalc.getAllAmulets());
        amuletBox.setValue(weaponBox.getItems().get(0));
        
        ComboBox bodyBox = new ComboBox();
        bodyBox.getItems().addAll("none");
        bodyBox.setValue("none");
        
        ComboBox legsBox = new ComboBox();
        legsBox.getItems().addAll("none");
        legsBox.setValue("none");
        
        ComboBox bootsBox = new ComboBox();
        bootsBox.getItems().addAll("none");
        bootsBox.setValue("none");
        
        ComboBox capeBox = new ComboBox();
        capeBox.getItems().addAll("none");
        capeBox.setValue("none");
        
        ComboBox glovesBox = new ComboBox();
        glovesBox.getItems().addAll("none");
        glovesBox.setValue("none");
        
        ComboBox ringBox = new ComboBox();
        ringBox.getItems().addAll("none");
        ringBox.setValue("none");
        
        ComboBox shieldBox = new ComboBox();
        shieldBox.getItems().addAll("none");
        shieldBox.setValue("none");

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
        Button calculate = new Button("Calculate! -->");
        Button getBonuses = new Button("Get bonuses!");
        
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
        dpsGUI.add(calculate, 3, 3);
        dpsGUI.add(maxHit, 4, 2);
        dpsGUI.add(hitChance, 4, 3);
        dpsGUI.add(dps, 4, 4);
        dpsGUI.add(typeLabel, 5, 4);
        dpsGUI.add(typeBox, 6, 4);
        dpsGUI.add(weaponLabel, 5, 5);
        dpsGUI.add(weaponBox, 6, 5);
        dpsGUI.add(helmLabel, 5, 6);
        dpsGUI.add(helmetBox, 6, 6);
        dpsGUI.add(amuletLabel, 5, 7);
        dpsGUI.add(amuletBox, 6, 7);
        dpsGUI.add(bodyLabel, 5, 8);
        dpsGUI.add(bodyBox, 6, 8);
        dpsGUI.add(legsLabel, 5, 9);
        dpsGUI.add(legsBox, 6, 9);
        dpsGUI.add(bootsLabel, 5, 10);
        dpsGUI.add(bootsBox, 6, 10);
        dpsGUI.add(glovesLabel, 5, 11);
        dpsGUI.add(glovesBox, 6, 11);
        dpsGUI.add(ringLabel, 5, 12);
        dpsGUI.add(ringBox, 6, 12);
        dpsGUI.add(capeLabel, 5, 13);
        dpsGUI.add(capeBox, 6, 13);
        dpsGUI.add(shieldLabel, 5, 14);
        dpsGUI.add(shieldBox, 6, 14);
        dpsGUI.add(getBonuses, 3, 2);
        

        //Näkymät
        Scene dpsScene = new Scene(dpsGUI, 1000, 400);
        
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
            maxHit.setText("Max hit: "+dpsCalc.getMaxHit());
            hitChance.setText("Hit chance: "+dpsCalc.getHitChance());
            dps.setText("Dps: "+dpsCalc.getDps());

        });
        
        getBonuses.setOnAction((event) -> {
            bonusCalc.clearWornItems();
            
            bonusCalc.setType(typeBox.getValue().toString());
            
            bonusCalc.changeWeapon(weaponBox.getValue().toString());
            bonusCalc.changeHelm(helmetBox.getValue().toString());
            bonusCalc.changeAmulet(amuletBox.getValue().toString());
            
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