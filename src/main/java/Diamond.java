public class Diamond{

    void Isosceles(int num){
        System.out.println("This is Isosceles Triangle:");
        for(int i=1; i<=num; i++){
            int AsteriskNum = 2 * i - 1;
            int SpaceNum = num -i;
            for(int space=0; space<SpaceNum; space++){
                System.out.print(" ");
            } // This circle print the space before *
            for(int asterisk=0; asterisk<AsteriskNum; asterisk++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    void Asterisks(int i,int num){
        int AsteriskNum = 2 * i - 1;
        int SpaceNum = num -i;
        for(int space=0; space<SpaceNum; space++){
            System.out.print(" ");
        } // This circle print the space before *
        for(int asterisk=0; asterisk<AsteriskNum; asterisk++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    void Diamond(int num){
        System.out.println("This is Diamond:");
        for(int i=1; i<=num; i++){
            Asterisks(i, num);
        }
        for(int j=num-1; j>0; j--){
            Asterisks(j, num);
        }
    }

    void DiamondWithName(int num){
        System.out.println("This is Diamond with Name");
        for(int i=1; i<=num-1; i++){
            Asterisks(i,num);
        }
        System.out.println("Bill");
        for(int j=num-1; j>0; j--){
            Asterisks(j, num);
        }
    }
}