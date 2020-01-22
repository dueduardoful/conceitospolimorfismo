package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer GetroomNumber() {
		return roomNumber;
	}
	public void setroomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date GetcheckIn() {
		return checkIn;
	}
	public Date getcheckout() {
		return checkOut;
	}
	public long duration() {
		// diferença entre as duas data em miisegundos
		long diff = checkOut.getTime() - checkIn.getTime();
		// converter milisegundos para dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	
	
	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if (!checkOut.after(checkIn)) {
			return "Check-out date must be after check-in date";	
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null; // para indicar que nao teve erro retorna nullo
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	
}
