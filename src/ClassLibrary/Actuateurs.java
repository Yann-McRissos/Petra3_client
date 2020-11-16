package ClassLibrary;

public class Actuateurs {

    private int CP; //Chariot
    private boolean C1 = false; //Conv1
    private boolean C2 = false; //Conv2
    private boolean PV = false; //Ventouse
    private boolean PA = false; // Truc su le chariot
    private boolean AA = false; // Grapin sur Arbre

    public Actuateurs() {
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {

        if(CP >  0 || CP < 4)
        {
            System.out.println( CP + ": Valeur incorrecte");
        }
        else
        {
            this.CP = CP;
        }
    }

    public boolean getC1() {
        return C1;
    }

    public void setC1(boolean c1) {
        C1 = c1;
    }

    public boolean getC2() {
        return C2;
    }

    public void setC2(boolean c2) {
        C2 = c2;
    }

    public boolean getPV() {
        return PV;
    }

    public void setPV(boolean PV) {
        this.PV = PV;
    }

    public boolean getPA() {
        return PA;
    }

    public void setPA(boolean PA) {
        this.PA = PA;
    }

    public boolean getAA() {
        return AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }
}
