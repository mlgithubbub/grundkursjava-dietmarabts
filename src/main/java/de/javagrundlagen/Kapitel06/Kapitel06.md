# 6 Klassen, Objekte und Methoden

- Begriffe wie *Klasse*, *Objekt*, *Attribut* und *Methode*
- `OOP` löst sich von dem Prinzip der **Trennung von Daten und Funktionen** wie in **prozeduralen Programmiersprachen**
  üblich ist
- stattdessen werden Daten und Funktionen zu selbständigen Einheiten zusammengefasst

Wir lernen:
- Klassen definieren
- Objekte erzeugen
- Instanzvariablen und -methoden
- statischen Variablen und statischen Methoden

## 6.1 Klassen und Objekte

- `Klasse`:
    - allgemeingültige Beschreibung von Dingen, die in verschiedenen Ausprägungen vorkommen können, aber alle:
        - gemeinsame Struktur
        - gemeinsames Verhalten
          haben.
    - ein Bauplan für die Erzeugung von einzelnen konkreten Ausprägungen: `Objekte` oder `Instanzen` der Klasse

### Zustand und Verhalten

Bestandteile einer Klasse:
- `Attribute`: sagen etwas über den Zustand des Objekts aus
- `Methoden`: enthalten den ausführbaren Code einer Klasse, beschreiben das *Verhalten* des Objekts
    - können Werte von Attributen und damit den Zustand des Objekts ändern
- `Konstruktoren`: spezielle Methoden, die bei der Objekterzeugung aufgerufen werden

### Klasse

Aufbau einer Klasse:
````java
[Modifizierer] class Klassenname [extends Basisklasse] [implements Interface-Liste]{
        Attribute
        Konstruktoren
        Methoden
        }
````
- Die Dingen in eckigen Klammern [] sind optional
- `Initialisierer`, `innere Klassen`, `Interfaces` können auch in der Klasse definiert werden

````java
public class Konto {
    //Attribute:
    private int kontonummer;
    private double saldo;

    //Get-/Set-Methoden
    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int nr) {
        kontonummer = nr;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double betrag) {
        saldo = betrag;
    }

    //Methoden, die den Saldo erhöhen/vermindern
    public void zahleEin(double betrag) {
        saldo += betrag;
    }

    public void zahleAus(double betrag) {
        saldo -= betrag;
    }

    //Methode, die die Attributwerte ausgibt
    public void info() {
        System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
    }
}

````
- `public`: kann außerhalb der eigenen Klasse zugegriffen werden
- `private`: diese Methoden und Attribute können nur in der eigenen Klasse zugegriffen

### Quelldatei und public-Klasse

- Eine Quelldatei soll nur einen Klassendefinition enthalten
- Sind mehrere Klassen in einer Datei definiert, darf höchstens eine den Modifizierer *public* haben
- Enthält die Datei eine public-Klasse, so muss diese Datei den gleichen Namen wie die Klasse haben (Groß- und
  Kleinschreibung ist zu achten)

### Objekterzeugung mit new

Um ein Objekt von einer Klasse zu erzeugen:
- definiere eine Variable vom Typ der Klasse
- assign the variable to a new object using the new operator

````java
Konto meinKonto;
meinKonto = new Konto();
````
or:
```java
Konto meinKonto = new Konto();
```
- Der Operator `new` uses a method Konto() automatically created by the Compiler to create Speicherplatz for a new object of type Konto
- `Instanzierung`: das Erzeugen eines Objekts
- `Objekte`: `Instanzen` der entsprechenden Klasse

### Indentität

- `Identität` ist unabhängig von `Zustand`
- Objects can have all the same values but still possess their unique identity

### Referenzvariable

