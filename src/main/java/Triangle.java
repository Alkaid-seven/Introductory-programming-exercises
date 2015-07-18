public class Triangle{

    void one(){
        System.out.println("This is one asterisk:");
        System.out.println("*");
    }

    void horizontal(int num){
        System.out.println("This is a horizontal line:");
        for(int i=0; i<num; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    void vertical(int num){
        System.out.println("This is a Veritical line:");
        for(int i=0; i<num; i++){
            System.out.println("*");
        }
    }

    void RightTriangle(int num){
        System.out.println("This is a ritht triangle:");
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
