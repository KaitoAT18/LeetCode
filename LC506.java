import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC506 {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        HashMap<Integer, String> hashMap = new HashMap<>();

        int[] sortScore = new int[score.length];

        for (int i = 0; i < sortScore.length; i++) {
            sortScore[i] = score[i];
        }
        Arrays.sort(sortScore);

        int count = 0;
        for (int i = sortScore.length - 1; i >= 0; i--) {
            count++;
            if (count == 1) {
                hashMap.put(sortScore[i], "Gold Medal");
            } else if (count == 2) {
                hashMap.put(sortScore[i], "Silver Medal");
            } else if (count == 3) {
                hashMap.put(sortScore[i], "Bronze Medal");
            } else {
                hashMap.put(sortScore[i], Integer.toString(count));
            }
        }

        for (int i = 0; i < score.length; i++) {
            ans[i] = hashMap.get(score[i]);
        }

        return ans;
    }
}
