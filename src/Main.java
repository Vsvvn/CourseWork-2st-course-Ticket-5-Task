public class Main {
    public static void main(String[] args) {

        Number number = Number.ONE;
        System.out.println(number.getNumber());


        for (Number num : Number.values()) {
            System.out.println(num.getNumber());
        }
    }
}
