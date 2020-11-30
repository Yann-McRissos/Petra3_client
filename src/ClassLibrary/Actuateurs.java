package ClassLibrary;

public class Actuateurs 
{
	private static int BACENTREE = 11;
	private static int CONV1 = 12;
	private static int BACKO = 13;
	private static int CONV2 = 14;
	
	private boolean C1;
	private boolean C2;
	private boolean VENTOUSE;
	private boolean PLONGEUR;
	private boolean BRAS;
	private boolean GRAPPIN;
	private int CHARIOT;
	
	public Actuateurs()
	{
	}

	public static int getBACENTREE()
	{
		return BACENTREE;
	}

	public static void setBACENTREE(int aBACENTREE)
	{
		BACENTREE = aBACENTREE;
	}

	public static int getCONV1()
	{
		return CONV1;
	}

	public static void setCONV1(int aCONV1)
	{
		CONV1 = aCONV1;
	}

	public static int getBACKO()
	{
		return BACKO;
	}

	public static void setBACKO(int aBACKO)
	{
		BACKO = aBACKO;
	}

	public static int getCONV2()
	{
		return CONV2;
	}

	public static void setCONV2(int aCONV2)
	{
		CONV2 = aCONV2;
	}

	public boolean isC1()
	{
		return C1;
	}

	public void setC1(boolean C1)
	{
		this.C1 = C1;
	}

	public boolean isC2()
	{
		return C2;
	}

	public void setC2(boolean C2)
	{
		this.C2 = C2;
	}

	public boolean isVENTOUSE()
	{
		return VENTOUSE;
	}

	public void setVENTOUSE(boolean VENTOUSE)
	{
		this.VENTOUSE = VENTOUSE;
	}

	public boolean isPLONGEUR()
	{
		return PLONGEUR;
	}

	public void setPLONGEUR(boolean PLONGEUR)
	{
		this.PLONGEUR = PLONGEUR;
	}

	public boolean isBRAS()
	{
		return BRAS;
	}

	public void setBRAS(boolean BRAS)
	{
		this.BRAS = BRAS;
	}

	public boolean isGRAPPIN()
	{
		return GRAPPIN;
	}

	public void setGRAPPIN(boolean GRAPPIN)
	{
		this.GRAPPIN = GRAPPIN;
	}

	public int getCHARIOT()
	{
		return CHARIOT;
	}

	public void setCHARIOT(int CHARIOT)
	{
		this.CHARIOT = CHARIOT;
	}
}
