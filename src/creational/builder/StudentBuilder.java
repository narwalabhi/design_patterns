package creational.builder;

public class StudentBuilder {

    private String firstName;
    private String secondName;
    private int age;
    private int passingOutYear;
    private int psp;
    private String collegeName;
    private String batchName;

    public StudentBuilder(String firstName, String secondName, int age, int passingOutYear, int psp, String collegeName, String batchName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.passingOutYear = passingOutYear;
        this.psp = psp;
        this.collegeName = collegeName;
        this.batchName = batchName;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", passingOutYear=" + passingOutYear +
                ", psp=" + psp +
                ", collegeName='" + collegeName + '\'' +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String secondName;
        private int age;
        private int passingOutYear;
        private int psp;
        private String collegeName;
        private String batchName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder passingOutYear(int passingOutYear) {
            this.passingOutYear = passingOutYear;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder collegeName(String collegeName) {
            this.collegeName = collegeName;
            return this;
        }

        public Builder batchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        private void verify() throws InvalidPassingOutYearException, InvalidAgeException, InvalidFirstNameException, InvalidCollegeNameException {
            if(passingOutYear > 2023){
                throw new InvalidPassingOutYearException();
            }
            if(age < 18){
                throw  new InvalidAgeException();
            }
            if(firstName == null){
                throw new InvalidFirstNameException();
            }
            if(collegeName == null){
                throw new InvalidCollegeNameException();
            }
        }

        public StudentBuilder build() throws InvalidPassingOutYearException, InvalidAgeException, InvalidFirstNameException, InvalidCollegeNameException {
            verify();
            return new StudentBuilder(firstName, secondName, age, passingOutYear, psp, collegeName, batchName);
        }

    }

}
