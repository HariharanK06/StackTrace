public class Trace {
    void one(){
        two();
        System.out.println("ONE");

    }
    void two(){
        three();
        System.out.println("two");

    }
    void three(){
        four();
        System.out.println("third");

    }
    void four(){

        five();
        System.out.println("four");

    }
    void five(){
        six();
        System.out.println("five");

    }
    void six(){
        seven();
        System.out.println("six");

    }
    void seven(){
        eight();
        System.out.println("seven");

    }
    void eight(){
        nine();
        System.out.print(1 / 0);


    }
    void nine(){
        ten();
        System.out.println("NINE");
    }
    void ten(){
        System.out.println("TEN");
    }


    public static void main(String[] args) {
        new Trace().one();
    }
}
