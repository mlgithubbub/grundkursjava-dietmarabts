# 5 Arrays

- Array:
    - eine geordnete Sammlung von Elementen desselben Datentyps, die man unter einem gemeinsamen Namen ansprechen kann
    - die Elemente eines Arrays enthalten alle entweder Werte desselben einfachen Datentyps oder Referenzen auf Objekte desselben Typs

## 5.1 Definition und Initialisierung

- Definition der Array-Variablen: *Typ[] Arrayname;*
    - *Typ* = einfacher Datentyp/Referenztyp
- Erzeugung eines Arrays: *new Typ[Ausdruck]*
    - *Ausdruck* legt die Größe des Arrays fest und muss Typ *int* haben

Beispiel:
```java
int[] x;
x = new int[10];
```
- erzeugt ein Array *x* vom Typ *int*, das 10 Zahlen aufnehmen kann

Steht bei der Definition bereits fest, wie viele Elemente das Array aufnehmen soll, können beide Anweisungen 
zusammengefasst werden:
```java
int[] x = new int[10];
```

Bei der Erzeugung werden die Elemente eines Arrays mit *Standardwerten* vorbesetzt:
| Typ | Standardwert |
|---|---|
|Zahlen| 0 |
|boolean | false |
|String | null |
- *null* ist eine Referenz, die auf nichts verweist

Ein Array kann bei der Definition erzeugt und direkt *initialisiert* werden:
- Die Größe ergibt sich aus der Anzahl der zugewiesenen Werte

Beispiel:
````java
int[] x = {1, 10, 4, 0}; // hat 4 Elemente 
````
oder:
```java
int[] x = new int[] {1, 10, 4, 0};
```
- Die Größe eines Arrays kann erst zur Laufzeit festgelegt werden und kann danach nicht mehr verändert werden
- Die Anzahl der Elementen eines Arrays kann über das *length* Attribut abgefragt:
````java
x.length
````

## 5.2 Zugriff auf Array-Elemente

Der Zugriff auf ein Element erfolgt über seinen Index:
````java
Arrayname[Ausdruck]
````
- Ausdruck = Index und muss vom Typ int sein

Laufzeitsystem prüft Einhaltung der Array-Grenzen:
- Bei Überschreitung der Grenzen wird die Exception *ArrayIndexOutOfBoundsException* ausgelöst

Wenn beim Durchlaufden einer for-Schleife der Schleifenindex nicht benötigt wird, kann die *for-each-Schleife* 
eingesetzt:
````java
for(int zahl : zahlen){
    System,out.print(zahl + " ");
        }
````
- *zahl* wird der Reihe Nach jedes Element des Arrays zahlen zugewiesen
- *zahl* ist nur im Schleifenkörper gültig
- Veränderungen an Schleifenvariablen wirken sich nicht auf die Elemente des Arrays aus

### Mehrdimensionale Arrays

- sind geschachtelte Arrays oder Arrays von Arrays

Beispiel:
````java
int[][] x = new int[2][3];
````
- erzeugt 2 x 3 Matrix ( 2 Zeilen, 3 Spalten)
- x[0] und x[1] verweisen jeweils auf ein Array aus 3 Elementen
- Zugriff auf ein Element erfolgt durch Angabe aller erforderlichen Indizes

````java
int[][] x = {{1,2,3},{4,5,6}};
````
- x.length hat den Wert 2

## 5.3 Kommandozeilen-Parameter

Beim Aufruf eien Java-Applikation kann man dem Programm in der Kommandozeile Parameter, die durch Leerzeichen 
voneinander getrennt sind mitgeben:
````java
java Programm param1 param 2 ...
````
Die Kommandozeilen-Parameter werden der Methode main übergeben:
````java
public static void main(String[] args)
````
- args ist ein Array vom Typ String und enthält Kommandozeilen-Parameter als Elemente
