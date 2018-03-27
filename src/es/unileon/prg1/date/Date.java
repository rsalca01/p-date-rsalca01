package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	
	}
    r
	
	public int getYear(){
		return this.year;
	}

	public boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
   public boolean isSameMonth(Date another){
	if(this.month == another.getMonth()){
	    return true;
	}
	return false;
    }
    public boolean isSameDay(Date another){
	if(this.day == another.getDay()){
	    return true;
	}
	return false;
    }
    public boolean isSame(Date another){
	if((this.day==another.getDay()&&(this.month==another.getMonth)&&(this.year==another.getYear()){
		    return true;
		}
		return false;
		}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

    public String getMonthName(){
	switch(this.month){
	case 1: this.month="Enero";
	    break;
	case 2: this.month="Febrero";
	    break;
	case 3: this.month="Marzo";
	    break;
	case 4: this.month="Abril";
	    break;
	case 5: this.month="Mayo";
	    break;
	case 6: this.month="Junio";
	    break;
	case 7: this.month="Julio";
	    break;
	case 8: this.month="Agosto";
	    break;
	case 9: this.month="Septiembre";
	    break;
	case 10: this.month="Octubre";
	    break;
	case 11: this.month="Noviembre";
	    break;
	case 12: this.month="Diciembre";
	    break;
    }

}
