
public class campanaSalud {

    // 1.Método que acepte el número de personas a vacunar y la cantidad de dosis por persona, y devuelva la cantidad total de dosis necesarias.
    public int planificarCampana(int numeroPersonas, int dosisPorPersona) {
        return numeroPersonas * dosisPorPersona;
    }

    // 2.Método que acepte el tipo de vacuna
    public int planificarCampana(String tipoVacuna, int numeroPersonas) {
        int dosisPorPersona;
        switch (tipoVacuna.toLowerCase()) {
            case "covid-19":
                dosisPorPersona = 2; // 2 dosis para COVID-19
                break;
            case "gripe":
                dosisPorPersona = 1; // 1 dosis para la gripe
                break;
            case "polio":
                dosisPorPersona = 3; // 3 dosis para Polio
                break;
            default:
                dosisPorPersona = 1; // Por defecto, 1 dosis
        }
        return numeroPersonas * dosisPorPersona;
    }
    // Método poliformismo
    public double calcularPresupuesto(int totalDosis, double costoPorDosis) {
        return totalDosis * costoPorDosis;
    }
}