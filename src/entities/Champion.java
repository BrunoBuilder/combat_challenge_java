package entities;

public class Champion {
	
	private String name;
	private Integer life;
	private Integer attack;
	private Integer armor;
	
	public Champion(String name, Integer life, Integer damage, Integer armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public Integer getLife() {
		return life;
	}

	public Integer getAttack() {
		return attack;
	}

	public Integer getArmor() {
		return armor;
	}
	
	public void takeDamage(Champion other) {
		if(other.attack > (life + armor)) {
			life = 0;
		}
		else if(armor >= other.attack) {
			life -= 1;
		} else {
			life = life + armor - other.attack;
		}
	}
	
	public String status() {
		String result = name + ": " + life + " life ";
		if(life == 0) {
			result += "(died)";
		}
		return result;
	}

}
