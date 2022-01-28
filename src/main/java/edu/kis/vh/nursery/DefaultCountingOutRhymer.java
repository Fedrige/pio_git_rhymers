package edu.kis.vh.nursery;

/**
 * Implementacja klasy DefaultCountingOutRhymer
 */
public class DefaultCountingOutRhymer {

    private static final int NUMBER_SIZE = 12;
    private static final int TOTAL_VALUE = -1;
    private static final int ERROR_VALUE = -1;
    private static final int FULL_VALUE = 11;
    private final int[] numbers = new int[NUMBER_SIZE];

    private int total = TOTAL_VALUE;

    /**
     * Zwracanie całkowitej wartości stosu
     * @return całkowita wartość stosu
     */
    public int getTotal() {
        return total;
    }

    /**
     * metoda dodająca wartość do stosu
     * @param in wartość do dodania do stosu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdzanie czy stos jest pusty
     * @return true jeśli jest pusty w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    /**
     * Sprawdzanie czy stos jest pełen
     * @return true jeśli jest pełen w przeciwnym razie false
     */
    public boolean isFull() {
        return total == FULL_VALUE;
    }

    /**
     * Zwraca najwyższą wartość stosu
     * @return ostatni element stosu
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    /**
     * Usuwa najwyższą wartość stosu
     * @return ostatni element stosu
     */
    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
