/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int getYear(){
        return y;
    }

    public int getMonth(){
        return m;
    }

    public int getDay(){
        return d;
    }

    public int compareTo(Date date){
        int[] dateInfo = new int[6];
        dateInfo[0] = y;
        dateInfo[1] = m;
        dateInfo[2] = d;
        dateInfo[3] = date.getYear();
        dateInfo[4] = date.getMonth();
        dateInfo[5] = date.getDay();

        int date2 = 3;
        for(int index = 0; index < 6; index ++){
            if(dateInfo[index] < dateInfo[date2]) return -1;
            if(dateInfo[index] > dateInfo[date2]) return 1;
        }
        return 0;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}