public interface adress {
    public static void initialize(String adress) {

        getAdress().adress = adress;
    }

    private static adress getAdress() {
        return this;
    }
}
