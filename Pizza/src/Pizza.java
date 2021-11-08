class Pizza {
    protected Pizza base;

    Pizza() {}

    Pizza(Pizza base) {
        this.base = base;
    }

    public int cost() {
        return 100000; // Pizza dough with nothing on it will cost 6€
    }

    // Make System.out.println work like magic
    public String toString() {
        return this.cost() + " rupiah";
    }
}