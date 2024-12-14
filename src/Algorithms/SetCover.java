package Algorithms;
import java.util.*;
public class SetCover {
        public static void main(String[] args) {

            int[] universe = {1, 2, 3, 4, 5};
            int[][] sets = {{1}, {2, 4}, {5}, {3}};
            List<int[]> result = chooseSets(universe, sets);
            System.out.println("Sets to take: " + result);
        }

        public static List<int[]> chooseSets(int[] universe, int[][] sets) {
            List<int[]> result = new ArrayList<>();
            Set<Integer> universeSet = new HashSet<>();
            for (int element : universe) {
                universeSet.add(element);
            }

            while (!universeSet.isEmpty()) {
                int[] maxSet = null;
                int maxCount = 0;
                for (int[] set : sets) {
                    int count = 0;
                    for (int element : set) {
                        if (universeSet.contains(element)) {
                            count++;
                        }
                    }
                    if (count > maxCount) {
                        maxCount = count;
                        maxSet = set;
                    }
                }

                result.add(maxSet);

                for (int element : maxSet) {
                    universeSet.remove(element);
                }

                List<int[]> newSets = new ArrayList<>();
                for (int[] set : sets) {
                    if (!Arrays.equals(set, maxSet)) {
                        newSets.add(set);
                    }
                }
                sets = newSets.toArray(new int[0][]);
            }

            return result;
        }
    }

