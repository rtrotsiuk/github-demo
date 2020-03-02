import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeTask1 {
    public static void main(String[] args) throws Exception {

        String month = readLine();
        Season season = deriveSeason(month);
        printSeason(season);

    }

    public static String readLine() throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        return rd.readLine();

    }

    public static Season deriveSeason(String month) {
        Season season = null;

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
        }
        return season;

    }

    public static void printSeason(Season season) {
        String result = (season == null) ? "No this month" : season.toString();
        System.out.println(result);
    }

}