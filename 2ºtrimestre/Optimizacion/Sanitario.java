public class Sanitario {

    private Sanitario jefe;
    private int sueldo_bruto;

    class enfermero extends Sanitario {
        private int inyeccionesSuministradas;

    }

    class medicoFamilia extends Sanitario {
        private int numeroGuardias;
        private Sanitario[] sanitariosACargo;

    }

    class cirujano extends Sanitario {
        private int numeroGuardias;
        private int numeroOperaciones;
        private Sanitario[] sanitariosACargo;

    }

    Sanitario(int numeroGuardias, int numeroOperaciones, Sanitario[] sanitariosACargo, Sanitario jefe,
            int inyeccionesSuministradas, int sueldo_bruto) {
        this.numeroGuardias = numeroGuardias;
        this.numeroOperaciones = numeroOperaciones;
        this.sanitariosACargo = sanitariosACargo;
        this.jefe = jefe;
        this.inyeccionesSuministradas = inyeccionesSuministradas;
        this.sueldo_bruto = sueldo_bruto;
    }

}
