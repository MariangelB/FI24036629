public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);
        node.setNext(_head);
        _head = node;
    }

    public String pop() {
        String word = null;
        if (_head != null) {
            word = _head.getWord();
            _head = _head.getNext();
        }
        return word;
    }

    public int size() {
        var length = 0;
        for (var node = _head; node != null; node = node.getNext()) {
            length++;
        }

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}