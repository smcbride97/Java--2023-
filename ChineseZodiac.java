public enum ChineseZodiac {

    MONKEY, ROOSTER, DOG, PIG, RAT, OX, TIGER, RABBIT, DRAGON, SNAKE, HORSE, GOAT;

    public static ChineseZodiac get(int year) {
        return ChineseZodiac.values() [year % 12];
    }

    public static void main(String[] args) {
        System.out.println(ChineseZodiac.get(2003));
        System.out.println(ChineseZodiac.get(2023));
        System.out.println(ChineseZodiac.get(1968));
        System.out.println(ChineseZodiac.get(1997));
    }
    
}
