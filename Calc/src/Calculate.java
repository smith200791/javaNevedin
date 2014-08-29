import intf.Operation;
import intf.Viewer;
import factory.OperationFactory;
import factory.ViewerFactory;

/**
 * @author macbookretina
 * 
 */
public class Calculate {

    public Double result;

    public void ssumm(Integer firstParam, Integer secondParam) {
        result = (double) (firstParam + secondParam);
    }   

    public void executeOperation(String code, Integer... params) {
        OperationFactory operationFactory = new OperationFactory();
        if (params != null && params.length == 2) {
            Operation operation = operationFactory.createOperation(code, params[0], params[1]);
            result = operation.operate();
        }
    }

    public void viewLastResult(String viewCode) {
        ViewerFactory viewerFactory = new ViewerFactory();
        Viewer viewer = viewerFactory.createView(viewCode);
        viewer.onView(result);
        System.out.println("success");
    }

}
