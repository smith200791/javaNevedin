package operations;

import intf.Operation;

public class Multiply implements Operation {

	protected Integer firstAgr;
	protected Integer seconArg;
	
	/**
	 * @return the firstAgr
	 */
	protected Integer getFirstAgr() {
		return firstAgr;
	}

	/**
	 * @param firstAgr the firstAgr to set
	 */
	protected void setFirstAgr(Integer firstAgr) {
		this.firstAgr = firstAgr;
	}

	/**
	 * @return the seconArg
	 */
	protected Integer getSeconArg() {
		return seconArg;
	}

	/**
	 * @param seconArg the seconArg to set
	 */
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
