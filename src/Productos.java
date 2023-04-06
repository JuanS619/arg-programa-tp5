public class Productos {
    private String nombre;
    private double precio;
    public Productos(){

    }
    public Productos(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String GetNombre(){
        return nombre;
    }
    public double GetPrecio(){
        return precio;
    }



}
