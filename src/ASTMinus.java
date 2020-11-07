
public class ASTMinus implements ASTNode {

	ASTNode lhs, rhs;

    public int eval(Environment e)
    { 
    	int v1 = lhs.eval(e);
    	int v2 = rhs.eval(e);
    return v1-v2; 
}

    public ASTMinus(ASTNode l, ASTNode r)
    {
    	lhs = l; rhs = r;
    }
}
