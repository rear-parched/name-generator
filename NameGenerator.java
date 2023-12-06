public class NameGenerator {
    private FirstNameGenerator firstNameGenerator;
    private LastNameGenerator lastNameGenerator;

    public NameGenerator(FirstNameGenerator firstNameGenerator, LastNameGenerator lastNameGenerator) {
        this.firstNameGenerator = firstNameGenerator;
        this.lastNameGenerator = lastNameGenerator;
    }

    public String generateFullName() {
        String firstName = firstNameGenerator.generateFirstName();
        String lastName = lastNameGenerator.generateLastName();
        return firstName + " " + lastName;
    }
}
