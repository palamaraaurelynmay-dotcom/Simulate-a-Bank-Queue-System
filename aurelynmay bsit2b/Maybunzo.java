/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maybunzo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maybunzo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int customerNumber = 1;

        do {
            System.out.println("\n--- BANK QUEUE SYSTEM ---");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. View queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    String customer = "Customer #" + customerNumber + " - " + name;
                    queue.add(customer);
                    System.out.println(customer + " added to queue.");
                    customerNumber++;
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        System.out.println(queue.poll() + " is being served.");
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("Current Queue:");
                        for (String c : queue) {
                            System.out.println(" - " + c);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
