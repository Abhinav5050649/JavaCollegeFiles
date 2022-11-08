interface FirstTesting{
    public abstract void firstMethod();
}

class InterfaceTesting{
    int number;

    public InterfaceTesting(){
        number =25;
    }

    public InterfaceTesting(int n){number = n;}

    public int getNumber(){return number;}
}

class InterfaceTesting2 extends InterfaceTesting implements FirstTesting{

    @Override
    public void firstMethod() {
        System.out.println("firstmethod implementation ");
    }

    public InterfaceTesting2(int n){super(n);}

}


public class Interfacetesting {

    public static void main(String args[]) {
        InterfaceTesting t1 = new InterfaceTesting(35);
        InterfaceTesting t2 = new InterfaceTesting2(555);

        System.out.println(t2.getNumber());
        
    }
    
}
