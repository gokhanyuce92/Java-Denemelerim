public class main {
    public static void main(String[] args) {
        
        /*String[] array = {"Elma", "Armut", "Kiraz" };
        
        for (String s : array) {
            System.out.println(s);
        }*/
        
        Deneme[] array1 = { new Deneme("Gökhan"), new Deneme("Mehmet"), new Deneme("Gökçe") };
        for (Deneme deneme : array1) {
            System.out.println(deneme.getIsim());
            //deneme.yaz();
        }
    }
}
