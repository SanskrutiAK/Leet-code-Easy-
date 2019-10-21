public class BaseBall {
    public int calPoints(String[] ops) {
        int score = 0;
        int roundZero = 0;
        int roundOne = 0;
        int roundTwo = 0;
        int lastValidScore = 0;
        for(int i = 0; i<ops.length;i++){
            String operation = ops[i];
            if(operation.equals("+")){
                score = score +(roundOne+roundTwo);
                lastValidScore = (roundOne+roundTwo);
            }
            else if(operation.equals("D")){
                score = score +(2*roundTwo);
                lastValidScore = (2*lastValidScore);
            }
            else if(operation.equals("C")){
                score = score - lastValidScore;
                lastValidScore = roundOne;
                roundTwo = lastValidScore;
                roundOne = roundZero;
                continue;
            }
            else{
                score = score + Integer.parseInt(operation);
                lastValidScore = Integer.parseInt(operation);
            }
            roundZero = roundOne;
            roundOne = roundTwo;
            roundTwo = lastValidScore;

        }
        return score;
    }
    public static void main(String[] args) {
        BaseBall bb = new BaseBall();
        String[] scoreboard = new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(bb.calPoints(scoreboard));
    }
}
