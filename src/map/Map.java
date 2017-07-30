package map;

public class Map
{
	private Lattice[][] lattice;

	public Map(int length, int width)
	{
		lattice = new Lattice[length][width];
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j < width; j++)
			{
				lattice[i][j] = new Lattice(Lattice.FLAT);
			}
		}
	}

	public String toString()
	{
		StringBuilder map = new StringBuilder();
		for (int i = 0; i < lattice.length; i++)
		{
			for (int j = 0; j < lattice[i].length; j++)
			{
				map.append(lattice[i][j]);
				map.append(" ");
			}
			map.append("\n");
		}
		return map.toString();
	}
}
