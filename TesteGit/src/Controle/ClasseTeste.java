
package Controle;


public class ClasseTeste {
    
    // Buble Sort - ordenação
    
    public static void main(String[] args) {
        int[] idade = {25,12,35,3,9};
        
        int aux;
        for(int i=0; i<idade.length; i++){
            for(int j=0; j<idade.length-1; j++){
                
                    if(idade[j]>idade[j+1]){
                        aux = idade[j];
                        idade[j] = idade[j+1];
                        idade[j+1] = aux;
                }
            }
        }
        for(int i=0; i<idade.length; i++){
           System.out.println(idade[i]); 
        }
        
    }
}
