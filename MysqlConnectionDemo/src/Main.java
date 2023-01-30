import Client.demo.Client;
import Client.demo.ClientDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to my project!!!");
        while (1 == 1) {
            System.out.println("Please provide a input to us");
            System.out.println("Press 1 for adding a client!!");
            System.out.println("Press 2 for getting a client!!");
            System.out.println("Press 3 for deleting a client!!");
            System.out.println("Press 4 for updating a client!!");
            System.out.println("Press 5 for exit!!!");
            int a = Integer.parseInt(br.readLine());
            if (a == 1) {
                System.out.println("Please provide a name");
                String name = br.readLine();
                Client cus = new Client(name);
                System.out.println(ClientDemo.add(cus));
            } else if (a == 2) {
                System.out.println(ClientDemo.get());
            } else if (a == 4) {
                System.out.println("Please give your id");
                int id = Integer.parseInt(br.readLine());
                System.out.println("Please enter your updated name");
                String name = br.readLine();
                System.out.println(ClientDemo.update(id, name));
            } else if (a == 3) {
                System.out.println("Please provide your id");
                int id = Integer.parseInt(br.readLine());
                System.out.println(ClientDemo.delete(id));
            } else if (a == 5) {
                System.out.println("Thank you for using our application!!!");
                break;
            }

        }
        }
}