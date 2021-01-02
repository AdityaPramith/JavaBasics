public class typeCast {
    public static void main(String Args[]){
    int num='c';
    System.out.println(num); 
    long regId = num;//Int to Long Implicit Type Casting
    System.out.println(regId);
    int iRegId = (int)regId;    // Explicit Type Casting
    System.out.println(iRegId);
    int totalMarks= 779;
    float percentage = ((float)totalMarks/800) * 100; 
    System.out.println(percentage);
    int iPer=(int)percentage;
    System.out.println(iPer);
    char ch = 'c';
    int num2 = 88;
    ch = (char)num2;
    System.out.println(ch);
    }
}
