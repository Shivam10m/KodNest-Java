
class Bike {

    int km;
    int lit;

    Bike(int km, int lit) {
        this.km = km;
        this.lit = lit;
    }

    static void convertKiloToMiles(int km) {
        System.out.println("Converting kilometers to miles");
        double miles = km * 0.621371;
        System.out.printf("%d kilometer in Miles are: %f\n", km, miles);
    }

    void calculatingMileage() {
        System.out.println("Calculating mileage of a bike");
        double mileage = km / lit;
        System.out.println("The mileage of a bike is: " + mileage);
    }

    public static void main(String[] args) {
        Bike honda = new Bike(100, 5);
        Bike.convertKiloToMiles(100);
        honda.calculatingMileage();
    }

}
