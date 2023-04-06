import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainComprar {
    double montoTotal=0;
    public static void main(String[] args) throws IOException {
        String linea="";
        String delimitador = ";";
        String filePath = "C:\\Users\\Juan\\Documents\\java-argentina-programa\\3. tareas-codigos\\tp5.2\\compras.txt";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        double sumar=0;
        double x=0;
        double descFijo=0;
        while((linea=reader.readLine())!=null){
            String[] campo = linea.split((delimitador));
            Double campoPrecio =  Double.parseDouble(campo[1]);
            Double campoCantidad = Double.parseDouble(campo[2]);

            Productos productos = new Productos(campo[0], campoPrecio);
            Descuento d = new Descuento();
            ItemCarrito itemsa = new ItemCarrito(productos, campoCantidad, d);

            double seleccion=0;
            if(seleccion == 1){
                itemsa.MostrarResultado();
                sumar += itemsa.Getsubtotal();
                x += itemsa.GetDescuento();
                itemsa.MostraDescuento();
            }
            else {
                itemsa.MostrarResultado();
                sumar+=itemsa.Getsubtotal();
                descFijo -= itemsa.GetDescuentoFijo();
                itemsa.MostrarDescuentoFijo();

            }




            
        }
        System.out.println("Descuento fijo " + (descFijo*-1));
        System.out.println("Subtotal: "+sumar);
        System.out.println("Precio final con descuentos: "+ x);

    }

}
