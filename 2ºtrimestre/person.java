public class person {
    String name;
    String surname;
    String direction;

    private String getInitial(String text) {
        return text.toLowerCase().trim().charAt(0) + "";
    }

    public String getInitials() {
        String firstLetterOfName = getInitial(name);
        String firstLetterOfSurname = getInitial(surname);

        // System.out.println(firstLetterOfName + " " + firstLetterOfSurname);
        return firstLetterOfName + " " + firstLetterOfSurname;
    }
}
