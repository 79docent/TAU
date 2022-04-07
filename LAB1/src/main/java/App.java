public class App {

    /**
     * Zwraca sumę dwóch liczb
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma a i b
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Zwraca różnicę dwóch liczb
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return różnica a i b
     */
    public static double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * Zwraca iloczyn dwóch liczb
     *
     * @param a pierwsza liczba
     * @param b pierwsza liczba
     * @return iloczyn a i b
     */
    public static double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * Zwraca iloraz dwóch liczb
     *
     * @param a dzielna
     * @param b dzielnik
     * @return iloraz a i b
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nie możesz dzielić przez 0!");
        }
        return a / b;
    }

    /**
     * Sprawdza czy liczba jest ujemna
     *
     * @param a sprawdzana liczba
     * @return prawda jeżeli liczba jest ujemna
     */
    public static boolean isNegative(double x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Zamiana stringa na ciąg znaków
     *
     * @param str String do zamiany
     * @return Ciąg znaków
     */
    public static char[] convertStringToArray(String str) {
        char[] charactersArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charactersArray[i] = str.charAt(i);
        }

        return charactersArray;
    }

    /**
     * Liczy parametry trójkąta
     *
     * @param a pierwszy bok
     * @param b drugi bok
     * @param c trzeci bok
     * @return Parametr trójkąta
     * @throws Exception
     */
    public static double trianglePerimeter(double a, double b, double c) throws Exception {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("To nie jest trójkąt!");
        }
        return a + b + c;
    }

}
