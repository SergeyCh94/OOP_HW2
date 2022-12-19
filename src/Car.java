public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " +
                color + " цвет кузова, обьем двигателя " + engineVolume + " - л.";
    }

    Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand == ""){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model == ""){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null || country == ""){
            this.country = "default";
        } else {
            this.country = country;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

    }
}