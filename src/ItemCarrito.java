public class ItemCarrito {
    Productos productos;
    Descuento descuento;
    private double cantidad;
    private double subtotal;
    private  double desc;

    public ItemCarrito(Productos productos, double cantidad, Descuento descuento){
        this.productos = productos;
        this.cantidad = cantidad;
        this.descuento = descuento;
        subtotal = productos.GetPrecio() * cantidad;
        desc = subtotal - (subtotal * descuento.GetDescuento()); //aca debería ir mi clase descuento

    }
    public double Getsubtotal(){
        return subtotal;
    }
    public double GetDescuento(){return  desc;}
    public void MostrarResultado(){
        System.out.println("Producto: " + productos.GetNombre() + " Precio: " + productos.GetPrecio() + " Cantidad: " + cantidad +
                "\nSubtotal: " + subtotal);
    }
    public void MostraDescuento(){
        System.out.println("Descuento del producto: " + desc);
    }
}
