import java.util.Scanner;

    public class Shape {
        void draw(){
            System.out.println("Drawing Shape");
        }

        void erase(){
            System.out.println("Erasing Shape");
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Shape obj = new Shape();
            obj.draw();
            obj.erase();
        }
    }

