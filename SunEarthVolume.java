public class SunEarthVolume {
    public static void main(String[] args) {
        final double pi =3.14;
        double sunDiameter = 865000;
        double earthDiameter =7600;

        //半径 =直径/2
        double sunR = sunDiameter /2;
        double earthR = earthDiameter /2;

        double volSun = (4.0/3) * pi * Math.pow(sunR,3);
        double volEarth = (4.0/3) * pi * Math.pow(earthR,3);
        double ratio = volSun / volEarth;

        System.out.println("Volume of Earth: "+ volEarth + " cubic miles");
        System.out.println("Volume of Sun: "+ volSun + " cubic miles");
        System.out.println("Sun/Earth Volume Ratio: "+ ratio);
    }
}
