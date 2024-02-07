public enum Week {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;  

    public static void main(String [] args) {
        Week week;

        week = Week.MONDAY;
        System.out.println(week);

        if (week == Week.MONDAY)
            System.out.println("The first day of the week");

        for(Week w : Week.values())
            System.out.printf("The %d day of the week is: %s\n", w.ordinal() + 1, w);

        System.out.println(Week.MONDAY.compareTo(Week.SUNDAY));   
    }
}
