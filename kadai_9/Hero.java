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
		System.out.println(this.name + "�̍U���I�I");
		System.out.println("������" + this.at + "�|�C���g�̃_���[�W��^�����I�I");
	}

	void defense() {
		System.out.println(this.name + "�͐g�������");
		this.df = this.df + 10;
		System.out.println("�h��͂��P�O�オ��A�h��͂�" + this.df + "�|�C���g�ɂȂ���");
	}

	void heal() {
		System.out.println(this.name + "�͋x�e����");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�񕜂��A" + this.hp + "�|�C���g�ɂȂ���");
	}
}