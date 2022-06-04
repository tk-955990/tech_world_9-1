package kadai;

public class Magician {

	private String name;
	private int hp;
	private int at;
	private int mp;
	private int m_at;
	
	// 魔法での攻撃

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAt() {
		return this.at;
	}
	public void setAt(int at) {
		this.at = at;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getM_at() {
		return this.m_at;
	}
	public void setM_at(int m_at) {
		this.m_at = m_at;
	}
	
	
	
	
	
	
	void attack() {
		System.out.println(this.name + "の攻撃！！");
		System.out.println("相手に" + this.at + "ポイントのダメージを与えた！！");
	}

	void magic_Attack() { // 魔法攻撃
		System.out.println(this.name + "は魔法で攻撃した！");
		System.out.println("相手に" + this.m_at + "のダメージを与えた");
		this.mp = this.mp - 10;
		System.out.println("MPが１０ポイント消費し" + this.mp + "ポイントになった");
	}

	void magic_Recovery() { // 回復魔法
		System.out.println(this.name + "は魔法で回復した");
		this.hp = this.hp + 10;
		System.out.println(this.name + "の体力が１０ポイント回復した");
		this.mp = this.mp - 5;
		System.out.println(this.name + "のMPが５ポイント消費し" + this.mp + "ポイントになった");
	}

	void heal() {
		System.out.println(this.name + "は休憩をした");
		this.hp = this.hp + 10;
		System.out.println(this.name + "の体力が１０ポイント回復し、" + this.hp + "ポイントになった");
	}
}
