# 3 Operatoren

- Mit `Operatoren` können `Zuweisungen` und `Berechnungen` formuliert und geprüft werden
- `Operatoren` sind Bestandteile von `Ausdrücken`
- Ein `Ausdrück` besteht aus:
  - `Operatoren`
  - `Operanden`
    - auf die ein `Operator` angewandt wird
    - können `variablen`, `Literale`oder `Methodenaufrufe` sein
  - `Klammern`
  
  , die zusammen eine `Auswertungsvorschrift` beschreiben
- Ein `Ausdruck` wird `zur Laufzeit` ausgewertet und liefert ein `Ergebniswert` dessen Typ aus den Typen der 
  Operanden und der Art des Operators bestimmt
  - Ausnahme: Aufruf einer Methode mit Rückgabetyp `void` -> dieser Ausdruck hat keinen Wert
- Wenn mehrere Operatoren im Ausdruck vorkommen, `Vorrangregeln` legen die Reihenfolge der `Auswertung` fest
- Durch setzen von `Runden Klammern` lässt sich eine bestimmte `Auswertungsreihenfolge` erzwingen
```
2 + 3 * 4 = 14
(2 + 3) * 4 = 20
```
- Elementare Ausdrücke:
  - `Literale`
  - `variablen`
  - `Methodenaufrufe`
  - `Zugriffe auf Elemente eines Arrays`
  - usw.
- Operatoren:
  - `arithmetische`
  - `relationale`
  - `logische`
  - `Bit-Zuweisungs-`

### Lernziele:

- mit welchen Operatoren `Berechnungen`, `Vergleiche`, `Bedingungen` formuliert werden können
- welche Besonderheiten zu berücksichtigen sind

## 3.1 Arithmetische Operatoren

- `arithmetischen Operatoren` 
  - haben numerische Operanden
  - liefern einen numerischen Wert
- wenn Operanden unterschiedliche Datentypen haben, wird automatisch eine `Typumwandlung` `"nach oben"` durchgeführt:
  - der kleinere Typ wird in den Typ des größeren umgewandelt:
    - z.B. short -> int, int -> double
  - der `Ergebnistyp` entspricht dem größeren der beiden Operanden, ist aber mindestens vom Typ `int`
    - z.B. byte b1 + byte b2 ist ein `int`, und kann nicht ein byte-Variablen zugewiesen
- bei Division von ganzen Zahlen, wird der Nachkommateil abgeschnitten: ```13/5 = 2```
- Aber ```13/5. = 2.6``` weil 13 nach double konvertiert wird

#### Tabelle 3-1 Arithemetische Operatoren

| Operator | Bezeichnung | Priorität |
| --- | --- | ---| 
| + | positives Vorzeichen | 1 |
| - | negatives Vorzeichen | 1 |
| ++ | Inkrementierung | 1 |
| -- | Dekrementierung | 1 |
| * | Multiplikation | 2 |
| / | Division | 2 |
| % | Rest | 2 |
| + | Addition | 3 |
| - | Subtraktion | 3 |

| Inkrementierung/Dekrementierung | Wert | was passiert           |
|---------------------------------|---|------------------------|
| ++a                             | a + 1 | a wird um 1 erhöht     |
| a++                             | a | a wird um 1 erhöht     |
| --a                             | a - 1 | a wird um 1 verringert |
| a--                             | a | a wird um 1 verringert |

- der `Rest-Operator` `%` berechnet bei ganzzahligen Operanden ```a = (a / b) * b + r ```

Beispiel:
```
13 % 5 = 3
-13 % 5 = -3
```
auf `Fließkommazahlen`:
```
12. % 2.5 = 2.0
```

```java
public class ArithmOp {
    public static void main(String[] args) {
        System.out.println(13/5);
        System.out.println(13%5);
        System.out.println();

        System.out.println(12./2.5);
        System.out.println(12.%2.5);
        System.out.println();

        int a = 1;
        System.out.println(++a + "\t" + a);
        System.out.println(a++ + "\t" + a);
        System.out.println();

        int b = 2;
        System.out.println(--b + "\t" + b);
        System.out.println(b-- + "\t" + b);
        System.out.println();

        double x = .7 + .1;
        double y = .9 - .1;
        System.out.println(y - x);
    }
}
```

