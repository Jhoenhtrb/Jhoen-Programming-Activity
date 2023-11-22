/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4loopsequence;

/**
 *
 * @author Villagonzalo_CPE
 */
public class Main {
    public static void main(String[] args) {
 int ii=0;
 int ad=1;
 int add,i,count=20;    
System.out.println(ii+" "+ad); 
    
 for(i=2;i<count;++i)  
 {    
  add=ii+ad;    
 System.out.println(" "+add);    
  ii=ad;    
  ad=add;    
 }    
 }  
 }
