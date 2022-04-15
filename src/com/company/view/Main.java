package com.company.view;

import java.util.Scanner;

public class Main {
public Main(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("==================== MY NAVBAR ==========================");
    System.out.println("1. REGISTER");
    System.out.println("2. LOGIN");
    System.out.println("3. SHOW LIST ROLE");
    int chooseMenu = scanner.nextInt();
    switch (chooseMenu){
        case 1:
            new RegisterView();
            break;
        case 2:
            new LoginView();
            break;
        case 3:
            new RoleView().showListRole();
            break;
    }
}
    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
