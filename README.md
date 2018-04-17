## DPS (melee) calculator for OSRS by Sijoittaja/TheMorshu/Ilmari Heiskanen

This project is under work and will be finished once I have enough time! Currently only the max hit calc is working.
NOTE: Currently only for melee!

**WHAT IS CURRENTLY WORKING:**
-Max hit calc (potions, prayers, slayer (y/n), levels&bonuses, attack style)

**WHAT LOOKS LIKE TO BE WORKING:**
-Accuracy calculator (has NOT been tested/validated in live game!) but seems to be working!
-DPS calculator works IF accuracy calculator works correctly.

**WHAT IS NOT WORKING:**
-Void armour not added
-Salve amulet not added
-Special attacks not added

**To-do list**
-Better attack speed options
-Hiscore fetch for stats
-Item selection for each item slot for more pleasant bonus calculation


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

in terminal. The file can be dowloaded directly [HERE](https://github.com/TheMorshu/DPScalculator/blob/master/DPScalculator-1.0-SNAPSHOT.jar). You can also generate jar file yourseld.