Das Programm zeigt, dass das Rechnen mit Fließkommazahlen sogar in sehr einfachen Fällen ungenau sein kann, wenn 
auch die Ungenauigkeit verschwindend gering ist

## 3.2 Relationale Operatoren

- `Relationale Operatoren` vergleichen Ausdrücke mit numerischem Wert miteinander
- Das Ergebnis ist vom Typ `boolean`
- Bei Fließkommazahlen sollte die Prüfung auf exacte Gleichheit oder Ungleichheit vermieden werden, da es bei 
  Berechnungen zu Rundungsfehler kommen kann
  - Stattdessen soll mit Operatoren `<` und `> ` gearbeitet werden, um die Übereinstimmung der Werte bis auf einen 
    relativen Fehler zu prüfen


#### Tabelle 3-2: Relationale Operatoren
| Operator | Bezeichnung         | Priorität |
|----------|---------------------| ---|
| <        | kleiner             | 5 |
| <=       | kleiner oder gleich | 5 |
| \>       | größer              | 5 |
| \>=      | größer oder gleich  | 5 |
| ==       | gleich              | 5 |
| !=       | ungleich            | 5 |


## 3.3 Logische Operatoren

- `Logische Operatoren` verknüpfen `Wahrheitswerte` miteinander:
  - UND, ODER, NICHT, EXCLUSIVE ODER

| Operator | Bezeichnung                   | Priorität |
|----------|-------------------------------|-----------|
| !        | NICHT                         | 1         |
| &        | UND mit vollständiger Auswertung | 7         |
| ^        | exclusives ODER (XOR)         | 8         |
| &#124;   | ODER mit vollständiger Auswertung | 9         |
| &&        | UND mit kurzer Auswertung     | 10        |
| &#124;&#124; | ODER mit kurzer Auswertung    | 11        |

- `short circuit`: bei der kurzen Variante wird der zweite Operand nicht mehr ausgewertet, wenn das Ergebnis des 
  Gesamtausdrucks schon feststeht
- `vollständige Auswertung`: soll der zweite Operand auf jeden Fall ausgewertet werden, muss die vollständige 
  Auswertung genutzt werden

#### Tabelle 3-4: Verknüpfung von Wahrheitswerten

| a     | b     | a &(&) b | a ^ b | a &#124;(&#124;) b |
|-------|-------|----------|-------|--------------------|
| true  | true  | true     | false | true               |
| true  | false | false    | true  | true               |
| false | true  | false    | true  | true               |
| false | false | false    | false | false              |


```java
public class LogOp {

    public static void main(String[] args) {
        int a = 2, b = 3;

        System.out.println(a == 2 && b < 8);
        System.out.println(a != 2 || !(b < 2));
        System.out.println(a == 2 ^ b > 0);

        System.out.println(a == 0 && b++ == 3);
        System.out.println(b);

        System.out.println(a == 0 & b++ == 3);
        System.out.println(b);

        System.out.println(a == 2 || b++ == 3);
        System.out.println(b);

        System.out.println(a == 2 | b++ == 3);
        System.out.println(b);
    }
}
```

## 3.4 Bitoperatoren

-`Bitoperatoren` arbeiten auf der Binärdarstellung ganzahliger Operanden
  - also, mit: 8 Bit (byte), 16 Bit (short, char), 32 Bit (int) oder 64 Bit (long)
- `~a`: alle Bit von `a` werden invertiert
- `Schiebeoperatoren`: alle Bit des ersten Operanden werden um so viele Stellen nach links/rechts geschoben wie im 
  zweiten Operanden angegeben ist
- Beim `Linksschieben` werden von rechts Nullen nachgezogen
- Beim `Rechtsschieben` 
  - falls der erste Operand positiv ist, werden von links Nullen nachgezogen
  - falls negativ, werden Einsen nachgezogen
