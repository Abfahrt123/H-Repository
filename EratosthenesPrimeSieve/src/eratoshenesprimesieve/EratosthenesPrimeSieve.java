/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratoshenesprimesieve;

import java.util.ArrayList;

/**
 *
 * @author marku
 */
public class EratosthenesPrimeSieve implements PrimeSieve {
    private int max_number;
    public EratosthenesPrimeSieve(int max_number){
        this.max_number = max_number;
    }
    
    @Override
    public boolean isPrime(int p) {
        for(int i = 2; i < p;i++){
          if((p % i) == 0){
           return false;   
          }
          }
        return true;
        }
   
    @Override
    public void printPrimes() {
     ArrayList<Integer> myArrList = new ArrayList<>();
     for(int i = 2; i < max_number; i++){
        myArrList.add(i);
     }
     for(int a = 0; a < myArrList.size();a++){
         int zahl = myArrList.get(a);
         int teiler = myArrList.get(a);
         for(;zahl < max_number;zahl += teiler){
             if(zahl != teiler){
             if((zahl % teiler) == 0){
                 if(myArrList.contains(zahl)){
               myArrList.remove(myArrList.indexOf(zahl));
                 }
             }
         }
     }}
     
     for(int i = 0; i < myArrList.size();i++){
         System.out.println("Primzahl: " + myArrList.get(i));
     }
    }
    
    public static void main(String[]args){
        EratosthenesPrimeSieve s = new EratosthenesPrimeSieve(100);
        s.printPrimes();
    }
    
    
}

