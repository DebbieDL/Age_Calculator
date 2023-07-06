import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Example:");
            System.out.println("1/1/2001");

        //  This array holds the number of days in each month

        int[] daysInMonth = new int[12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;





            //the data members

            int yearOfBirth;
            int monthOfBirth;
            int dayOfBirth;

            int currentYear;
            int currentMonth;
            int currentDay;
            int year;
            int month;
            int day = 0;
            int months;
            int days;

            //input section

            System.out.println("Enter day of birth");
            dayOfBirth = Integer.parseInt(sc.nextLine());
            System.out.println("Enter month of birth");
            monthOfBirth = Integer.parseInt(sc.nextLine());
            System.out.println("Enter year of birth");
            yearOfBirth = Integer.parseInt(sc.nextLine());


            System.out.println("Enter current day");
            currentDay = Integer.parseInt(sc.nextLine());
            System.out.println("Enter current month");
            currentMonth = Integer.parseInt(sc.nextLine());
            System.out.println("Enter current year");
            currentYear = Integer.parseInt(sc.nextLine());

        // print section

            System.out.println("Date of birth");
            System.out.println(dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);


            System.out.println("Today:");
            System.out.println(currentDay + "/" + currentMonth + "/" + currentYear);

            //Calculations

            //calculating the years

            year = currentYear - yearOfBirth;

            //calculating months

            month = (12 - monthOfBirth) + currentMonth;
            //if the user is more than 12 months old this will subtract twelve and will get the rest as a month less than twelve
            if (month >= 12) {

                month = month - 12;

            }



                if (currentMonth < monthOfBirth) {
                    year = (currentYear - yearOfBirth) - 1;

                }

        //Here we calculate the number of days

           day = daysInMonth[monthOfBirth -1] -dayOfBirth + currentDay;
            if (day > daysInMonth[currentMonth-1]) {
                day = day - daysInMonth[currentMonth-1];
                month++;
            }
            //this will make the month go down with one for the rest of the days does not make a full month
            if (day > 0) {
                month--;
            }

        //Here we calculate the total number of months

            months = (year*12) + month;

            System.out.println();
            System.out.println("You are:");
            System.out.println();
            System.out.println(year + " years, " + month + " month, " + day + " days old");
            System.out.println();
            System.out.println("Or:");
            System.out.println();
            System.out.println("You are:");
            System.out.println();
            System.out.println(months+" months old");


            //Calculation of the total number of days

            days = year*365 + day;

            //Here we transform the months in days
                for (int i = 0; i < month; i++) {
                    days = days + daysInMonth[i];
                }

                System.out.println();
                System.out.println("Or");
                System.out.println();
                System.out.println(days+" days old");


        }
        catch(Exception e ){
            System.out.println("Oops , something went wrong!");
        }
        finally{
            sc.close();
        }

    }


}