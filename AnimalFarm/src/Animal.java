abstract class Animal {
    private int weight;
    private int num_legs;

    public Animal(int weight,int num_legs) { 
        this.weight = weight; 
        this.num_legs = num_legs;
    }
    
    public void setWeight(int weight) { 
        this.weight = weight; 
    }
    public int getWeight() { 
        return weight; 
    }

    public void setNum_legs(int num_legs) {
        this.num_legs = num_legs;
    }
    public int getNum_legs() {
        return num_legs;
    }

    public abstract void makeNoise();
    public abstract void jumlahKaki();
}
