class WithPepperonis extends Pizza {
    WithPepperonis(Pizza base) {
        super(base);
    }

    public int cost() {
        return this.base.cost() + 10000; // Additional 2€ for pepperonis
    }
}
