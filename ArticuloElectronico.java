public abstract class ArticuloElectronico{
    protected String nombre;
    protected String modelo;
    protected double precio;
    static int id;

    static int setID(){
        id++;
        return id;
     }


    public ArticuloElectronico(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        
        
    }

}