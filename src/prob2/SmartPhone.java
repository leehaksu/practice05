package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if("통화".equals(function))
		{
			super.execute(function);
		}
		else
		{
			playMusic();
		}		
	}

	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악 재생");
	}
	
	
}
