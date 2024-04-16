public class FuncionLambda {

    interface operacion {

        // el metodo abstracto
        public double suma(double x, double y);
    }

    public static void main(String[] args) {

        // Expresion lambda
        double primerElem = 8d;
        double segundElem = 30d;

        operacion l = (x, y) -> x + y;
        System.out.println("suma ["+primerElem+"] + ["+segundElem+"] = " + l.suma(primerElem, segundElem));
    }
}
