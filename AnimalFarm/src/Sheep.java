public class Sheep extends AnimalFarm{
    private String sheepNoise;

    public Sheep() { 
        super(100,4);
        this.sheepNoise = "mbekk!!";
    }

    public void makeNoise(){
        System.out.println("Suara kambing "+sheepNoise);
    }
    public void jumlahKaki(){
        System.out.println("Jumlah kaki kambing adalah "+getNum_legs());
    }
}
