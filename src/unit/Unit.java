package unit;

public class Unit
{
	private int hp;
	private int mp;
	private int speed;
	private int attack;
	private int defend;
	private int vision;

	public Unit(int hp, int mp, int speed, int attack, int defend, int vision)
	{
		setHp(hp);
		setMp(mp);
		setSpeed(speed);
		setAttack(attack);
		setDefend(defend);
		setVision(vision);
	}

	public int getHp()
	{
		return hp;
	}

	public void setHp(int hp)
	{
		this.hp = hp;
	}

	public int getMp()
	{
		return mp;
	}

	public void setMp(int mp)
	{
		this.mp = mp;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public int getAttack()
	{
		return attack;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	public int getDefend()
	{
		return defend;
	}

	public void setDefend(int defend)
	{
		this.defend = defend;
	}

	public int getVision()
	{
		return vision;
	}

	public void setVision(int vision)
	{
		this.vision = vision;
	}

	public String toString()
	{
		return String.format("%d,%d,%d,%d,%d,%d", hp, mp, speed, attack, defend, vision);
	}
}