- meinKonto enthält nicht das Objekt selbst, sondern nur einen Addressverweis auf seinen Speicherplatz
- Solche Variablen werden `Referenzvariablen` genannt
- Klassen sind `Referenztypen`
- null = leere Referenz
- Referenzvariablen mit Wert null verweisen nirgendwohin
```java
public class example{
  Konto meinKonto = new Konto();
  Konto k = meinKonto; 
}
```
- k und meinKonto referenzieren dasselbe Objekt
- für zwei Referenzvariablen x und y, x == y wenn beide dasselbe Objekt referenzieren

### Initialisierung

- `Attribute` können `einfacher Datentypen` oder `Referenztypen` sein
- Nicht explizit initialisierte Attribute erhalten bei der Objekterzeugung automatisch einen Standardwert:

| type | standard value         |
|---|------------------------|
| Zahlen | 0                      |
| boolean | false                  |
| char | Unicode-Zeichen \u0000 |
| Referenzvariablen | null                   |


### Punktnotation

- Um auf Attribute oder Methoden eines Objekts zugreifen zu können, wird Punktnotation verwendet
```
Referenz.Attribut
Referenz.Methode(...)
```

````java
public class KontoTest {
    public static void main(String[] args) {
        // Ein Objekt der Klasse Konto wird erzeugt.
        Konto meinKonto = new Konto();

        // Für dieses Objekt werden einige Methoden angewandt.
        meinKonto.setKontonummer(4711);
        meinKonto.setSaldo(500.);
        meinKonto.zahleEin(10000.);
        double saldo = meinKonto.getSaldo();
        System.out.println("Saldo: " + saldo);
    }
}
````
- wären die Attribute der Klasse Konto nicht private, könnte man auch unter Umgehung der Methodenaufrufe die
  Attribute direkt ansprechen:
- ```java
  meinKonto.kontonummer = 4711;
  meinKonto.saldo = 500.;
  meinKonto.saldo = += 10000.;
  ```
- diese Variablen gehören zu den Implementierungsdetails einer Klasse, daher sollen nur von den öffentlichen
  Methoden der Klasse verändert werden können

## 6.2 Methoden

- Operationen auf Objekten werden mit `Methoden` realisiert
- Innerhalb einer Methode können die `Attribute` und `Methoden` der eigenen Klasse ohne ausdrückliche `Objektreferenz`
  benutzt werden
### Methode
`Methodendefinition` = `Methodenkopf` + `Methodenrumpf` mit Implementierung
````
[Modifizierer] Rueckgabetyp Methodenname ([Parameter-Liste]) [throws Exception-Liste]{
        Anweisungen
        }
````
- [] optionale Elemente

### Rückgabetyp
- Eine Methode kann einen Wert zurückgeben
- Der Rückgabetyp kann ein `einfacher Datentyp` oder ein `Referenztyp` sein
- `void` gibt keinen Wert zurück
- Werte sind mit `return` zurückzugeben:



````java
return Ausdruck;  
````
- die return-Anweisung beendet die Methode
- bei void-Methoden fehlt `Ausdruck`
- `Ausdruck` muss `zuweisungskompatibel zum Rückgabetyp` der Methode sein

### Parameter

- spezifizieren die `Argumente`, die der Methode beim Aufruf übergeben werden
- werden durch Kommas getrennt

### call by value / call by reference
- ein eigener `Speicherplatz` wird innerhalb der Methode für jeden Parameter erzeugt, in den der Parameter kopiert
  wird: `call by value`
- dadurch bleiben die Variablen, deren Wert beim Aufruf der Methode als `Argumente` übergeben werden, unverändert
- `call by reference`: ist das `Argument` vom `Referenztyp`, verweist also auf ein Objekt, so kann die `Methode` 
  dieses `Objekt` verändern, da die `Referenzvariable` und `ihre Kopie` auf `dasselbe Objekt` verweisen; diese Art des 
  Methodenaufrufs wird als `call by reference` bezeichnet:

