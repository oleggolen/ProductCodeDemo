public class Option {
    private String name;
    private String value;
    private boolean isSelected;

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

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
    public static String toXml(Option option){
        return "<item name=\"" +
                option.name +
                "\" value=\"" +
                option.value +
                "\" isselected=\"" +
                option.isSelected +
                "\" />";
    }
    public static  Option parseXml(String xml){
        Option option = new Option();
        var params = xml.split(" ");
        var name = params[1].split( "=")[1].replaceAll("\"","");
        option.setName(name);
        var value = params[2].split( "=")[1].replaceAll("\"","");
        option.setValue(value);
        String isSelected = params[3].split( "=")[1].replaceAll("\"","");
        option.setSelected(Boolean.parseBoolean(isSelected));
        return option;
    }
}
