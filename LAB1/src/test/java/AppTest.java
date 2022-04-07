import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class AppTest {

    /**
     * Poprawna suma dwóch liczb.
     *
     * @result Dwie liczby double zostaną poprawnie do siebie dodane
     */
    @Test
    public void sum_correctInput_correctResult() {
        double result = App.sum(14.5, 25.8);
        assertEquals(40.3, result, 0);
    }

    /**
     * Poprawne odejmowanie dwóch liczb.
     *
     * @result Dwie liczby double zostaną poprawnie do siebie odjęte
     */
    @Test
    public void subtraction_correctInput_correctResult() {
        double result = App.subtraction(59.9, 19.9);
        assertEquals(40, result, 0);
    }

    /**
     * Poprawne mnożenie dwóch liczb.
     *
     * @result Dwie liczby double zostaną poprawnie przez siebie pomnożone
     */
    @Test
    public void multiplication_correctInput_correctResult() {
        double result = App.multiplication(20.0, 2.0);
        assertEquals(40, result, 0);
    }

    /**
     * Poprawne dzielenie dwóch liczb.
     *
     * @result Dwie liczby double zostaną poprawnie przez siebie podzielone
     */
    @Test
    public void divide_correctInput_correctResult() {
        double result = App.divide(24.0, 6.0);
        assertEquals(4, result, 0);
    }

    /**
     * Dzielenie przez 0.
     *
     * @result zostanie wyrzucone exception
     */
    @Test
    public void divide_divideBy0_exception() {
        try {
            @SuppressWarnings("unused")
            double result = App.divide(24.0, 0);
            fail("Dzielenie przez 0 -> musi byc pokazany exception!");
        } catch (IllegalArgumentException e) {
            assertEquals("Nie możesz dzielić przez 0!", e.getMessage());
        }
    }

    /**
     * Sprawdza czy dana liczba jest ujemna
     *
     * @result Prawda dla ujemnego inputu
     */
    @Test
    public void isNegative_correctInput_correctResult() {
        boolean result = App.isNegative(-17.2);
        assertTrue(result);
    }

    /**
     * Sprawdza fałsz czy dana liczba jest ujemna
     *
     * @result Fałsz dla ujemnego inputu
     */
    @Test
    public void isNegative_correctInput_incorrectResult() {
        boolean result = App.isNegative(17.2);
        assertFalse(result);
    }

    /**
     * Sprawdza czy konwersja jest poprawna
     *
     * @result Prawda dla poprawnej konwersji
     */
    @Test
    public void convertStringToArray_correctInput_correctResult() {
        char[] result = App.convertStringToArray("Szymon");
        char[] expected = { 'S', 'z', 'y', 'm', 'o', 'n' };
        assertArrayEquals(expected, result);
    }

    /**
     * Sprawdza czy tablica nie jest NULLem
     *
     * @result Prawda dla niepustej tablicy
     */
    @Test
    public void convertStringToArray_correctInput_resultNotNull() {
        char[] result = App.convertStringToArray("Szymon");
        assertNotNull(result);
    }

    /**
     * Sprawdza czy można złożyć trójkąt
     *
     * @result zostanie wyrzucone exception
     */
    @Test
    public void trianglePerimeter_incorrectInput_exception() {
        try {
            @SuppressWarnings("unused")
            double result = App.trianglePerimeter(1, 2, 3);
            fail("Niepoprawne parametry trójkąta -> musi byc pokazany exception!");
        } catch (Exception e) {
            assertEquals("To nie jest trójkąt!", e.getMessage());
        }
    }
}