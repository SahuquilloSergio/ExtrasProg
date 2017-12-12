package tienda;
public class Tienda {

    public static void main(String[] args) {

        Producto Producto1 = new Producto("C1", 24);
        System.out.println(Producto1.getCodigo()+"   " + Producto1.getPrecio());
        
        Producto2 Producto2 = new Producto2("H23", 243);
        System.out.println(Producto2.toString());
        
        Producto Producto3 = new Producto("M30", 109);
        System.out.println(Producto3.getCodigo()+"   "+Producto3.getPrecio());

        Producto2.cambiarCodigo("K123");
        Producto2.cambiarPrecio(109);
        System.out.println(Producto2.toString());
        
    }
}
 
