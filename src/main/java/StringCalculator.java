public class StringCalculator {

    /**
     * add given inputs
     */
    public int add(String... inputs) {
        if (inputs.length == 1) {
            if (inputs[0].equals("")) {
                return 0;
            } else {
                return Integer.parseInt(inputs[0]);
            }
        } else {
            int input1 = Integer.parseInt(inputs[0]);
            int input2 = Integer.parseInt(inputs[1]);
            return input1 + input2;
        }
    }
}
