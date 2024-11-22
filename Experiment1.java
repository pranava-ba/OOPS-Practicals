//program one
import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int previousMonthReading;
    int currentMonthReading;
    String ebConnectionType;

    void calculateBill() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        double billAmount = 0;

        if (ebConnectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 1 + (unitsConsumed - 100) * 2.50;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 1 + 100 * 2.50 + (unitsConsumed - 200) * 4;
            } else {
                billAmount = 100 * 1 + 100 * 2.50 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (ebConnectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 2 + (unitsConsumed - 100) * 4.50;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 2 + 100 * 4.50 + (unitsConsumed - 200) * 6;
            } else {
                billAmount = 100 * 2 + 100 * 4.50 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }

        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("EB Connection Type: " + ebConnectionType);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBill bill = new ElectricityBill();

        System.out.print("Enter Consumer No: ");
        bill.consumerNo = sc.nextInt();

        System.out.print("Enter Consumer Name: ");
        sc.nextLine(); // Consume the newline character
        bill.consumerName = sc.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        bill.previousMonthReading = sc.nextInt();

        System.out.print("Enter Current Month Reading: ");
        bill.currentMonthReading = sc.nextInt();

        System.out.print("Enter EB Connection Type (domestic/commercial): ");
        bill.ebConnectionType = sc.next();

        bill.calculateBill();
    }
}
