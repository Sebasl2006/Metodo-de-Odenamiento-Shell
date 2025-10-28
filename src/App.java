public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = new int[]{5,0,8,4,9,6,7,2,3};
        SortShell shell = new SortShell();
        View view = new View();
        view.printArray(numeros);
        shell.sort(numeros, false);
        System.out.println("\nOrdenado");
        view.printArray(numeros);
        

        

      
    }
}
