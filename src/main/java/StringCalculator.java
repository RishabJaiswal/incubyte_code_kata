public class StringCalculator {

    /**
     * get integer numbers from a string of numbers
     */
    private int[] getNumbers(String numbers) {
        String[] numberStrings = numbers.split("[\\n,]");
        int[] numberInts = new int[numberStrings.length];
        for (int index = 0; index < numberStrings.length; index++) {
            numberInts[index] = Integer.parseInt(numberStrings[index].trim());
        }
        return numberInts;
    }

    /**
     * multiple inputs
     */
    private int addInputs(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * add given inputs
     */
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return addInputs(getNumbers(numbers));
        }
    }
}
