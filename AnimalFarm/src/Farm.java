public class Farm {
    public static void main(String[] args) {
        Animal[] farm = {new Chicken(), new Sheep()};
        int totalWeight = 0;

        for (int i=0; i<farm.length; i++){
            farm[i].makeNoise();
            farm[i].jumlahKaki();
            totalWeight += farm[i].getWeight();
        };

        System.out.println("Total berat dari hewan ternak secara keseluruhan adalah " + totalWeight+" Kg");
    }
}

