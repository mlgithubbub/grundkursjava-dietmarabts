# 6 Klassen, Objekte und Methoden

- Begriffe wie *Klasse*, *Objekt*, *Attribut* und *Methode*
- OOP löst sich von dem Prinzip der Trennung von Daten und Funktionen wie in **prozeduralen Programmiersprachen**
  üblich ist
- stattdessen werden Daten und Funktionen zu selbständigen Einheiten zusammengefasst

Wir lernen:
- Klassen definieren
- Objekte erzeugen
- Instanzvariablen und -methoden
- statischen Variablen und statischen Methoden

## 6.1 Klassen und Objekte

- **Klasse**:
    - allgemeingültige Beschreibung von Dingen, die in verschiedenen Ausprägungen vorkommen können, aber alle:
        - gemeinsame Struktur
        - gemeinsames Verhalten
          haben.
    - ein Bauplan für die Erzeugung von einzelnen konkreten Ausprägungen: **Objekte** oder **Instanzen** der Klasse

### Zustand und Verhalten

Bestandteile einer Klasse:
- **Attribute**: sagen etwas über den Zustand des Objekts aus
- **Methoden**: enthalten den ausführbaren Code einer Klasse, beschreiben das *Verhalten* des Objekts
    - können Werte von Attributen und damit den Zustand des Objekts änder
- **Konstruktoren**: spezielle Methoden, die bei der Objekterzeugung aufgerufen werden

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
- Initialisierer/innere Klassen/Interfaces können auch in der Klasse definiert werden

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
- **public**: kann außerhalb der eigenen Klasse zugegriffen werden
- **private**: diese Methoden und Attribute können nur in der eigenen Klasse zugegriffen

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
Konto meinKonto = newKonto();
```
- Der Operator "new" uses a method Konto() automatically created by the Compiler to create Speicherplatz for a new object of type Konto
- **Instanzierung**: das Erzeugen eines Objekts
- **Objekte**: **Instanzen** der entsprechenden Klasse

### Indentität

- Identität ist unabhängig von Zustand
- Objects can have all the same values but still possess their unique identity

### Referenzvariable

- meinKonto enthält nicht das Objekt selbst, sondern nur einen Addressverweis auf seinen Speicherplatz
- Solche Variablen werden *Referenzvariablen* genannt
- Klassen sind *Referenztypen*
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

- Attribute können einfacher Datentypen oder Referenztypen sein
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

- Operationen auf Objekten werden mit **Methoden** realisiert
- Innerhalb einer Methode können die Attribute und Methoden der eigenen Klasse ohne ausdrückliche Objektreferenz
  benutzt werden
### Methode
Methodendefinition = Methodenkopf + Methodenrumpf mit Implementierung
````
[Modifizierer] Rueckgabetyp Methodenname ([Parameter-Liste]) [throws Exception-Liste]{
        Anweisungen
        }
````
- [] optionale Elemente

### Rückgabetyp
- Eine Methode kann einen Wert zurückgeben
- Der Rückgabetyp kann ein **einfacher Datentyp** oder ein **Referenztyp** sein
- **void** gibt keinen Wert zurück
- Werte sind mit *return* zurückzugeben:



````java
return Ausdruck;  
````
- die return-Anweisung beendet die Methode
- bei void-Methoden fehlt *Ausdruck*
- *Ausdruck* muss *zuweisungskompatibel* zum Rückgabetyp der Methode sein

### Parameter

- spezifizieren die Argumente, die der Methode beim Aufruf übergeben werden
- werden durch Kommas getrennt

### call by value / call by reference
- ein eigener Speicherplatz wird innerhalb der Methode für jeden Parameter erzeugt, in den der Parameter kopiert
  wird: **call by value**
- dadurch bleiben die Variablen, deren Wert beim Aufruf der Methode als Argumente übergeben werden, unverändert
- `call by reference`: ist das `Argument` vom `Referenztyp`, verweist also auf ein Objekt, so kann die Methode 
  dieses Objekt verändern, da die Referenzvariable und ihre Kopie auf dasselbe Objekt verweisen; diese Art des 
  Methodenaufrufs wird als "call by reference" bezeichnet

### Lokale Variable
### Lokale final-Variable
### Die Referenz this
### Signatur
### Überladen / Overloading


## 6.3 Konstruktoren

### Standardkonstruktor
### this(...)
### Initialisierungsblock
### Garbage Collector


## 6.4 Klassenvariablen und Klassenmethoden

### Klassenvariable
### Instanzvariable
### Klassenmethode
### Instanzmethode
### main-Methode
### statische Initialisierung

## 6.5 Varargs

## 6.6 Iterative und rekursive Problemlösungen