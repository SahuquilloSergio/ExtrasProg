package tienda;
class Producto2 {

    private String Codigo;
    private int Precio;
//Constructor por defecto
    
    public Producto2(){
    
    }
    
//Constructor por parametros
    public Producto2(String C, int P){
        Codigo = C;
        Precio = P;
    }     
//Metodos de Acceso(Getters y Setters)

public void setCodigo2(String Codigo2){
      
   }
   public String getCodigo2(){
       return Codigo;
   }
   public void setPrecio2(int Precio2){
      
   }
   public int getPrecio2(){
       return Precio;
   }
   
    @Override
   public String toString(){
      return Codigo +"   "+ Precio;
   }
 void cambiarCodigo(String nCodigo){
    Codigo = nCodigo;
 }
 void cambiarPrecio(int nPrecio){
    Precio = nPrecio;
 }
}

