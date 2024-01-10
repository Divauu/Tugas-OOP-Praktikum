package ClassPBO.Enkapsulasi.TugasPraktikumBola;

public class Bola {
    private double jariJari;

    public Bola(){
        this.jariJari = 0.0;
    }

    public void setJariJari(double jariJari){
        if (jariJari > 0) {
            this.jariJari = jariJari;
        } else{
            System.out.println("Jari-jari harus lebih dari 0");
        }
    }

    public double showDiameter(){
        return 2 * jariJari;
    }

    public double showLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume(){
        return(4/3) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        double jariJariVariable = 5.0;
        Bola bolaObjek = new Bola();

        System.out.println("Diameter: "+bolaObjek.showDiameter());
        System.out.println("Luas permukaan: "+bolaObjek.showLuasPermukaan());
        System.out.println("Volume: "+bolaObjek.showVolume());

        bolaObjek.setJariJari(jariJariVariable);

        System.out.println("\nSetelah manipulasi: ");
        System.out.println("Diameter: "+bolaObjek.showDiameter());
        System.out.println("Luas permukaan: "+bolaObjek.showLuasPermukaan());
        System.out.println("Volume: "+bolaObjek.showVolume());


    }

}
