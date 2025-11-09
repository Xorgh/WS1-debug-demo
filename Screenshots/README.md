## 1. Debugging IntelliJ & Gradle ...
Brugte halvanden time på overhovedet at få demo projektet til at køre. Der skulle hentes jdk 17, sættes path vaiabler, opdateres gradle version. Køres ./gradlew clean build i mellem hvert forsøg indtil jeg endelig fik lov til at køre BattleshipGame,java

### Bug #1 skibe spawner kun horisontalt
Vha break point og debug mode step in, jump over fandt jeg ud af at switch i calculateEndPoint altid vil være 0, da Random().nextInt er eksklusiv. 

### Bug #2 Spillet fortsætter efter skib er ramt 3 gange.
Rootcause fundet i debug mode og breakpoint med Condition.

### Bug #3 ArrayIndexOutOfBoundsException
Her har vi brugt et Exception Breakpoint til at finde buggen. Rettelsen er udført som foreskrevet i Youtube videoen.