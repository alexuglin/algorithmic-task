public class Main {

    public static void main(String[] args) {
        double d = 0.1;
        double c = 0.2;
        if (Double.compare(d + c, 0.3) != 0) {
            System.out.println("true");
        } else {
            System.out.println("false " + (d +c));
        }

    }
}
