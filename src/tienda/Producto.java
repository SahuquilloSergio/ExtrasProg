package tienda;

class Producto {

    private String Codigo;
    private int Precio;
//Constructor por defecto
    
    public Producto(){
    
    }
    
//Constructor por parametros
    public Producto(String C, int P){
        Codigo = C;
        Precio = P;
    }     
//Metodos de Acceso(Getters y Setters)

public static String setCodigo(String Codigo){
       return Codigo;
   }
   public String getCodigo(){
       return Codigo;
   }
   public  int setPrecio(int Precio){
       return Precio;
   }
   public int getPrecio(){
       return Precio;
   }
   

}
