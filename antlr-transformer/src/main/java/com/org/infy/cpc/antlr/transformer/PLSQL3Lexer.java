// $ANTLR 3.3 Nov 30, 2010 12:50:56 PLSQL3.g 2019-12-18 11:09:22
package com.org.infy.cpc.antlr.transformer;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PLSQL3Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int ID=4;
    public static final int N=5;
    public static final int ID1=6;
    public static final int VARCHAR=7;
    public static final int VARCHAR2=8;
    public static final int NUMERIC=9;
    public static final int FLOAT=10;
    public static final int ID3=11;
    public static final int WS=12;
    public static final int SL_COMMENT=13;
    public static final int ML_COMMENT=14;

    // delegates
    // delegators

    public PLSQL3Lexer() {;} 
    public PLSQL3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PLSQL3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "PLSQL3.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:3:7: ( 'DECLARE' )
            // PLSQL3.g:3:9: 'DECLARE'
            {
            match("DECLARE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:4:7: ( 'create or replace PACKAGE BODY' )
            // PLSQL3.g:4:9: 'create or replace PACKAGE BODY'
            {
            match("create or replace PACKAGE BODY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:5:7: ( 'CREATE OR REPLACE PACKAGE BODY' )
            // PLSQL3.g:5:9: 'CREATE OR REPLACE PACKAGE BODY'
            {
            match("CREATE OR REPLACE PACKAGE BODY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:6:7: ( 'AS' )
            // PLSQL3.g:6:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:7:7: ( 'BEGIN' )
            // PLSQL3.g:7:9: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:8:7: ( 'END' )
            // PLSQL3.g:8:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:9:7: ( 'LOOP' )
            // PLSQL3.g:9:9: 'LOOP'
            {
            match("LOOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:10:7: ( 'IF' )
            // PLSQL3.g:10:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:11:7: ( 'THEN' )
            // PLSQL3.g:11:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:12:7: ( 'EXIT;' )
            // PLSQL3.g:12:9: 'EXIT;'
            {
            match("EXIT;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:13:7: ( 'END IF;' )
            // PLSQL3.g:13:9: 'END IF;'
            {
            match("END IF;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:14:7: ( 'END LOOP;' )
            // PLSQL3.g:14:9: 'END LOOP;'
            {
            match("END LOOP;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:15:7: ( 'CREATE OR REPLACE FUNCTION' )
            // PLSQL3.g:15:9: 'CREATE OR REPLACE FUNCTION'
            {
            match("CREATE OR REPLACE FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:16:7: ( 'FUNCTION' )
            // PLSQL3.g:16:9: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:17:7: ( 'CREATE FUNCTION' )
            // PLSQL3.g:17:9: 'CREATE FUNCTION'
            {
            match("CREATE FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:18:7: ( 'REPLACE FUNCTION' )
            // PLSQL3.g:18:9: 'REPLACE FUNCTION'
            {
            match("REPLACE FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:19:7: ( 'RETURN' )
            // PLSQL3.g:19:9: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:20:7: ( ';' )
            // PLSQL3.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:21:7: ( 'IS' )
            // PLSQL3.g:21:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:22:7: ( 'END;' )
            // PLSQL3.g:22:9: 'END;'
            {
            match("END;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:23:7: ( 'WHILE' )
            // PLSQL3.g:23:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:24:7: ( 'FOR' )
            // PLSQL3.g:24:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:25:7: ( 'in' )
            // PLSQL3.g:25:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:26:7: ( '..' )
            // PLSQL3.g:26:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:27:7: ( 'CREATE OR REPLACE PROCEDURE' )
            // PLSQL3.g:27:9: 'CREATE OR REPLACE PROCEDURE'
            {
            match("CREATE OR REPLACE PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:28:7: ( 'PROCEDURE' )
            // PLSQL3.g:28:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:29:7: ( 'CREATE PROCEDURE' )
            // PLSQL3.g:29:9: 'CREATE PROCEDURE'
            {
            match("CREATE PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:30:7: ( 'REPLACE PROCEDURE' )
            // PLSQL3.g:30:9: 'REPLACE PROCEDURE'
            {
            match("REPLACE PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:31:7: ( 'ELSE' )
            // PLSQL3.g:31:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:32:7: ( 'ELSIF' )
            // PLSQL3.g:32:9: 'ELSIF'
            {
            match("ELSIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:33:7: ( ':=' )
            // PLSQL3.g:33:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:34:7: ( '.' )
            // PLSQL3.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:35:7: ( '\"' )
            // PLSQL3.g:35:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:36:7: ( 'dbms_output.put_line' )
            // PLSQL3.g:36:9: 'dbms_output.put_line'
            {
            match("dbms_output.put_line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:37:7: ( 'FND_FILE.put_line' )
            // PLSQL3.g:37:9: 'FND_FILE.put_line'
            {
            match("FND_FILE.put_line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:38:7: ( 'FND_FILE.PUT_LINE' )
            // PLSQL3.g:38:9: 'FND_FILE.PUT_LINE'
            {
            match("FND_FILE.PUT_LINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:39:7: ( 'write_debug' )
            // PLSQL3.g:39:9: 'write_debug'
            {
            match("write_debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:40:7: ( 'SELECT' )
            // PLSQL3.g:40:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:41:7: ( 'INTO' )
            // PLSQL3.g:41:9: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:42:7: ( 'FROM' )
            // PLSQL3.g:42:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:43:7: ( 'INSERT INTO' )
            // PLSQL3.g:43:9: 'INSERT INTO'
            {
            match("INSERT INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:44:7: ( 'UPDATE' )
            // PLSQL3.g:44:9: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:45:7: ( 'SET' )
            // PLSQL3.g:45:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:46:7: ( '=' )
            // PLSQL3.g:46:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:47:7: ( '();' )
            // PLSQL3.g:47:9: '();'
            {
            match("();"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:48:7: ( '(' )
            // PLSQL3.g:48:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:49:7: ( '<' )
            // PLSQL3.g:49:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:50:7: ( '>' )
            // PLSQL3.g:50:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:51:7: ( '+' )
            // PLSQL3.g:51:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:52:7: ( ')' )
            // PLSQL3.g:52:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:53:7: ( ',' )
            // PLSQL3.g:53:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:54:7: ( 'IN' )
            // PLSQL3.g:54:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:55:7: ( 'OUT' )
            // PLSQL3.g:55:9: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:56:7: ( 'number' )
            // PLSQL3.g:56:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:57:7: ( 'NUMBER' )
            // PLSQL3.g:57:9: 'NUMBER'
            {
            match("NUMBER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:58:7: ( 'VARCHAR' )
            // PLSQL3.g:58:9: 'VARCHAR'
            {
            match("VARCHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:59:7: ( 'VARCHAR2' )
            // PLSQL3.g:59:9: 'VARCHAR2'
            {
            match("VARCHAR2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:60:7: ( 'FLOAT' )
            // PLSQL3.g:60:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:61:7: ( 'NUMBER(' )
            // PLSQL3.g:61:9: 'NUMBER('
            {
            match("NUMBER("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:62:7: ( 'number(' )
            // PLSQL3.g:62:9: 'number('
            {
            match("number("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:63:7: ( 'VARCHAR2(' )
            // PLSQL3.g:63:9: 'VARCHAR2('
            {
            match("VARCHAR2("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:64:7: ( 'varchar2(' )
            // PLSQL3.g:64:9: 'varchar2('
            {
            match("varchar2("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:65:7: ( 'VARCHAR(' )
            // PLSQL3.g:65:9: 'VARCHAR('
            {
            match("VARCHAR("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:66:7: ( 'varchar(' )
            // PLSQL3.g:66:9: 'varchar('
            {
            match("varchar("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:67:7: ( '%TYPE' )
            // PLSQL3.g:67:9: '%TYPE'
            {
            match("%TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:68:7: ( '%type' )
            // PLSQL3.g:68:9: '%type'
            {
            match("%type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "VARCHAR"
    public final void mVARCHAR() throws RecognitionException {
        try {
            int _type = VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:364:2: ( 'varchar' )
            // PLSQL3.g:364:4: 'varchar'
            {
            match("varchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARCHAR"

    // $ANTLR start "VARCHAR2"
    public final void mVARCHAR2() throws RecognitionException {
        try {
            int _type = VARCHAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:368:2: ( 'varchar2' )
            // PLSQL3.g:368:4: 'varchar2'
            {
            match("varchar2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARCHAR2"

    // $ANTLR start "NUMERIC"
    public final void mNUMERIC() throws RecognitionException {
        try {
            int _type = NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:372:2: ( 'numeric' )
            // PLSQL3.g:372:4: 'numeric'
            {
            match("numeric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMERIC"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:376:2: ( 'float' )
            // PLSQL3.g:376:4: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:414:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // PLSQL3.g:414:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // PLSQL3.g:414:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PLSQL3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ID1"
    public final void mID1() throws RecognitionException {
        try {
            int _type = ID1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:417:6: ( ( '(' ( . )* ')' )? )
            // PLSQL3.g:417:10: ( '(' ( . )* ')' )?
            {
            // PLSQL3.g:417:10: ( '(' ( . )* ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='(') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PLSQL3.g:417:11: '(' ( . )* ')'
                    {
                    match('('); 
                    // PLSQL3.g:417:14: ( . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==')') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='(')||(LA2_0>='*' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // PLSQL3.g:417:14: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID1"

    // $ANTLR start "ID3"
    public final void mID3() throws RecognitionException {
        try {
            int _type = ID3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:420:2: ( ( '\"' | '||' | ':' | '*' | '/' | '-' )* )
            // PLSQL3.g:420:3: ( '\"' | '||' | ':' | '*' | '/' | '-' )*
            {
            // PLSQL3.g:420:3: ( '\"' | '||' | ':' | '*' | '/' | '-' )*
            loop4:
            do {
                int alt4=7;
                switch ( input.LA(1) ) {
                case '\"':
                    {
                    alt4=1;
                    }
                    break;
                case '|':
                    {
                    alt4=2;
                    }
                    break;
                case ':':
                    {
                    alt4=3;
                    }
                    break;
                case '*':
                    {
                    alt4=4;
                    }
                    break;
                case '/':
                    {
                    alt4=5;
                    }
                    break;
                case '-':
                    {
                    alt4=6;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // PLSQL3.g:420:4: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;
            	case 2 :
            	    // PLSQL3.g:420:8: '||'
            	    {
            	    match("||"); 


            	    }
            	    break;
            	case 3 :
            	    // PLSQL3.g:420:13: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 4 :
            	    // PLSQL3.g:420:17: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 5 :
            	    // PLSQL3.g:420:21: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 6 :
            	    // PLSQL3.g:420:25: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID3"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:424:5: ( '0' .. '9' ( '0' .. '9' )* )
            // PLSQL3.g:424:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // PLSQL3.g:424:18: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PLSQL3.g:424:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:427:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // PLSQL3.g:427:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // PLSQL3.g:427:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PLSQL3.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:431:2: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // PLSQL3.g:431:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 

            // PLSQL3.g:431:9: (~ ( '\\n' | '\\r' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PLSQL3.g:431:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // PLSQL3.g:431:23: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PLSQL3.g:431:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:435:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // PLSQL3.g:435:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // PLSQL3.g:435:9: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PLSQL3.g:435:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    public void mTokens() throws RecognitionException {
        // PLSQL3.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | VARCHAR | VARCHAR2 | NUMERIC | FLOAT | ID | ID1 | ID3 | N | WS | SL_COMMENT | ML_COMMENT )
        int alt10=77;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // PLSQL3.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // PLSQL3.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // PLSQL3.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // PLSQL3.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // PLSQL3.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // PLSQL3.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // PLSQL3.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // PLSQL3.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // PLSQL3.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // PLSQL3.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // PLSQL3.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // PLSQL3.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // PLSQL3.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // PLSQL3.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // PLSQL3.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // PLSQL3.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // PLSQL3.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // PLSQL3.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // PLSQL3.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // PLSQL3.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // PLSQL3.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // PLSQL3.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // PLSQL3.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // PLSQL3.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // PLSQL3.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // PLSQL3.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // PLSQL3.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // PLSQL3.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // PLSQL3.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // PLSQL3.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // PLSQL3.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // PLSQL3.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // PLSQL3.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // PLSQL3.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // PLSQL3.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // PLSQL3.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // PLSQL3.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // PLSQL3.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // PLSQL3.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // PLSQL3.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // PLSQL3.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // PLSQL3.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // PLSQL3.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // PLSQL3.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // PLSQL3.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // PLSQL3.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // PLSQL3.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // PLSQL3.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // PLSQL3.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // PLSQL3.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // PLSQL3.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // PLSQL3.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // PLSQL3.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // PLSQL3.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // PLSQL3.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // PLSQL3.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // PLSQL3.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // PLSQL3.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // PLSQL3.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // PLSQL3.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // PLSQL3.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // PLSQL3.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // PLSQL3.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // PLSQL3.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // PLSQL3.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // PLSQL3.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // PLSQL3.g:1:406: VARCHAR
                {
                mVARCHAR(); 

                }
                break;
            case 68 :
                // PLSQL3.g:1:414: VARCHAR2
                {
                mVARCHAR2(); 

                }
                break;
            case 69 :
                // PLSQL3.g:1:423: NUMERIC
                {
                mNUMERIC(); 

                }
                break;
            case 70 :
                // PLSQL3.g:1:431: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 71 :
                // PLSQL3.g:1:437: ID
                {
                mID(); 

                }
                break;
            case 72 :
                // PLSQL3.g:1:440: ID1
                {
                mID1(); 

                }
                break;
            case 73 :
                // PLSQL3.g:1:444: ID3
                {
                mID3(); 

                }
                break;
            case 74 :
                // PLSQL3.g:1:448: N
                {
                mN(); 

                }
                break;
            case 75 :
                // PLSQL3.g:1:450: WS
                {
                mWS(); 

                }
                break;
            case 76 :
                // PLSQL3.g:1:453: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 77 :
                // PLSQL3.g:1:464: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\46\13\45\1\uffff\2\45\1\102\1\45\1\47\1\105\4\45\1\uffff\1\113"+
        "\5\uffff\5\45\1\uffff\1\45\3\uffff\2\47\2\uffff\3\45\1\131\5\45"+
        "\1\137\1\140\1\143\10\45\1\155\2\uffff\1\45\2\uffff\4\45\1\46\1"+
        "\uffff\5\45\2\uffff\1\45\2\47\3\45\1\uffff\1\45\1\u008f\3\45\2\uffff"+
        "\2\45\1\uffff\2\45\1\u0098\6\45\1\uffff\4\45\1\u00a3\1\45\1\u00a5"+
        "\1\u00a6\5\45\2\47\1\uffff\3\47\1\uffff\1\47\2\uffff\4\47\4\45\3"+
        "\uffff\1\45\1\u00b7\1\45\1\u00b9\1\u00ba\1\45\1\u00bc\1\45\1\uffff"+
        "\1\45\1\u00bf\10\45\1\uffff\1\45\2\uffff\6\45\3\47\3\45\1\u00d2"+
        "\4\uffff\1\u00d3\2\uffff\1\45\1\uffff\2\45\1\uffff\1\u00d7\2\45"+
        "\1\u00da\12\45\1\u00e5\3\45\2\uffff\3\45\1\uffff\1\45\1\u00ed\1"+
        "\uffff\3\45\1\u00f1\1\u00f2\1\u00f4\1\45\1\u00f7\2\45\1\uffff\1"+
        "\u00fa\3\uffff\3\45\1\uffff\3\45\4\uffff\1\u0104\2\uffff\1\u0107"+
        "\1\u010a\4\uffff\1\u010c\1\45\1\uffff\3\45\1\uffff\1\u0114\2\uffff"+
        "\1\u0116\7\uffff\1\u011a\2\45\10\uffff\2\45\1\uffff\1\45\1\u0122"+
        "\15\uffff";
    static final String DFA10_eofS =
        "\u012d\uffff";
    static final String DFA10_minS =
        "\1\11\1\105\1\162\1\122\1\123\1\105\1\114\1\117\1\106\1\110\1\114"+
        "\1\105\1\uffff\1\110\1\156\1\56\1\122\1\75\1\42\1\142\1\162\1\105"+
        "\1\120\1\uffff\1\0\5\uffff\1\125\1\165\1\125\1\101\1\141\1\124\1"+
        "\154\3\uffff\1\52\1\55\2\uffff\1\103\1\145\1\105\1\60\1\107\1\104"+
        "\1\111\1\123\1\117\3\60\1\105\1\116\1\122\1\104\2\117\1\120\1\111"+
        "\1\60\2\uffff\1\117\2\uffff\1\155\1\151\1\114\1\104\1\73\1\uffff"+
        "\1\124\1\155\1\115\1\122\1\162\2\uffff\1\157\2\0\1\114\1\141\1\101"+
        "\1\uffff\1\111\1\40\1\124\1\105\1\120\2\uffff\1\117\1\105\1\uffff"+
        "\1\116\1\103\1\60\1\137\1\115\1\101\1\114\1\125\1\114\1\uffff\1"+
        "\103\1\163\1\164\1\105\1\60\1\101\1\0\1\60\1\142\1\102\1\103\1\143"+
        "\1\141\6\0\1\uffff\1\0\1\uffff\5\0\1\101\1\164\1\124\1\116\1\111"+
        "\2\uffff\1\73\1\60\1\106\2\60\1\122\1\60\1\124\1\uffff\1\106\1\60"+
        "\1\124\1\101\1\122\2\105\1\137\1\145\1\103\1\uffff\1\124\2\uffff"+
        "\1\145\1\162\1\105\1\110\1\150\1\164\3\0\1\122\1\145\1\105\1\60"+
        "\4\uffff\1\60\2\uffff\1\124\1\uffff\2\111\1\uffff\1\60\1\103\1\116"+
        "\1\60\1\104\1\157\1\137\1\124\1\105\1\162\1\151\1\122\1\101\1\141"+
        "\1\60\1\105\2\40\2\uffff\1\40\1\117\1\114\1\uffff\1\105\1\60\1\uffff"+
        "\1\125\1\165\1\144\2\60\1\50\1\143\1\50\1\122\1\162\1\uffff\1\60"+
        "\1\uffff\1\106\1\uffff\1\116\1\105\1\40\1\uffff\1\122\1\164\1\145"+
        "\4\uffff\1\60\2\uffff\2\50\1\uffff\1\122\2\uffff\1\60\1\56\1\106"+
        "\1\105\1\160\1\142\1\uffff\1\50\2\uffff\1\50\2\uffff\1\40\1\uffff"+
        "\1\120\2\uffff\1\60\2\165\4\uffff\1\122\3\uffff\1\164\1\147\1\105"+
        "\1\56\1\60\1\120\2\uffff\1\114\1\101\1\103\1\105\1\40\1\106\1\101"+
        "\3\uffff";
    static final String DFA10_maxS =
        "\1\174\1\105\1\162\1\122\1\123\1\105\1\130\1\117\1\123\1\110\1"+
        "\125\1\105\1\uffff\1\110\1\156\1\56\1\122\1\75\1\174\1\142\1\162"+
        "\1\105\1\120\1\uffff\1\uffff\5\uffff\1\125\1\165\1\125\1\101\1\141"+
        "\1\164\1\154\3\uffff\1\52\1\55\2\uffff\1\103\1\145\1\105\1\172\1"+
        "\107\1\104\1\111\1\123\1\117\3\172\1\105\1\116\1\122\1\104\2\117"+
        "\1\124\1\111\1\172\2\uffff\1\117\2\uffff\1\155\1\151\1\124\1\104"+
        "\1\73\1\uffff\1\124\1\155\1\115\1\122\1\162\2\uffff\1\157\2\uffff"+
        "\1\114\1\141\1\101\1\uffff\1\111\1\172\1\124\1\111\1\120\2\uffff"+
        "\1\117\1\105\1\uffff\1\116\1\103\1\172\1\137\1\115\1\101\1\114\1"+
        "\125\1\114\1\uffff\1\103\1\163\1\164\1\105\1\172\1\101\1\uffff\1"+
        "\172\1\145\1\102\1\103\1\143\1\141\6\uffff\1\uffff\1\uffff\1\uffff"+
        "\5\uffff\1\101\1\164\1\124\1\116\1\114\2\uffff\1\73\1\172\1\106"+
        "\2\172\1\122\1\172\1\124\1\uffff\1\106\1\172\1\124\1\101\1\122\2"+
        "\105\1\137\1\145\1\103\1\uffff\1\124\2\uffff\1\145\1\162\1\105\1"+
        "\110\1\150\1\164\3\uffff\1\122\1\145\1\105\1\172\4\uffff\1\172\2"+
        "\uffff\1\124\1\uffff\2\111\1\uffff\1\172\1\103\1\116\1\172\1\104"+
        "\1\157\1\137\1\124\1\105\1\162\1\151\1\122\1\101\1\141\1\172\1\105"+
        "\2\40\2\uffff\1\40\1\117\1\114\1\uffff\1\105\1\172\1\uffff\1\125"+
        "\1\165\1\144\3\172\1\143\1\172\1\122\1\162\1\uffff\1\172\1\uffff"+
        "\1\120\1\uffff\1\116\1\105\1\40\1\uffff\1\122\1\164\1\145\4\uffff"+
        "\1\172\2\uffff\2\172\1\uffff\1\122\2\uffff\1\172\1\56\1\120\1\105"+
        "\1\160\1\142\1\uffff\1\172\2\uffff\1\172\2\uffff\1\40\1\uffff\1"+
        "\160\2\uffff\1\172\2\165\4\uffff\1\122\3\uffff\1\164\1\147\1\105"+
        "\1\56\1\172\1\120\2\uffff\1\114\1\101\1\103\1\105\1\40\1\120\1\122"+
        "\3\uffff";
    static final String DFA10_acceptS =
        "\14\uffff\1\22\12\uffff\1\54\1\uffff\1\57\1\60\1\61\1\62\1\63\7"+
        "\uffff\1\107\1\110\1\111\2\uffff\1\112\1\113\25\uffff\1\30\1\40"+
        "\1\uffff\1\37\1\41\5\uffff\1\56\5\uffff\1\101\1\102\6\uffff\1\4"+
        "\5\uffff\1\10\1\23\2\uffff\1\64\11\uffff\1\27\23\uffff\1\115\1\uffff"+
        "\1\114\12\uffff\1\24\1\6\10\uffff\1\26\12\uffff\1\53\1\uffff\1\55"+
        "\1\65\15\uffff\1\13\1\14\1\12\1\35\1\uffff\1\7\1\47\1\uffff\1\11"+
        "\2\uffff\1\50\22\uffff\1\5\1\36\3\uffff\1\72\2\uffff\1\25\12\uffff"+
        "\1\106\1\uffff\1\2\1\uffff\1\51\3\uffff\1\21\3\uffff\1\46\1\52\1"+
        "\74\1\66\1\uffff\1\73\1\67\2\uffff\1\1\1\uffff\1\17\1\33\6\uffff"+
        "\1\105\1\uffff\1\77\1\70\1\uffff\1\100\1\103\1\uffff\1\16\1\uffff"+
        "\1\20\1\34\3\uffff\1\75\1\71\1\76\1\104\1\uffff\1\43\1\44\1\32\6"+
        "\uffff\1\42\1\45\7\uffff\1\15\1\3\1\31";
    static final String DFA10_specialS =
        "\30\uffff\1\22\73\uffff\1\10\1\20\36\uffff\1\6\6\uffff\1\11\1\12"+
        "\1\7\1\14\1\15\1\16\1\uffff\1\0\1\uffff\1\17\1\2\1\3\1\4\1\5\44"+
        "\uffff\1\21\1\13\1\1\175\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\22\2\uffff\1\43"+
            "\2\uffff\1\30\1\34\1\47\1\33\1\35\1\51\1\17\1\50\12\52\1\21"+
            "\1\14\1\31\1\27\1\32\2\uffff\1\4\1\5\1\3\1\1\1\6\1\12\2\45\1"+
            "\10\2\45\1\7\1\45\1\40\1\36\1\20\1\45\1\13\1\25\1\11\1\26\1"+
            "\41\1\15\3\45\4\uffff\1\45\1\uffff\2\45\1\2\1\23\1\45\1\44\2"+
            "\45\1\16\4\45\1\37\7\45\1\42\1\24\3\45\1\uffff\1\47",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\63\1\uffff\1\61\11\uffff\1\62",
            "\1\64",
            "\1\65\7\uffff\1\67\4\uffff\1\66",
            "\1\70",
            "\1\75\1\uffff\1\73\1\72\2\uffff\1\74\2\uffff\1\71",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103",
            "\1\104",
            "\1\47\7\uffff\1\47\2\uffff\1\47\1\uffff\1\47\12\uffff\1\47"+
            "\101\uffff\1\47",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\51\46\1\112\uffd6\46",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\37\uffff\1\122",
            "\1\123",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\22\45\1\142\1\141\6\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\3\uffff\1\153",
            "\1\154",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161\7\uffff\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d\17\uffff\12\45\1\uffff\1\u008e\5\uffff\32\45\4\uffff"+
            "\1\45\1\uffff\32\45",
            "\1\u0090",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a4",
            "\0\46",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a7\2\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\u00ad"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\174\u0081\1\u00ae\uff83\u0081",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "",
            "\174\u0083\1\u00af\uff83\u0083",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4\2\uffff\1\u00b5",
            "",
            "",
            "\1\u00b6",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bb",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\42\u0081\1\174\7\u0081\1\173\2\u0081\1\u0080\1\u0081\1\177"+
            "\12\u0081\1\176\101\u0081\1\175\uff83\u0081",
            "\42\u0083\1\u0082\7\u0083\1\u0086\2\u0083\1\u0088\1\u0083"+
            "\1\u0087\12\u0083\1\u0085\101\u0083\1\u0084\uff83\u0083",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d8",
            "\1\u00d9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00f3\7\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "\1\u00f5",
            "\1\u00f6\7\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00fc\10\uffff\1\u00fb\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u0106\7\uffff\2\45\1\u0105\7\45\7\uffff\32\45\4\uffff\1"+
            "\45\1\uffff\32\45",
            "\1\u0109\7\uffff\2\45\1\u0108\7\45\7\uffff\32\45\4\uffff\1"+
            "\45\1\uffff\32\45",
            "",
            "\1\u010b",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u010d",
            "\1\u010e\11\uffff\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113\7\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "",
            "",
            "\1\u0115\7\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "",
            "",
            "\1\u0117",
            "",
            "\1\u0119\37\uffff\1\u0118",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u011b",
            "\1\u011c",
            "",
            "",
            "",
            "",
            "\1\u011d",
            "",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0123",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u012a\11\uffff\1\u0129",
            "\1\u012b\20\uffff\1\u012c",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | VARCHAR | VARCHAR2 | NUMERIC | FLOAT | ID | ID1 | ID3 | N | WS | SL_COMMENT | ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_130 = input.LA(1);

                        s = -1;
                        if ( ((LA10_130>='\u0000' && LA10_130<='!')||(LA10_130>='#' && LA10_130<=')')||(LA10_130>='+' && LA10_130<=',')||LA10_130=='.'||(LA10_130>='0' && LA10_130<='9')||(LA10_130>=';' && LA10_130<='{')||(LA10_130>='}' && LA10_130<='\uFFFF')) ) {s = 131;}

                        else if ( (LA10_130=='\"') ) {s = 130;}

                        else if ( (LA10_130=='|') ) {s = 132;}

                        else if ( (LA10_130==':') ) {s = 133;}

                        else if ( (LA10_130=='*') ) {s = 134;}

                        else if ( (LA10_130=='/') ) {s = 135;}

                        else if ( (LA10_130=='-') ) {s = 136;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_175 = input.LA(1);

                        s = -1;
                        if ( (LA10_175=='\"') ) {s = 130;}

                        else if ( (LA10_175=='|') ) {s = 132;}

                        else if ( (LA10_175==':') ) {s = 133;}

                        else if ( (LA10_175=='*') ) {s = 134;}

                        else if ( (LA10_175=='/') ) {s = 135;}

                        else if ( (LA10_175=='-') ) {s = 136;}

                        else if ( ((LA10_175>='\u0000' && LA10_175<='!')||(LA10_175>='#' && LA10_175<=')')||(LA10_175>='+' && LA10_175<=',')||LA10_175=='.'||(LA10_175>='0' && LA10_175<='9')||(LA10_175>=';' && LA10_175<='{')||(LA10_175>='}' && LA10_175<='\uFFFF')) ) {s = 131;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_133 = input.LA(1);

                        s = -1;
                        if ( ((LA10_133>='\u0000' && LA10_133<='!')||(LA10_133>='#' && LA10_133<=')')||(LA10_133>='+' && LA10_133<=',')||LA10_133=='.'||(LA10_133>='0' && LA10_133<='9')||(LA10_133>=';' && LA10_133<='{')||(LA10_133>='}' && LA10_133<='\uFFFF')) ) {s = 131;}

                        else if ( (LA10_133=='\"') ) {s = 130;}

                        else if ( (LA10_133=='|') ) {s = 132;}

                        else if ( (LA10_133==':') ) {s = 133;}

                        else if ( (LA10_133=='*') ) {s = 134;}

                        else if ( (LA10_133=='/') ) {s = 135;}

                        else if ( (LA10_133=='-') ) {s = 136;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_134 = input.LA(1);

                        s = -1;
                        if ( ((LA10_134>='\u0000' && LA10_134<='!')||(LA10_134>='#' && LA10_134<=')')||(LA10_134>='+' && LA10_134<=',')||LA10_134=='.'||(LA10_134>='0' && LA10_134<='9')||(LA10_134>=';' && LA10_134<='{')||(LA10_134>='}' && LA10_134<='\uFFFF')) ) {s = 131;}

                        else if ( (LA10_134=='\"') ) {s = 130;}

                        else if ( (LA10_134=='|') ) {s = 132;}

                        else if ( (LA10_134==':') ) {s = 133;}

                        else if ( (LA10_134=='*') ) {s = 134;}

                        else if ( (LA10_134=='/') ) {s = 135;}

                        else if ( (LA10_134=='-') ) {s = 136;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_135 = input.LA(1);

                        s = -1;
                        if ( ((LA10_135>='\u0000' && LA10_135<='!')||(LA10_135>='#' && LA10_135<=')')||(LA10_135>='+' && LA10_135<=',')||LA10_135=='.'||(LA10_135>='0' && LA10_135<='9')||(LA10_135>=';' && LA10_135<='{')||(LA10_135>='}' && LA10_135<='\uFFFF')) ) {s = 131;}

                        else if ( (LA10_135=='\"') ) {s = 130;}

                        else if ( (LA10_135=='|') ) {s = 132;}

                        else if ( (LA10_135==':') ) {s = 133;}

                        else if ( (LA10_135=='*') ) {s = 134;}

                        else if ( (LA10_135=='/') ) {s = 135;}

                        else if ( (LA10_135=='-') ) {s = 136;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_136 = input.LA(1);

                        s = -1;
                        if ( ((LA10_136>='\u0000' && LA10_136<='!')||(LA10_136>='#' && LA10_136<=')')||(LA10_136>='+' && LA10_136<=',')||LA10_136=='.'||(LA10_136>='0' && LA10_136<='9')||(LA10_136>=';' && LA10_136<='{')||(LA10_136>='}' && LA10_136<='\uFFFF')) ) {s = 131;}

                        else if ( (LA10_136=='\"') ) {s = 130;}

                        else if ( (LA10_136=='|') ) {s = 132;}

                        else if ( (LA10_136==':') ) {s = 133;}

                        else if ( (LA10_136=='*') ) {s = 134;}

                        else if ( (LA10_136=='/') ) {s = 135;}

                        else if ( (LA10_136=='-') ) {s = 136;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_116 = input.LA(1);

                        s = -1;
                        if ( ((LA10_116>='\u0000' && LA10_116<='\uFFFF')) ) {s = 38;}

                        else s = 165;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_125 = input.LA(1);

                        s = -1;
                        if ( (LA10_125=='|') ) {s = 174;}

                        else if ( ((LA10_125>='\u0000' && LA10_125<='{')||(LA10_125>='}' && LA10_125<='\uFFFF')) ) {s = 129;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_84 = input.LA(1);

                        s = -1;
                        if ( (LA10_84=='*') ) {s = 123;}

                        else if ( (LA10_84=='\"') ) {s = 124;}

                        else if ( (LA10_84=='|') ) {s = 125;}

                        else if ( (LA10_84==':') ) {s = 126;}

                        else if ( (LA10_84=='/') ) {s = 127;}

                        else if ( (LA10_84=='-') ) {s = 128;}

                        else if ( ((LA10_84>='\u0000' && LA10_84<='!')||(LA10_84>='#' && LA10_84<=')')||(LA10_84>='+' && LA10_84<=',')||LA10_84=='.'||(LA10_84>='0' && LA10_84<='9')||(LA10_84>=';' && LA10_84<='{')||(LA10_84>='}' && LA10_84<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_123 = input.LA(1);

                        s = -1;
                        if ( (LA10_123=='/') ) {s = 173;}

                        else if ( (LA10_123=='*') ) {s = 123;}

                        else if ( (LA10_123=='\"') ) {s = 124;}

                        else if ( (LA10_123=='|') ) {s = 125;}

                        else if ( (LA10_123==':') ) {s = 126;}

                        else if ( (LA10_123=='-') ) {s = 128;}

                        else if ( ((LA10_123>='\u0000' && LA10_123<='!')||(LA10_123>='#' && LA10_123<=')')||(LA10_123>='+' && LA10_123<=',')||LA10_123=='.'||(LA10_123>='0' && LA10_123<='9')||(LA10_123>=';' && LA10_123<='{')||(LA10_123>='}' && LA10_123<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA10_124 = input.LA(1);

                        s = -1;
                        if ( (LA10_124=='*') ) {s = 123;}

                        else if ( (LA10_124=='\"') ) {s = 124;}

                        else if ( (LA10_124=='|') ) {s = 125;}

                        else if ( (LA10_124==':') ) {s = 126;}

                        else if ( (LA10_124=='/') ) {s = 127;}

                        else if ( (LA10_124=='-') ) {s = 128;}

                        else if ( ((LA10_124>='\u0000' && LA10_124<='!')||(LA10_124>='#' && LA10_124<=')')||(LA10_124>='+' && LA10_124<=',')||LA10_124=='.'||(LA10_124>='0' && LA10_124<='9')||(LA10_124>=';' && LA10_124<='{')||(LA10_124>='}' && LA10_124<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA10_174 = input.LA(1);

                        s = -1;
                        if ( (LA10_174=='\"') ) {s = 124;}

                        else if ( (LA10_174=='|') ) {s = 125;}

                        else if ( (LA10_174==':') ) {s = 126;}

                        else if ( (LA10_174=='*') ) {s = 123;}

                        else if ( (LA10_174=='/') ) {s = 127;}

                        else if ( (LA10_174=='-') ) {s = 128;}

                        else if ( ((LA10_174>='\u0000' && LA10_174<='!')||(LA10_174>='#' && LA10_174<=')')||(LA10_174>='+' && LA10_174<=',')||LA10_174=='.'||(LA10_174>='0' && LA10_174<='9')||(LA10_174>=';' && LA10_174<='{')||(LA10_174>='}' && LA10_174<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA10_126 = input.LA(1);

                        s = -1;
                        if ( (LA10_126=='*') ) {s = 123;}

                        else if ( (LA10_126=='\"') ) {s = 124;}

                        else if ( (LA10_126=='|') ) {s = 125;}

                        else if ( (LA10_126==':') ) {s = 126;}

                        else if ( (LA10_126=='/') ) {s = 127;}

                        else if ( (LA10_126=='-') ) {s = 128;}

                        else if ( ((LA10_126>='\u0000' && LA10_126<='!')||(LA10_126>='#' && LA10_126<=')')||(LA10_126>='+' && LA10_126<=',')||LA10_126=='.'||(LA10_126>='0' && LA10_126<='9')||(LA10_126>=';' && LA10_126<='{')||(LA10_126>='}' && LA10_126<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA10_127 = input.LA(1);

                        s = -1;
                        if ( (LA10_127=='*') ) {s = 123;}

                        else if ( (LA10_127=='\"') ) {s = 124;}

                        else if ( (LA10_127=='|') ) {s = 125;}

                        else if ( (LA10_127==':') ) {s = 126;}

                        else if ( (LA10_127=='/') ) {s = 127;}

                        else if ( (LA10_127=='-') ) {s = 128;}

                        else if ( ((LA10_127>='\u0000' && LA10_127<='!')||(LA10_127>='#' && LA10_127<=')')||(LA10_127>='+' && LA10_127<=',')||LA10_127=='.'||(LA10_127>='0' && LA10_127<='9')||(LA10_127>=';' && LA10_127<='{')||(LA10_127>='}' && LA10_127<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA10_128 = input.LA(1);

                        s = -1;
                        if ( (LA10_128=='*') ) {s = 123;}

                        else if ( (LA10_128=='\"') ) {s = 124;}

                        else if ( (LA10_128=='|') ) {s = 125;}

                        else if ( (LA10_128==':') ) {s = 126;}

                        else if ( (LA10_128=='/') ) {s = 127;}

                        else if ( (LA10_128=='-') ) {s = 128;}

                        else if ( ((LA10_128>='\u0000' && LA10_128<='!')||(LA10_128>='#' && LA10_128<=')')||(LA10_128>='+' && LA10_128<=',')||LA10_128=='.'||(LA10_128>='0' && LA10_128<='9')||(LA10_128>=';' && LA10_128<='{')||(LA10_128>='}' && LA10_128<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA10_132 = input.LA(1);

                        s = -1;
                        if ( (LA10_132=='|') ) {s = 175;}

                        else if ( ((LA10_132>='\u0000' && LA10_132<='{')||(LA10_132>='}' && LA10_132<='\uFFFF')) ) {s = 131;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA10_85 = input.LA(1);

                        s = -1;
                        if ( (LA10_85=='\"') ) {s = 130;}

                        else if ( ((LA10_85>='\u0000' && LA10_85<='!')||(LA10_85>='#' && LA10_85<=')')||(LA10_85>='+' && LA10_85<=',')||LA10_85=='.'||(LA10_85>='0' && LA10_85<='9')||(LA10_85>=';' && LA10_85<='{')||(LA10_85>='}' && LA10_85<='\uFFFF')) ) {s = 131;}

                        else if ( (LA10_85=='|') ) {s = 132;}

                        else if ( (LA10_85==':') ) {s = 133;}

                        else if ( (LA10_85=='*') ) {s = 134;}

                        else if ( (LA10_85=='/') ) {s = 135;}

                        else if ( (LA10_85=='-') ) {s = 136;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA10_173 = input.LA(1);

                        s = -1;
                        if ( (LA10_173=='*') ) {s = 123;}

                        else if ( (LA10_173=='\"') ) {s = 124;}

                        else if ( (LA10_173=='|') ) {s = 125;}

                        else if ( (LA10_173==':') ) {s = 126;}

                        else if ( (LA10_173=='/') ) {s = 127;}

                        else if ( (LA10_173=='-') ) {s = 128;}

                        else if ( ((LA10_173>='\u0000' && LA10_173<='!')||(LA10_173>='#' && LA10_173<=')')||(LA10_173>='+' && LA10_173<=',')||LA10_173=='.'||(LA10_173>='0' && LA10_173<='9')||(LA10_173>=';' && LA10_173<='{')||(LA10_173>='}' && LA10_173<='\uFFFF')) ) {s = 129;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA10_24 = input.LA(1);

                        s = -1;
                        if ( (LA10_24==')') ) {s = 74;}

                        else if ( ((LA10_24>='\u0000' && LA10_24<='(')||(LA10_24>='*' && LA10_24<='\uFFFF')) ) {s = 38;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}