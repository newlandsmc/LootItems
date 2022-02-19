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

See the [example](https://github.com/SemiVanilla-MC/LootItems/blob/rewrite/example.loot.json)

## **Support**

## **License**
[LICENSE](LICENSE)
