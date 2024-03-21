package TEMA_2.NIVEL_3;

public class Converter implements ConverterDI{
    @Override
    public double convert(double price, String coin) {

        double newPrice = 0;

        switch (coin) {

            case "USD":
               newPrice = price * 1.09;
               break;
            case "JPY":
                newPrice = price * 144.24;
                break;
            case "CHF":
                newPrice = price * 1.02;
                break;
            case "GBP":
                newPrice = price * 0.88;
                break;
        }
        return newPrice;
    }
}