```java
public class ParamTest {

    public void test(double betrag, Konto kto){
        betrag += 100.;
        kto.zahleEin(betrag);
    }

    public static void main(String[] args) {
        ParamTest p = new ParamTest();

        double wert = 1000.;
        Konto konto = new Konto();

        System.out.println("Vorher: wert=" + wert + " saldo=" + konto.getSaldo());
        p.test(wert, konto);
        System.out.println("Nachher: wert=" + wert + " saldo=" + konto.getSaldo());
    }
}
```
1. `main`-Methode wird ausgeführt
2. Beim Aufruf von **test**, die `Parameter` `betrag` und `kto` werden als `Variablen` erzeugt
3. In `betrag` wird der wert von `wert` kopiert
4. In `kto` wird die `Referenz` auf das konto-Objekt (Adresse dieses Objekts) kopiert
5. Nach Ausführung der Methode enthält `wert` immer noch `1000.0` aber `konto` ist jetzt `1100.0`
- So `call by reference` changes objects outside of the method, but `call by value` only makes changes within the 
  method?

### Lokale Variable

- `lokale Variablen`: Variablen, die innerhalb einer Methode oder innerhalb eines Blockes einer Methode definiert werden
- werden `angelegt`, wenn die Ausführung der Methode/des Blocks beginnt
- werden `zerstört`, wenn die Methode/der Block verlassen wird
- Variablen innerer Blöcke verdecken gleichnahmige Variablen äußerer Blöcke, insbesondere gleichnahmige Attribute 
  der Klasse 
- Die `Parameter` einer Methode sind als `lokale Variablen` des `Methodenrumpfs` aufzufassen
- Variablen, die im Initialisierungsteil des Kopfs einer `for`-Anweisung definiert werden, sind nur innerhalb der 
  `for`-Anweisung gültig
- Innerhalb eines Blocks kann auf der Variablen der umgebenden Blöcke/Methode sowie auf der umschließenden Klasse 
  zugegriffen werden
- Es ist nicht erlaubt, eine bereits definierte lokale Variable in einem tiefer geschachtelten Block erneut mit dem 
  gleichen Namen zu definieren, aber ihr Name darf mit einem Attributnamen der Klasse übereinstimmen
- Definitionen lokaler Variablen können mit anderen Anweisungen gemischt werden


### Lokale final-Variable

- Beginnt die Definition einer lokalen Variablen mit `final`, so handelt es sich um eine `Konstante`, wird entweder:
  - sofort mit einem Wert initialisiert
  - vor dem ersten Zugriff ein Wert zugewiesen
- Der Wert ist dann unveränderbar
- Die Parameter einer Methode können auch `final` deklariert werden; Eine Zuweisung an sie im Methodenrumpf ist dann 
  nicht möglich

### Die Referenz this

- Innerhalb einer Methode bezeichnet `this` einen Wert, der dasjenige Objekt referenziert, für das die Methode 
  aufgerufen wurde
- `this` bezeichnet das gerade `handelnde` Objekt
- `this` wird benutzt um:
  - auf "verdeckte" Attribute der eigenen Klasse zuzugreifen
  - die eigene Instanz als Wert zurückzugeben
  - oder die eigene Instanz als Argument beim Aufruf einer anderen Methode zu verwenden

```java
public void setKontonummer(int kontonummer){
    this.kontonummer = kontonummer;
        }
```
- In diesem Beispiel verdeckt die lokale Variable das Attribut `kontonummer` der Klasse `konto`
- Mit `this` wird das Attribut trotz Namensgleichheit zugänglich

### Signatur

- `Signatur` der Methode = `Name der Methode` + ihre `Parameterliste`
- Der `Rückgabetyp` gehört **nicht** zur Signatur
- Um eine Methode einer Klasse in einem Programm aufrufen zu können, muss nur:
  - ihre Signatur
  - ihr Rückgabetyp
  - ihre semantische Wirkung ... bekannt sein.
