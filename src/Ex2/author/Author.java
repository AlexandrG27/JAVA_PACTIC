package Ex2.author;

public class Author {
    public static void main(String[] args) {
    }
    private String name, email;
    private char gender;
    public Author(String name, String email, char gander)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {this.email = email;}
    public char getGender() {
        return gender;
    }

    public String toString() {
        return email +" " + name +" "+gender;
    }
}

