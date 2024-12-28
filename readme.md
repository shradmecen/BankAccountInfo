Opis:
- Aplikacja w języku Java umożliwia użytkownikowi sprawdzenie, do którego banku należy numer konta bankowego na podstawie pierwszych trzech cyfr numeru konta. 
- Program łączy się z serwisem Narodowego Banku Polskiego (NBP), który udostępnia publiczne dane o numerach banków w Polsce. 
- Na podstawie tych danych aplikacja wyszukuje informacje o banku i zwraca nazwę banku oraz jego numer.
- Program wymaga od użytkownika podania pierwszych trzech cyfr numeru konta, po czym zwraca wynik w postaci informacji o banku.

Funkcjonalności:
- Podanie pierwszych trzech cyfr numeru konta bankowego – użytkownik wprowadza trzy cyfry numeru konta.
- Walidacja wprowadzonego numeru – aplikacja sprawdza, czy użytkownik wprowadził dokładnie trzy cyfry, oraz czy są one poprawne (liczby).
- Pobieranie danych z serwera NBP – aplikacja łączy się z publicznym serwisem Narodowego Banku Polskiego, aby pobrać dane o numerach banków.
- Wyszukiwanie banku na podstawie wprowadzonych cyfr – aplikacja przeszukuje dane pobrane z serwera w celu znalezienia odpowiednich informacji o banku.
- Wyświetlenie wyników – po znalezieniu dopasowania do wprowadzonych cyfr, aplikacja wyświetla nazwę banku oraz numer banku. Jeśli nie znajdzie pasujących danych, użytkownik otrzymuje komunikat o braku wyników.
- Obsługa błędów – program reaguje na błędy, takie jak niepoprawne dane wejściowe lub problemy z połączeniem z serwerem NBP, wyświetlając odpowiednie komunikaty.

Struktura:
- klasa Main: 
    - Klasa główna aplikacji, która odpowiada za interakcję z użytkownikiem oraz wywołanie metod z klasy BankAccountInfo. Umożliwia wprowadzenie danych wejściowych i wyświetlenie wyników. Zawiera również logikę walidacji danych wejściowych.
    - Metody:
        - main(String[] args) – główna metoda programu, która obsługuje wejście użytkownika oraz wywołuje funkcję w klasie BankAccountInfo.
- klasa BankAccountInfo
    - Klasa odpowiedzialna za komunikację z serwisem NBP oraz przetwarzanie danych. Odpowiada za pobranie danych o bankach i znalezienie informacji o banku na podstawie wprowadzonych trzech cyfr numeru konta.
    - Metody:
        - getBankInfo(String accountPrefix) – metoda, która łączy się z serwisem NBP, pobiera dane o bankach, przetwarza je i zwraca nazwę banku oraz numer banku dla pasujących danych.
