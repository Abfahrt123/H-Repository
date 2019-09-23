/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratoshenesprimesieve;

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
       for(int i = 2; i < max_number;i++){
           if(isPrime(i)){
               System.out.println("Primzahl: " + i);
           }
       } 
    }
    
    public static void main(String[]args){
        EratosthenesPrimeSieve s = new EratosthenesPrimeSieve(97);
        s.printPrimes();
    }
    
    
}

