import java.sql.Connection;




class GestionBD {

    Connection AbrirBD
    {

    }
    Connection CerrarBD
    {

    }

}
class usersBDMysql extends GestionBD {

    void deleteUser(it id) {

    }

    void addUser(User newUser) {
        return null;

    }


    class usersBDMongo {

        void deleteUser(it id) {

        }
    
        void addUser(User newUser) {
            return null;
    
        }
    }


//Bajo acoplamiento alta cohesion
// -que nuestras clases no estén enganchadas
// -que nuestras clases solo hagan una cosa
    class user{


        String name;
        String surname;
        Date birthday;

        users[] listUsers() {
            return null;
    
        }

        int average(int[]valores){

        }
    }

}