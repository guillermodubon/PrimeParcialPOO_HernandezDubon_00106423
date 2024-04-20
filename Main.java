import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
            Telefono t=new Telefono(null, null, null, null);
            Laptop l=new Laptop(null, null, 0, 0);
            ArrayList<Telefono>Telefonos=new ArrayList<>();
            ArrayList<Laptop>Laptops=new ArrayList<>();
            int TipoArticulo;
            int OpcionMenu;

        while (true) {
        
        System.out.println("\t"+"MENU:"+"\n");
        System.out.println("1.Agregar Articulos");
        System.out.println("2. Modificar Articulo");
        System.out.println("3.Consular todos los articulos");
        System.out.println("0.Salir");

        OpcionMenu=sc.nextInt();
        if(OpcionMenu <0 || OpcionMenu >3){

            System.out.println("Ingresa una opcion valida");
        }
            switch (OpcionMenu) {
                case 1:
                
                System.out.println("Ingrese el tipo de articulo que desea agregar(1=Telfono,2=Laptop)");
                TipoArticulo=sc.nextInt();
    
                if(TipoArticulo <1 || TipoArticulo >2){
    
                    System.out.println("Ingresa una opcion valida");
                }
    
            switch (TipoArticulo) {
                    case 1:
            sc.nextLine();
            System.out.println("nombre-telefono:");
            t.nombre=sc.nextLine();
            System.out.println("modelo-telefono:");
            t.modelo=sc.nextLine();
            System.out.println("precio-telefono:");
            t.ObtenerPrecio(sc.nextDouble());
            sc.nextLine();
            System.out.println("Anio de Lanzamiento:");
            t.setAnioLanzamiento(sc.nextLine());
            System.out.println("Software:");
            t.setTipoSoftware(sc.nextLine());
            Telefonos.add(t);
            break;
    
            case 2:
            sc.nextLine();
            System.out.println("nombre:");
            l.nombre=sc.nextLine();
            System.out.println("modelo:");
            l.modelo=sc.nextLine();
            System.out.println("precio:");
            l.ObtenerPrecio(sc.nextDouble());
            sc.nextLine();
            System.out.println("Ram:");
            l.setRam(sc.nextInt());
            System.out.println("Capacidad:");
            l.setCapacidad(sc.nextInt());
            Laptops.add(l);
                        break;
                }
                break;

               case 3:
               System.out.println("DISPOSITIVOS DISPONIBLES:"+"\n");
               for(Laptop la: Laptops){
                la.Descrpcion();
                System.out.println("***********************");
               }
               for(Telefono te: Telefonos){
                te.Descrpcion();
                System.out.println("***********************");
               }
               break;

               case 0:
               System.exit(0);
               sc.close();

            }

           }
        
       

        }



    }
