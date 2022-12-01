public abstract class MeasurementConversion {

    public final double heightConversion(int feet, int inch) {
        int valForConversion = feet * 12;
        valForConversion += inch;
        return (double)valForConversion * 0.0254;
    }

    public final double weightConversion(int lbs) {
        return (double)lbs / 2.205;
    }

    public final double bmi(double height, double weight) {
        return height / (weight * weight) * (double)703;
    }
}
