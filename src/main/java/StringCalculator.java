public class StringCalculator {

    /**
     * get delimiter from the given input
     */
    private String getDelimiter(String numbersInput) {
        String delimiter = "\\n,";
        if (numbersInput.startsWith("//")) {
            String[] splits = numbersInput.substring(2).split("\n", 2);
            delimiter += splits[0];
        }
        delimiter = "[" + delimiter + "]";
        return delimiter;
    }

    /**
     * get numbers list string from the given input
     */
    private String getNumbersString(String numbersInput) {
        String numbers = numbersInput;
        if (numbersInput.startsWith("//")) {
            String[] splits = numbersInput.substring(2).split("\n", 2);
            numbers = splits[1];
        }
        return numbers;
    }

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
            String delimiter = getDelimiter(numbersInput);
            String numbers = getNumbersString(numbersInput);
            return addInputs(getNumbers(numbers, delimiter));
        }
    }
}
