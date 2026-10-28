
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);
        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());

        boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();
        boolean backlogsPass = candidate.getBacklogs() <= job.getMaximumBacklogs();
        boolean yearPass = candidate.getGraduationYear() == job.getRequiredGraduationYear();
        boolean eligible = percentagePass && backlogsPass && yearPass;

        System.out.println("============================================================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("============================================================================");
        System.out.println();

        System.out.println("Candidate:" + candidate.getName());
        System.out.println("Company  :" + job.getCompany());
        System.out.println("Role     :" + job.getRole());
        System.out.println();

        if (percentagePass) {
            System.out.println("Percentage      : PASS");
        } else {
            System.out.println("Percentage      : FAIL");
        }

        if (backlogsPass) {
            System.out.println("Backlogs        : PASS");
        } else {
            System.out.println("Backlogs        : FAIL");
        }

        if (yearPass) {
            System.out.println("Graduation Year : PASS");
        } else {
            System.out.println("Graduation Year : FAIL");
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("============================================================================");

        scanner.close();
    }
}
