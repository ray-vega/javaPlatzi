public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives -1;
        System.out.println(lives); //4

        lives--;
        System.out.println(lives); //3

        lives++;
        System.out.println(lives);  //4

        //Prefija
        // Gana un regalo por ganar una vida
       int gift = 100 +lives++; //postfijo
       System.out.println(gift);
       System.out.println(lives);

       int gift2 = 100 + ++lives; //prefijo
       System.out.println(gift2);

    }
}
