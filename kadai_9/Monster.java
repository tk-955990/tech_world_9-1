package kadai;

public class Monster {

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
		System.out.println(this.name + "�̍U���I�I�I");
		System.out.println(this.at + "�|�C���g�̃_���[�W���󂯂�");
	}

	void defense() {
		System.out.println(this.name + "�͎����ł߂�");
		this.df = this.df + 10;
		System.out.println(this.name + "�̖h��͂��P�O�|�C���g�オ����");
	}
}
