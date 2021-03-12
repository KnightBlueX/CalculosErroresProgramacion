
package errores;

import java.util.Scanner;


public class Errores {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcion=0, otra = 0;
        double valorReal, ValorAproximado;

        do {//inicio del ciclo
            try {//inicio búsqueda de errores
                System.out.println("Bienvenido al menú de cálculo de errores de programación");
                System.out.println("Porfavor, Elija el cálculo que desea hacer:");//Menú de opciones
                System.out.println("");
                System.out.println("1.Error Relativo");
                System.out.println("2.Error Absoluto");
                System.out.println("3.Error Relativo Porcentual");
                
                opcion = teclado.nextInt();

                switch (opcion) {//Operaciones de cada opción 

                    case 1://Error Relativo

                        System.out.println("Ingrese el valor verdarero");
                        valorReal = teclado.nextDouble();
                        System.out.println("Ingrese el valor aproximado");
                        ValorAproximado = teclado.nextDouble();
                        ErrorRelativo error2 = new ErrorRelativo(valorReal, ValorAproximado);//creación del objeto y uso

                        System.out.println("El error relativo es " + error2.ErrorRelativo());//impresión del resultado llamando al método
                        break;

                    case 2://Error Absoluto

                        System.out.println("Ingrese el valor verdadero");
                        valorReal = teclado.nextDouble();
                        System.out.println("Ingrese el valor aproximado");
                        ValorAproximado = teclado.nextDouble();
                        ErrorAbsoluto error1 = new ErrorAbsoluto(valorReal, ValorAproximado);//creación del objeto y uso
                        //de la clase y metodo error absoluto
                        System.out.println("El error absoluto es " + error1.ErrorAbsoluto());//impresión del resultado llamando al método 
                        break;

                    case 3://Error Relativo Porcentaje
                        System.out.println("Ingrese el valor verdadero");
                        valorReal=teclado.nextDouble();
                        System.out.println("Ingrese el valor aproximado");
                        ValorAproximado=teclado.nextDouble();
                        ErrorRelativoPorcentual error3=new ErrorRelativoPorcentual(valorReal, ValorAproximado);//creación del objeto y uso
                      
                        System.out.println("El error relativo porcentual es de "+error3.ErrorRelativoPorcentual()+"%"); //impresión del resultando llamando al método
                        break;

                    
                }

            } catch (NumberFormatException k) { //fin de búsqueda de errores 

            }
            System.out.println("");//continuar o cerrar el programa 
            System.out.println("¿Desea realizar otra operación? 1.Si(volver a la barra de menús), 2.No(Salir del programa)");
            otra=teclado.nextInt();
        } while (otra != 2);
    }
    
}

//clases y métodos para las operaciones
class ErrorRelativo {

    double valorreal1, valoraproximado;

    ErrorRelativo(double d, double e) {
        valorreal1 = d;
        valoraproximado = e;
    }

    double ErrorRelativo() {
        return (valorreal1 / valoraproximado);
    }

}

class ErrorAbsoluto { //clase y método para error absoluto

    double valorreal, valoraprox;

    ErrorAbsoluto(double a, double b) {
        valorreal = a;
        valoraprox = b;
    }

    double ErrorAbsoluto() { //valor retornable
        return (valorreal - valoraprox);
    }

}

class ErrorRelativoPorcentual{ //Error Relativo Porcentual 
    
    double valorreal2, valoraprox2;
    ErrorRelativoPorcentual (double f, double g){
        valorreal2=f;
        valoraprox2=g; 
    }
    double ErrorRelativoPorcentual(){
        return ((valorreal2-valoraprox2)/valorreal2)*100;
}
     
   
}