- Wie die Methode im Methodenrumpf implementiert ist, interessiert nicht (`Black Box`)

### Überladen / Overloading

- Es können mehrere Methoden mit gleichem Namen aber unterschiedlichen Signaturen definiert werden
- Der Compiler entscheidet beim Methodenaufruf, welche der definierten Methoden aufgerufen wird
- Mögliche implizite Typumwandlungen werden einbezogen und die Methode ausgewählt die am genauesten passt
- Diese Technik nennt man `Überladen`/`Overloading`
- `Überladene Methoden` unterscheiden sich in der `Parameterliste`
- Sie sollen eine vergleichbare Funktionalität haben , um keine Verwirrung zu stiften

```java
public int max(int a, int b){
    return a < b? b : a;
        }

public double max(double a, double b){
        return a < b? b : a;
        }

public int max(int a, int b, int c){
        return max(max(a,b),c);
        }
```

Die Signaturen dieser Methoden sind alle voneinander verschieden:
- max int int
- max double double
- max int int int

```java
public class OverloadingTest {
    public int max (int a, int b){
        System.out.println("Signatur: max int int");
        return a < b ? b : a;
    }

    public double max (double a, double b){
        System.out.println("Signatur: max double double");
        return a < b ? b : a;
    }

    public int max (int a, int b, int c){
        System.out.println("Signatur: max int int int");
        return max(max(a,b),c);
    }

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        System.out.println("max(1, 3): " + ot.max(1,3));
        System.out.println();
        System.out.println("max(1, 2, 3): " + ot.max(1,3,2));
        System.out.println();
        System.out.println("max(1., 3.): " + ot.max(1., 3.));
        System.out.println();
        System.out.println("max(1., 3): " + ot.max(1., 3));
    }


}

```

## 6.3 Konstruktoren

- `Konstruktor`-en sind spezielle Methoden, die bei der Erzeugung eines Objekts mit `new` aufgerufen werden
- Sie werden häufig genutzt, um einen Anfangszustand für das Objekt herzustellen, der durch eine einfache 
  Initialisierung nicht zu erzielen ist
- Ein Konstruktor trägt den Namen der zugehörigen Klasse und hat keinen Rückgabetyp
- Ansonsten wird er wie eine andere Methode definiert
- kann auch überladen werden

### Standardkonstruktor

- Wenn für eine Klasse kein Konstruktor explizit deklariert ist, wird ein sogenannter Standardkonstruktor ohne 
  Parameter vom Compiler selbst bereitgestellt
- Ist ein Konstruktor mit oder ohne Parameter explizit definiert, so erzeugt der Compiler von sich aus keinen 
  Standardkonstruktor mehr

```java
public Konto(){}

Konto(int kontonummer){
    this.kontonummer = kontonummer;
        }

public Konto(int kontonummer, double saldo){
    this.kontonummer = kontonummer;
    this.saldo = saldo;
        }
        
public Konto(Konto k){
    kontonummer = k.kontonummer;
    saldo = k.saldo;
        }
```

- Der vierte Konstruktor erzeugt eine Kopie eines bereits bestehenden Objekts derselben Klasse: `Kopierkonstruktor`

```java
public class KonstrTest {

    public static void main(String[] args) {
        Konto k1 = new Konto();
        Konto k2 = new Konto(4711);
        Konto k3 = new Konto(1234, 1000.);
        Konto k4 = new Konto(k3);
        
        k1.info();
        k2.info();
        k3.info();
        k4.info();

        new Konto(5678,2000.).info();
    }
}
```

- Objekte ohne eigene Referenzvariable können erzeugt werden: `anonyme Objekte`
  - `info` Methode wird direkt für das zuletzt erzeugte `konto`Objekt aufgerufen
  - Danach ist das Objekt nicht mehr verfügbar

### this(...)

