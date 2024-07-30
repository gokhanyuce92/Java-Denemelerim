public class main {
    
    public static void main(String[] args) {
   
            //local inner class
            class Alan {
                public void daire_alan(int yaricap) {
                    System.out.println("Dairenin alanı: " + (yaricap * yaricap * Math.PI));
                }
            }
            
            Alan alan = new Alan();
            
            alan.daire_alan(5);
    }
}
