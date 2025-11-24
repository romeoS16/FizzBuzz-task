# Aufgabe – FizzBuzz (Gruppe A – klassischer Ansatz / test-after)

In dieser Aufgabe implementieren Sie eine Methode, die für Zahlen von 1 bis `n` FizzBuzz-Strings berechnet.  
Sie arbeiten nach dem **test-after-Prinzip**: Zuerst wird die Implementierung geschrieben, dann die Tests.  

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

## Vorgehen (test-after)

(1) Implementieren Sie zuerst die Methode FizzBuzz.fizzBuzz(int n) in [FizzBuzz](src/main/java/de/ba/experiment/FizzBuzz.java).

(2) Testen Sie Ihre Implementierung anschließend mit JUnit-Tests:
- Legen Sie Testfälle in [FizzBuzzTest](src/test/java/FizzBuzzTest.java) an.
- Testen Sie typische Werte (z.B. 1, 3, 5, 15).
- Testen Sie Randfälle: n = 0 und ein negatives n (leeres Array).

(3) Führen Sie Ihre Tests regelmäßig aus und ergänzen Sie weitere Testfälle, wenn Sie Fehler finden.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf FizzBuzzTest → Run 'FizzBuzzTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static String[] fizzBuzz(int n)).
- Ziel: Zuerst eine Lösung implementieren, danach passende Tests formulieren (klassisches test-after).
