public class PhoneForChill extends Phone{
    public PhoneForChill(String color, int year, String displaysize, int price, int memory) {
        super(color, year, displaysize, price, memory);
    }
    public String printInfo() {
        return "Phone color is " + getColor() + "Phone year is "  + getYear() + "Display size is " + getDisplaysize()+ "Price is " + getPrice() + "Phone memory is" + getMemory();
    }
}
