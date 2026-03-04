import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos");
        int n = sc.nextInt();

        metodos m = new metodos();

        objMotos[][] Productos = new objMotos[n][n];

        Productos = m.Llenar(Productos);

        int contador = 0;

        objMotos[][] proDisponibles = new objMotos[n][n];

        proDisponibles = m.ProductosDis(Productos, proDisponibles, contador);
        m.Mostar(proDisponibles);

    }
    
}
