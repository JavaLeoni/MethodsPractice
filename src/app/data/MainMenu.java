package app.data;

public class MainMenu {

    public static int choice;
    public static final String MAIN_MENU_ITEMS = """
            1) Квадрат цілого числа
            2) Об'єм циліндра (радіус і висота)
            3) Сума елементів масиву цілих чисел
            4) Інверсія рядка (текст ззаду наперед)
            5) Степінь цілого числа
            6) Копіювання рядка
            
            """;
    public static void showMainMenu() {
        System.out.print(MAIN_MENU_ITEMS);
        choice = Integer.parseInt(DataHandlers.getStringData("Зробіть вибір (введіть номер завдання від 1 до 6):" ));
        runChoicedTask(choice);
    }

    public static void runChoicedTask(int choicedItem) {
        switch (choicedItem) {
            case 1:
                DataHandlers.calculateSquareOfNumber();
                break;
            case 2:
                DataHandlers.calculateCylinderVolume();
                break;
            case 3:
                DataHandlers.calculateSumIntItemArrays();
                break;
            case 4:
                DataHandlers.flipTextRow();
                break;
            case 5:
                DataHandlers.calculatePowerOfNumber();
                break;
            case 6:
                DataHandlers.copyTextRow();
        }
    }
}
