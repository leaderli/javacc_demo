/* Generated By:JJTree&JavaCC: Do not edit this line. DemoParserConstants.java */
package io.leaderli.c1;

/**
 * Token literal values and constants. Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface DemoParserConstants {

    /** End of File. */
    int EOF = 0;
    /** RegularExpression Id. */
    int D_TTS = 1;
    /** RegularExpression Id. */
    int D_TAG = 2;
    /** RegularExpression Id. */
    int B_TTS = 3;
    /** RegularExpression Id. */
    int B_TAG = 4;
    /** RegularExpression Id. */
    int WAV = 5;
    /** RegularExpression Id. */
    int BREAK = 6;
    /** RegularExpression Id. */
    int COMMA = 7;
    /** RegularExpression Id. */
    int DIGITS = 8;
    /** RegularExpression Id. */
    int T_TAG = 9;

    /** Lexical state. */
    int DEFAULT = 0;
    /** Lexical state. */
    int TAG_BEGIN = 1;
    /** Lexical state. */
    int TAG_STATE = 2;

    /** Literal token values. */
    String[] tokenImage = { "<EOF>", "<D_TTS>", "\"#\"", "<B_TTS>", "\"#\"", "\"wav\"", "\"break\"", "\":\"",
            "<DIGITS>", "\"##\"", };

}
