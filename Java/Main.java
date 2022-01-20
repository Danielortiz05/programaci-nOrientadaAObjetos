package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        UberX uberX = new UberX("ABC123", new Account("Jhon Doe", "123.456.789.09"), "Chevrolet", "Onix");
        uberX.setPassenger(4);
        uberX.printDataCar();


        UberVan uberVan = new UberVan("RPO178", new Account("Hernesto", "524.201.785.02") );
        uberVan.setPassenger(6);
        uberVan.printDataCar();

    }
}