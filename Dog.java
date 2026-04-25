public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){
        super("mutt", "Big", 50);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
            super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
            this.earShape = earShape;
            this.tailShape = tailShape;
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    @Override
    public String toString() {
        return "{" +
            " earShape='" + earShape + "'" +
            ", tailShape='" + tailShape + "'" +
            "}" + super.toString();
    }

    @Override
    public void makeNoise(){

        if ("Wolf".equals(type)) {
            System.out.println("Ow Wooooooooo! ");
        } 
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
  //      System.out.println("Dogs walk, run and wag the thier tail");
        if ("slow".equals(speed)) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("woof");
    }

    private void run() {
        System.out.println("Dog running");
    }

    private void walk() {
        System.out.println("Dog walking");
    }

    private void wagTail() {
        System.out.println("Tail Wagging");
    }
 
}
