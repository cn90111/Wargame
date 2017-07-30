package map;

public class Lattice
{
	public static int FLAT = 0;
	public static int MOUNTAIN = 1;
	public static int WATER = 2;

	private int terrain;
	private boolean canGoThrough;
	private boolean canStand;

	public Lattice(int terrain)
	{
		setTerrain(terrain);
		canGoThrough = true;
		canStand = true;
	}
	
	public int getTerrain()
	{
		return terrain;
	}

	public void setTerrain(int terrain)
	{
		this.terrain = terrain;
	}

	public boolean isCanGoThrough()
	{
		return canGoThrough;
	}

	public void setCanGoThrough(boolean canGoThrough)
	{
		this.canGoThrough = canGoThrough;
	}

	public boolean isCanStand()
	{
		return canStand;
	}

	public void setCanStand(boolean canStand)
	{
		this.canStand = canStand;
	}

	public String toString()
	{
		return String.format("%d", terrain);
	}
}
