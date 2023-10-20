package controller;

import common.Library;
import common.AlgorithmData;
import view.Menu;

public class DataFormatManagement extends Menu<String> {

    static String[] mc = {"Display GUI, Input Data And Perform function", "Exit"};

    protected Library library;
    protected AlgorithmData algorithm;

    public DataFormatManagement() {
        super("====== Validate Progaram ======", mc);
        library = new Library();
        algorithm = new AlgorithmData();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Phone: ");
                algorithm.checkInputPhone();
                System.out.print("Date: ");
                algorithm.checkInputDate();
                System.out.print("Email: ");
                algorithm.checkInputEmail();
                System.out.println(algorithm.checkInputPhone());
                System.out.println(algorithm.checkInputDate());
                System.out.println(algorithm.checkInputEmail());
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
