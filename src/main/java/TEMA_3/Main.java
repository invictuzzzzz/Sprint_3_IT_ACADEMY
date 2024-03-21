package TEMA_3;

public class Main {
    public static void main(String[] args) {

        ConverterDI converter = new Converter();
        Demo demo = new Demo(converter);


        demo.start();






    }
}
