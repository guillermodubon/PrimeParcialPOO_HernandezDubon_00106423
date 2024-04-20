public class Laptop extends ArticuloElectronico implements PrecioDescripcion {

    private int Ram;
    private int Capacidad;

    //Setters y Getters
     public int getRam() {
        return Ram;
    }
    public void setRam(int ram) {
        this.Ram = ram;
    }
    public int getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.Capacidad = capacidad;
    }

    //Constructore
    public Laptop(String nombre,String modelo,int ram, int capacidad) {
        super(nombre,modelo);
        this.Ram = ram;
        this.Capacidad = capacidad;
    }

    //Metodos
    @Override
    public double ObtenerPrecio(double precio) {
        return this.precio+precio;
    }

    //Los id de laptops seran impares
   
    @Override
    public void Descrpcion() {
        System.out.println("ID: "+setID());
        System.out.println("Nombre: "+nombre);
        System.out.println("Modelo: "+modelo);
        System.out.println("Memoria-Ram: "+Ram);
        System.out.println("Capacidad: "+Capacidad);
        System.out.println("Precio: "+ObtenerPrecio(precio));
    }
}