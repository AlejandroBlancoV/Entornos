
class Armadura {
    String tipoArmadura;
    int durabilidadArmadura;
    int calidadArmadura;

}

class EnemigoNormal extends Enemigo {
    float calculapotenciagolpe() {
        return golpeBase * vida;
    }
}

class EnemigoBoss extends Enemigo {
    float calculapotenciagolpe() {
        return golpeBase * 8 * vida;
    }
}

class EnemigoFinalBoss extends Enemigo {
    float calculapotenciagolpe() {
        return golpeBase * 20 * vida;
    }
}

abstract class Enemigo {

    Armadura armadura = new Armadura();

    float vida = 100; // vida del enemigo
    float golpeBase = 40;
    private boolean muerto = false;

    enum TipoEnemigo {
        NORMAL, BOSS, FINAL_BOSS
    };

    TipoEnemigo tipoEnemigo;

    abstract float calculapotenciagolpe();

    boolean estaMuerto() {
        return muerto;
    }

}

public class Principal {

    void matar(Enemigo enemigo) {
        System.out.println("Murió el enemigo ");
    }

    public static void main(String[] args) {
        EnemigoNormal stromTrooper1 = new EnemigoNormal();
        EnemigoNormal stromTrooper2 = new EnemigoNormal();
        EnemigoFinalBoss darthVader = new EnemigoFinalBoss();
        Enemigo jarjarbean = new EnemigoBoss();
        matar(darthVader);
    }
}
