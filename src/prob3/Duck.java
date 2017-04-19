package prob3;

public class Duck extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리("+this.getName()+")는 날지 않습니다.");
	}
}
