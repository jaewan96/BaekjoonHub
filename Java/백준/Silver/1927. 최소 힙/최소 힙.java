import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private List<Integer> heap;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        MinHeap heap = new MinHeap();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(reader.readLine());
            if (x == 0) {
                if (heap.isEmpty()) {
                    result.append(0).append("\n");
                } else {
                    result.append(heap.poll()).append("\n");
                }
            } else {
                heap.insert(x);
            }
        }
        System.out.println(result);
    }
}

class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapUp(heap.size()-1);
    }

    private void heapUp(int idx) {
        while (idx > 0) {
            int parentIdx = (idx - 1) / 2;

            if (heap.get(idx) < heap.get(parentIdx)) {
                swap(idx, parentIdx);
                idx = parentIdx;
            } else {
                break;
            }
        }
    }

    public int poll() {
        swap(0, heap.size() - 1);
        int num = heap.remove(heap.size()-1);
        heapDown();
        return num;
    }

    private void heapDown() {
        int idx= 0;
        while (true) {
            int leftIdx = 2 * idx +1 ;
            int rightIdx = 2 * idx +2 ;
            int smallIdx = idx;

            if (leftIdx < heap.size() && heap.get(leftIdx) < heap.get(smallIdx)) {
                smallIdx = leftIdx;
            }

            if (rightIdx < heap.size() && heap.get(rightIdx) < heap.get(smallIdx)) {
                smallIdx = rightIdx;
            }

            if (smallIdx != idx) {
                swap(idx, smallIdx);
                idx = smallIdx;
            } else {
                break;
            }
        }
    }

    private void swap(int x, int y) {
        Collections.swap(heap, x, y);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}