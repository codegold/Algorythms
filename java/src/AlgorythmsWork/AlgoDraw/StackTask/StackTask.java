package src.AlgorythmsWork.AlgoDraw.StackTask;

import src.AlgorythmsWork.AlgoDraw.Deque.Deque;

public class StackTask {
    private Deque stackTask;

    public StackTask(int size) {
        stackTask = new Deque(size);
    }

    public void push(long j) {
        stackTask.insertRight(j);
    }

    public long pop() {
        return stackTask.removeRight();
    }

    public long peek() {
        return stackTask.peekRight();
    }

    public Boolean isEmpty() {
        return stackTask.isEmpty();
    }

    public Boolean isFull() {
        return stackTask.isFull();
    }
}
