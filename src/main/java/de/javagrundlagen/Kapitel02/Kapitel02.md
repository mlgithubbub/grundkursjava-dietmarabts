
# 2 Einfache Datentypen und Variablen

- ein Programm muss Daten (Zahlen, Zeichenketten, usw.) vorübergehend speichern, damit es Berechnungen und andere 
  Verarbeitungen vornehmen kann

## 2.1 Einfache Datentypen

- `Variabel`: entspricht ein Speicherplatz im Arbeitsspeicher, in dem der aktuelle Wert der Variablen abgelegt ist

### **8 Einfache/Primitive Datentypen**:

#### Tabelle 2-1
| Datentyp | Größe (Byte) | Wertebereich                                               |
|----------|--------------|------------------------------------------------------------|
| boolean  | -            | false, true                                                |
| char     | 2            | 0...65,535                                                 |
| byte     | 1            | -128...127                                                 |
| short    | 2            | -32,768...32,767                                           |
| int      | 4            | -2,147,483,648...2,147,483,647                             |
| long     | 8            | -9,223,372,036,854,775,808...9,223,372,036,854,775,807     |
| float    | 4            | Absolutbetrag 1.4 * 10^-45...3.4028235 * 10^38             |
| double   | 8            | Absolutbetrag 4.9 * 10^-324... 1.7976931348623157 * 10^308 |

### Literale

- `Literal`: eine Zeichenfolge, die den Wert eines einfachen Datentyps darstellt, z.B. 12.345

### Wahrheitswerte


- Der `logische Typ` `boolean` kennt zwei `Literale`: true und false
- Dieser Datentype wird dort verwendet, wo eine Entscheidung erforderlich ist
  - z.B. Bedingungen in Fallunterscheidungen und Schleifen
- Umwandlung ins ganzzahlige Werte nicht möglich

### Zeichen

- Der `Zeichentyp` `char` dient dazu, einzelne Zeichen des Unicode-Zeichensatzes in zwei Byte zu speichern
- Literale werden:
  - in einfache Anführungszeichen eingeschlossen `''`
  - als `Unicode-Zeichen` oder `Escape-Sequenzen` angegeben

#### Unicode:
- eine standardisierte Mehrbyte-Codierung, mit der die Schriftzeichen aller gängigen Sprachen dargestellt werden können
- Zeichen vom Typ `char` sind 16 bit lang: ermöglicht 65.536 Zeichen
- Die ersten 128 Zeichen sind die 7-bit-`ASCII-Zeichen`

#### Tabelle 2-2 Escape-Sequenzen

| Escape-sequenz | Bedeutung                                                             |
|----------------|-----------------------------------------------------------------------|
| \\b            | Backspace                                                             |
| \\t            | Tabulator                                                             |
| \\n            | neue Zeile: Newline                                                   |
| \\f            | Seitenvorschub: Formfeed                                              |
| \\r            | Wagenrücklauf: Carriage return                                        |
| \\"            | doppeltes Anführungszeichen "                                         |
| \\'            | einfaches Anführungszeichen '                                         |
| \\\            | Backslash \                                                           |
| \\ddd          | ASCII-codiertes Zeichen in Oktalschreibweise                          |
| \\udddd        | Unicode-Zeichen in Hexadezimalschreibweise, z.B. \u0020 (Leerzeichen) |

#### Unicode-Escapes für deutsche Umlaute und ß:

| Zeichen | Escape-sequenz |
|---------| --- |
| Ä       | \u00c4 |
| ä       | \u00e4 |
| Ö       | \u00d6 |
| ö       | \u00f6 |
| Ü       | \u00dc |
| ü       | \u00fc |
| ß       | \u00df |

### Ganze Zahlen

- Die `ganzzahligen Typen`: `byte`, `short`, `int`, `long` sind `vorzeichenbehaftet`
- Literale können in `Dezimal-`, `Binär-`, `Oktal-` oder `Hexadezimalform` notiert werden

| Wert | Präfix | gültige Ziffern |
| --- | --- | --- |
| Dezimal | --- | 0-9 |
| Binär | 0b oder 0B | 0 und 1 |
| Oktal | 0 | 0-7 |
| Hexadezimal | 0x oder 0X | 0-9, a-f, A-F |

