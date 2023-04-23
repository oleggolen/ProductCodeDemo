public class PrinterSetting {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static String toXml(PrinterSetting printerSetting){
        return "<printer name =\""+printerSetting.name+"\" value=\""+printerSetting.value+"\" />";
    }
    public static  PrinterSetting parseXml(String xml){
        PrinterSetting printerSetting = new PrinterSetting();
        var params = xml.split(" ");
        var name = params[1].split( "=")[1].replaceAll("\"","");
        printerSetting.setName(name);
        var value = params[2].split( "=")[1].replaceAll("\"","");
        printerSetting.setValue(value);
        String isSelected = params[3].split( "=")[1].replaceAll("\"","");
        return printerSetting;
    }
}
