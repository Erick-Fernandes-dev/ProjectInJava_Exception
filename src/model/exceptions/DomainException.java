package model.exceptions;

public class DomainException extends Exception {
	
//	RuntimeException --> É UM TIPO DE EXCEÇÃO QUE O COMPILADOR NÃO OBRIGA A TRATAR
//	Exception --> O COMPILADOR VAI TER QUE SER OBRIGADO A TRATAR
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
	

}
