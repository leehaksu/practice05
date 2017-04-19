package prob3;

public abstract class Bird {
	
	private String name;
	
	public abstract void fly();
	
	
	
	
	public String toString()
	{
		String bird;
		if(name.equals("꽥꽥"))
		{
			bird="오리";
		}else
		{
			bird="참새";
		}		
		return bird+"의 이름은 "+name+"입니다.";
	}
	public  void sing()
	{
		String bird;
		if(name.equals("꽥꽥"))
		{
			bird="오리";
		}else
		{
			bird="참새";
		}
		System.out.println(bird+"("+name+"가 소리내어 웁니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
