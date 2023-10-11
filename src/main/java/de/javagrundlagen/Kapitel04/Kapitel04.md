# 4 Verzweigungen und Schleifen

- `Anweisungen` stellen die kleinsten ausführbaren Einheiten eines Programms dar
- Eine `Anweisung` kann:
  - eine Definition (z.B. von Variablen) enthalten
  - einen Ausdruck:
    - `Zuweisung`
    - `Inkrementierung`
    - `Dekrementierung`
    - `Methodenaufruf`
    - `Erzeugung eines Objekts`
    auswetren
  - den Ablauf des Programms steueren
- Semikolon `;` markiert das Ende einer Anweisung
- `leere Anweisung` `;` wird dort benutzt, wo syntaktisch eine Anweisung erforderlich ist, aber von der 
  Programmlogik her nichts zu tun ist

#### Lernziele:
- wie mit Hilfe von `Kontrollstrukturen` (`Verzweigungen`, `Schleifen`) der Ablauf eines Programms gesteuert werden kann
- wie wichtig die richtige Setzung `geschweifter Klammern` ist
- wie nützlich `Einrückungen des Codes` sind, um Kontrollstrukturen übersichtlich zu gestalten

### Block {...}

- geschweifte Klammern `{}` fassen mehrere Anweisungen zu einem `Block` zusammen
- kann keine oder nur eine Anweisung enthalten
- ein `Block` gilt als eine einzelne Anweisung und kann überall dort verwendet werden, wo eine elementare Anweisung 
  erlaubt ist
- damit können Blöcke ineinander geschachtelt werden
- Variablen, die in einem Block definiert werden, sind nur dort gültig und sichtbar

## 4.1 Verzweigungen

- `Verzweigungen` erlauben es, abhängig von Bedingungen unterschiedliche Anweisungen auszuführen
- Die `if-Anweisung` tritt in zwei Varianten auf:
```java
if(Ausdruck)
    Anweisung
```
- `Ausdruck` hat den Typ `boolean`
- `Anweisung` wird nur ausgeführt wenn `Ausdruck` den Wert `true`hat

oder
```java
if(Ausdruck)
    Anweisung1
else
    Anweisung2
```
- `Anweisung1` wird nur ausgeführt wenn `Ausdruck` den Wert `true`hat
- Andernfalls wird `Anweisung2` ausgeführt

- Der auszuführende Code kann aus einer einzelnen Anweisung oder aus einem Anweisungblock bestehen
- `if-Anweisungen` können geschachtelt werden
- ein `else` wird dem nächstmöglichen `if` zugeordnet

```java
public class IfTest {
    public static void main(String[] args) {
        int zahl = 4;
        
        if (zahl == 6 || zahl == 8)
            System.out.println("Knapp daneben");
        else if (zahl == 7)
            System.out.println("Treffer");
        else
            System.out.println("Weit daneben");
    }
}
```

Die `switch-Anweisung` führt je nach Wert des Ausdrucks unterschiedliche Anweisungen aus

```java
switch (Ausdruck)
case Konstante:
    Anweisungen
        ...
default:
    Anweisungen
```
- `Anweisungen` steht für: keine, eine, oder mehrere einzelne Anweisungen
- `Ausdruck` muss vom Typ sein:
  - `char` oder `Character`
  - `byte` oder `Byte`
  - `short` oder `Short`
  - `int` oder `Integer`
  - `String`
  - `Aufzählungstyp`: `enum`
- `Konstante` muss ein konstanter Ausdruck passend zum Typ vom Ausdruck sein
- Diese konstanten Ausdrücke müssen verschiedene Werte haben
- `Durchfallen (Fall Through)`: 
  1. in Abhängigkeit vom Wert von `Ausdruck` wird die Sprungmarke angesprungen, deren 
    Konstante mit dem Wert des Ausdrucks übereinstimmt
  2. Dann werden alle dahinter stehenden Anweisungen, auch solche, die andere Sprungmarken haben, bis zum Ende der 
     `switch-Anweisung` oder bis zum ersten `break;` ausgeführt
- Anweisung `break` führt zum sofortigen Verlassen der `switch-Anweisung`
- optionale Marke `default` wird angesprungen, wenn keine passende Sprungmarke gefunden wird

