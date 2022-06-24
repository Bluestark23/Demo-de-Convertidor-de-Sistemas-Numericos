/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Integer;
import java.util.Scanner;
/**
 *
 * @author Tadeo Daniel
 */
public class op {
    public int nu;
    
    public String intTohex(int n){
        return Integer.toHexString(n).toString();
    }
    
     public String intToOctal(int n){
        return Integer.toOctalString(n).toString();
    }
    public String intBinary(int n){
        return Integer.toBinaryString(n).toString();
    }
    public String bin_dec(String Num)
    {
        int dec=Integer.parseInt(Num,2);
     return String.valueOf(dec);
    }
   public String bin_hex(String valor)
    {
        int dec=Integer.parseInt(valor,2);// El método Number.parseInt() 
        //convierte un argumento tipo string y retorna un entero de la base especificada.
        valor=Integer.toHexString(dec);
     return valor;
    }
   public String bin_oct(String valor)
    {
        int dec=Integer.parseInt(valor,2);
        valor=Integer.toOctalString(dec);
        return valor;
    }
    
    public String hex_dec(String valor)
    {
        int dec=Integer.parseInt(valor,16);
return  String.valueOf(dec);
        }
    
    public String hex_bin(String valor)
    {
        int dec=Integer.parseInt(valor,16);
        valor=Integer.toBinaryString(dec);
        return valor;
    }
    
    
    public String hex_oct(String valor)
    {
        int dec=Integer.parseInt(valor,8);
        valor=Integer.toHexString(dec);
        return valor;
    }
    
    public String oct_bin(String valor)
    {
        int dec=Integer.parseInt(valor,8);
        valor=Integer.toBinaryString(dec);
       return valor;
    }
     public String oct_dec(String valor)
    {
      int dec=Integer.parseInt(valor,8);
         
       return String.valueOf(dec);
      
    }
     public String oct_hex(String valor)
    {
        int dec=Integer.parseInt(valor,8);
        valor=Integer.toHexString(dec);
        return valor;
    }
     public static String SumaB(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);//el 2 es por que es base de decimal(2)
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }
     public static String SumaO(String a, String b) {
        int a1 = Integer.parseInt(a, 8);
        int b1 = Integer.parseInt(b, 8);//el 2 es por que es base de decimal(2)
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 8);
        return resultado;
    }
      public static String SumaH(String a, String b) {
        int a1 = Integer.parseInt(a, 16);
        int b1 = Integer.parseInt(b, 16);//el 2 es por que es base de decimal(2)
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 16);
        
      if(c1>9&&c1<11){//10
            resultado=String.valueOf("A");
        }else{
            if(c1>10&&c1<12){//11
                           resultado=String.valueOf("B");
 
            }else{
            if(c1>12&&c1<14){//12
                           resultado=String.valueOf("C");
 
            }else{
            if(c1>13&&c1<15){//13
                           resultado=String.valueOf("D");
 
            }else{
            if(c1>12&&c1<14){//14
                           resultado=String.valueOf("E");
 
            }else{
            if(c1>14&&c1<16){//15
                           resultado=String.valueOf("F");
             
                                         }    
                                  }
                               }
                            }
            }
            
        }
        return resultado;
    }
     
    /*
    public String oct_dec(String valor)
    {
        int dec=Integer.parseInt(valor,8);
        return String.valueOf(dec);
    }*/
   
    //si funcionan el binario_hexadecimal() yo del futuro 
    //solo que por el tiempo tengo que adaptarme :v
    /*
public int binario_hexadecimal(){
    Scanner sc=new Scanner(System.in);
    int numero;
    int cont=0;
    int aux = 0;
    int acum=0;
    String resultados="";
    
    numero=getNu();
         while(numero>0){
             
                acum=0;
                cont=0;
             while(cont<4){
                 aux=numero%10;///% quita el ultimo numero osea solo llega hasta 9 no hasta 10
                 if(aux==1){
            switch(cont){
                case 0:
                    acum=acum+1;
                     break;
                 case 1:
                    acum=acum+2;
                     break;
                      case 2:
                    acum=acum+4;
                     break;
                      case 3:
                    acum=acum+8;
                     break;
                     
            }
                 
             }      
             numero=numero/10;
                 cont++;
                 
             }
             
             //checar con jose 
             if(acum<=9){
             resultados=acum+resultados;
             }else 
                 if(acum>9){
                    switch (acum) {
                        case 10:
                            resultados="A"+resultados;
                            break;
                        case 11:
                            resultados="B"+resultados;
                            break;
                        case 12:
                            resultados="C"+resultados;
                            break;
                        case 13:
                            resultados="D"+resultados;
                            break;
                        case 14:
                            resultados="E"+resultados;
                            break;
                        case 15:
                            resultados="F"+resultados; 
                            break;
                        default:
                            break;
                    }
                                
             }
         }
 return  Integer.valueOf(resultados);
}
/*
public int binario_octal(){
    Scanner sc=new Scanner(System.in);
    int numero;
    int cont=0;
    int aux = 0;
    int acum=0;
    String resultados="";
       
    numero=getNu();
         while(numero>0){
             
                acum=0;
                cont=0;
             while(cont<2){
                 aux=numero%8;///% quita el ultimo numero osea solo llega hasta 9 no hasta 10
                 if(aux==1){
            switch(cont){
                case 0:
                    acum=acum+1;
                     break;
                 case 1:
                    acum=acum+2;
                     break;
                      case 2:
                    acum=acum+4;
                     break;
                                        
            }
                 
             }      
             numero=numero/8;
                 cont++;
             }
             
             //checar con jose 
            if(acum<=7){
             resultados=String.valueOf(acum+resultados);
             }
                                
                              
             }
         
 return  Integer.valueOf(resultados);
}*/
    /**
     * @return the nu
     */
    public int getNu() {
        return nu;
    }

    /**
     * @param nu the nu to set
     */
    public void setNu(int nu) {
        this.nu = nu;
    }
    
    
    
    
    
}
