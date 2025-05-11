public class VolumeCalculator {
    public static void main(String[] args) {
        // Diameters in miles
        double diameterSun = 865000;
        double diameterEarth = 7600;

        // Radii in miles
        double radiusSun = diameterSun / 2;
        double radiusEarth = diameterEarth / 2;

        // Volume formula for a sphere: (4/3) * π * r³
        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);
        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);

        // Ratio of volumes
        double ratio = volumeSun / volumeEarth;

        // Display results
        System.out.println("Volume of the Earth (cubic miles): " + volumeEarth);
        System.out.println("Volume of the Sun (cubic miles): " + volumeSun);
        System.out.printf("Ratio (Sun / Earth): %.2f\n", ratio);
    }
}
