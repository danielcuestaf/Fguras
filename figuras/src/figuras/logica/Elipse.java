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
public class Elipse extends Figura {
    
    
    public void calcularArea(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = temp.calcularDistancia(origen);
        area = (int) ((Math.PI)*(base*altura));
        

    }
    public void calcularPerimetro(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = temp.calcularDistancia(origen);
        perimetro = (int)(((Math.PI)*2)*(Math.sqrt((Math.pow(base,2)+ Math.pow(altura, 2))/2)));
    }
    
}
