/* DemoParser.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. DemoParser.java */
package io.leaderli.c1;

import java.io.StringReader;

public class DemoParser/* @bgen(jjtree) */ implements DemoParserTreeConstants, DemoParserConstants {/* @bgen(jjtree) */
    protected JJTDemoParserState jjtree = new JJTDemoParserState();

    public static void main(String[] args) throws Exception {
        DemoParser demo = new DemoParser(new StringReader("aa"));
        SimpleNode node = demo.Start();
        node.dump(" ");
        demo = new DemoParser(new StringReader("aa#"));
        node = demo.Start();
        node.dump(" ");
        demo = new DemoParser(new StringReader("aa##wav:12345##1111#11##wav:22345##cc##break##bb"));
        node = demo.Start();
        node.dump(" ");
        DemoParserDefaultVisitor demoParserDefaultVisitor = new DemoParserDefaultVisitor();
        StringBuilder sb = new StringBuilder();
        demoParserDefaultVisitor.visit(node, sb);
        System.out.println(sb);
    }

    final public SimpleNode Start() throws ParseException {/* @bgen(jjtree) Start */
        ASTStart jjtn000 = new ASTStart(JJTSTART);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            label_1: while (true) {
                tts();
                switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case D_TTS:
                case D_TAG: {
                    ;
                    break;
                }
                default:
                    jj_la1[0] = jj_gen;
                    break label_1;
                }
            }
            jj_consume_token(0);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            {
                if ("" != null)
                    return jjtn000;
            }
        } catch (Throwable jjte000) {
            if (jjtc000) {
                jjtree.clearNodeScope(jjtn000);
                jjtc000 = false;
            } else {
                jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
                {
                    if (true)
                        throw (RuntimeException) jjte000;
                }
            }
            if (jjte000 instanceof ParseException) {
                {
                    if (true)
                        throw (ParseException) jjte000;
                }
            }
            {
                if (true)
                    throw (Error) jjte000;
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public void wav() throws ParseException {/* @bgen(jjtree) wav */
        ASTwav jjtn000 = new ASTwav(JJTWAV);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        Token t;
        try {
            jj_consume_token(WAV);
            jj_consume_token(COMMA);
            t = jj_consume_token(DIGITS);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtn000.jjtSetValue(t.image);
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
    }

    final public void tts() throws ParseException {
        Token t;
        switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
        case D_TTS: {
            t = jj_consume_token(D_TTS);
            ASTtts jjtn001 = new ASTtts(JJTTTS);
            boolean jjtc001 = true;
            jjtree.openNodeScope(jjtn001);
            try {
                jjtree.closeNodeScope(jjtn001, true);
                jjtc001 = false;
                jjtn001.jjtSetValue(t.image);
            } finally {
                if (jjtc001) {
                    jjtree.closeNodeScope(jjtn001, true);
                }
            }
            break;
        }
        case D_TAG: {
            jj_consume_token(D_TAG);
            switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
            case B_TTS:
            case B_TAG: {
                switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case B_TTS: {
                    t = jj_consume_token(B_TTS);
                    ASTtts jjtn002 = new ASTtts(JJTTTS);
                    boolean jjtc002 = true;
                    jjtree.openNodeScope(jjtn002);
                    try {
                        jjtree.closeNodeScope(jjtn002, true);
                        jjtc002 = false;
                        jjtn002.jjtSetValue("#" + t.image);
                        {
                            if ("" != null)
                                return;
                        }
                    } finally {
                        if (jjtc002) {
                            jjtree.closeNodeScope(jjtn002, true);
                        }
                    }
                    break;
                }
                case B_TAG: {
                    tag();
                    {
                        if ("" != null)
                            return;
                    }
                    break;
                }
                default:
                    jj_la1[1] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                break;
            }
            default:
                jj_la1[2] = jj_gen;
                ;
            }
            ASTtts jjtn003 = new ASTtts(JJTTTS);
            boolean jjtc003 = true;
            jjtree.openNodeScope(jjtn003);
            try {
                jjtree.closeNodeScope(jjtn003, true);
                jjtc003 = false;
                jjtn003.jjtSetValue("#");
            } finally {
                if (jjtc003) {
                    jjtree.closeNodeScope(jjtn003, true);
                }
            }
            break;
        }
        default:
            jj_la1[3] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
        }
    }

    final public void _break() throws ParseException {/* @bgen(jjtree) _break */
        AST_break jjtn000 = new AST_break(JJT_BREAK);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        try {
            jj_consume_token(BREAK);
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
            }
        }
    }

    final public void tag() throws ParseException {
        Token t;
        jj_consume_token(B_TAG);
        switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
        case WAV: {
            wav();
            break;
        }
        case BREAK: {
            _break();
            break;
        }
        default:
            jj_la1[4] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
        }
        jj_consume_token(T_TAG);
    }

    /** Generated Token Manager. */
    public DemoParserTokenManager token_source;
    SimpleCharStream jj_input_stream;
    /** Current token. */
    public Token token;
    /** Next token. */
    public Token jj_nt;
    private int jj_ntk;
    private int jj_gen;
    final private int[] jj_la1 = new int[5];
    static private int[] jj_la1_0;
    static {
        jj_la1_init_0();
    }

    private static void jj_la1_init_0() {
        jj_la1_0 = new int[] { 0x6, 0x18, 0x18, 0x6, 0x60, };
    }

    /** Constructor with InputStream. */
    public DemoParser(java.io.InputStream stream) {
        this(stream, null);
    }

    /** Constructor with InputStream and supplied encoding */
    public DemoParser(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source = new DemoParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 5; i++)
            jj_la1[i] = -1;
    }

    /** Reinitialise. */
    public void ReInit(java.io.InputStream stream) {
        ReInit(stream, null);
    }

    /** Reinitialise. */
    public void ReInit(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream.ReInit(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jjtree.reset();
        jj_gen = 0;
        for (int i = 0; i < 5; i++)
            jj_la1[i] = -1;
    }

    /** Constructor. */
    public DemoParser(java.io.Reader stream) {
        jj_input_stream = new SimpleCharStream(stream, 1, 1);
        token_source = new DemoParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 5; i++)
            jj_la1[i] = -1;
    }

    /** Reinitialise. */
    public void ReInit(java.io.Reader stream) {
        if (jj_input_stream == null) {
            jj_input_stream = new SimpleCharStream(stream, 1, 1);
        } else {
            jj_input_stream.ReInit(stream, 1, 1);
        }
        if (token_source == null) {
            token_source = new DemoParserTokenManager(jj_input_stream);
        }

        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jjtree.reset();
        jj_gen = 0;
        for (int i = 0; i < 5; i++)
            jj_la1[i] = -1;
    }

    /** Constructor with generated Token Manager. */
    public DemoParser(DemoParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 5; i++)
            jj_la1[i] = -1;
    }

    /** Reinitialise. */
    public void ReInit(DemoParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jjtree.reset();
        jj_gen = 0;
        for (int i = 0; i < 5; i++)
            jj_la1[i] = -1;
    }

    private Token jj_consume_token(int kind) throws ParseException {
        Token oldToken;
        if ((oldToken = token).next != null)
            token = token.next;
        else
            token = token.next = token_source.getNextToken();
        jj_ntk = -1;
        if (token.kind == kind) {
            jj_gen++;
            return token;
        }
        token = oldToken;
        jj_kind = kind;
        throw generateParseException();
    }

    /** Get the next Token. */
    final public Token getNextToken() {
        if (token.next != null)
            token = token.next;
        else
            token = token.next = token_source.getNextToken();
        jj_ntk = -1;
        jj_gen++;
        return token;
    }

    /** Get the specific Token. */
    final public Token getToken(int index) {
        Token t = token;
        for (int i = 0; i < index; i++) {
            if (t.next != null)
                t = t.next;
            else
                t = t.next = token_source.getNextToken();
        }
        return t;
    }

    private int jj_ntk_f() {
        if ((jj_nt = token.next) == null)
            return (jj_ntk = (token.next = token_source.getNextToken()).kind);
        else
            return (jj_ntk = jj_nt.kind);
    }

    private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
    private int[] jj_expentry;
    private int jj_kind = -1;

    /** Generate ParseException. */
    public ParseException generateParseException() {
        jj_expentries.clear();
        boolean[] la1tokens = new boolean[10];
        if (jj_kind >= 0) {
            la1tokens[jj_kind] = true;
            jj_kind = -1;
        }
        for (int i = 0; i < 5; i++) {
            if (jj_la1[i] == jj_gen) {
                for (int j = 0; j < 32; j++) {
                    if ((jj_la1_0[i] & (1 << j)) != 0) {
                        la1tokens[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (la1tokens[i]) {
                jj_expentry = new int[1];
                jj_expentry[0] = i;
                jj_expentries.add(jj_expentry);
            }
        }
        int[][] exptokseq = new int[jj_expentries.size()][];
        for (int i = 0; i < jj_expentries.size(); i++) {
            exptokseq[i] = jj_expentries.get(i);
        }
        return new ParseException(token, exptokseq, tokenImage);
    }

    private boolean trace_enabled;

    /** Trace enabled. */
    final public boolean trace_enabled() {
        return trace_enabled;
    }

    /** Enable tracing. */
    final public void enable_tracing() {
    }

    /** Disable tracing. */
    final public void disable_tracing() {
    }

}
