package kadai;

public class Hero {

	private String name;
	private int hp;
	private int at;
	private int df;

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
	public int getDf() {
		return this.df;
	}
	public void setDf(int df) {
		this.df = df;
	}
	
	
	
	
    
	void attack() {
		System.out.println(this.name + "の攻撃！！");
		System.out.println("怪物に" + this.at + "ポイントのダメージを与えた！！");
	}

	void defense() {
		System.out.println(this.name + "は身を守った");
		this.df = this.df + 10;
		System.out.println("防御力が１０上がり、防御力が" + this.df + "ポイントになった");
	}

	void heal() {
		System.out.println(this.name + "は休憩した");
		this.hp = this.hp + 10;
		System.out.println(this.name + "の体力が１０回復し、" + this.hp + "ポイントになった");
	}
}