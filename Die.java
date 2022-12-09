public abstract class Die {
    /**
     * игральный кубик
     * @param d количество граней
     * @return случайный номер грани
     */
    public static int roll(int d){
        int num = (int) (Math.random() * d) + 1;
        return num;
    }
}
