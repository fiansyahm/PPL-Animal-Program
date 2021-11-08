class WithGarlic extends Pizza {
    WithGarlic(Pizza base) {
        super(base);
    }

    public int cost() {
        return this.base.cost() + 5000; // Additional 1€ for garlic
    }
}
