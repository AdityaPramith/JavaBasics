public class arrays {
    public static void main(String[] Args){
    int scores[]={281, 344, 265, 272, 236, 324, 287};
    int sum=0;
    for(int score:scores){
        sum+=score;
    }
    int average=sum/scores.length;
    System.out.println("Average Score is "+average);
    int greater=0;
    int lesser=0;
    int equal=0;
    for(int score:scores){
        if(score>average)
            greater++;
        else if(score==average) 
            equal++;
        else
            lesser++;
    }
    System.out.println("Greater scores"+greater);
    System.out.println("Equal Scores"+equal);
    System.out.println("Less Scores"+lesser);
}
}