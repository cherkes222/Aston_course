public class TaskNine {
    protected static boolean checkLeapYear(int a){
        if (a % 4 - a % 100 + a % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
