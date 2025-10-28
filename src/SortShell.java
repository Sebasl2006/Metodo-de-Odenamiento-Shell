public class SortShell {

    public SortShell(){
        System.out.println("Metodo Shell");
    }
    public void sort(int[] numeros, boolean ase){
        int size = numeros.length;
        int comparaciones = 0;
        int cambios = 0;
        for (int gap = size/2; gap > 0; gap/=2) {
           
            for (int i = gap; i < size; i++) {
                int temp = numeros[i];
                int j = i;
                comparaciones++;
                while (j>=gap && numeros[j-gap] > temp ) {
                    numeros[j]= numeros[j - gap];
                    boolean cam = true;
                    j-=gap;
                    comparaciones++;
                    if(cam){
                        cambios++;
                    }

                }
                
                numeros[j] = temp;
                
            } 
        }
        System.out.println("\nAcciones: (Cambios y comparaciones) =" + " " +(comparaciones+cambios));

    }
    
}
