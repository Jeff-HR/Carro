
/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro
{
    //En esta parte vamos a definir 3 atributos y un valor 1 atributo si nos dira si el carro esta o no esta encendido
    //siempre seguiremos esta estructura private gestiona la ocultacion, el tipo de dato, nombre del atributo 
    private String color; // cadena de texto
    private double galones;//porque es de tipo decimal
    private boolean encendido;
    
    
    /**
     * Constructor for objects of class Carro
     */
    public Carro()
    {
        // vamos a darle a los atributos en esta seccion (el constructor)
        
        this.color = "negro";  //usaremos la palabra reservada this que hace referencia a la propía clase 
        this.galones = 30.5; 
        this.encendido = false; // por defecto lo dejaremos que no esta arrancado
        
    }
      
    public Carro(String newColor, double newGalones, boolean newArrancado)
    //que tendriamos que hacer con estos atributos que nos pasen aqui? pues tendriamos que asignarlos a los atrubutos de la clase
    
    {
        // vamos a darle a los atributos en esta seccion (el constructor)
        
        this.color = "negro";  //usaremos la palabra reservada this que hace referencia a la propía clase 
        this.galones = 30.5; 
        this.encendido = false; // por defecto lo dejaremos que no esta arrancado   
        
    }
    
    //paea crear los metodos de modificacion partimos desde aca
    //utilizamos la palabra reservada public vamos a tener que agregar void ya que se utiliza como un modificador ya que no retorna valor solo
    //modifica el atributo y que var ser acesible dessde fuera de la clase
    public void setColor(String newColor){
        //se utiliza la nomenclatura set
        this.color = newColor;
    
    }     
    public void setGalones(double newGalones){
        //se utiliza la nomenclatura set
        this.galones = newGalones;
        
    }
    public void setEncendido(boolean newArrancado){
        //se usa la nomenclatura set
        this.encendido = newArrancado;
    }
}
