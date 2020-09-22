
public class Engine {

	private Algorithm algo;
	
	
	public void search(String keyword) {
		
		if(algo == null)
	 
		
		algo.setKeyword(keyword);
		
		System.out.println(algo.getTopResult());
	}
	
	
	
	
}
