import java.util.Scanner;

public class ConsoleView {
    private static final Scanner scanner = new Scanner(System.in);
    public static Option readOption(){
        Option option = new Option();
        System.out.print("Enter option name");
        String name = scanner.nextLine();
        option.setName(name);
        System.out.print("Enter option value");
        String value = scanner.nextLine();
        option.setName(value);
        System.out.print("Option selected?");
        boolean isSelected = scanner.nextBoolean();
        option.setSelected(isSelected);
        return option;
    }
    public static PrinterSetting readPrinterSetting(){
        PrinterSetting printerSetting = new PrinterSetting();
        System.out.print("Enter option name");
        String name = scanner.nextLine();
        printerSetting.setName(name);
        System.out.print("Enter option value");
        String value = scanner.nextLine();
        printerSetting.setName(value);
        return printerSetting;
    }
    public static void showMenu(){
        System.out.println("1. Добавить опцию печати");
        System.out.println("2. Добавить информацию о принтере");
        System.out.println("3. Прочитать конфигурации XML");
        System.out.println("4. Сохранить конфигурации XML");
        System.out.println("0. Выход");
    }
    public static int getUserInput(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
}
