# 7 Pakete

- Für `Zweckmäßigkeit` (zur Besseren Übersicht) können Klassen in `Pakete` zusammengefasst
- Klassen aus unterschiedlichen Paketen dürfen den gleichen Namen haben

## 7.1 Pakete erzeugen und nutzen

- `Name eines Pakets` besteht aus mit einem Punkt getrennten Teilen:

```java
admin.gui
```

### package
- Um eine Klasse einem bestimmten Paket zuzuorden, muss als erste Anweisung stehen:
```java
package paketname;
```
- jedem Namensteil entspricht ein Unterverzeichnis auf das Dateiverzeichnis
```java
package admin.gui;
```
- `Verzeichnis`: gui, `Unterzeichnis`: admin
- Der zugehörige Quellcode soll ebenfalls in einem Verzeichnis `admin/gui` legen, für Übersichtlichkeit

Quellcode im Verzeichnis:
```
.../src/admin/gui
```
Bytecode im Verzeichnis:
```
.../bin/admin/gui
```
- innerhalb eines Pakets kann man auf alle anderen Klassen und Interfaces zugreifen
- Um eine Klasse aus einem anderen Paket verwenden zu können, muss der Paketname mit angegeben werden:
```
paketname.Klassenname
```

### import

- eine andere Möglichkeit ist, die gewünschte Klasse am Anfang der Quelldatei (hinter der package-Anweisung) bekannt 
  zu machen:
```
import paketname.Klassenname;
```
- im darauf folgenden Quellcode kann dann die Klasse mit ihrem einfachen Namen angegeben werden, sofern es in allen 
  anderen importierten Paketen keine Klasse mit dem gleichen Namen gibt
- Mit der folgenden Anweisung können alle Klassen eines Pakets zugänglich gemacht werden:
````
import paketname.*;
````
Beispiel:
```
import admin.*;
```
- macht alle Pakete die in `gui` legen zugänglich

### Wie wird der Bytecode vom Compiler bzw. der JVM gefunden?

- Eine Klasse wird vom Compiler erst dann gesucht, wenn sie im Programm benötigt wird
```java
import admin.gui.MainFrame;
```
- MainFrame.class ist im `Verzeichnis` `admin/gui` gespeichert
- Wo dieses Verzeichnis im Dateisystem liegt kann in der `Umgebungsvariablen` `CLASSPATH` angegeben werden
- Bei Windows:
Eingabeaufforderung mit Set-Befehl:
```
set CLASSPATH=.;D:\Programme
```
- Compiler und JVM suchen nach dem Unterverzeichnis `admin` im aktuellen Verzeichnis `.` und im Verzeichnis 
  `D:\Programme`

### Default-Paket

- Klassen, in denen die package-Anweisung fehlt, gehören automatisch zu einem `unbenannten Paket` (Default-Paket)
- Sie können ohne explizite `import-Anweisung` gesucht werden
- Wichtige Pakete der Java-Entwicklungsumgebung:
```
java.lang
java.io
java.util
javax.swing
```
- java.lang enthält grundlegende `Klassen` und `Interfaces`
- diese werden ohne explizite `import-Anweisung` in jeden Code automatisch importiert

### Namenskonvention für Pakete

- Soll die entwickelte Software später ausgeliefert werden, ist es wichtig, dass die vollständigen Namen für Klassen 
  nicht zufällig mit den Namen anderer Anwendungen kollidieren
- In vielen Projekten werden Anwendungen auf Basis von Klassen fremder Projekte (z.B. `Frameworks`) entwickelt
- Folgende Konvention ist die Regel: `Reverse Domain Name Pattern`
- Firma ABC mit Webadresse `www.abc.de` entwickelt software `xyz`, alle Paketnamen dieser Software sollen mit `de.
  abc.xzy` anfangen
- Die Eindeutigkeit des URL `www.abc.de` garantiert Kollisionsfreiheit

### Statische import-Klausel

- `statische Methoden` und `statische Variablen` können über den Klassennamen importiert, dass sie ohne 
  vorangestellten Klassennamen verwendet werden können:
```java
import static paketname.Klassenname.bezeichner;
```
- `bezeichner` = Name einer `statischen Methode` oder `statischen Variablen`
- Um alle statischen Elemente der Klasse zugänglich zu machen:
```java
import static paketname.Klassenname.*;
```
Beispiel:
```java
import static java.lang.Math.*;
import static java.lang.System.out;
public class StaticImportTest {

    public static void main(String[] args) {
        out.println("sin(PI/4) = " + sin(PI/4));
    }
}
```
- `sin` ist eine `Klassenmethode` und `PI` eine `Klassenvariable` 
- `out` ist eine `Klassenvariable` in der Klasse `System`

## 7.2 Eigene Java-Bibliotheken erzeugen

- Umgang mit Paketen:
```java
public class Konto {
    private int kontonummer;
    private double saldo;

    public Konto() {
    }
  ...}
```
```java
 public static void main(String[] args) {
        Konto k = new Konto(1234,1000.);
        k.info();
    }
```
- In Welchen Verzeichnissen `Quellcode` und `Bytecode` abgelegt sind:
```
Projekt_7_2

- bin (wird durch kompilieren erzeugt)
--- Test.class
--- bank
----- Konto.class
- src
--- Test.java
--- bank
----- Konto.java
```

### 1. Compilieren

```java
javac -d bin src/bank/Konto.java
```
- Mit `-d` wird Zielverzeichnis für die Ablage des Bytecode festgelegt

```java
set CLASSPATH=bin
javac -d bin src/Test.java
```

- Alternativ kann auch eingegeben werden (ohne setzen von CLASSPATH):
```java
javac -d bin -cp bin src/Test.java
```

## 2. Ausführung

```java
set CLASSPATH=bin
java Test
```
Or:
```java
java -cp bin test
```

## Java-Bibliotheken nutzen

- Nach Schritt 1 (Compilieren) kann auch eine Archivdatei im jar-Format erstellt werden, die alle Klassen eines oder 
  mehrerer Pakete enthält:
```java
jar --create --file bank.jar -C bin bank
```
Dann kann das Programm wie folgt aufgerufen werden:
```java
java -cp bin; bank.jar Test
```
- Das Verzeichnis `bank` wird für die Ausführung nicht benötigt
- Sollen alle `jar-`Dateien aus einem bestimmten Verzeichnis (hier `lib`) verwendet werden, kann auch `*` zum 
  Compilieren/Ausführung benutzt werden
```
java -cp .;lib/* MeineKlasse
```