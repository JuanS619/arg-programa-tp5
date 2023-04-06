public class Descuento {
      private double descuentoDia;
      private  double descuentoFijo;

      public Descuento(){
          descuentoDia=0.70;
          descuentoFijo = 500;
      }
      public double GetDescuento(){return descuentoDia;}
      public double GetDescuentoFijo(){return descuentoFijo;}


}
