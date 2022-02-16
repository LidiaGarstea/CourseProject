package homework.lesson9;

class Area {
    private double width;
    private double heigth;

    public double setDim (double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
        return getArea();
    }

    public double getArea () {
        return this.width * this.heigth;
    }
}