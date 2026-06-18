import java.util.*;

public class LRUPageReplacementAlgo {
    public static void main(String[] args) {
        int[] pages = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3};
        int capacity = 3;

        lruPageReplacement(pages, capacity);
    }

    static void lruPageReplacement(int[] pages, int capacity) {
        List<Integer> frames = new ArrayList<>();
        int pageFaults = 0;

        for (int page : pages) {

            if (!frames.contains(page)) {
                pageFaults++;

                if (frames.size() == capacity) {
                    frames.remove(0); // Remove least recently used page
                }
            } else {
                frames.remove(Integer.valueOf(page));
            }

            frames.add(page); // Add as most recently used

            System.out.println("Page " + page + " -> " + frames);
        }

        System.out.println("Total Page Faults = " + pageFaults);
    }
}