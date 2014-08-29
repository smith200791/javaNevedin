package operations;

import intf.Operation;

public class Multiply implements Operation {

	protected Integer firstAgr;
	protected Integer seconArg;
	
	
    protected Integer getFirstAgr() {
        return firstAgr;
    }


    protected void setFirstAgr(Integer firstAgr) {
        this.firstAgr = firstAgr;
    }


    protected Integer getSeconArg() {
        return seconArg;
    }


    protected void setSeconArg(Integer seconArg) {
        this.seconArg = seconArg;
    }


    @Override
	public Double operate() {
		if (firstAgr!=null && seconArg!=null) {
			return (double) (firstAgr*seconArg);			
		}
		return null;
	}

}
