package For_Practice.Day_6;

public class Student_attendance_record {
    public boolean checkRecord(String s) {
        int a_count=0;
        int l_count=0;
        if(s.contains("LLL")){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                 a_count++;
            }
            if(a_count>=2) return false;
        }
        return true;
    }
}
