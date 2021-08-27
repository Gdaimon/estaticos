package estaticos;


public class Circulo {

    public static final float pi = 3.141592f; // Le pertenece as la clase y no al objeto
    public float radio = 0f; // Le pertenece al Objeto

    public Circulo(float radio) {
        this.radio = radio;
    }    
    
    public static float area(float radio){
        return pi * (radio * radio);
    }
    
}
