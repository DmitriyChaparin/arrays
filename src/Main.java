public class Main {
    public static void main(String[] args) {

        //Задача 1
        //1
        int[] numb = new int[3];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        //2
        double[] numb1 = {1.57, 7.654, 9.986};
        //3
        int[] total = {12, 15, 78, 33, 55, 0, 0};

        //Задача 2
        System.out.print(numb[0]+ ", " + numb[1]+ ", "+ numb[2] + "\n");
        System.out.print(numb1[0] + ", " + numb1[1] + ", " + numb1[2] + "\n");
        System.out.print(total[0] + ", " + total[1] + ", " + total[2] + ", " + total[3] + ", " + total[4] + ", " + total[5] + ", " + total[6]);

        //Задача 3
        System.out.print(numb[2]+ ", " + numb[1]+ ", "+ numb[0] + "\n");
        System.out.print(numb1[2] + ", " + numb1[1] + ", " + numb1[0] + "\n");
        System.out.print(total[6] + ", " + total[5] + ", " + total[4] + ", " + total[3] + ", " + total[2] + ", " + total[1] + ", " + total[0] + "\n");

        //Задача 4
        for (int i = 0; i < numb.length ; i ++) {
            if ( numb [i] %2 !=0 );{
                numb [i] = numb[i] + 1;
             System.out.print(numb[i] + ", ");}


        }


    }
}
