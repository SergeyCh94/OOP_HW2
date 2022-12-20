package transport;


public class Car {
    final String brand;
    final String model;
    private double engineVolume;
    private String color;
    final int year;
    final String country;
    private String transmission;
    final String bodyType;
    private String registrationNumber;
    final int numberOfSeats;
    private boolean summerTiers;


    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", " +
                getColor() + " цвет кузова, обьем двигателя " + getEngineVolume() + " - л." + "\n" + "Коробка передач " + getTransmission() +
                ", Тип кузова " + getBodyType() + ", Регистрационный номер " + getRegistrationNumber() + ", Количество мест " +
                getNumberOfSeats() + ", Тип резины летняя " + summerTiers;
    }

    public void changeTiers(int month) {
        if (month <= 0 || month > 12){
            System.out.println("Такого месяца нет");
        } else {
            summerTiers = month >= 5 && month < 9;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean summerTiers) {

        if (numberOfSeats <= 0){
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()){
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (bodyType == null || bodyType.isEmpty()){
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (transmission == null || transmission.isEmpty()){
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (brand == null || brand.isEmpty()){
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

        this.summerTiers = summerTiers;

    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTiers() {
        return summerTiers;
    }

    public void setSummerTiers(boolean summerTiers) {
        this.summerTiers = summerTiers;
    }
}