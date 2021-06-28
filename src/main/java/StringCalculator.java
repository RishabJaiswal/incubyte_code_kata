public class StringCalculator {

    private int addTwoInputs(String input1, String input2) {
        int int1 = Integer.parseInt(input1);
        int int2 = Integer.parseInt(input2);
        return int1 + int2;
    }

    private int parseSingleInput(String input) {
        if (input.equals("")) {
            return 0;
        } else {
            return Integer.parseInt(input);
        }
    }

    /**
     * add given inputs
     */
    public int add(String... inputs) {
        if (inputs.length == 1) {
            return parseSingleInput(inputs[0]);
        } else if (inputs.length == 2) {
            return addTwoInputs(inputs[0], inputs[1]);
        } else {
            int sum = 0;
            for (String input : inputs) {
                sum += Integer.parseInt(input);
            }
            return sum;
        }
    }
}
