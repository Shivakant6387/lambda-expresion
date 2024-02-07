package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        int policyTerm = 3;
        String startDateString="2024-01-25";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = dateFormat.parse( startDateString);

        // Convert startDate to Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        // Add policyTerm years to startDate
        calendar.add(Calendar.YEAR, policyTerm);
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        // Now, calendar.getTime() holds the result as a Date
        Date policyEndDate = calendar.getTime();

        // Print the results for verification
        System.out.println("Policy Start Date: " + startDate);
        System.out.println("Policy End Date: " + policyEndDate);
    }
}