- Konstruktoren können sich gegenseitig aufrufen, sodass vorhandener Programmcode wiederverwendet werden kann
- Der Aufruf eines Konstruktors muss dann als erste Anweisung mit dem Namen `this` erfolgen
- Der zweite Konstruktor des vorigen Beispiels hätte auch so geschrieben werden können

```java


public Konto(int kontonummer){
    this(kontonummer, 0.);
        }
```

### Initialisierungsblock

- Ein `Initialisierungsblock` `{...}` : Block von Anweisungen, der außerhalb aller Attribut-, Konstruktor-, und 
  Methodendefinitionen erscheint
- Er wird beim Aufruf eines Konstruktors immer als Erstes ausgeführt
- Mehrere Initialisierungsblöcke werden dabei in der aufgeschriebenen Reihenfolge durchlaufen

### Garbage Collector

- Die Verschiedene Elemente eines Programms werden in unterschiedlichen Bereichen des Hauptspeichers verwaltet
- Im `Stack` werden `lokale Variablen` und `Methodenparameter` verwaltet
- Im `Heap` liegen `erzeugten Objekte einer Klasse
- Im `Methodenspeicher` wird die Representation jeder geladenen Klasse verwaltet
- Der Heap wird vom `Garbage Collector` des Java-Laufzeitsystems automatisch freigegeben, wenn er nicht mehr gebraucht 
  wird:
  - wenn die Methode, in der ein Objekt erzeugt wurde, endet
  - wenn die Referenzvariable auf den Wert `null` gesetzt wurde
  ... kann das Objekt nicht mehr benutzt werden, da keine Referenz mehr darauf verweist
- Wann die `Speicherbereinigung` ausgeführt wird, ist nicht festgelegt; Normalerweise startet sie nur dann, wenn 
  Speicherplatz knapp wird und neue Objekte benötigt werden

## 6.4 Klassenvariablen und Klassenmethoden

Attribute und Methoden, deren Nutzung nicht an die Existenz von Objekten gebunden ist

### Klassenvariable

- `Klassenvariable` (auch `statische Variablen` genannt): ein Attribut einer Klasse, dessen Definition mit dem 
Schlüsselwort `static` versehen ist
- werden bereits beim Laden der Klasse erzeugt
- Es existiert nur ein Exemplar dieser Variablen, unabhängig von der Anzahl der Instanzen der Klasse
- ihre Lebensdauer erstreckt sich über das ganze Programm
- Der Zugriff von außerhalb der Klasse erfolgt über den Klassennamen in der Form:
```java
Klassenname.Variablename
```
- Der Zugriff über ein Objekt der Klasse ist ebenfalls möglich

### Instanzvariable

- `Nicht-statische Attribute` werden zur Unterscheidung auch `Instanzvariablen` genannt
- Mit Klassenvariablen können beispielweise Instanzen-Zähler realisiert werden:

```java
public class ZaehlerTest {
    private static int zaehler;
    
    public ZaehlerTest(){
        zaehler++;
    }

    public static void main(String[] args) {
        new ZaehlerTest();
        new ZaehlerTest();
        new ZaehlerTest();
        System.out.println(ZaehlerTest.zaehler);
    }
}
```

- Die Instanzen der Klasse `ZaehlerTest` teilen sich die gemeinsame Variable `zaehler`

### Klassenmethode

- `Klassenmethode` (auch `statische Methoden` genannt): eine Methode, deren Definition mit dem Schlüsselwort `static` 
  versehen ist
- Kann von außerhalb der Klasse über den Klassennamen aufgerufen werden:

```java
Klassenname.Methodenname(...)
```
- Man braucht keine Instanz der Klasse um sie aufrufen zu können

### Instanzmethode

- `Nicht-statische Methoden` werden zur Unterscheidung `Instanzmethoden` genannt
- `Klassenmethoden` dürfen nur auf `Klassenvariablen` und `Klassenmethoden` zugreifen
- `Klassenmethoden` können wie bei `Instanzmethoden` überladen werden

### main-Methode

````java
public static void main(String[]args){
        
        }
````

- Durch hinzufügen der `main`  Methode wird eine beliebige Klasse zu einer `Java-Applikation`
- Diese `Klassenmethode` ist der Startpunkt der Anwendung
- Sie wird vom `Java-Laufzeitsystem` aufgerufen
- `main` ist als `Klassenmethode` definiert, da zum Startpunkt noch kein Objekt existiert
- Eine Klasse, die eine `main` Methode enthält, nennt man auch `ausführbare Klasse`

### Statische Initialisierung

- `statischer Initialisierungsblock`: ein Block von Anweisungen, der außerhalb aller Attribut-, Konstruktor-, und 
  Methodendefinitionen erscheint und mit dem Schlüsselwort `static` eingeleitet wird
- Er kann nur auf `Klassenvariablen` zugreifen und `Klassenmethoden` aufrufen

```java
static {
    Anweisungen
        }
