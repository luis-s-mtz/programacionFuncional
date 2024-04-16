import java.util.function.Consumer;

public class MetodoReferenciado {

    public static void main(String[] args) {

        // utilizaremos de la interface Consumer el unico metodo denominado accept
        // el cual recibe un parametro y no devuelve nada
        Consumer<String> consumidor = x -> System.out.println(x);
        consumidor.accept("Bienvenido en metodo accept");

        procesar(x -> System.out.println(x), "Bienvenido en metodo procesar");

        // Pasamos como referencia una funcion que se encuentra en nuestro propio programa
        procesar(MetodoReferenciado::saludar, "Hola");
    }

    public static <T> void procesar(Consumer<T> expresion, T mensaje) {
        expresion.accept(mensaje);
    }

    // Disponemos de otro metodo en la misma clase que cumple con el patron
    // de la expresion lambda (reciba un parametro y no devuelva nada)
    public static void saludar(String saludo) {
        System.out.println("****** Bienvenido en metodo saludar *******");
        System.out.println(saludo);
        System.out.println("*****************************");
    }
}
