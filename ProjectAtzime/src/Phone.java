public class Phone {
    private String color;
    private int year;
    private String displaysize;
    private int price;
    private String model;
    private int memory;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDisplaysize() {
        return displaysize;
    }

    public void setDisplaysize(String displaysize) {
        this.displaysize = displaysize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Phone(String color, int year, String displaysize, int price, int memory) {
        this.color = color;
        this.year = year;
        this.model = model;
        this.displaysize = displaysize;
        this.price = price;
        this.memory = memory;
    }

    public String printInflo() {
        System.out.println ("Phone color is " + getColor() + "\n" + "Year - " + getYear() + "\n" + "model is " + getModel() + "\n" + "Phone price is " + getPrice() + "\n" + "Phone memory is " + getMemory());
        return null;
    }
}
