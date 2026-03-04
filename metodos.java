import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objMotos[][] Llenar(objMotos[][] p) {

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                objMotos o = new objMotos();

                System.out.println("Ingrese el nombre del repuesto: ");
                o.setNombre(sc.next());

                System.out.println("Ingrese la descripcion: ");
                o.setDescripcion(sc.next());

                System.out.println("Ingrese el precio: ");
                o.setPrecio(sc.nextDouble());

                System.out.println("Ingrese 1 si el producto esta disponible si no lo esta ingrese 0");

                o.setDisponibilidad(sc.nextInt());

                p[i][j] = o;
            }
        }
        return p;
    }

    public objMotos[][] ProductosDis(objMotos[][] p, objMotos[][] d,int contador) {
        int contador1 = 0;

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (p[i][j].getDisponibilidad() == 1) {
                    d[i][j] = p[i][j];
                    contador1++;
                }
            }
            
        }
        System.out.println("La cantidad de productos disponibles es: " + contador1);
        return d;
    }

    public void Mostar(objMotos[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] != null) {
                    System.out.println("Nombre: " + d[i][j].getNombre());
                    System.out.println("Descripcion: " + d[i][j].getDescripcion());
                    System.out.println("Precio: " + d[i][j].getPrecio());
                    System.out.println("---------------------------------");
                }
            }
        }
    }

}
