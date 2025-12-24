import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://www.hackerrank.com/challenges/compare-the-triplets
public class CompareTriplets {
    public static List<Integer> compareWithIterator(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        Iterator<Integer> aScores = a.iterator();
        Iterator<Integer> bScores = b.iterator();

        List<Integer> answ = new ArrayList<>();

        while(aScores.hasNext() && bScores.hasNext()){
            Integer ai = (Integer) aScores.next();
            Integer bi = (Integer) bScores.next();

            if(ai.compareTo(bi) > 0){
                aliceScore++;
            }else if (ai.compareTo(bi) < 0){
                bobScore++;
            }

        }

        answ.add(aliceScore);
        answ.add(bobScore);
        return answ;
    }
}
