package org.example.lession2.ClassWork;

public class Ex5 {
    public static void main(String[] args) {
        VektorEx5 vektor1 = new VektorEx5(1,2,3);
        VektorEx5 vektor2 = new VektorEx5(1,1,1);
        System.out.println("vektor2.vectorLength() = " + vektor2.vectorLength());
        System.out.println("vektor1.scalarMulti(vektor2) = " + vektor1.scalarMulti(vektor2));
        System.out.println("vektor1.vectorMulti(vektor2) = " + vektor1.vectorMulti(vektor2));
        System.out.println("vektor1.vectorCos(vektor2) = " + vektor1.vectorCos(vektor2));
        System.out.println("vektor1.vectorSumm(vektor2) = " + vektor1.vectorSumm(vektor2));
        System.out.println("vektor1.vectorRes(vektor2) = " + vektor1.vectorRes(vektor2));
        System.out.println(vektor1);

    }
}
