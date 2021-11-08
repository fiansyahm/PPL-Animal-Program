public class Chicken extends AnimalFarm{
    private String chickenNoise;

    public Chicken() {
        super(7,2);
        this.chickenNoise = "kukuruyuk!!";
    }

    public void makeNoise(){
        System.out.println("Suara ayam "+chickenNoise);
    }

    public void jumlahKaki(){
        System.out.println("Jumlah kaki ayam adalah "+getNum_legs());
    }
}
