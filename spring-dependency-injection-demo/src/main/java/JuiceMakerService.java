public class JuiceMakerService {

	private Juice juice=null;
	
	/**dependency is injecting as a form of abstraction and that abstraction is 
	 * injected externally to the constructor
	 */
	public JuiceMakerService(Juice juice){
		this.juice=juice;
	}
	
	public void makeJuice(){
		this.juice.describeJuice();
	}
}
