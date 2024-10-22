public class campanaAdultos extends campanaSalud{

    @Override
    public int planificarCampana(String tipoVacuna, int numeroPersonas) {
        int dosisPorPersona;
        switch (tipoVacuna.toLowerCase()) {
            case "gripe":
                dosisPorPersona = 1; // 1 dosis para la gripe
                break;
            case "Virus del Papiloma Humano":
                dosisPorPersona = 3; // 3 dosis para Virus del Papiloma Humano
                break;
            default:
                dosisPorPersona = 1; // Por defecto, 1 dosis
        }
        return numeroPersonas * dosisPorPersona;
    }
}
