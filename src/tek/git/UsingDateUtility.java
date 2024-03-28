package tek.git;

import tek.git.utility.DateUtility;

import java.time.LocalDateTime;

public class UsingDateUtility {

    public static void main(String[] args) {
        DateUtility utility = new DateUtility();
        LocalDateTime now =utility.now();
        System.out.println("Day of the Month is "
                + now.getDayOfMonth());
    }
}
