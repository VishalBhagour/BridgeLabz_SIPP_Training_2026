package core_java_practice.gcr_codebase.Exception_handling;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double bill, double amountPaid)
            throws InsufficientFundsException {

        if (amountPaid < bill) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        int[] patientIds = {101, 102, 103};

        try {
            int totalBill = 5000;
            int items = 0;

            
            double perItemCost = totalBill / items;

            System.out.println(patientIds[10]);

            int amount = Integer.parseInt("abc");

            processPayment(5000, amount);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("System continues running...");
    }
}