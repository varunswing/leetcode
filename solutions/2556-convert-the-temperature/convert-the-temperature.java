class Solution {
    public double[] convertTemperature(double celsius) {
        DecimalFormat df = new DecimalFormat("#.#####");
        
        return new double[]{Double.parseDouble(df.format(celsius+273.15)), Double.parseDouble(df.format(celsius*1.8 + 32))};
    }
}