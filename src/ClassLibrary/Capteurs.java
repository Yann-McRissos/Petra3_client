package ClassLibrary;

public class Capteurs {

    private boolean L1;
    private boolean L2;
    private boolean T;	// broken
    private boolean S;
    private boolean CS;	// chariot stable
    private boolean AP;	// bras
    private boolean PP;	// plongeur
    private boolean DE;	// bac d'entrée
	private boolean H;

    public Capteurs() {
    }
	
	public void setEverythingOff()
	{
		setL1(false);
		setL2(false);
		setT(false);
		setS(false);
		setCS(false);
		setAP(false);
		setPP(false);
		setDE(false);
		setH(false);
	}

    public boolean getL1() {
        return L1;
    }

    public void setL1(boolean l1) {
        L1 = l1;
    }

    public boolean getL2() {
        return L2;
    }

    public void setL2(boolean l2) {
        L2 = l2;
    }

    public boolean getT() {
        return T;
    }

    public void setT(boolean t) {
        T = t;
    }

    public boolean getS() {
        return S;
    }

    public void setS(boolean s) {
        S = s;
    }

    public boolean getAP() {
        return AP;
    }

    public void setAP(boolean AP) {
        this.AP = AP;
    }

    public boolean getPP() {
        return PP;
    }

    public void setPP(boolean PP) {
        this.PP = PP;
    }

    public boolean getDE() {
        return DE;
    }

    public void setDE(boolean DE) {
        this.DE = DE;
    }

    public boolean getCS() {
        return CS;
    }

    public void setCS(boolean CS) {
        this.CS = CS;
    }
	
	public boolean getH() {
        return H;
    }

    public void setH(boolean H) {
        this.H = H;
    }
}
