public class RobotReturnTwoOrigin {
    public boolean judgeCircle(String moves) {
        int X = 0, Y = 0;
        for(int i = 0; i < moves.length(); i++) {
            char m = moves.charAt(i);
            if(m== 'U') {
                X += 1;
            }
            if(m== 'D') {
                X -=1;
            }
            if(m== 'R') {
                Y += 1;
            }
            if(m== 'L') {
                Y -=1;
            }
        }
        return (X==0&&Y==0);
    }
}
