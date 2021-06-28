public class StringCalculator {

    /**
     * add given inputs
     * */
    public int add(String... inputs) {
        if (inputs[0].equals("")) {
            return 0;
        } else {
            return Integer.parseInt(inputs[0]);
        }
    }
}