```java
public class SwitchTest {

    public static void main(String[] args) {
        int zahl = 4;

        switch(zahl){
            case 6:
            case 8:
                System.out.println("Knapp daneben");
                break;
            case 7:
                System.out.println("Treffer");
                break;
            default:
                System.out.println("Weit daneben");
        }
    }
}
```
- Seit Java 14 können mehrere durch Kommas getrennte Werte hinter `case` angegeben werden, und `switch` kann auch 
  als Ausdruck mit Ergebnis verwendet werden

```java
public class SwitchTest2 {

    public static void main(String[] args) {
        char op = 'x';

        //Beispiel 1
        switch (op) {
            case '*':
            case 'x':
                System.out.println("Multiplikation");
                break;
            case ':':
            case '/':
                System.out.println("Division");
        }

        //Beispiel 2
        switch (op){
            case '*', 'x' -> System.out.println("Multiplikation");
            case ':', '/' -> {
                String s = "Division";
                System.out.println(s);
            }
        }

        //Beispiel 3
        String result1 = switch(op){
            case '*':
            case 'x':
                yield "Multiplikation";
            case ':', '/':
                String s = "Division";
                yield s;
            default:
                yield "Unbekannt";
        };
        System.out.println(result1);

        //Beispiel 4
        String result2 = switch(op){
            case '*', 'x' -> "Multiplikation";
            case ':', '/' -> {
                String s = "Division";
                yield s;
            }
            default -> "Unbekannt";
        };
        System.out.println(result2);
    }
}
```

Beispiel 1

- `klassische switch-Form`
- `Durchfallen/Fallthrough` ist möglich
- vollständige Abdeckung der Fälle ist nicht nötig: `default` darf fehlen

Beispiel 2
- hinter `->` steht:
  - ein `Ausdruck`,
  - ein `Block` in geschweiften Klammern, ODER
  - ein `throw-Anweisung`, die eine nicht kontrollierte Ausnahme einlöst
- ein `Durchfallen` ist NICHT möglich
- vollständige Abdeckung der Fälle ist nicht erförderlich

Beispiel 3
- `switch` wird als `Ausdruck` mit `Ergebnis` verwendet
- vollständige Abdeckung der Fälle IST erforderlich, da der `switch-Ausdruck` immer ein Ergebnis haben muss
- `yield` zur Rückgabe oder eine nicht kontrollierte Ausnahme ist erforderlich
- ein `Durchfallen` IST möglich

Beispiel 4
- `switch` wird als `Ausdruck` mit `Ergebnis` verwendet
- vollständige Abdeckung der Fälle IST erforderlich, da der `switch-Ausdruck` immer ein Ergebnis haben muss
- hinter `->` steht:
  - ein `Ausdruck`,
  - ein `Block` in geschweiften Klammern, ODER
  - ein `throw-Anweisung`, die eine nicht kontrollierte Ausnahme einlöst
- in einem `Block` wird das Ergebnis mit `yield` zurückgegeben
- ein `Durchfallen` ist NICHT möglich

Zusammenfassung:
- wird `:` bei case genutzt ist ein Durchfallen möglich
- wird `->` genutzt ist Durchfallen NICHT möglich
- wird `switch` als Anweisung verwendet, ist eine Abdeckung aller Fälle nicht erforderlich
- wird `switch` als `Ausdruck mit Ergebnis` genutzt, müssen alle Möglichkeiten abgedeckt sein


## 4.2 Schleifen

- `Schleifen` führen Anweisungen wiederholt aus, solange eine Bedingung erfüllt ist
- `while-Schleife`: eine `abweisende Schleife`: die Ausführungsbedingung wird jeweils **vor Eintritt in die Schleife überprüft
```java
while(Ausdruck)
Anweisung
```
- `Ausdruck` muss vom Typ `boolean` sein
- hat `Ausdruck` den Wert `true`, wird `Anweisung` ausgeführt, andernfalls wird mit der Anweisung fortgefahren, die 
  der Schleife folgt
- `do-Schleife` ist eine `nicht abweisende` Schleife: `Anweisung` wird mindestens einmal ausgeführt
- die `Ausführungsbedingungen` wird erst nach der Ausführung der Anweisung (einzelne Anweisung oder Anweisungsblock) 
  geprüft

