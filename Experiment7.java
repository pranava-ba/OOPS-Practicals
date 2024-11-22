//program 7
import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private final Random random = new Random();
    private final int maxNumbers = 10;  // Stop after 10 numbers

    @Override
    public void run() {
        try {
            int count = 0;
            while (count < maxNumbers) {  // Stop after generating 10 numbers
                int number = random.nextInt(100); // Generate random integer between 0 and 99
                System.out.println("Generated number: " + number);

                // Create thread for square or cube based on number type
                if (number % 2 == 0) {
                    new Thread(() -> {
                        int square = number * number;
                        System.out.println("Square of " + number + " is: " + square);
                    }).start();
                } else {
                    new Thread(() -> {
                        int cube = number * number * number;
                        System.out.println("Cube of " + number + " is: " + cube);
                    }).start();
                }

                Thread.sleep(1000); // Delay for 1 second
                count++;
            }
            System.out.println("Finished processing 10 numbers. Stopping execution.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MultiThreadedApp {
    public static void main(String[] args) {
        Thread generatorThread = new Thread(new RandomNumberGenerator());
        generatorThread.start(); // Start the random number generator thread
    }
}
