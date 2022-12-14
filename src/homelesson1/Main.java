package homelesson1;



public class Main {

    public static void main(String[] args) {

        Persson persson = new Persson("Andre", 72, 182, 68, true, 500);
        Persson secondPersson = new Persson();
        Persson thirdPersson = new Persson("Nikolya", 17, 173, 59, true, 100);
        Persson forPersson = new Persson("Dmytro", 43, 174, 62, true, 1000);
        Persson fivePersson = new Persson("Diana", 23, 168, 52, false, 2000 );


        persson.info();
        secondPersson.info();
        thirdPersson.info();
        forPersson.info();
        fivePersson.info();

        persson.goWork();
        thirdPersson.goWork();
        forPersson.goWork();
        fivePersson.goWork();


    }




}
