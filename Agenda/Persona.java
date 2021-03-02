public class Persona {
    private String Nombre;
    private String Apellidos;
    private String Telefono;
    private String Correo;
    private String Birthday;
    private String Tipo;
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getApellidos(){
     return Apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.Apellidos = apellidos;
    }
    
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
    
    public String getCorreo(){
      return Correo;
    }
    
    public void setCorreo(String correo){
      this.Correo = correo;
    }
    
    public String getBirthday(){
      return Birthday;
    }
    
    public void setBirthday(String birthday){
      this.Birthday = birthday;
    }
   
   public String getTipo(){
     return Tipo;
    }
    
    public void setTipo(String tipo){
        this.Tipo = tipo;
    }
   
}