import java.util.Scanner;

class Robot {

    private String CPU;
    private int legs;
    private int hands;
    private int eyes;

    Robot(String CPU, int legs, int hands, int eyes) {
        this.CPU = CPU;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    public static class RobotBuilder {

        /* write your code here (fields) */
        private String cpu;
        private int legs;
        private int hands;
        private int eyes;

        /* write your code here (constructor) */

        public RobotBuilder() {
        }

        public RobotBuilder setCPU(String cpu) {
            /* write your code here */
            this.cpu = cpu;
            return this;
        }

        public RobotBuilder setLegs(int legs) {
            /* write your code here */
            this.legs = legs;
            return this;
        }

        public RobotBuilder setHands(int hands) {
            /* write your code here */
            this.hands = hands;
            return this;
        }

        public RobotBuilder setEyes(int eyes) {
            /* write your code here */
            this.eyes = eyes;
            return this;
        }

        public Robot build() {
            /* write your code here */
            return new Robot(cpu, legs, hands, eyes);

        }
    }


    @Override
    public String toString() {
        return "CPU : " + CPU + "\n" +
                "Legs : " + legs + "\n" +
                "Hands : " + hands + "\n" +
                "Eyes : " + eyes + "\n";
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        /* write your code here */
        /* Set CPU */
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();
        /* write your code here */
        Robot robot = new Robot.RobotBuilder()
                .setCPU("Intel Core i5")
                .setLegs(legs)
                .setHands(hands)
                .setEyes(eyes)
                .build();

        System.out.println(robot);
        scanner.close();
    }
}