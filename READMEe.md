# DPS (melee) calculator for OSRS by Sijoittaja/TheMorshu

This project is under work and will be finished once I have enough time. 

## Description

What is working:
- Hit chance, max hit and dps calculators. 
- Potions, prayers, attack styles, levels, attack/str/def bonuses and slayer tass (yes/no) are concidered in calculations.
- Item slot selection.

What will be added later:
- HiScore fetch for stats
- Special attacks, salve amulet, void gear, opponents attacks style (when fighting players).
- Possibly ranged mode too


## Documentation

[Manual (will be added later..)](https://github.com/TheMorshu/DPScalculator/tree/master/documentation/manual.md)

[Patch notes](https://github.com/TheMorshu/DPScalculator/tree/master/documentation/patchnotes)

## Downloads

[Download ZIPs here!](https://github.com/TheMorshu/DPScalculator/releases)

## Running the application

Easiest way to use the application is simply by downloading the newest release and running the jar file!

### Generating jar file yourself using Maven (if you don't want to download jar)

If you feel uncomfortable using the already generated jar file, you can generate the jar file yourself from the source code. Feel free to check the source code if you want to, it's not long! You can package the file using maven with the following code in terminal:

```
mvn package
```

In folder _target_ jar-file called _DPScalculator-1.0-SNAPSHOT.jar_ will be generated..


### Running the jar file

On Windows you should be able to run the jar by simply opening it (double click). If not, please open terminal in correct folder and type:

```
java -jar DPScalculator-1.0-SNAPSHOT.jar
```
in terminal. In Linux/OSX this must be done by default (no double clickery)

**NOTE: You must download and save all csv files and create and place them in folder "csv", which must be in same folder as the jar file! If you downloaded a release, csv folder and files should be there already!**

The ZIP (jar+csv files) can be dowloaded directly [HERE](https://github.com/TheMorshu/DPScalculator/releases).

### Running JUnit tests and jacoco

Will be added later

### Running CheckStyle

Will be added later

### Running JavaDoc

Will be added later
