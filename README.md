## DPS (melee) calculator for OSRS by Sijoittaja/TheMorshu/Ilmari Heiskanen

This project is under work and will be finished once I have enough time! Currently only the max hit calc is working.
NOTE: Currently only for melee!

### Downloads!

[Downloads ZIP here!](https://github.com/TheMorshu/DPScalculator/releases)

**Beta version 0.2 update:**
- Item slots added! You can add your own items directly to csv file with notepad or Excel!

**Beta version 0.1 includes:**
- Basic UI that should do the work, will be improved later
- Max hit, hit chance and DPS calculator for melee including potions, prayers, attack styles, levels, bonuses, attack style and slayer (excluding special attacks, salve amulet and void gear).

**Later versions will include:**
- HiScore fetch for stats
- Special attacks, salve amulet, void gear, opponents attacks style (when fighting players).
- Possibly ranged mode too


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

**NOTE: You must download and save all csv files in the same folder as the jar file in order to run the calculator!**

The ZIP (jar+csv files) can also be dowloaded directly [HERE](https://github.com/TheMorshu/DPScalculator/releases).
