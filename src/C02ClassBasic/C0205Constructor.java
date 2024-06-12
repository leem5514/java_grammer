package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calender c = new Calender("2024","01","07");
//        c.setYear("2024");
//        c.setMonth("01");
//        c.setDay("07");
        System.out.println(c.getYear() + "년" + c.getMonth() + "월" + c.getDay()+"일");
    }

}
class Calender {
    private String year;
    private String month;
    private String day;

    // 생성자 : 클래스명과 동일, 초기화 하고 싶은 변수명 나열
    Calender(){
    } // -> 기본 내장 값으로 생략 가능

    // 별도의 생성자를 만들 경우, 초기생성자 를 따로 선언 필요
    Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    Calender(String year, String month) {
        this(year, month, null);
    }
    public String getYear() {
        return year;
    }

//    public void setYear(String year) {
//        this.year = year;
//    }

    public String getMonth() {
        return month;
    }

//    public void setMonth(String month) {
//        this.month = month;
//    }

    public String getDay() {
        return day;
    }

//    public void setDay(String day) {
//        this.day = day;
//    }


}

