package model.exceptions;

public class DomainException extends Exception {
	
//	RuntimeException --> � UM TIPO DE EXCE��O QUE O COMPILADOR N�O OBRIGA A TRATAR
//	Exception --> O COMPILADOR VAI TER QUE SER OBRIGADO A TRATAR
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
	

}
