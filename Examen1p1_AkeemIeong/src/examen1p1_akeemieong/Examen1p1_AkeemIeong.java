package examen1p1_akeemieong;

import java.util.Scanner;
import java.util.Random;
public class Examen1p1_AkeemIeong {
static Scanner leer= new Scanner(System.in);
static Random random=new Random(); 
    
    public static void main(String[] args) {
        int opcion;
    do{
        System.out.println("Bienvenido");
        System.out.println("1<-Divisores primos");
        System.out.println("2<-contorno de piramide");
        System.out.println("3<-Vecinos");
        System.out.println("4<-Salida");
        opcion=leer.nextInt();
        switch (opcion){
            case 1:
                int num;
                System.out.println("Ingrese un numero: ");
                num=leer.nextInt();
                if (num>=1){
                    primos(num);
                    
                    //System.out.println("Los numeros primos que dividen el "+num+" son: "+primos(numpri));

                }
                else 
                    System.out.println("Ingrese un numero mayor a 0");                
                break;
                
            case 2:
                int size;
                System.out.println("Ingrese un tamano: ");
                size=leer.nextInt();
                if (size>0){
                    if (size%2==1){
                        contorno(size);
                        
                    }
                    else System.out.println("Ingrese un numero impar");
                        
                }
                else System.out.println("Ingrese un numero positivo");
                
                break;
                
            case 3:
                String cadena;
                boolean tipo=true;
                int form;
                System.out.println("Ingrese una cadena: ");
                leer.nextLine();
                cadena=leer.nextLine();
                for(int v=0;v<cadena.length();v++){
                    form=cadena.charAt(v);
                    if (form>=65&&form<=90||form<=122&&form>=97){
                        tipo=true;
                        
                    }
                    
                    else 
                    {
                        System.out.println("Solo se acepta letras y espacios");
                    tipo=false;
                    break;
                    }
                }
                if (tipo==true){
                    vecinos(cadena);
                }
                break;
        }
    }
    while (opcion!=4);
    
 
}
    
public static String primos(int num){
    String numpri="";
    int division=0,divi=0;
    for (int q=1;q<=num;q++){
        division=num%q;
        if (division==0){
            if (q==num){
                numpri=numpri;
            }
            else
            numpri=numpri+q+" ";
        }
    }    
return numpri;
}
        

public static void contorno(int tri){
    int mid=(tri-1/2)+1,conta1=tri-1,conta2=tri+1;
    for (int y=1;y<tri;y++ ){
        if (y==1){
            conta1=0;
            conta2=0;
        }
        if(y==2){
            conta1=mid-1;
            conta2=mid+1;
        } 
        for(int x=1;x<tri;x++){
            if (x==mid||x==conta1||x==conta2){
                System.out.print("+");
            }
            if (x>conta1||x<conta2){
                System.out.print(" ");
            }
            if (conta1-1<0){
                System.out.print("*");
            }
            if (conta1-1==0){
                System.out.print("*");
            }
            else 
                System.out.print("*");
        }
        System.out.println();
    }
    conta1--;
    conta2++;
}

public static void  vecinos(String var){
    int how=random.nextInt(2);
    int dis;
    String accum="";
    System.out.println("Numero generado: "+how);
    if (how==0){
        for(int e=0;e<var.length();e++){
            dis=(int)var.charAt(e);
            if(dis>=65&&dis<=90){
                accum+=(char)(dis-1);
            }
            else 
                if (dis>=97&&dis<=122){
                    accum+=(char)(dis-1);
                }
        }
    }
    else
        for(int e=0;e<var.length();e++){
            dis=(int)var.charAt(e);
            if(dis>=65&&dis<=90){
                accum+=(char)(dis+1);
            }
            else 
                if (dis>=97&&dis<=122){
                    accum+=(char)(dis+1);
                }
        }
        System.out.println(""+accum);
}
}