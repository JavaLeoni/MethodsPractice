package app;

  import app.data.MainMenu;
  import java.util.Scanner;


public class Main {
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        MainMenu.showMainMenu();
        sc.close();
    }
}
