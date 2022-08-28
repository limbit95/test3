import java.util.StringTokenizer;

public class wow2 {
    public static void main(String[] args) {

        String[] member = {"hong,홍길동,30", "lee,이순신,40", "kim,김유신,50"};
        String[] newMember = new String[member.length];
        int[] ageLst = new int[member.length];
        int ageSum = 0;
        String[] temp = new String[member.length];

        for (int i = 0; i < member.length; i++){
            StringTokenizer st = new StringTokenizer(member[i], ",");

            while (st.hasMoreTokens()){
                for (int x = 0; x < member.length; x++){
                    temp[x] = st.nextToken();
                }
            }
            newMember[i] = temp[1];
            ageLst[i] = Integer.valueOf(temp[2]);
        }

        for (int i = 0; i < member.length; i++){
            System.out.println(newMember[i]);
            ageSum += ageLst[i];
        }
        System.out.println(ageSum / member.length);
    }
}
