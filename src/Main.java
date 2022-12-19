public class Main {
    public static void main(String[] args) {
        Car ladaCar = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия" );
        Car audiCar = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия" );
        Car bmwCar = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия" );
        Car kiaCar = new Car("KIA", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея" );
        Car hyundaiCar = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2015, "Южная Корея" );

        System.out.println(ladaCar);
        System.out.println(audiCar);
        System.out.println(bmwCar);
        System.out.println(kiaCar);
        System.out.println(hyundaiCar);
    }
}
