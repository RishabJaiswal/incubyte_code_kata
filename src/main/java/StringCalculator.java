import java.util.ArrayList;
import java.util.List;

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
    private String getNumbers(String numbersInput) {
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
        String[] numbersString = numbers.split(delimiter);
        int[] numberInts = new int[numbersString.length];
        for (int index = 0; index < numbersString.length; index++) {
            String number = numbersString[index].trim();
            if (!number.isEmpty()) {
                numberInts[index] = Integer.parseInt(number);
            }
        }
        return numberInts;
    }

    /**
     * add multiple inputs or
     * throw an exception if an input is negative
     */
    private int addInputs(int... numbers) throws NumberFormatException {
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number <= 1000) {
                sum += number;
            }
            if (number < 0) {
                negativeNumbers.add(number);
            }
        }

        //throw an exception if an input is negative
        if (negativeNumbers.size() > 0) {
            throw new NumberFormatException(negativeNumbers.toString());
        } else {
            return sum;
        }
    }

    /**
     * add given inputs
     */
    public int add(String numbersInput) {
        if (numbersInput.isEmpty()) {
            return 0;
        } else {
            String delimiter = getDelimiter(numbersInput);
            String numbers = getNumbers(numbersInput);
            return addInputs(getNumbers(numbers, delimiter));
        }
    }
}
