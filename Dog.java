//宠物类
public class Dog {
	private String name="无名氏";//昵称
	private int health=100;//健康值，默认值是1-100之间，小于60为不健康
	private int love=0;//亲密度
	private String strain="聪明的拉布拉多犬";//品种
	
	//为private的属性加一对setter/getter
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setLove(int love){
		if(love<0){
			System.out.println("亲密度不能为负数！");
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
		System.out.println("健康值不能为负数");
			this.health=60;
			return;
		}
		this.health=health;
		}
	public int getHealth(){
			return this.health;
		}
	//输出狗狗的信息
	public void print(){
		System.out.println("宠物的自白：\n我的名字叫"+this.name+",我的健康值是"+this.health+",和主人的亲密度是"+this.love+",我是一只"+this.strain);
		
	}
	}


