
public class Algorithm {

	private String keyword;
	
	
	public Algorithm(){
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	public String getTopResult() {
		String result = "winner winner chicken dinner";
		
		return result + " of " + keyword;
		
		
	}
	
	
	
}
