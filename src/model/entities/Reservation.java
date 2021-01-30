package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return this.roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	
	public long duration() {
		
		long diff = this.checkOut.getTime() - this.checkIn.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) throws DomainException {
		
//		SEGUNDA SOLUÇÃO - RUIM
		Date now = new Date();//VAI APRESENTAR A DATA ATUAL
		
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation date for updates must be future dates");
			
		} 
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
			
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
		
//		FIM DA SEGUNDA SOLUÇÃO
	}

	@Override
	public String toString() {
		return "Room " + roomNumber +
					", checkIn: " + sdf.format(checkIn) +
					", checkOut: " + sdf.format(checkIn) + 
					", duration: " + duration() + " nights";
	}
	
	
	
	

}
