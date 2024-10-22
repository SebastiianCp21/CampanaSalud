public class main {
    public static void main(String[] args) {

        campanaInfantil campanaInfantil = new campanaInfantil();
        int dosisInfantil = campanaInfantil.planificarCampana(200, 2);
        System.out.println("Dosis necesarias para la campaña infantil: " + dosisInfantil);

        campanaAdultos campanaAdultos = new campanaAdultos();
        int dosisAdultos = campanaAdultos.planificarCampana("gripe", 300);
        System.out.println("Dosis necesarias para la campaña de adultos: " + dosisAdultos);

        double presupuestoInfantil = campanaInfantil.calcularPresupuesto(dosisInfantil, 10000.0);
        System.out.println("Presupuesto total para la campaña infantil: $" + presupuestoInfantil);

        double presupuestoAdultos = campanaAdultos.calcularPresupuesto(dosisAdultos, 20000.0);
        System.out.println("Presupuesto total para la campaña de adultos: $" + presupuestoAdultos);
    }
}
