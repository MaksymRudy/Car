public class Car {
    int age = 0;
    int power = 116;
    int turbo = 56;

    public static void main(String[] args) {
        Car GM1 = new Car();
        Car GM2 = new Car();

        System.out.println(GM1.getAge());
        System.out.println(GM1.calculateIndex());
        System.out.println(GM2.power);
        System.out.println(GM2.upgradePower(116));
        System.out.println(GM2.calculateIndex());

    }
    int getAge (){
        return age;
    }
    int calculateIndex() {
        return power * 10 + turbo;
    }
    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }
}
