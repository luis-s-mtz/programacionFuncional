import java.util.List;

public class CuentaNumerosMayorDiez {

    public void validaNumerosMayorADiez() {

        // Declarativo
        List<Integer> numeros = List.of(11, 8, 9, 15, 39, 1, 4, 83);

        int contador = 0;

        for (int numero: numeros) {
            if(numero > 10){
                contador ++;
            }
        }

        System.out.println("Forma declarativa: "+contador);
    }

    public void validaNumerosMayorADiezImperat() {

        // Imperativo
        List<Integer> numeros = List.of(11, 8, 9, 15, 39, 1, 4, 83);

        Long resultado = numeros.stream().filter(num -> num > 10).count();
        System.out.println("Forma imperativa: "+resultado);
    }
}