- Beim `>>>` werden von links immer Nullen nachgezogen

#### Tabelle 3-5: Bitoperatoren

| Operator | Bezeichnung                              | Priorität |
|---------|------------------------------------------| --- |
| `~`     | Bitkomplement                            | 1 |
| `<<`    | Linksschieben                            | 4 |
| `>>`    | Rechtssschieben                          | 4 |
| `>>>`   | Rechtssschieben mit Nachziehen von Nullen | 4 |
| `&`     | bitweises UND                            | 7 |
| `^`     | bitweises exclusives ODER                | 8 |
| `&#124;`                                         | bitweises ODER | 8 |


#### Tabelle 3-6: Bitweise Verknüpfungen

| a   | b   | a & b | a ^ b | a &#124; b |
|-----|-----| --- |-------| --- |
| 0   | 0   | 0 | 0     | 0 |
| 0   | 1   | 0 | 1     | 1 |
| 0   | 0   | 0 | 0     | 0 |
| 1   | 0   | 0 | 1    | 1 |
| 1   | 1   | 1 | 0     | 1 |


## 3.5 Zuweisungsoperatoren

- `arithmetische` und `bitweise` Operatoren können mit der `Zuweisung` kombiniert werden
- bei der `einfachen Zuweisung` wird der rechts stehende Ausdruck ausgewertet und der links stehenden Variablen 
  zugewiesen
- die Datentypen beider Seiten müssen kompatibel sein: der Typ des Ausdrucks muss mit dem Typ der Variablen 
  übereinstimmen oder in diesen umgewandelt werden können
- eine automatische Umwandlung der rechten Seite "nach oben"
in den Typ der Variablen wird ggf. durchgeführt
- folgende Zuweisungen sind möglich:
```
byte --> short/char --> int --> long --> float --> double
```
- Zuweisungen haben als Ausdruck selbst einen Wert, nämlich den Wert des zugewiesenen Ausdrucks

### Tabelle 3-7: Zuweisungsoperatoren

| Operator | Bezeichnung | Priorität |
| --- | --- | --- | 
| = | einfache Zuweisung | 13 |
| op= | kombinierte Zuweisung, dabei steht `op`für: <br /> `*`, `/`, `%`, `+`, `-`, `<<`, `>>`, `>>>`,`&`,`^`, `&#124;`| 13 |

```
a op= b
a = a op b
```

## 3.6 Bedingungsoperator

- der `Bedingungsoperator` benötigt drei `Operanden`
```
Bedingung? Ausdruck1 : Ausdruck2
```
- `Bedingung` muss vom Typ `boolean` sein
- Falls `Bedingung` wahr ist, wird `Ausdruck1`, sonst `Ausdruck2` ausgewertet
- `Bedingungsoperator` hat Priorität 12

Beispiele:
```
Wenn a ein Zahl ist, ist der Wert der Absolutbetrag von a
a < 0 ? -a : a

Ergibt das Maximum von a und b:
a < b ? b : a
```

## 3.7 Cast Operator

- mit dem `Cast-Operator` wird eine `explizite Typumwandlung` vorgenommen
- ```(type) a``` wandelt den Ausdruck `a` in einen Ausdruck vom Typ `type` um, wenn möglich
- `Cast-Operator` hat Priorität 1

int-Variablen b einen double-Wert zuweisen:
```java
b = (int) a
```
short-Variablen a in einen byte-Wert b umwandeln:
```java
b = (byte) a
```
- das höherwertige Byte wird von a abgeschnitten:
```b = (byte) 257 --> 1```

Wie eine `reelle Division` ganzer Zahlen erzwungen werden kann:

```java
public class CastOp {

    public static void main(String[] args) {
        int x = 5, y = 3;
        double z = x / y;
        System.out.println(z);
        
        z = (double) x/y;
        System.out.println(z);

        long a = 9123456789123456789L;
        System.out.println(a);

        double b = a;
        long c = (long)b;
        System.out.println(c);
    }
}
```

