package ExamTest;

public class Exam2 {
    public static void main(String[] args) {
        star(3);
        star(5);
        star(7);


    }
    static void star(int count){
        int count2 = count * 2;
        for (int i = 0; i < count2; i += 2) {
            for (int j = count2; j > i; j -=2 ){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
