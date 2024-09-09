public class Data {
    private int day;
    private int month;
    private int year;

    public static int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Data(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void printData() {
        System.out.println((day < 10 ? "0" : "") + day + "/" + (month < 10 ? "0" : "") + month + "/" + year);
        
    }

    public void getRemainingDayYear() {

        int remainingDays = 0;
        int[] dpm = daysPerMonth.clone();
    
        // Contar os dias restantes do mês atual
        remainingDays += (dpm[month - 1] - day);

        // Somar os dias dos meses restantes até o fim do ano
        for (int i = month; i < 12; i++) {
            remainingDays += dpm[i];
        }

        System.out.println(remainingDays);
    }

}