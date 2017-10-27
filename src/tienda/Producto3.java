package tienda;
class Producto3 {

    private String Codigo;
    private int Precio;
//Constructor por defecto
    
    public Producto3(){
    
    }
    
//Constructor por parametros
    public Producto3(String C, int P){
        Codigo = C;
        Precio = P;
    }     
//Metodos de Acceso(Getters y Setters)

    public static String setCodigo3(String Codigo){
       return Codigo;
   }
   public String getCodigo3(){
       return Codigo;
   }
   public  int setPrecio3(int Precio){
       return Precio;
   }
   public int getPrecio3(){
       return Precio;
   }
   

}

