package controller;
import view.View;

import java.util.Scanner;

public class mainController {
    ClientController newClientController = new ClientController();
    public void mainController() {
        View newView = new View();
        newView.welcome();
        newView.mainMenu();
        Scanner option = new Scanner(System.in);
        String resposta = option.nextLine();
        option.close();
    }
}