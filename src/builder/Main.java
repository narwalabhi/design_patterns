package builder;

public class Main {

    public static void main(String[] args) {
        try {
            StudentBuilder studentBuilder = StudentBuilder.builder()
                    .firstName("Abhishek")
                    .age(20)
                    .batchName("B1")
                    .collegeName("LPU")
                    .passingOutYear(2021)
                    .build();
            System.out.println(studentBuilder);
        } catch (InvalidPassingOutYearException e) {
            System.out.println("Invalid passing out year");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age");
        } catch (InvalidFirstNameException e) {
            System.out.println("Invalid first name");
        } catch (InvalidCollegeNameException e) {
            System.out.println("Invalid college name");
        }
    }

}
