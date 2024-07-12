//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] data = {1.1, 3.2, -4.23, 5.6, 3.3,-5.6,3.6,-7.6,6,7.2,-8,-12,3,15,21,};
        int cout = 0;
        double sum = 0;
        boolean flag = false;

//        System.out.println("j");

        for (double num : data) { //num == data[i]
            if (num < 0) {
                flag = true;
            }
            if (flag && num > 0) {
                cout = cout + 1;
                sum = sum + num;
            }
        }
        System.out.println(sum);
        System.out.println(cout);
        System.out.println(sum / cout);


    }
}
