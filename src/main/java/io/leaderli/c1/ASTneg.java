/* Generated By:JJTree: Do not edit this line. ASTneg.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package io.leaderli.c1;

public
class ASTneg extends SimpleNode {
    public ASTneg(int id) {
        super(id);
    }

    public ASTneg(DemoParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor.
     **/
    public Integer jjtAccept(DemoParserVisitor visitor, Integer data) {

        return
                visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7fa539bd5f583a361b28d686f977b4d5 (do not edit this line) */
