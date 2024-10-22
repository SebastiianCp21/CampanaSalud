public class campanaInfantil extends campanaSalud{

    @Override
    public int planificarCampana(String tipoVacuna, int numeroPersonas) {
        int dosisPorPersona;
        switch (tipoVacuna.toLowerCase()) {
            case "Neumococo":
                dosisPorPersona = 4; // 4 dosis para Neumococo
                break;
            case "varicela":
                dosisPorPersona = 2; // 2 dosis para varicela
                break;
            default:
                dosisPorPersona = 1; // Por defecto, 1 dosis
        }
        return numeroPersonas * dosisPorPersona;
    }
}
