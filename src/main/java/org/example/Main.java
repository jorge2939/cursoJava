package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int var;
        boolean pregunta;
        //char hola;


        System.out.println("bienvenido a mi humilde primer programa en java");
       // System.out.println("instroduzca un char ");
       // hola=funcionesScaneo.intentoChar();
      //  System.out.println(hola);
        do {
            pregunta=true;
            System.out.println("Por favor introduzca el numero de iteraciones que desea conocer");
            var= funcionesScaneo.intentoEntero();
            System.out.println("estimado señor su fibbo de la iteracion"+var+" es: "+fibbo(var));
            System.out.println("desea usted continuar? 1=si, 2=no");
            var=funcionesScaneo.intentoEntero();
            if(var!=1)
            {
                pregunta=false;
            }
        }while(pregunta);
    }
    public static int fibbo(int iteracion)
    {
        int varfibbo;
        if(iteracion<=1)
        {
            varfibbo = iteracion;
        }
        else
        {
            varfibbo = fibbo(iteracion-1)+fibbo(iteracion-2);
        }
        return varfibbo;
    }
}
class funcionesScaneo
{
    public static Scanner sc = new Scanner(System.in);
    public static int intentoEntero()
    {
        int var=0;
        boolean verdadero=true;
        do
        {
            try
            {
                var= sc.nextInt();
                verdadero=false;
            }
            catch(Exception e)
            {
                System.out.println("introduzca un numero valido");
                sc.next();
            }
        }while (verdadero);
        return var;
    }
    public static char intentoChar()
    {
        char var=1;
        boolean verdadero=true;
        do
        {
            try
            {
                var= sc.next().charAt(0);
                verdadero=false;
            }
            catch(Exception e)
            {
                System.out.println("introduzca un numero valido");
                sc.next();
            }
        }while (verdadero);
        return var;
    }
}

