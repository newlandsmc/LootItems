# LootItems

___
Small optional library to assist in generating random items from configuration.

## **Downloads**
There are no downloads, as this lib has to be shaded into the plugin using it.

## **API**

#### Dependency information

Maven
```
<repository>
  <id>SemiVanilla-snapshots</id>
  <name>SemiVanilla Maven Repo</name>
  <url>https://sv.destro.xyz/snapshots</url>
</repository>

<dependency>
  <groupId>com.semivanilla.lootitems</groupId>
  <artifactId>api</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

Gradle
```
implementation "com.semivanilla.lootitems:api:1.0-SNAPSHOT"

maven {
    url "https://sv.destro.xyz/snapshots"
 }
```

Gradle kts
```
implementation("com.semivanilla.lootitems:api:1.0-SNAPSHOT")

maven {
    url = uri("https://sv.destro.xyz/snapshots")
}
```

## **Building**

#### Initial setup
Clone the repo using `git clone https://github.com/SemiVanilla-MC/LootItems.git`.

#### Compiling
Use the command `./gradlew build --stacktrace` in the project root directory.
The compiled jar will be placed in directory `/build/libs/`.

## **Configuration**

```yaml
items:
  1: 
    material: DIAMOND_SWORD # Bukkit Material
    itemname: "<rainbow:2>Duck Slayer" # Optional custom item name, supports minimessage
    lore: ["<rainbow>Duck","<red>Dead"] # Optional item lore
    randomEnchants: true # Apply random level 3 enchants on this item
  2:
    material: DIAMOND_SWORD
    itemname: "<rainbow:2>Dragon Slayer"
    lore: ["<rainbow>Forly, The life giver"]
    randomEnchants: false
    allowTreasureEnchants: false
    enchants: # only used if randomEnchants = false
      mending: # Add a new key for every enchant you want it to be, these enchants follow vanilla limits and will be limited to that if the max level is higher
        minlevel: 2 # lowest level this enchant should have
        maxlevel: 10 # max level for this enchant
```

## **Support**

## **License**
[LICENSE](LICENSE)
