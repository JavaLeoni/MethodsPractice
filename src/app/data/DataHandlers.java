package app.data;

import app.Main;
import java.util.Arrays;

public class DataHandlers {

    public static void calculateSquareOfNumber() {
        int intNumber;
        double doubleSquareNumber;
        intNumber = Integer.parseInt(getStringData(MainMenu.choice + ") Введіть ціле число:"));
        doubleSquareNumber = Math.pow(intNumber, 2);
        System.out.printf("Квадрат числа %d дорівнює %.0f: \n", intNumber, doubleSquareNumber);
    }

    public static void calculatePowerOfNumber() {
        int intNumber;
        int powerNum;
        double powerOfNumber;
        intNumber = Integer.parseInt(getStringData(MainMenu.choice + ") Введіть ціле число:"));
        powerNum = Integer.parseInt(getStringData("Введіть степінь числа: "));
        powerOfNumber =  Math.pow(intNumber, powerNum);
        System.out.printf("Результат %d^%d дорівнює %.0f. \n", intNumber, powerNum, powerOfNumber);
    }

    public static void calculateCylinderVolume() {
        double cylinderHeight;
        double radius;
        double cylinderVolume;
        radius = Double.parseDouble(getStringData(MainMenu.choice + ") Введіть радіус основи циліндра:"));
        cylinderHeight = Double.parseDouble(getStringData("Введіть висоту циліндра: "));
        cylinderVolume =  Math.PI * radius * radius * cylinderHeight;
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює  %.2f: \n",radius, cylinderHeight, cylinderVolume);
    }

    public static void flipTextRow() {
        String textRow;
        String flippedTextRow = "";
        textRow = getStringData(MainMenu.choice + ") Введіть рядок: ");
        for (int i = 0; i < textRow.length(); i++) {
            flippedTextRow = textRow.charAt(i) + flippedTextRow;
        }
        System.out.printf("Рядок в зворотньому порядку: %s \n",flippedTextRow);
    }

    public static void calculateSumIntItemArrays() {
        int[] intNumsArray = {10,20,30,40,50};
        int sum = 0;
        for (int arrItem : intNumsArray) sum += arrItem;
        System.out.printf("%d) Масив чисел: %s \n",MainMenu.choice, Arrays.toString(intNumsArray));
        System.out.printf("Сума всіх елементів масиву дорівнює: %d",sum);
    }

    public static void copyTextRow() {
        int countCopy;
        String textToCopy;
        int loopIndex;
        countCopy = Integer.parseInt(getStringData("Введіть ціле число: "));
        textToCopy = getStringData("Введіть текстовий рядок: ");
        for (loopIndex = 1; loopIndex<=countCopy; loopIndex++)
           System.out.printf(textToCopy + "\n");
    }

    public static String getStringData(String hint) {
        System.out.print(hint);
        return Main.sc.nextLine();
    }
}
