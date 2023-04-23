public class Main {
    public static void main(String[] args) {

        ConfigStorage storage = new ConfigStorage();
        while(true){
            int choose = ConsoleView.getUserInput("Enter your choose: ");
            if(choose==0)
                break;
            if(choose<0 || choose>4)
                choose = ConsoleView.getUserInput("Error in choose. Please enter value from 0 to 4\nEnter your choose: ");
            else if(choose == 1){
                Option option = ConsoleView.readOption();
                storage.addOption(option);
            }
            else if(choose==2){
                PrinterSetting setting = ConsoleView.readPrinterSetting();
                storage.addPrinterSetting(setting);
            }
            if(choose==3)
                storage.readXml();
            if(choose==4)
                storage.saveXml();
        }
    }
}