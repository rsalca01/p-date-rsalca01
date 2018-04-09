package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;

	public int validDate(int day, int month, int year)throws Exception{
		StringBuffer excep = new StringBuffer();
		if((day > 31) || (day < 1)){
			excep.append("El dia no puede ser negativo ni mayor que 31, "+day+" es un dia no permitido");
		}
		if((month > 12) || (month < 1)){
			excep.append("El dia no puede ser negativo ni mayor que 12, "+month+" es un mes no permitido");
		}
		if(year < 1){
			excep.append("El año no puede ser negativo, "+year+" es un año no permitido");
		}
		if(excep.length()!=0){
			throw new Exception (excep.toString());
			
		}
		else{
			this.day=day;
			this.month=month;
			this.year=year;
		}
	return 0;
	}
	
	public Date(int day, int month, int year){
	this.day=day;
	this.month=month;
	this.year=year;
	}
	public int getYear(){
	return this.year;
	}
	public int getDay(){
	return this.day;
	}
	public int getMonth(){
	return this.month;
	}


	public boolean isSameYear(Date another){
		if (this.year == another.getYear() ){
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
	if((this.day==another.getDay())&&(this.month==another.getMonth())&&(this.year==another.getYear())){
		    return true;
		}
		return false;
		}
	
	

    public String getMonthName(){
	String month="";
	switch(this.month){
	case 1: month="Enero";
	    break;
	case 2: month="Febrero";
	    break;
	case 3: month="Marzo";
	    break;
	case 4: month="Abril";
	    break;
	case 5: month="Mayo";
	    break;
	case 6: month="Junio";
	    break;
	case 7: month="Julio";
	    break;
	case 8: month="Agosto";
	    break;
	case 9: month="Septiembre";
	    break;
	case 10: month="Octubre";
	    break;
	case 11: month="Noviembre";
	    break;
	case 12: month="Diciembre";
	    break;
	}
	return month;
    }
	public String isDayRight(){
		if((this.month == 1 || this.month == 3 || this.month == 5 || this.month==7 || this.month == 8 || this.month==10 || this.month == 12) && (this.day>31 || this.day<1)){
		return this.day +"is not correct for this month";
		}
		else if ((this.month==2) && ((this.day>29) || (this.day<1))){
		return this.day +"is not correct for this month";
		}
		else if((this.month == 4 || this.month == 6 || this.month == 9 || this.month==11) && (this.day>30 || this.day<1)){
		return this.day +"is not correct for this month";
		}
		else{
		return this.day +"is correct for this month";
		}
	}
	public String getSeasonName(){
	String season="otoño";
		if(this.month == 1 || this.month == 2 || this.month == 3){
			if((this.month == 3) && (this.day>=21)){
			season="es primavera";
			}
		season ="es invierno ";
		}
		else if (this.month==4 || this.month==5 || this.month==6){
			if((this.month == 6) && (this.day>=21)){
			season="es verano";
			}
		season="es primavera";
		}
		else if(this.month == 7 || this.month == 8 || this.month == 9){
			if((this.month == 9) && (this.day>=21)){
			season="es otoño";
			}
		season="es verano";
		}
		else if (this.month == 10 || this.month==11 || this.month == 12){
			if((this.month == 12) && (this.day>=21)){
			season="es invierno";
			}
		season="es otoño";
		}
	return season;
	}
	public String getMonthsLeft(){
	StringBuffer months;
	months=new StringBuffer();
		for(int i =this.month; i<=12; i++){
		months.append("\n");
		months.append(this.getMonthName());
		this.month=this.month+1;
		}
	return months.toString();
	}
	
	public int getDaysLeftOfMonth(){
	int cont=0;
	if(month==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
		for(int i = this.day+1; i<=31; i++){
			cont++;
		}
	}
	if(month==4 || month == 6 || month == 9 || month == 11 ){
		for(int i = this.day+1; i<=30; i++){
			cont++;
		}		
	} 
	if(month==2 ){
		for(int i = this.day+1; i<=29; i++){
			cont++;
		}
	}
	return cont;
	}	
	public int getNumberOfAttempsDoWhile(){
		int randomDay=0;
		int randomMonth=0;
		int attemps=0;
		do{
		 randomDay = (int) ((Math.random() * 31)+ 1);
		 randomMonth = (int) ((Math.random()* 12)+ 1);
		 attemps++;
		}while(randomDay != this.day && randomMonth != this.month);
		return attemps;
	}
	public int getNumberOfAttempsWhile(){
		int randomDay=0;
		int randomMonth=0;
		int attemps=0;
		while(randomDay != this.day && randomMonth != this.month){
			 randomDay = (int) ((Math.random() * 31)+ 1);
			 randomMonth = (int) ((Math.random()* 12)+ 1);
			 attemps++;
		}
		return attemps;
	}
	public int DaysPast(){
	int cont =0;
	int dias=0;
	if(this.month ==1){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont;
	}
	if(this.month ==2){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31;
	}
	if(this.month ==3){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28;
	}
	if(this.month ==4){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31;
	}
	if(this.month ==5){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30;
	}
	if(this.month ==6){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31;
	}
	if(this.month ==7){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30;
	}
	if(this.month ==8){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31;
	}
	if(this.month ==9){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31;
	}
	if(this.month ==10){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31+30;
	}
	if(this.month ==11){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31+30+31;
	}
	if(this.month ==12){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31+30+31+30;
	}
	return dias;
	}
	public String MonthsWithSameDays(){
	String meses="";
	if(this.month ==1){
		meses="marzo, mayo, julio, agosto, octubre, diciembre";
	}
	if(this.month ==3){
		meses="enero, mayo, julio, agosto, octubre, diciembre";
	}
	if(this.month ==5){
		meses="marzo, enero, julio, agosto, octubre, diciembre";
	}
	if(this.month ==7){
		meses="marzo, mayo, enero, agosto, octubre, diciembre";
	}
	if(this.month ==8){
		meses="marzo, mayo, julio, enero, octubre, diciembre";
	}
	if(this.month ==10){
		meses="marzo, mayo, julio, agosto, enero, diciembre";
	}
	if(this.month ==12){
		meses="marzo, mayo, julio, agosto, octubre, enero";
	}
	if(this.month ==2){
		meses="febrero";
	}
	if(this.month ==4){
		meses="junio, septiembre, noviembre";
	}
	if(this.month ==6){
		meses="abril, septiembre, noviembre";
	}
	if(this.month ==9){
		meses="junio, abril, noviembre";
	}
	if(this.month ==11){
		meses="junio, septiembre, abril";
	}
	return meses;
	}
	public String PrintDate(){
	StringBuffer date=new StringBuffer();
	date.append(Integer.toString(this.day) + "" + Integer.toString(this.month) + "" + Integer.toString(this.year));
	return date.toString();
	}
	public int dayOfWeek(){
	int cont =0;
	int dias=0;
	int dia=0;
	if(this.month ==1){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont;
	}
	if(this.month ==2){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31;
	}
	if(this.month ==3){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28;
	}
	if(this.month ==4){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31;
	}
	if(this.month ==5){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30;
	}
	if(this.month ==6){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31;
	}
	if(this.month ==7){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30;
	}
	if(this.month ==8){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31;
	}
	if(this.month ==9){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31;
	}
	if(this.month ==10){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31+30;
	}
	if(this.month ==11){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31+30+31;
	}
	if(this.month ==12){
		for(int i=1; i<this.day; i++){
			cont++;
		}
	dias=cont+31+28+31+30+31+30+31+31+30+31+30;
	}
	if(dias%7==0){
	dia=this.day;
	}
	if(dias%7==1){
	dia=this.day+1;
	}
	if(dias%7==2){
	dia=this.day+2;
	}
	if(dias%7==3){
	dia=this.day+3;
	}
	if(dias%7==4){
	dia=this.day+4;
	}
	if(dias%7==5){
	dia=this.day+5;
	}
	if(dias%7==6){
	dia=this.day+6;
	}
	return dia;
	}
}	
	
	
	
