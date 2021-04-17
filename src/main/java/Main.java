import functionalInterface.ConsumerInterface;
import functionalInterface.FunctionInterface;
import functionalInterface.PredicateInterface;
import functionalInterface.SupplierInterface;

public class Main {

    public static void main(String[] args) {

        PredicateInterface<Double> doublePredicateInterface = salaryAmount -> {
            if (salaryAmount > 1500.00) {
                return true;
            }
            return false;
        };

        ConsumerInterface<String> stringConsumerInterface = string -> {
            System.out.println(string.toCharArray());
        };

        FunctionInterface<Integer, String> functionInterface = integer -> {
            String number;
            switch (integer) {
                case (1):
                    number = "one";
                    break;
                case (2):
                    number = "two";
                    break;
                case (3):
                    number = "three";
                    break;
                case (4):
                    number = "four";
                    break;
                case (5):
                    number = "five";
                    break;
                case (6):
                    number = "six";
                    break;
                case (7):
                    number = "seven";
                    break;
                case (8):
                    number = "eight";
                    break;
                case (9):
                    number = "nine";
                    break;
                case (10):
                    number = "ten";
                    break;
                default:
                    number = "unknown";
                    break;
            }
            return number;
        };

        SupplierInterface<String> supplierInterface = () -> "String";

    }
}
