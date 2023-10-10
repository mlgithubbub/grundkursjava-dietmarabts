### 6.2 Methoden

- Operationen auf Objekten werden mit **Methoden** realisiert
- Innerhalb einer Methode können die Attribute und Methoden der eigenen Klasse ohne ausdrückliche Objektreferenz
  benutzt werden
#### Methode
Methodendefinition = Methodenkopf + Methodenrumpf mit Implementierung
````
[Modifizierer] Rueckgabetyp Methodenname ([Parameter-Liste]) [throws Exception-Liste]{
        Anweisungen
        }
````
- [] optionale Elemente

#### Rückgabetyp
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

#### Parameter

- spezifizieren die Argumente, die der Methode beim Aufruf übergeben werden
- werden durch Kommas getrennt

#### call by value / call by reference
- ein eigener Speicherplatz wird innerhalb der Methode für jeden Parameter erzeugt, in den der Parameter kopiert
  wird: **call by value**
-

#### Lokale Variable
#### Lokale final-Variable
#### Die Referenz this
#### Signatur
#### Überladen / Overloading