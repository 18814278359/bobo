//������
public class Dog {
	private String name="������";//�ǳ�
	private int health=100;//����ֵ��Ĭ��ֵ��1-100֮�䣬С��60Ϊ������
	private int love=0;//���ܶ�
	private String strain="��������������Ȯ";//Ʒ��
	
	//Ϊprivate�����Լ�һ��setter/getter
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setLove(int love){
		if(love<0){
			System.out.println("���ܶȲ���Ϊ������");
			this.love=60;
			return;
		}
		this.love=love;
	}
	public int getLove(){
		return this.love;
	}
	public void setStrain(String strain){
		this.strain=strain;
	}
	public String getStrain(){
		return this.strain;
	}
	public void setHealth(int health){
		if(health<0){
		System.out.println("����ֵ����Ϊ����");
			this.health=60;
			return;
		}
		this.health=health;
		}
	public int getHealth(){
			return this.health;
		}
	//�����������Ϣ
	public void print(){
		System.out.println("������԰ף�\n�ҵ����ֽ�"+this.name+",�ҵĽ���ֵ��"+this.health+",�����˵����ܶ���"+this.love+",����һֻ"+this.strain);
		
	}
	}