```java
do
    Anweisung
while (Ausdruck);
```
- die Schleife wird beendet wenn Ausdruck den Wert false hat

Addieren die Zahlen von 1 bis einer vorgegebenen Zahl

```java
public class WhileTest {

    public static void main(String[] args) {
        int n = 100, summe = 0, i = 1;

        while(i <= n){
            summe += i;
            i++;
        }
        System.out.println("Summe 1 bis " + n + ": " + summe);
    }
}
```

- die `for-Schleife`: wiederholt eine Anweisung in Abhängigkeit von Kontrollausdrücken

```java
for(Init; Bedingung; Update)
    Anweisung
```
- `Init`: 
  - eine Liste von durch Kommas voneinander getrennten Anweisungen oder Variablendefinitionen des gleichen Typs
  - wird einmal vor dem Start der Schleife aufgerufen
  - dieser Initialisierungsteil darf fehlen
- `Bedingung`:
  - ein Ausdruck vom Typ `boolean`
  - wird zu Beginn jedes Schleifendurchgangs getestet
  - fehlt `Bedingung`, wird als Ausdruck `true` angenommen
- `Update`:
  - eine Liste von durch Kommas voneinander getrennten Anweisungen; sie kann auch leer sein
  - wird nach jedem Durchlauf der Schleife ausgewertet bevor `Bedingung` das nächste Mal ausgewertet wird
  - meistens dient `Update` dazu:
    - Schleifenzähler zu verrändern und damit
    - die Laufbedingung zu beeinflussen
    
```java
public class ForTest {

    public static void main(String[] args) {
        int n = 100, summe = 0;

        for (int i = 1; i <= n; i++){
            summe += i;
            System.out.println("Summe 1 bis " + n + ": " + summe);
        }
    }
}
```

Sie haben 1€ und Bonbons kosten 10, 20, 30, ... 100 cent. Sie kaufen von jeder Sort ein Bonbon, bis Restgeld nicht 
mehr ausreicht. Wie viele Bonbons kaufen Sie, und welchen Geldbetrag erhalten Sie zurück?

```java
public class Bonbons1 {

    public static void main(String[] args) {
        double budget = 1.;
        int anzahl = 0;

        for(double preis = 0.1; budget >= preis; preis += 0.1){
            budget -= preis;
            anzahl++;
        }
        System.out.println(anzahl + " Bonbons gekauft.");
        System.out.println("Restgeld: " + budget);
    }

}
```

- beim Rechnen mit `double-Werten` kann Genauigkeit verloren gehen!

Lieber mit ganzen Zahlen rechnen:

```java
public class Bonbons2 {

    public static void main(String[] args) {
        int budget = 100;
        int anzahl = 0;

        for (int preis = 10; budget >= preis; preis += 10){
            budget -= preis;
            anzahl++;
        }
        System.out.println(anzahl + " Bonbons gekauft.");
        System.out.println("Restgeld: " + budget);
    }
}
```

- `foreach-Schleife`: elemente eines Arrays oder Collection durchlaufen

## 4.3 Sprunganweisungen

- `Sprunganweisungen`: werden verwendet, um Schleifendurchgänge voezeitig zu beenden
- `break` Anweisung: beendet eine `switch-`, `while-`, `do-` oder `for-` Anweisung, die die 
  `break-Anweisung` unmittelbar umgibt
- um aus geschachtelten Schleifen herauszuspringen, gibt es diese Variante:
```java
break Marke;
```
- `Marke` steht für einen selbst gewählten Bezeichner
- diese Anweisung verzweigt and das Ende der Anweisung, vor der diese Marke unmittelbar steht
- `markierte` Anweisung:
```java
Marke: Anweisung
```
- `break-Anweisungen mit Marke` dürfen in beliebigen markierten Blöcken genutzt werden
- `continue` unterbricht den aktuellen Schleifendurchgang einer `while-`, `do-` oder `for-` Schleife und springt an 
  die Wiederholungsbedingung der sie unmittelbar umgebenden Schleife
  - hier gibt's auch die Variante mit Marke:
```java
continue Marke;
```