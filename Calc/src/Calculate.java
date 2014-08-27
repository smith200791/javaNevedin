import factory.ViewerFactory;

/**
 * @author macbookretina
 * 
 */
public class Calculate {

	public Integer result;

	public void ssumm(Integer firstParam, Integer secondParam) {
		result = firstParam + secondParam;
	}

	public void viewLastResult(String viewCode) {
		ViewerFactory viewerFactory = new ViewerFactory();
		viewerFactory.createView(viewCode);
	}

}
