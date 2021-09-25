package Default;

import java.util.Scanner;

public class Queue{

    private int[] cars;
    private int front, rear;

    public Queue() {

        cars = new int[10];
        front = -1;
        rear = -1;
    }

    public void REGISTER(int element) {

        if (rear == cars.length - 1) {
            System.out.println("Overflow, Queue is Full");
            return;
        }

        else {
            if (front == -1)
                front = 0;
            rear++;
            cars[rear] = element;
        }

    }

    public int WHONEXT() {
        if(front == rear)
        {
            System.out.println("Underflow, Queue is Empty");
        }

        return cars[front];

    }

    public void DELETE() {

        if (front == rear)
        {
            System.out.println("Underflow, Queue is Empty.");
            front = rear = -1;
        }
        else 
        {
            System.out.print("\nService Completed for Car Number: " + cars[front] + "\n");
            front++;
        }

    }

    public void DISPLAYQueue() {

        for(int i = front; i <= rear; i++)
        {
            System.out.print(cars[i] + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        Queue Queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        Queue.REGISTER(21);
        Queue.REGISTER(22);
        Queue.REGISTER(23);
        Queue.REGISTER(24);
        Queue.REGISTER(25);

        System.out.println("\nOrginal Queue: ");
        Queue.DISPLAYQueue();

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Who Next");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("\nEnter your Choice: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("\nEnter Your Car Number: ");
                    int ele;
                    ele = scanner.nextInt();
                    Queue.REGISTER(ele);
                    System.out.println(ele + " is registered for Car service.");
                    break;

                case 2:
                    System.out.println("\nCar waiting next in the queue is: " + Queue.WHONEXT());
                    break;

                case 3:
                    Queue.DELETE();
                    break;

                case 4:
                    System.out.println("\nCurrent Queue Status: ");
                    Queue.DISPLAYQueue();
                    break;

                case 5:
                    System.out.println("Exiting!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
                    break;

            }

        }
    
    }
}
