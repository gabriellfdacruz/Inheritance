public class Fish extends Animal{

    private int gills;
    private int fins;


    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    
    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if ("fast".equals(speed)) {
            moveBackFin();
        }
        System.out.println();
    }


    @Override
    public String toString() {
        return "{" +
            " gills='" + gills + "'" +
            ", fins='" + fins + "'" +
            "}" + super.toString();
    }

    private void moveMuscles() {
            System.out.println("muscles moving");
    }

    private void moveBackFin() {
            System.out.println("backfin moving");
    }


}
