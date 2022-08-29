public class Hello {
    public static void main(String[] args) {
        MyNaturalNumber naturalNumber1 = new MyNaturalNumber(3);
        System.out.println("naturalNumber1 = " + naturalNumber1);

        try {
            MyNaturalNumber naturalNumber2 = new MyNaturalNumber(0);
        } catch (Exception e) {
            System.out.println(" 예외발생 - "+e);
        }

        MyInteger myInteger1 = new MyInteger(naturalNumber1);
        System.out.println("myInteger1 = " + myInteger1);

        MyInteger myInteger2 = new MyInteger(-4);
        System.out.println("myInteger2 = " + myInteger2);

        MyRationalNumber rn1 =  new MyRationalNumber(naturalNumber1);
        System.out.println("rn1 = " + rn1);
        MyRationalNumber rn2 =  new MyRationalNumber(myInteger2);
        System.out.println("rn2 = " + rn2);
        MyRationalNumber rn3 =  new MyRationalNumber(rn2);
        System.out.println("rn3 = " + rn3);
        MyRationalNumber rn4 =  new MyRationalNumber(30,2);
        System.out.println("rn4 = " + rn4);

        try {
            MyRationalNumber rn5_ex =  new MyRationalNumber(3,0);
        } catch (Exception e) {
            System.out.println(" 예외발생 - "+e);
        }
        try {
            System.out.println(naturalNumber1.multipleBy(naturalNumber1));
        } catch (Exception e) {
            System.out.println(" 예외발생 - "+e);
        }

    }

}
