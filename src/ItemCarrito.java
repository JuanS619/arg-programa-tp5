public class ItemCarrito {
    Productos productos;
    Descuento descuento;
    private double cantidad;
    private double subtotal;
    private  double descPorcentual;
    private double descFijo;

    public ItemCarrito(Productos productos, double cantidad, Descuento descuento){
        this.productos = productos;
        this.cantidad = cantidad;
        this.descuento = descuento;
        subtotal = productos.GetPrecio() * cantidad;
        descPorcentual = subtotal - (subtotal * descuento.GetDescuento()); //aca debería ir mi clase descuento
        descFijo = subtotal - descuento.GetDescuentoFijo();


    }
    public double Getsubtotal(){
        return subtotal;
    }
    public double GetDescuento(){return  descPorcentual;}
    public double GetDescuentoFijo(){return descFijo;}
    public void MostrarResultado(){
        System.out.println("Producto: " + productos.GetNombre() + " Precio: " + productos.GetPrecio() + " Cantidad: " + cantidad +
                "\nSubtotal: " + subtotal);
    }
    public void MostraDescuento(){
        System.out.println("Descuento del producto: " + descPorcentual);
    }
    public  void MostrarDescuentoFijo(){
        System.out.println("Descuento Fijo: " + descFijo);
    }
}
