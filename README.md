# Aufgabe – FizzBuzz (Gruppe B – TDD, keine KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** an der klassischen FizzBuzz-Aufgabe.  
Sie schreiben also zuerst Tests und entwickeln dann Schritt für Schritt die Implementierung.  

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

Arbeiten Sie in kleinen TDD-Schritten:

(1) **Red** – Test schreiben
- Formulieren Sie zuerst in FizzBuzzTest einen Testfall für einen einfachen Fall, z.B.
fizzBuzz(1) → ["1"].
- Führen Sie die Tests aus – der neue Test sollte zunächst fehlschlagen.

(2) **Green** – minimaler Code
- Implementieren Sie FizzBuzz.fizzBuzz(int n) so, dass der Test besteht.
- Schreiben Sie zunächst nur so viel Code wie nötig, um den Test grün zu bekommen.

(3) **Refactor** – aufräumen
- Verbessern Sie bei Bedarf den Code (z.B. Bedingungen übersichtlicher formulieren),
ohne das Verhalten zu ändern. Alle Tests müssen danach grün bleiben.

(4) Weitere Tests hinzufügen
- Ergänzen Sie Testfälle für:
  - n = 3 → Fizz an Stelle 3
  - n = 5 → Fizz und Buzz  
  - ...  

---

**Technische Hinweise**

- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf FizzBuzzTest → Run 'FizzBuzzTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static String[] fizzBuzz(int n)).
- Schreiben Sie konsequent Tests zuerst und lassen Sie sich von ihnen durch die Implementation führen.