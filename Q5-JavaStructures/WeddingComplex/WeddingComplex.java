
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> menPref, Map<String, List<String>> womenPref) {
        Deque<String> freeMen = new ArrayDeque<>(menPref.keySet());
        Map<String, String> engagements = new HashMap<>();

        Map<String, Map<String, Integer>> womenRankings = getWomenRankings(womenPref);
        Map<String, Integer> menProposals = menPref.keySet().stream()
                .collect(Collectors.toMap(man -> man, man -> 0));

        while (!freeMen.isEmpty()) {
            String man = freeMen.poll(); 
            List<String> manPrefList = menPref.get(man);
            int proposalIndex = menProposals.get(man);
            if (proposalIndex < manPrefList.size()) {
                String woman = manPrefList.get(proposalIndex); 
                if (!engagements.containsKey(woman)) {
                    engagements.put(woman, man);
                } else {
                    String currentPartner = engagements.get(woman);
                    Map<String, Integer> womanRanks = womenRankings.get(woman);
                    if (womanRanks.get(man) < womanRanks.get(currentPartner)) {
                        engagements.put(woman, man);
                        freeMen.add(currentPartner); 
                    } else {       
                        freeMen.add(man);
                    }
                }
                menProposals.put(man, proposalIndex + 1);
            }
        }
        return engagements.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    private static Map<String, Map<String, Integer>> getWomenRankings(Map<String, List<String>> womenPref) {
        Map<String, Map<String, Integer>> womenRankings = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : womenPref.entrySet()) {
            String woman = entry.getKey();
            List<String> Pref = entry.getValue();
            Map<String, Integer> ranks = new HashMap<>();
            for (int i = 0; i < Pref.size(); i++) {
                ranks.put(Pref.get(i), i);
            }
            womenRankings.put(woman, ranks);
        }
        return womenRankings;
    }
}