- Negative Zahlen haben Minuszeichen `-`
- Ganzzahlige Literale sind `int` wenn kein `l` oder `L` angehängt
- Wenn `l` oder `L` -> Typ = `long`
- `char` stellt auch einen ganzzahligen Typ dar und ist `short` gleichgestellt

### Fleißkommazahlen/ Gleitkommazahlen

- `Fließkommatypen` wie `float` und `double` werden in Dezimalschreibweise notiert
- `Fließkommatypen`: 
```
Vorkomma-Teil + Dezimalpunkt + Nachkomma-Teil + Exponenten + Suffix
```
- Es muss mindestens der `Dezimalpunkt`, der `Exponent` oder das `Suffix` vorhanden sein, damit die Zahle von einer 
  ganzzahligen Konstanten unterschieden werden kann
- Falls `Dezimalpunkt` vorkommt, muss vor oder nach ihm eine `Ziffernfolge` stehen
- Entweder `Vorkomma-Teil` oder `Nachkomma-Teil` darf wegfallen
- `Vorkomma-Teil` und `Exponenten` kann `+` oder `-` vorangestellt werden
- `Exponent` wird durch `e` oder `E` eingeleitet
- `Exponent` und `Suffix` sind optional
- Suffix `f` `F` kennzeichnet `float` Literal
- Suffix `d` `D` kennzeichnet `double` Literal
- Folgende Literale stehen für dieselbe Fließkommazahl:
``` 18.   1.8e1   .18e2 ```
- `Unterstriche` können in allen numerischen Literalen zur Erhöhung der Lesbarkeit eingefügt werden: ``` int x = 
  1_000_000 ```
- Der Unterstrich darf nicht am Anfang oder Ende des Literals stehen, und auch nicht vor dem Suffix `f`, `F`, `l` 
  oder `L`

### Zeichenketten

- `Zeichenketten` als Literalen erscheinen in doppelten Anführungszeichen `""`: ``` "Das ist eine Zeichenkette"```
- Es gibt keinen einfachen Datentyp für Zeichenketten
- Zeichenketten sind `Objekte` der Klasse `String`
- Mit dem `Operator` `+` können Zeichenketten aneinandergehängt werden

## 2.2 Variablen

- `Definition` einer `Variablen` erfolgt in der Form:
```java
Typname Variablenname;
```
- Hierdurch wird `Speicherplatz` eingerichtet
- Der Variablen kann durch eine `explizite Initialisierung` ein Wert zugewiesen werden:
```java
int nummer = 10;
```
- Mehrere Variablen des gleichen Typs können in einer Liste, in der die Variablennamen dem Datentyp folgen und durch 
  kommas getrennt sind, definiert werden:
```java
int alter, groesse, nummer;
```

```java
public class Variablen {
  public static void main(String[] args) {
    boolean booleanVar = true;
    char charVar = 'a';
    byte byteVar = 100;
    short shortVar = 32000;
    int intVar = 0b1000_0000;
    long longVar = 123_456_789;
    float floatVar = 0.12345f;
    double doubleVar = 0.12345e1;

    System.out.println("booleanVar: " + booleanVar);
    System.out.println("charVar: " + charVar);
    System.out.println("byteVar: " + byteVar);
    System.out.println("shortVar: " + shortVar);
    System.out.println("intVar: " + intVar);
    System.out.println("longVar: " + longVar);
    System.out.println("floatVar: " + floatVar);
    System.out.println("doubleVar: " + doubleVar);
  }
}
```
- im oben aufgeführten Programm werden Variablen der verschiedenen Datentypen definiert und initialisiert
- der Wert der int-Variablen ist in Binärform angegeben
- zur Ausgabe wir eine Zeichenkette mit dem Wert einer Variablen durch `+` verknüpft und das Ergebnis auf dem 
  Bildschirm ausgegeben
- Dabei wird vorher der Variablenwert automatisch in eine Zeichenkette umgewandelt

### Typinferenz für lokale Variablen

- Innerhalb von `Methoden` oder `Blöcken` kann der Datentyp bei der Definition einer Variablen auf der linken Seite 
  weggelassen werden
- Statt Angabe des Typs wird `var` hingeschrieben
- `var` dient als `Platzhalter` für den Datentyp

Beispiel:
```java
var age = 42;
```

Der `Compiler` leitet den Typ vom Initialisierungsausdruck auf der rechten Seite ab

```java

```