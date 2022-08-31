package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int d = year % 4;
        int d1 = year % 100;
        int d2 = year % 400;
        switch (d) {
            case 0: {
                if (d1 == 0) {
                    if (d2 == 0) {
                        System.out.println("leap");
                    } else {
                        System.out.println("not leap");
                    }
                } else {
                    System.out.println("leap");
                }
                break;
            }
            default: System.out.println("not leap");
        }
    }
}
