# DPS (melee) calculator for OSRS by Sijoittaja/TheMorshu/Ilmari Heiskanen

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

## Downloads

[Downloads ZIP here!](https://github.com/TheMorshu/DPScalculator/releases)

[Patch notes](https://github.com/TheMorshu/DPScalculator/tree/master/documentation/patchnotes)


## Nerd stuff

### Generating jar file using Maven

If you feel uncomfortable using the already generated jar file, you can generate the jar file yourself from the source code. Feel free to check the source code if you want to, it's not long! You can package the file using maven with the following code in terminal:

```
mvn package
```

In folder _target_ jar-file called _DPScalculator-1.0-SNAPSHOT.jar_ will be generated..


### Running the file

On Debian and Windows you should be able to run the jar by simply opening it. If not, please open terminal in correct folder and type

```
java -jar DPScalculator-1.0-SNAPSHOT.jar
```
in terminal. 

**NOTE: You must download and save all csv files and create and place them in folder "csv", which must be in same folder as the jar file!**

The ZIP (jar+csv files) can also be dowloaded directly [HERE](https://github.com/TheMorshu/DPScalculator/releases).
