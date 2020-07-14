class Army {

    public static void createArmy() {
        // Implement this method
        Unit uWest = new Unit("Unit - WEST");
        Unit uEast = new Unit("Unit - EAST");
        Unit uNorth = new Unit("Unit - NORTH");
        Unit uSouth = new Unit("Unit - SOUTH");
        Unit uNorthWest = new Unit("Unit - NORTHWEST");

        Knight kJohn = new Knight("John");
        Knight kWill = new Knight("Will");
        Knight kScot = new Knight("Scot");

        General gPatric = new General("Patric");

        Doctor dFred = new Doctor("Fred");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}