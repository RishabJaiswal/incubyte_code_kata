public class StringCalculator {

    /**
     * get integer numbers from a string of numbers
     */
    private int[] getNumbers(String numbers, String delimiter) {
        String[] numberStrings = numbers.split(delimiter);
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
    public int add(String numbersInput) {
        if (numbersInput.isEmpty()) {
            return 0;
        } else {
            String delimiter = "\\n,";
            String numbers = numbersInput;
            if (numbersInput.startsWith("//")) {
                String[] s = numbersInput.substring(2).split("\n", 2);
                delimiter += s[0];
                numbers = s[1];
            }
            delimiter = "[" + delimiter + "]";
            return addInputs(getNumbers(numbers, delimiter));
        }
    }
}
