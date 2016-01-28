Feature: loteriada

  Scenario:
    Given Wchodze na strone loteriady

  Scenario Outline: Uzupelnij pola
    Given Wpisuje nr kasy "<numer_kasy>"
    And Wpisuje nip "<NIP>"
    And Wpisuje dzien "<dzien>"
    And Wpisuje numer paragonu "<nr_paragonu>"
    And Wpisuje zlote "<zlote>"
    And Wpisuje grosze "<grosze>"
    And Wybieram branze "<branza>"
    And Wpisuje email "test@outlook.com"
    And Wpisuje numer telefonu "123456789"
    And Rozwiazuje zagadke
    And Potwierdzam opcje
    Then Wysylam formularz
    And Potwierdzam wyslanie
    Examples:
      | numer_kasy    | NIP           | dzien | nr_paragonu | zlote | grosze | branza |
      | CAJ1501321291 | 583-00-12-242 | 16    | W006674     | 14    | 55     | inne   |
      | ABJ04129110   | 583-00-12-242 | 28    | W165207     | 15    | 59     | inne   |
      | CAJ1501321268 | 583-00-12-242 | 28    | W013572     | 20    | 99     | inne   |








