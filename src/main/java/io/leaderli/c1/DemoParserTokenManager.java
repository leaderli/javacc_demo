/* DemoParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. DemoParserTokenManager.java */
package io.leaderli.c1;

import java.io.StringReader;

/** Token Manager. */
@SuppressWarnings("unused")
public class DemoParserTokenManager implements DemoParserConstants {

    /** Debug output. */
    public java.io.PrintStream debugStream = System.out;

    /** Set debug output. */
    public void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }

    private final int jjStopStringLiteralDfa_0(int pos, long active0) {
        switch (pos) {
        default:
            return -1;
        }
    }

    private final int jjStartNfa_0(int pos, long active0) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }

    private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
        case 35:
            return jjStopAtPos(0, 2);
        default:
            return jjMoveNfa_0(0, 0);
        }
    }

    static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };

    private int jjMoveNfa_0(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 1;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((0xfffffff7ffffffffL & l) == 0L)
                            break;
                        kind = 1;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        kind = 1;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((jjbitVec0[i2] & l2) == 0L)
                            break;
                        if (kind > 1)
                            kind = 1;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
                return curPos;
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private final int jjStopStringLiteralDfa_1(int pos, long active0) {
        switch (pos) {
        default:
            return -1;
        }
    }

    private final int jjStartNfa_1(int pos, long active0) {
        return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
    }

    private int jjMoveStringLiteralDfa0_1() {
        switch (curChar) {
        case 35:
            return jjStopAtPos(0, 4);
        default:
            return jjMoveNfa_1(0, 0);
        }
    }

    private int jjMoveNfa_1(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 1;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((0xfffffff7ffffffffL & l) == 0L)
                            break;
                        kind = 3;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        kind = 3;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((jjbitVec0[i2] & l2) == 0L)
                            break;
                        if (kind > 3)
                            kind = 3;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
                return curPos;
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private final int jjStopStringLiteralDfa_2(int pos, long active0) {
        switch (pos) {
        default:
            return -1;
        }
    }

    private final int jjStartNfa_2(int pos, long active0) {
        return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
    }

    private int jjMoveStringLiteralDfa0_2() {
        switch (curChar) {
        case 35:
            return jjMoveStringLiteralDfa1_2(0x200L);
        case 58:
            return jjStopAtPos(0, 7);
        case 98:
            return jjMoveStringLiteralDfa1_2(0x40L);
        case 119:
            return jjMoveStringLiteralDfa1_2(0x20L);
        default:
            return jjMoveNfa_2(0, 0);
        }
    }

    private int jjMoveStringLiteralDfa1_2(long active0) {
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_2(0, active0);
            return 1;
        }
        switch (curChar) {
        case 35:
            if ((active0 & 0x200L) != 0L)
                return jjStopAtPos(1, 9);
            break;
        case 97:
            return jjMoveStringLiteralDfa2_2(active0, 0x20L);
        case 114:
            return jjMoveStringLiteralDfa2_2(active0, 0x40L);
        default:
            break;
        }
        return jjStartNfa_2(0, active0);
    }

    private int jjMoveStringLiteralDfa2_2(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_2(0, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_2(1, active0);
            return 2;
        }
        switch (curChar) {
        case 101:
            return jjMoveStringLiteralDfa3_2(active0, 0x40L);
        case 118:
            if ((active0 & 0x20L) != 0L)
                return jjStopAtPos(2, 5);
            break;
        default:
            break;
        }
        return jjStartNfa_2(1, active0);
    }

    private int jjMoveStringLiteralDfa3_2(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_2(1, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_2(2, active0);
            return 3;
        }
        switch (curChar) {
        case 97:
            return jjMoveStringLiteralDfa4_2(active0, 0x40L);
        default:
            break;
        }
        return jjStartNfa_2(2, active0);
    }

    private int jjMoveStringLiteralDfa4_2(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_2(2, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_2(3, active0);
            return 4;
        }
        switch (curChar) {
        case 107:
            if ((active0 & 0x40L) != 0L)
                return jjStopAtPos(4, 6);
            break;
        default:
            break;
        }
        return jjStartNfa_2(3, active0);
    }

    private int jjMoveNfa_2(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 1;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                    case 0:
                        if ((0x3ff000000000000L & l) == 0L)
                            break;
                        kind = 8;
                        jjstateSet[jjnewStateCnt++] = 0;
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    default:
                        break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
                return curPos;
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    /** Token literal values. */
    public static final String[] jjstrLiteralImages = { "", null, "\43", null, "\43", "\167\141\166",
            "\142\162\145\141\153", "\72", null, "\43\43", };

    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    static final int[] jjnextStates = { 0 };

    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;

    /** Get the next Token. */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;

        EOFLoop: for (;;) {
            try {
                curChar = input_stream.BeginToken();
            } catch (Exception e) {
                jjmatchedKind = 0;
                jjmatchedPos = -1;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            switch (curLexState) {
            case 0:
                jjmatchedKind = 0x7fffffff;
                jjmatchedPos = 0;
                curPos = jjMoveStringLiteralDfa0_0();
                break;
            case 1:
                jjmatchedKind = 0x7fffffff;
                jjmatchedPos = 0;
                curPos = jjMoveStringLiteralDfa0_1();
                break;
            case 2:
                jjmatchedKind = 0x7fffffff;
                jjmatchedPos = 0;
                curPos = jjMoveStringLiteralDfa0_2();
                break;
            }
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos)
                    input_stream.backup(curPos - jjmatchedPos - 1);
                matchedToken = jjFillToken();
                if (jjnewLexState[jjmatchedKind] != -1)
                    curLexState = jjnewLexState[jjmatchedKind];
                return matchedToken;
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else
                    error_column++;
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
                    TokenMgrError.LEXICAL_ERROR);
        }
    }

    void SkipLexicalActions(Token matchedToken) {
        switch (jjmatchedKind) {
        default:
            break;
        }
    }

    void MoreLexicalActions() {
        jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
        switch (jjmatchedKind) {
        default:
            break;
        }
    }

    void TokenLexicalActions(Token matchedToken) {
        switch (jjmatchedKind) {
        default:
            break;
        }
    }

    private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    private void jjAddStates(int start, int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    /** Constructor. */
    public DemoParserTokenManager(SimpleCharStream stream) {

        if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

        input_stream = stream;
    }

    /** Constructor. */
    public DemoParserTokenManager(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Reinitialise parser. */

    public void ReInit(SimpleCharStream stream) {

        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 1; i-- > 0;)
            jjrounds[i] = 0x80000000;
    }

    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream, int lexState)

    {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Switch to specified lex state. */
    public void SwitchTo(int lexState) {
        if (lexState >= 3 || lexState < 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
                    TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }

    /** Lexer state names. */
    public static final String[] lexStateNames = { "DEFAULT", "TAG_BEGIN", "TAG_STATE", };

    /** Lex State array. */
    public static final int[] jjnewLexState = { -1, -1, 1, 0, 2, -1, -1, -1, -1, 0, };
    static final long[] jjtoToken = { 0x3ffL, };
    static final long[] jjtoSkip = { 0x0L, };
    static final long[] jjtoSpecial = { 0x0L, };
    static final long[] jjtoMore = { 0x0L, };
    protected SimpleCharStream input_stream;

    private final int[] jjrounds = new int[1];
    private final int[] jjstateSet = new int[2 * 1];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
