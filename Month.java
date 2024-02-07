public enum Month {
    
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(31), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int nOfDays;
    private Month(int nOfDays) {
        this.nOfDays = nOfDays;
    }

    public int days() {
        return this.nOfDays;
    }

    public static void main(String [] args) {
        Month month;

        month = Month.MAY;
        System.out.println(month);

        if (month == Month.MAY)
            System.out.println("31 days");

        month = Month.APRIL;

        switch (month) {
            case JANUARY:
                System.out.println("31 days");
            case FEBRUARY:
                System.out.println("28 days");
            case MARCH:
                System.out.println("30 days");
            case APRIL:
                System.out.println("30 days");
        }

        for (Month m : Month.values())
            System.out.println(m);
        
        month = Month.valueOf("AUGUST");
        System.out.println(month);
        // month = Month.valueOf("AUG");
        // System.out.println(month);

        System.out.println(month.days());
        System.out.println(Month.FEBRUARY.days());
        System.out.println(Month.SEPTEMBER.days());

        for (Month m : Month.values())
            System.out.printf("%s: %d\n", m, m.days());

        System.out.println(Month.JANUARY.ordinal());
        System.out.println(Month.SEPTEMBER.ordinal());

        for (Month m : Month.values())
            System.out.printf("The %d month of the year is: %s\n", m.ordinal() + 1, m);
        
        System.out.println(Month.JANUARY.compareTo(Month.APRIL));
    }
}
