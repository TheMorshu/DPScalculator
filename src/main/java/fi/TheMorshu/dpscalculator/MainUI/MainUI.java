/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.TheMorshu.dpscalculator.MainUI;

import fi.TheMorshu.dpscalculator.Logic.DPScalc;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        
         
        //Teksielementit ja kentät
        Label attackLabel = new Label("Attack lvl: ");
        TextField attackInput = new TextField();
        Label strLabel = new Label("Str lvl: ");
        TextField strInput = new TextField();
        Label attackBonusLabel = new Label("Attack bonus: ");
        TextField attackBonusInput = new TextField();
        Label strBonusLabel = new Label("Str bonus: ");
        TextField strBonusInput = new TextField();
        Label speedLabel = new Label("Weapon speed [3-7 from wiki]: ");
        TextField speedInput = new TextField();
        
        Label styleLabel = new Label("Attack style (a=aggressive, c=controlled, o=other): ");
        TextField styleInput = new TextField();
        Label potionLabel = new Label("Potion: (c=combat, sc=supercombat, n=none)");
        TextField potionInput = new TextField();
        Label prayerLabel = new Label("Prayer (b/s/u/c/p, n=none): ");
        TextField prayerInput = new TextField();
        Label slayerLabel = new Label("Slayer task (y/n): ");
        TextField slayerInput = new TextField();
        
        
        
        
        
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
        speedInput.setText("6");
        styleInput.setText("a");
        potionInput.setText("n");
        prayerInput.setText("n");
        slayerInput.setText("n");
        
        
        //Napit
        Button calculate = new Button("Calculate! -->");

        
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
        dpsGUI.add(speedInput, 1, 6);
        
        dpsGUI.add(styleLabel, 0, 7);
        dpsGUI.add(styleInput, 1, 7);
        dpsGUI.add(potionLabel, 0, 8);
        dpsGUI.add(potionInput, 1, 8);
        dpsGUI.add(prayerLabel, 0, 9);
        dpsGUI.add(prayerInput, 1, 9);
        dpsGUI.add(slayerLabel, 0, 10);
        dpsGUI.add(slayerInput, 1, 10);
        
        
        
        
        dpsGUI.add(calculate, 3, 3);
        
        
        dpsGUI.add(maxHit, 4, 2);
        dpsGUI.add(hitChance, 4, 3);
        dpsGUI.add(dps, 4, 4);
        
        
        //Asettelun hienosäätö
        dpsGUI.setHgap(10);
        dpsGUI.setVgap(10);
        dpsGUI.setPadding(new Insets(10, 10, 10, 10));

        
        //Näkymät
        Scene dpsScene = new Scene(dpsGUI, 700, 400);
        
        
        calculate.setOnAction((event) -> {
            dpsCalc.clear();
            dpsCalc.setAttLvl(Integer.parseInt(attackInput.getText()));
            dpsCalc.setAttBonus(Integer.parseInt(attackBonusInput.getText()));
            dpsCalc.setStrLvl(Integer.parseInt(strInput.getText()));
            dpsCalc.setStrBonus(Integer.parseInt(strBonusInput.getText()));
            dpsCalc.setDefLvl(Integer.parseInt(defInput.getText()));
            dpsCalc.setDefBonus(Integer.parseInt(defBonusInput.getText()));
            dpsCalc.setWepSpeed(Integer.parseInt(speedInput.getText()));
            dpsCalc.setPrayer(prayerInput.getText());
            dpsCalc.setPotion(potionInput.getText());
            dpsCalc.setStyle(styleInput.getText());
            dpsCalc.setSlayer(slayerInput.getText());
            
            
            maxHit.setText("Max hit: "+dpsCalc.getMaxHit());
            hitChance.setText("Hit chance: "+dpsCalc.getHitChance());
            dps.setText("Dps: "+dpsCalc.getDps());

        });
        
        

        window.setTitle("DPS calculator by Sijoittaja");
        window.setScene(dpsScene);
        window.show();
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        launch(MainUI.class);
    }
    
}