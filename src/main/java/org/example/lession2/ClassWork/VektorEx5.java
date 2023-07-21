package org.example.lession2.ClassWork;

import static java.lang.Math.sqrt;

public class VektorEx5 {
    public double x;
    public double y;
    public double z;

    public VektorEx5(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public VektorEx5() {
    }

    @Override
    public String toString() {
        return "VektorEx5{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длину вектора
     */
    public double vectorLength(){
        return sqrt(x*x + y*y + z*z);
    }

    /**
     *
     * @param vektor2 с которым производим действия
     * @return скалярное произведение
     */

    public double scalarMulti(VektorEx5 vektor2) {
        return x * vektor2.x + y * vektor2.y + z * vektor2.z;
    }


    /**
     *
     * @param vektor2 скоторой происхлдят взоимодействия
     * @return векторное произведение
     */
    public VektorEx5 vectorMulti(VektorEx5 vektor2) {
        return new VektorEx5(y * vektor2.z - z * vektor2.y,
                             z * vektor2.x - x * vektor2.z,
                             x * vektor2.y - y * vektor2.x
        );
    }

    /**
     * 
     * @param vektor2 с которой происходит взоимодействия
     * @return угол между векторами
     */
    public double vectorCos(VektorEx5 vektor2) {
        return this.scalarMulti(vektor2)/(this.vectorLength()* this.vectorLength());
    }

    /**
     *
     * @param vektor2 происходят взоимодействия
     * @return озвращяет сумму
     */

    public double vectorSumm(VektorEx5 vektor2) {
        return x+vektor2.x + y+vektor2.y + z+vektor2.z;
    }

    public double vectorRes(VektorEx5 vektor2) {
        return  x-vektor2.x - y-vektor2.y - z-vektor2.z;
    }
}
