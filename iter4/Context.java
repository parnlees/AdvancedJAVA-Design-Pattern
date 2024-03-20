// Context type: NORMAL, REVERSE
public class Context {
    // NORMAL, REVERSE
    // Additional context information, if needed
    
    // ใช้ ContextType จะเป็นลูกศรหัวเพชร และ -> 
    private ContextType _isReverse;

    public Context(ContextType isReverse) {
        this._isReverse = isReverse;
    }

    public Context() {
        this(ContextType.NORMAL);
    }

    public ContextType isReverse() {
        return _isReverse;
    }
}
