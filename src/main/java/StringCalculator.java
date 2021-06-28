public class StringCalculator {

    /**
     * single input
     */
    private int parseSingleInput(String input) {
        if (input.equals("")) {
            return 0;
        } else {
            return Integer.parseInt(input);
        }
    }

    /**
     * multiple inputs
     */
    private int addInputs(String... inputs) {
        int sum = 0;
        for (String input : inputs) {
            sum += Integer.parseInt(input);
        }
        return sum;
    }

    /**
     * add given inputs
     */
    public int add(String... inputs) {
        if (inputs.length == 1) {
            return parseSingleInput(inputs[0]);
        } else {
            return addInputs(inputs);
        }
    }
}
