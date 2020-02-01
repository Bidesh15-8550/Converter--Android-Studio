package com.bideshbiswasbiki.converter;

public class converterr {
    public static double m(double cm) {
        return (cm / 100);
    }

    public static double cm(double m) {
        return (m * 100);
    }

    public static double f(double cl) {
        return ((((9 * cl)/5) + 32));
    }

    public static double cl(double f) {
        return (((f - 32) * 5) / 9);
    }
    public static double taka(double doller) {
        return (doller / 0.0118);
    }
    public static double doller(double taka) {
        return (taka * 0.0118);
    }

    public static double euro(double tk) {
        return (tk * 0.011);
    }

    public static double tk(double eu) {
        return (eu / 0.011);

    }
    public static double gm(double kg) {
        return (kg * 1000);
    }

    public static double kg(double gm) {
        return (gm / 1000);

    }
    public static double me(double km) {
        return (km * 1000);
    }

    public static double km(double me) {
        return (me / 1000);

    }
}
