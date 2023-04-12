
class User {
    User(String nombre, String pass) {
    }

    String nombre;
    String email;
    String password;
}

public class UserCreator {
    boolean valid(String valor) {
        return valor != null && valor.length() > 0;
    }

    User create(String email, String pass) throws Exception {
        if (!valid(email))
            throw new Exception("Email incorrecto");

        if (!valid(pass))
            throw new Exception("Password incorrecto");

        else {
            return new User(email, pass);
        }

    }
}
