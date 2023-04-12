import java.security.InvalidParameterException;
import java.sql.Date;

class Subject {
    String name, address, cif;

}

class Article {
    String name;
    Float price;
}

public class Bill {
    String cod;
    Date date;
    Subject subject;
    Article[] articles;

    public float calculateTotal() {
        float total = 0;
        for (Article article : articles) {
            total += article.price;
        }
        return total;
    }

    static String[] diasSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

    public static String getNameDayOfWeek(int numberDayOfWeek) {
        if (numberDayOfWeek > 7 || numberDayOfWeek < 1) {
            throw new InvalidParameterException("Numero de día inválido");
        }
        String dia = diasSemana[numberDayOfWeek - 1];

        return dia;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
