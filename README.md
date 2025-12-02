# Aufgabe – FizzBuzz (Gruppe C – TDD + KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** und dürfen zusätzlich eine KI
(z.B. ChatGPT) unter klar definierten Bedingungen verwenden.  

---

## Aufgabe

Implementieren Sie in der Klasse [FizzBuzz](src/main/java/de/ba/experiment/FizzBuzz.java) die Methode

```java
public static String[] fizzBuzz(int n){}
```  

Die Methode soll ein String-Array der Länge n zurückgeben. Für jede Zahl von 1 bis n gilt:
- "Fizz" bei Vielfachen von 3
- "Buzz" bei Vielfachen von 5
- "FizzBuzz" bei Vielfachen von 3 und 5
- sonst die Zahl selbst als String

Beispiele:
- fizzBuzz(1) → ["1"]
- fizzBuzz(3) → ["1", "2", "Fizz"]
- fizzBuzz(5) → ["1", "2", "Fizz", "4", "Buzz"]

Für n <= 0 soll ein leeres Array zurückgegeben werden.  

Schreiben Sie Tests in der [FizzBuzzTest](src/test/java/FizzBuzzTest.java) Klasse.

---  

## Vorgehen (TDD: Red – Green – Refactor)

Grundsätzlich arbeiten Sie wie in Gruppe B:

(1) Red – Test schreiben
- Schreiben Sie zuerst eigene Testfälle in FizzBuzzTest.

(2) Green – minimaler Code
- Implementieren Sie FizzBuzz.fizzBuzz(int n) so, dass Ihre Tests grün werden.

(3) Refactor – aufräumen
- Verbessern Sie Code und evtl. Tests, ohne das Verhalten zu ändern.

(4) Ergänzen Sie nach und nach weitere Tests

---

## Nutzung von KI

Sie dürfen eine KI (z.B. ChatGPT) zur Unterstützung einsetzen – aber nur nach bestimmten Regeln:

(1) Zuerst eigene Tests, dann KI
- Die Tests werden in jedem Fall zuerst von den Studierenden **selbst** geschrieben
- Erst danach ist KI erlaubt:

(2) Wofür Sie KI verwenden dürfen
- Ideen für eine saubere Implementierung (z.B. Vorverarbeitung des Strings, Schleifenlogik)
- Refactoring-Vorschläge (z.B. Hilfsmethoden, bessere Namen)
- Vorschläge für weitere Testfälle (z.B. Sonderfälle, Leerzeichen-Varianten)

(3) KI-Log führen [ki-log.md](./ki-log.md)  
- Jede KI-Nutzung dokumentieren:
  - Datum/Uhrzeit
  - verwendeter Prompt
  - kurz: Was wurde übernommen? (z.B. „Testfall für n = 15“, „Alternative if-Struktur“)  
  - Beispiel siehe [ki-log.md](./ki-log.md)  

(4) Wichtig:
- Sie sind verantwortlich, die KI-Vorschläge kritisch zu prüfen und ggf. anzupassen.
- Das spätere Quiz zur Einheit wird ohne KI bearbeitet.  

---

**Technische Hinweise**

- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf FizzBuzzTest → Run 'FizzBuzzTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Halten Sie sich an die vorgegebene Methodensignatur (public static String[] fizzBuzz(int n)).
- Dokumentieren Sie jede KI-Nutzung vollständig in ki-log.md.
- Arbeiten Sie weiterhin im Sinne von TDD: Tests geben den Takt vor, nicht die KI.