```
- Eine Klasse kann mehrere statische Initialisierungsblöcke haben
- Sie werden in der aufgeschriebenen Reihenfolge ein einziges Mal ausgeführt, wenn die Klasse geladen wird

## 6.5 Varargs

- Mit `Varargs` (`variable length argument lists`) lassen sich Methoden mit einer beliebigen Anzahl von Parametern 
  desselben Typs definieren
- Nur ein einziger Parameter , der `Vararg-Parameter` wird benötigt
- Zu Kennzeichnung werden dem Datentyp dieses Parameters drei Punkte angefügt

```java
int sum(int... values)
int min(int firstValue, int... remainingValues)
```
- Es darf nur ein einziger `Vararg-Parameter` in der Parameterliste der Methode vorkommen
- Dieser muss der letzte in einer längeren Parameterliste sein
- In Methodenrumpf steht der `Vararg-Parameter` als Array zur Verfügung

```java
public class VarargTest {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,10,100,1000));
        System.out.println(sum());
        System.out.println(min(3,5,2));
    }

    public static int sum(int... values){
        int sum = 0;
        for(int v : values){
            sum += v;
        }
        return sum;
    }

    public static int min(int firstValue, int... remainingValues) {
        int min = firstValue;
        for (int v : remainingValues) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}
```

## 6.6 Iterative und rekursive Problemlösungen

- Meist können Probleme effizient `iterativ` gelöst werden
- Dabei werden mehrfach auszuführende Schritte in Schleifen umgesetzt

Es soll die Summer der ersten n Zahlen ermittelt werden: 1 + 2 + ... + n

```java
public class Iteration {

  public static long sum(int n){
    long sum = 0;
    for(int i = 1; i <= n; i++){
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(100));
  }
}
```

- Eine andere Möglichkeit besteht darin, eine Funktion zu definieren, die für mehrfach auszuführende Schritte sich 
  selbst wiederholt aufruft, also `rekursiv` arbeitet:
- Fur die Summer der Zahlen von 1 bis n:
```
sum(1) = 1
sum(n) = sum(n-1) + n, falls n > 1
```

```java
public class Rekursion {
    public static long sum(int n) {
        if (n == 1) {
            System.out.println("sum(1) returns 1");
            return 1;
        }

        System.out.println("sum(" + n + ") returns sum(" + (n - 1) + ") + " + n);
        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
```

- `Iterative Verfahren` sind meist effizienter und benötigen weniger Speicherplatz
- Weil beim `rekursiven Verfahren` die wiederholten Methodenaufrufe mit allen zwischengespeicherten Werten auf dem 
  `Stack` abgelegt werden
- Das kann zu `Pufferüberlauf` führen, da der Speicherplatz für einen Stack begrenzt ist
- Andererseits gibt es komplexe Problemstellungen, die elegant nur rekursiv mit wenigen Quellcodezeilen gelöst 
  werden können, z.B. `die Türme von Hanoi`