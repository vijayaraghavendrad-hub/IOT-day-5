package IOT5;

public class str_buld_ex7 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.insert(5, " World");
        sb.insert(11, " Java");

        System.out.println(sb);
    }
}