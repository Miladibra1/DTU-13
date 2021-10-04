import java.util.*;
public class rumfang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the radius");
        double radius = input.nextDouble();
        System.out.println("what is the height");
        double height = input.nextDouble();
        double pie = 3.14285714286;
        if (radius < 0 || height < 0){
            System.out.println("negative volume is not allowed");
            System.exit(0);
        }
        double volume = pie*(radius*radius)*height;
        System.out.println("Volume ="+volume);
        System.out.println("Færdigt");
    }
}
