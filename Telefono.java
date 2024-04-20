public class Telefono extends ArticuloElectronico implements PrecioDescripcion{

    private String AnioLanzamiento;
    private String TipoSoftware;//Android, Ios,etc

    //Setters y Getters
    public String getAnioLanzamiento() {
        return AnioLanzamiento;
    }
    public void setAnioLanzamiento(String anioLanzamiento) {
        this.AnioLanzamiento = anioLanzamiento;
    }
    public String getTipoSoftware() {
        return TipoSoftware;
    }
    public void setTipoSoftware(String tipoSoftware) {
        this.TipoSoftware = tipoSoftware;
    }

     //Constructore
     public Telefono(String nombre,String modelo,String anioLanzamiento, String tipoSoftware) {
        super(nombre,modelo);
         this.AnioLanzamiento = anioLanzamiento;
         this.TipoSoftware = tipoSoftware;
         
     }


    //Metodos
    @Override
    public double ObtenerPrecio(double precio) {
        return precio;
    }

    @Override
    public void Descrpcion() {
        System.out.println("ID: "+setID());
        System.out.println("Nombre: "+nombre);
        System.out.println("Modelo: "+modelo);
        System.out.println("AnioLanzamineto: "+AnioLanzamiento);
        System.out.println("Software: "+TipoSoftware);
        System.out.println("Precio: "+ObtenerPrecio(precio));
    }
}