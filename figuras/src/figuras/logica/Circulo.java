/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura {
    
    public void calcularArea(){
        int radio = origen.calcularDistancia(fin);
        area = (int) ((Math.PI*2)*(Math.pow(radio,2)));
        
}
    
    public void calcularPerimetro(){
        int radio = origen.calcularDistancia(fin);
        perimetro = (int) ((Math.PI*2)*radio);
    }
    
}
