// $ANTLR 3.3 Nov 30, 2010 12:50:56 PLSQL3.g 2019-12-18 11:09:21
package com.org.infy.cpc.antlr.transformer;
import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class PLSQL3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "N", "ID1", "VARCHAR", "VARCHAR2", "NUMERIC", "FLOAT", "ID3", "WS", "SL_COMMENT", "ML_COMMENT", "'DECLARE'", "'create or replace PACKAGE BODY'", "'CREATE OR REPLACE PACKAGE BODY'", "'AS'", "'BEGIN'", "'END'", "'LOOP'", "'IF'", "'THEN'", "'EXIT;'", "'END IF;'", "'END LOOP;'", "'CREATE OR REPLACE FUNCTION'", "'FUNCTION'", "'CREATE FUNCTION'", "'REPLACE FUNCTION'", "'RETURN'", "';'", "'IS'", "'END;'", "'WHILE'", "'FOR'", "'in'", "'..'", "'CREATE OR REPLACE PROCEDURE'", "'PROCEDURE'", "'CREATE PROCEDURE'", "'REPLACE PROCEDURE'", "'ELSE'", "'ELSIF'", "':='", "'.'", "'\"'", "'dbms_output.put_line'", "'FND_FILE.put_line'", "'FND_FILE.PUT_LINE'", "'write_debug'", "'SELECT'", "'INTO'", "'FROM'", "'INSERT INTO'", "'UPDATE'", "'SET'", "'='", "'();'", "'('", "'<'", "'>'", "'+'", "')'", "','", "'IN'", "'OUT'", "'number'", "'NUMBER'", "'VARCHAR'", "'VARCHAR2'", "'FLOAT'", "'NUMBER('", "'number('", "'VARCHAR2('", "'varchar2('", "'VARCHAR('", "'varchar('", "'%TYPE'", "'%type'"
    };
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

    protected static class slist_scope {
        List locals;
        List stats;
    }
    protected Stack slist_stack = new Stack();


        public PLSQL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PLSQL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("PLSQL3ParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return PLSQL3Parser.tokenNames; }
    public String getGrammarFileName() { return "PLSQL3.g"; }


    protected static class program_scope {
        List globals;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // PLSQL3.g:15:1: program : ( 'DECLARE' | 'create or replace PACKAGE BODY' | 'CREATE OR REPLACE PACKAGE BODY' ) classname= v1 ( 'AS' )? ( declaration )+ 'BEGIN' ( block )+ 'END' -> program(globals=$program::globalsclassname=$classname.st);
    public final PLSQL3Parser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        PLSQL3Parser.program_return retval = new PLSQL3Parser.program_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return classname = null;



          ((program_scope)program_stack.peek()).globals = new ArrayList();

        try {
            // PLSQL3.g:22:5: ( ( 'DECLARE' | 'create or replace PACKAGE BODY' | 'CREATE OR REPLACE PACKAGE BODY' ) classname= v1 ( 'AS' )? ( declaration )+ 'BEGIN' ( block )+ 'END' -> program(globals=$program::globalsclassname=$classname.st))
            // PLSQL3.g:22:9: ( 'DECLARE' | 'create or replace PACKAGE BODY' | 'CREATE OR REPLACE PACKAGE BODY' ) classname= v1 ( 'AS' )? ( declaration )+ 'BEGIN' ( block )+ 'END'
            {
            // PLSQL3.g:22:9: ( 'DECLARE' | 'create or replace PACKAGE BODY' | 'CREATE OR REPLACE PACKAGE BODY' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // PLSQL3.g:22:10: 'DECLARE'
                    {
                    match(input,15,FOLLOW_15_in_program48); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:22:22: 'create or replace PACKAGE BODY'
                    {
                    match(input,16,FOLLOW_16_in_program52); 

                    }
                    break;
                case 3 :
                    // PLSQL3.g:22:57: 'CREATE OR REPLACE PACKAGE BODY'
                    {
                    match(input,17,FOLLOW_17_in_program56); 

                    }
                    break;

            }

            pushFollow(FOLLOW_v1_in_program61);
            classname=v1();

            state._fsp--;

            // PLSQL3.g:23:3: ( 'AS' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PLSQL3.g:23:3: 'AS'
                    {
                    match(input,18,FOLLOW_18_in_program66); 

                    }
                    break;

            }

            // PLSQL3.g:24:9: ( declaration )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PLSQL3.g:24:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program77);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match(input,19,FOLLOW_19_in_program88); 
            // PLSQL3.g:26:13: ( block )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||(LA4_0>=21 && LA4_0<=22)||(LA4_0>=27 && LA4_0<=30)||(LA4_0>=35 && LA4_0<=36)||(LA4_0>=39 && LA4_0<=42)||LA4_0==44||(LA4_0>=48 && LA4_0<=52)||(LA4_0>=55 && LA4_0<=56)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PLSQL3.g:26:13: block
            	    {
            	    pushFollow(FOLLOW_block_in_program102);
            	    block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,20,FOLLOW_20_in_program113); 


            // TEMPLATE REWRITE
            // 28:9: -> program(globals=$program::globalsclassname=$classname.st)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("classname", (classname!=null?classname.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // PLSQL3.g:31:1: block : ( assignment | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function | funccall | procall );
    public final PLSQL3Parser.block_return block() throws RecognitionException {
        PLSQL3Parser.block_return retval = new PLSQL3Parser.block_return();
        retval.start = input.LT(1);

        PLSQL3Parser.assignment_return assignment1 = null;

        PLSQL3Parser.printstatement_return printstatement2 = null;

        PLSQL3Parser.sql_query_return sql_query3 = null;

        PLSQL3Parser.insert_statement_return insert_statement4 = null;

        PLSQL3Parser.update_statement_return update_statement5 = null;

        PLSQL3Parser.conditionals_return conditionals6 = null;

        PLSQL3Parser.conditionalelsif_return conditionalelsif7 = null;

        PLSQL3Parser.loops_return loops8 = null;

        PLSQL3Parser.wloop_return wloop9 = null;

        PLSQL3Parser.floop_return floop10 = null;

        PLSQL3Parser.procedure_return procedure11 = null;

        PLSQL3Parser.function_return function12 = null;

        PLSQL3Parser.funccall_return funccall13 = null;

        PLSQL3Parser.procall_return procall14 = null;


        try {
            // PLSQL3.g:32:5: ( assignment | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function | funccall | procall )
            int alt5=14;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // PLSQL3.g:32:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_block152);
                    assignment1=assignment();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((assignment1!=null?assignment1.st:null));

                    }
                    break;
                case 2 :
                    // PLSQL3.g:33:7: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_block162);
                    printstatement2=printstatement();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((printstatement2!=null?printstatement2.st:null));

                    }
                    break;
                case 3 :
                    // PLSQL3.g:34:7: sql_query
                    {
                    pushFollow(FOLLOW_sql_query_in_block173);
                    sql_query3=sql_query();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((sql_query3!=null?sql_query3.st:null));

                    }
                    break;
                case 4 :
                    // PLSQL3.g:35:4: insert_statement
                    {
                    pushFollow(FOLLOW_insert_statement_in_block184);
                    insert_statement4=insert_statement();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((insert_statement4!=null?insert_statement4.st:null));

                    }
                    break;
                case 5 :
                    // PLSQL3.g:36:4: update_statement
                    {
                    pushFollow(FOLLOW_update_statement_in_block195);
                    update_statement5=update_statement();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((update_statement5!=null?update_statement5.st:null));

                    }
                    break;
                case 6 :
                    // PLSQL3.g:37:7: conditionals
                    {
                    pushFollow(FOLLOW_conditionals_in_block209);
                    conditionals6=conditionals();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((conditionals6!=null?conditionals6.st:null));

                    }
                    break;
                case 7 :
                    // PLSQL3.g:38:4: conditionalelsif
                    {
                    pushFollow(FOLLOW_conditionalelsif_in_block217);
                    conditionalelsif7=conditionalelsif();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((conditionalelsif7!=null?conditionalelsif7.st:null));

                    }
                    break;
                case 8 :
                    // PLSQL3.g:39:7: loops
                    {
                    pushFollow(FOLLOW_loops_in_block228);
                    loops8=loops();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((loops8!=null?loops8.st:null));

                    }
                    break;
                case 9 :
                    // PLSQL3.g:40:7: wloop
                    {
                    pushFollow(FOLLOW_wloop_in_block238);
                    wloop9=wloop();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((wloop9!=null?wloop9.st:null));

                    }
                    break;
                case 10 :
                    // PLSQL3.g:41:7: floop
                    {
                    pushFollow(FOLLOW_floop_in_block248);
                    floop10=floop();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((floop10!=null?floop10.st:null));

                    }
                    break;
                case 11 :
                    // PLSQL3.g:42:7: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_block258);
                    procedure11=procedure();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((procedure11!=null?procedure11.st:null));

                    }
                    break;
                case 12 :
                    // PLSQL3.g:43:7: function
                    {
                    pushFollow(FOLLOW_function_in_block268);
                    function12=function();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((function12!=null?function12.st:null));

                    }
                    break;
                case 13 :
                    // PLSQL3.g:44:7: funccall
                    {
                    pushFollow(FOLLOW_funccall_in_block278);
                    funccall13=funccall();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((funccall13!=null?funccall13.st:null));

                    }
                    break;
                case 14 :
                    // PLSQL3.g:45:7: procall
                    {
                    pushFollow(FOLLOW_procall_in_block288);
                    procall14=procall();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((procall14!=null?procall14.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class loops_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "loops"
    // PLSQL3.g:48:1: loops : 'LOOP' ( blockert )+ 'IF' t2= v11 'THEN' 'EXIT;' 'END IF;' 'END LOOP;' -> findloop(locals=$slist::localst2=$t2.st);
    public final PLSQL3Parser.loops_return loops() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.loops_return retval = new PLSQL3Parser.loops_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v11_return t2 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:53:5: ( 'LOOP' ( blockert )+ 'IF' t2= v11 'THEN' 'EXIT;' 'END IF;' 'END LOOP;' -> findloop(locals=$slist::localst2=$t2.st))
            // PLSQL3.g:53:8: 'LOOP' ( blockert )+ 'IF' t2= v11 'THEN' 'EXIT;' 'END IF;' 'END LOOP;'
            {
            match(input,21,FOLLOW_21_in_loops319); 
            // PLSQL3.g:54:13: ( blockert )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==ID1) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==23) ) {
                            int LA6_4 = input.LA(4);

                            if ( (LA6_4==ID||(LA6_4>=21 && LA6_4<=22)||(LA6_4>=27 && LA6_4<=30)||(LA6_4>=35 && LA6_4<=36)||(LA6_4>=39 && LA6_4<=42)||LA6_4==44||(LA6_4>=48 && LA6_4<=52)||(LA6_4>=55 && LA6_4<=56)) ) {
                                alt6=1;
                            }


                        }


                    }


                }
                else if ( (LA6_0==ID||LA6_0==21||(LA6_0>=27 && LA6_0<=30)||(LA6_0>=35 && LA6_0<=36)||(LA6_0>=39 && LA6_0<=42)||LA6_0==44||(LA6_0>=48 && LA6_0<=52)||(LA6_0>=55 && LA6_0<=56)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PLSQL3.g:54:13: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_loops333);
            	    blockert();

            	    state._fsp--;


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

            match(input,22,FOLLOW_22_in_loops339); 
            pushFollow(FOLLOW_v11_in_loops343);
            t2=v11();

            state._fsp--;

            match(input,23,FOLLOW_23_in_loops345); 
            match(input,24,FOLLOW_24_in_loops351); 
            match(input,25,FOLLOW_25_in_loops356); 
            match(input,26,FOLLOW_26_in_loops366); 


            // TEMPLATE REWRITE
            // 59:5: -> findloop(locals=$slist::localst2=$t2.st)
            {
                retval.st = templateLib.getInstanceOf("findloop",
              new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("t2", (t2!=null?t2.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "loops"

    public static class function_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function"
    // PLSQL3.g:62:1: function : ( 'CREATE OR REPLACE FUNCTION' | 'FUNCTION' | 'CREATE FUNCTION' | 'REPLACE FUNCTION' ) t1= v1 t7= v11 'RETURN' t2= type ';' 'IS' t3= variable 'BEGIN' ( blockert )+ 'RETURN' t5= variable ';' 'END;' -> function(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::localst5=$t5.stt7=$t7.st);
    public final PLSQL3Parser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.function_return retval = new PLSQL3Parser.function_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;

        PLSQL3Parser.v11_return t7 = null;

        PLSQL3Parser.type_return t2 = null;

        PLSQL3Parser.variable_return t3 = null;

        PLSQL3Parser.variable_return t5 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:67:5: ( ( 'CREATE OR REPLACE FUNCTION' | 'FUNCTION' | 'CREATE FUNCTION' | 'REPLACE FUNCTION' ) t1= v1 t7= v11 'RETURN' t2= type ';' 'IS' t3= variable 'BEGIN' ( blockert )+ 'RETURN' t5= variable ';' 'END;' -> function(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::localst5=$t5.stt7=$t7.st))
            // PLSQL3.g:67:7: ( 'CREATE OR REPLACE FUNCTION' | 'FUNCTION' | 'CREATE FUNCTION' | 'REPLACE FUNCTION' ) t1= v1 t7= v11 'RETURN' t2= type ';' 'IS' t3= variable 'BEGIN' ( blockert )+ 'RETURN' t5= variable ';' 'END;'
            {
            // PLSQL3.g:67:7: ( 'CREATE OR REPLACE FUNCTION' | 'FUNCTION' | 'CREATE FUNCTION' | 'REPLACE FUNCTION' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // PLSQL3.g:67:8: 'CREATE OR REPLACE FUNCTION'
                    {
                    match(input,27,FOLLOW_27_in_function413); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:67:39: 'FUNCTION'
                    {
                    match(input,28,FOLLOW_28_in_function417); 

                    }
                    break;
                case 3 :
                    // PLSQL3.g:67:52: 'CREATE FUNCTION'
                    {
                    match(input,29,FOLLOW_29_in_function421); 

                    }
                    break;
                case 4 :
                    // PLSQL3.g:67:72: 'REPLACE FUNCTION'
                    {
                    match(input,30,FOLLOW_30_in_function425); 

                    }
                    break;

            }

            pushFollow(FOLLOW_v1_in_function430);
            t1=v1();

            state._fsp--;

            pushFollow(FOLLOW_v11_in_function434);
            t7=v11();

            state._fsp--;

            match(input,31,FOLLOW_31_in_function444); 
            pushFollow(FOLLOW_type_in_function461);
            t2=type();

            state._fsp--;

            match(input,32,FOLLOW_32_in_function463); 
            match(input,33,FOLLOW_33_in_function473); 
            pushFollow(FOLLOW_variable_in_function491);
            t3=variable();

            state._fsp--;

            match(input,19,FOLLOW_19_in_function501); 
            // PLSQL3.g:73:13: ( blockert )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||(LA8_0>=21 && LA8_0<=22)||(LA8_0>=27 && LA8_0<=30)||(LA8_0>=35 && LA8_0<=36)||(LA8_0>=39 && LA8_0<=42)||LA8_0==44||(LA8_0>=48 && LA8_0<=52)||(LA8_0>=55 && LA8_0<=56)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // PLSQL3.g:73:13: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_function515);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match(input,31,FOLLOW_31_in_function530); 
            pushFollow(FOLLOW_variable_in_function534);
            t5=variable();

            state._fsp--;

            match(input,32,FOLLOW_32_in_function536); 
            match(input,34,FOLLOW_34_in_function546); 


            // TEMPLATE REWRITE
            // 76:9: -> function(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::localst5=$t5.stt7=$t7.st)
            {
                retval.st = templateLib.getInstanceOf("function",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)).put("t2", (t2!=null?t2.st:null)).put("t3", (t3!=null?t3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("t5", (t5!=null?t5.st:null)).put("t7", (t7!=null?t7.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "function"

    public static class wloop_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "wloop"
    // PLSQL3.g:79:1: wloop : 'WHILE' t2= v10 'LOOP' ( blockert )+ 'END LOOP;' -> wloop(locals=$slist::localst2=$t2.st);
    public final PLSQL3Parser.wloop_return wloop() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.wloop_return retval = new PLSQL3Parser.wloop_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v10_return t2 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:84:5: ( 'WHILE' t2= v10 'LOOP' ( blockert )+ 'END LOOP;' -> wloop(locals=$slist::localst2=$t2.st))
            // PLSQL3.g:84:7: 'WHILE' t2= v10 'LOOP' ( blockert )+ 'END LOOP;'
            {
            match(input,35,FOLLOW_35_in_wloop620); 
            pushFollow(FOLLOW_v10_in_wloop624);
            t2=v10();

            state._fsp--;

            match(input,21,FOLLOW_21_in_wloop626); 
            // PLSQL3.g:85:13: ( blockert )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||(LA9_0>=21 && LA9_0<=22)||(LA9_0>=27 && LA9_0<=30)||(LA9_0>=35 && LA9_0<=36)||(LA9_0>=39 && LA9_0<=42)||LA9_0==44||(LA9_0>=48 && LA9_0<=52)||(LA9_0>=55 && LA9_0<=56)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PLSQL3.g:85:13: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_wloop640);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match(input,26,FOLLOW_26_in_wloop650); 


            // TEMPLATE REWRITE
            // 87:8: -> wloop(locals=$slist::localst2=$t2.st)
            {
                retval.st = templateLib.getInstanceOf("wloop",
              new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("t2", (t2!=null?t2.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "wloop"

    public static class floop_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "floop"
    // PLSQL3.g:90:1: floop : 'FOR' t1= v1 'in' t2= aside1 '..' t3= aside1 'LOOP' ( blockert )+ 'END LOOP;' -> floop(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::locals);
    public final PLSQL3Parser.floop_return floop() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.floop_return retval = new PLSQL3Parser.floop_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;

        PLSQL3Parser.aside1_return t2 = null;

        PLSQL3Parser.aside1_return t3 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:96:5: ( 'FOR' t1= v1 'in' t2= aside1 '..' t3= aside1 'LOOP' ( blockert )+ 'END LOOP;' -> floop(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::locals))
            // PLSQL3.g:96:7: 'FOR' t1= v1 'in' t2= aside1 '..' t3= aside1 'LOOP' ( blockert )+ 'END LOOP;'
            {
            match(input,36,FOLLOW_36_in_floop696); 
            pushFollow(FOLLOW_v1_in_floop700);
            t1=v1();

            state._fsp--;

            match(input,37,FOLLOW_37_in_floop702); 
            pushFollow(FOLLOW_aside1_in_floop706);
            t2=aside1();

            state._fsp--;

            match(input,38,FOLLOW_38_in_floop708); 
            pushFollow(FOLLOW_aside1_in_floop712);
            t3=aside1();

            state._fsp--;

            match(input,21,FOLLOW_21_in_floop714); 
            // PLSQL3.g:97:9: ( blockert )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||(LA10_0>=21 && LA10_0<=22)||(LA10_0>=27 && LA10_0<=30)||(LA10_0>=35 && LA10_0<=36)||(LA10_0>=39 && LA10_0<=42)||LA10_0==44||(LA10_0>=48 && LA10_0<=52)||(LA10_0>=55 && LA10_0<=56)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PLSQL3.g:97:9: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_floop725);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(input,26,FOLLOW_26_in_floop734); 


            // TEMPLATE REWRITE
            // 99:7: -> floop(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::locals)
            {
                retval.st = templateLib.getInstanceOf("floop",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)).put("t2", (t2!=null?t2.st:null)).put("t3", (t3!=null?t3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "floop"

    public static class procedure_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "procedure"
    // PLSQL3.g:103:1: procedure : ( 'CREATE OR REPLACE PROCEDURE' | 'PROCEDURE' | 'CREATE PROCEDURE' | 'REPLACE PROCEDURE' ) t1= v1 t2= arguments ( 'AS' | 'IS' ) ( variable )* 'BEGIN' ( blockert )+ 'END;' -> procedure(t1=$t1.stt2=$t2.stlocals=$slist::localst4=$variable.st);
    public final PLSQL3Parser.procedure_return procedure() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.procedure_return retval = new PLSQL3Parser.procedure_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;

        PLSQL3Parser.arguments_return t2 = null;

        PLSQL3Parser.variable_return variable15 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:108:5: ( ( 'CREATE OR REPLACE PROCEDURE' | 'PROCEDURE' | 'CREATE PROCEDURE' | 'REPLACE PROCEDURE' ) t1= v1 t2= arguments ( 'AS' | 'IS' ) ( variable )* 'BEGIN' ( blockert )+ 'END;' -> procedure(t1=$t1.stt2=$t2.stlocals=$slist::localst4=$variable.st))
            // PLSQL3.g:109:5: ( 'CREATE OR REPLACE PROCEDURE' | 'PROCEDURE' | 'CREATE PROCEDURE' | 'REPLACE PROCEDURE' ) t1= v1 t2= arguments ( 'AS' | 'IS' ) ( variable )* 'BEGIN' ( blockert )+ 'END;'
            {
            // PLSQL3.g:109:5: ( 'CREATE OR REPLACE PROCEDURE' | 'PROCEDURE' | 'CREATE PROCEDURE' | 'REPLACE PROCEDURE' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt11=1;
                }
                break;
            case 40:
                {
                alt11=2;
                }
                break;
            case 41:
                {
                alt11=3;
                }
                break;
            case 42:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // PLSQL3.g:109:6: 'CREATE OR REPLACE PROCEDURE'
                    {
                    match(input,39,FOLLOW_39_in_procedure815); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:109:38: 'PROCEDURE'
                    {
                    match(input,40,FOLLOW_40_in_procedure819); 

                    }
                    break;
                case 3 :
                    // PLSQL3.g:109:52: 'CREATE PROCEDURE'
                    {
                    match(input,41,FOLLOW_41_in_procedure823); 

                    }
                    break;
                case 4 :
                    // PLSQL3.g:109:73: 'REPLACE PROCEDURE'
                    {
                    match(input,42,FOLLOW_42_in_procedure827); 

                    }
                    break;

            }

            pushFollow(FOLLOW_v1_in_procedure832);
            t1=v1();

            state._fsp--;

            pushFollow(FOLLOW_arguments_in_procedure836);
            t2=arguments();

            state._fsp--;

            // PLSQL3.g:110:5: ( 'AS' | 'IS' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==33) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // PLSQL3.g:110:6: 'AS'
                    {
                    match(input,18,FOLLOW_18_in_procedure843); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:110:11: 'IS'
                    {
                    match(input,33,FOLLOW_33_in_procedure845); 

                    }
                    break;

            }

            // PLSQL3.g:111:3: ( variable )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // PLSQL3.g:111:3: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_procedure850);
            	    variable15=variable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_procedure857); 
            // PLSQL3.g:113:9: ( blockert )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID||(LA14_0>=21 && LA14_0<=22)||(LA14_0>=27 && LA14_0<=30)||(LA14_0>=35 && LA14_0<=36)||(LA14_0>=39 && LA14_0<=42)||LA14_0==44||(LA14_0>=48 && LA14_0<=52)||(LA14_0>=55 && LA14_0<=56)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PLSQL3.g:113:9: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_procedure867);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            match(input,34,FOLLOW_34_in_procedure874); 


            // TEMPLATE REWRITE
            // 115:5: -> procedure(t1=$t1.stt2=$t2.stlocals=$slist::localst4=$variable.st)
            {
                retval.st = templateLib.getInstanceOf("procedure",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)).put("t2", (t2!=null?t2.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("t4", (variable15!=null?variable15.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "procedure"

    public static class conditionals_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionals"
    // PLSQL3.g:121:1: conditionals : 'IF' v11 'THEN' ( blockert )+ ( 'ELSE' ( blockert1 )+ )? 'END IF;' -> conditionals(v4=$v11.stlocals=$slist::localsstats=$slist::stats);
    public final PLSQL3Parser.conditionals_return conditionals() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.conditionals_return retval = new PLSQL3Parser.conditionals_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v11_return v1116 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();
             ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // PLSQL3.g:127:9: ( 'IF' v11 'THEN' ( blockert )+ ( 'ELSE' ( blockert1 )+ )? 'END IF;' -> conditionals(v4=$v11.stlocals=$slist::localsstats=$slist::stats))
            // PLSQL3.g:127:13: 'IF' v11 'THEN' ( blockert )+ ( 'ELSE' ( blockert1 )+ )? 'END IF;'
            {
            match(input,22,FOLLOW_22_in_conditionals953); 
            pushFollow(FOLLOW_v11_in_conditionals955);
            v1116=v11();

            state._fsp--;

            match(input,23,FOLLOW_23_in_conditionals957); 
            // PLSQL3.g:128:17: ( blockert )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID||(LA15_0>=21 && LA15_0<=22)||(LA15_0>=27 && LA15_0<=30)||(LA15_0>=35 && LA15_0<=36)||(LA15_0>=39 && LA15_0<=42)||LA15_0==44||(LA15_0>=48 && LA15_0<=52)||(LA15_0>=55 && LA15_0<=56)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // PLSQL3.g:128:17: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_conditionals975);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // PLSQL3.g:129:5: ( 'ELSE' ( blockert1 )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PLSQL3.g:129:6: 'ELSE' ( blockert1 )+
                    {
                    match(input,43,FOLLOW_43_in_conditionals983); 
                    // PLSQL3.g:130:6: ( blockert1 )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==ID||(LA16_0>=21 && LA16_0<=22)||(LA16_0>=27 && LA16_0<=30)||(LA16_0>=35 && LA16_0<=36)||(LA16_0>=39 && LA16_0<=42)||LA16_0==44||(LA16_0>=48 && LA16_0<=52)||(LA16_0>=55 && LA16_0<=56)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // PLSQL3.g:130:6: blockert1
                    	    {
                    	    pushFollow(FOLLOW_blockert1_in_conditionals991);
                    	    blockert1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_conditionals1008); 


            // TEMPLATE REWRITE
            // 132:13: -> conditionals(v4=$v11.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("conditionals",
              new STAttrMap().put("v4", (v1116!=null?v1116.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "conditionals"

    public static class conditionalelsif_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalelsif"
    // PLSQL3.g:135:1: conditionalelsif : 'ELSIF' v12 'THEN' ( blockert1 )+ 'END IF;' -> conditionalelsif(v7=$v12.stlocals=$slist::localsstats=$slist::stats);
    public final PLSQL3Parser.conditionalelsif_return conditionalelsif() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.conditionalelsif_return retval = new PLSQL3Parser.conditionalelsif_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v12_return v1217 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();
             ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // PLSQL3.g:141:9: ( 'ELSIF' v12 'THEN' ( blockert1 )+ 'END IF;' -> conditionalelsif(v7=$v12.stlocals=$slist::localsstats=$slist::stats))
            // PLSQL3.g:141:11: 'ELSIF' v12 'THEN' ( blockert1 )+ 'END IF;'
            {
            match(input,44,FOLLOW_44_in_conditionalelsif1069); 
            pushFollow(FOLLOW_v12_in_conditionalelsif1071);
            v1217=v12();

            state._fsp--;

            match(input,23,FOLLOW_23_in_conditionalelsif1073); 
            // PLSQL3.g:142:6: ( blockert1 )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ID||(LA18_0>=21 && LA18_0<=22)||(LA18_0>=27 && LA18_0<=30)||(LA18_0>=35 && LA18_0<=36)||(LA18_0>=39 && LA18_0<=42)||LA18_0==44||(LA18_0>=48 && LA18_0<=52)||(LA18_0>=55 && LA18_0<=56)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // PLSQL3.g:142:6: blockert1
            	    {
            	    pushFollow(FOLLOW_blockert1_in_conditionalelsif1080);
            	    blockert1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            match(input,25,FOLLOW_25_in_conditionalelsif1087); 


            // TEMPLATE REWRITE
            // 144:5: -> conditionalelsif(v7=$v12.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("conditionalelsif",
              new STAttrMap().put("v7", (v1217!=null?v1217.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "conditionalelsif"

    public static class blockert_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockert"
    // PLSQL3.g:148:1: blockert : ( assignment | assignment1 | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function );
    public final PLSQL3Parser.blockert_return blockert() throws RecognitionException {
        PLSQL3Parser.blockert_return retval = new PLSQL3Parser.blockert_return();
        retval.start = input.LT(1);

        PLSQL3Parser.assignment_return assignment18 = null;

        PLSQL3Parser.assignment1_return assignment119 = null;

        PLSQL3Parser.printstatement_return printstatement20 = null;

        PLSQL3Parser.sql_query_return sql_query21 = null;

        PLSQL3Parser.insert_statement_return insert_statement22 = null;

        PLSQL3Parser.update_statement_return update_statement23 = null;

        PLSQL3Parser.conditionals_return conditionals24 = null;

        PLSQL3Parser.conditionalelsif_return conditionalelsif25 = null;

        PLSQL3Parser.loops_return loops26 = null;

        PLSQL3Parser.wloop_return wloop27 = null;

        PLSQL3Parser.floop_return floop28 = null;

        PLSQL3Parser.procedure_return procedure29 = null;

        PLSQL3Parser.function_return function30 = null;


        try {
            // PLSQL3.g:149:3: ( assignment | assignment1 | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function )
            int alt19=13;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // PLSQL3.g:149:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockert1129);
                    assignment18=assignment();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((assignment18!=null?assignment18.st:null));

                    }
                    break;
                case 2 :
                    // PLSQL3.g:150:7: assignment1
                    {
                    pushFollow(FOLLOW_assignment1_in_blockert1140);
                    assignment119=assignment1();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((assignment119!=null?assignment119.st:null));

                    }
                    break;
                case 3 :
                    // PLSQL3.g:151:7: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_blockert1150);
                    printstatement20=printstatement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((printstatement20!=null?printstatement20.st:null));

                    }
                    break;
                case 4 :
                    // PLSQL3.g:152:7: sql_query
                    {
                    pushFollow(FOLLOW_sql_query_in_blockert1162);
                    sql_query21=sql_query();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((sql_query21!=null?sql_query21.st:null));

                    }
                    break;
                case 5 :
                    // PLSQL3.g:153:4: insert_statement
                    {
                    pushFollow(FOLLOW_insert_statement_in_blockert1174);
                    insert_statement22=insert_statement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((insert_statement22!=null?insert_statement22.st:null));

                    }
                    break;
                case 6 :
                    // PLSQL3.g:154:4: update_statement
                    {
                    pushFollow(FOLLOW_update_statement_in_blockert1181);
                    update_statement23=update_statement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((update_statement23!=null?update_statement23.st:null));

                    }
                    break;
                case 7 :
                    // PLSQL3.g:155:7: conditionals
                    {
                    pushFollow(FOLLOW_conditionals_in_blockert1191);
                    conditionals24=conditionals();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((conditionals24!=null?conditionals24.st:null));

                    }
                    break;
                case 8 :
                    // PLSQL3.g:156:4: conditionalelsif
                    {
                    pushFollow(FOLLOW_conditionalelsif_in_blockert1200);
                    conditionalelsif25=conditionalelsif();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((conditionalelsif25!=null?conditionalelsif25.st:null));

                    }
                    break;
                case 9 :
                    // PLSQL3.g:157:7: loops
                    {
                    pushFollow(FOLLOW_loops_in_blockert1212);
                    loops26=loops();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((loops26!=null?loops26.st:null));

                    }
                    break;
                case 10 :
                    // PLSQL3.g:158:7: wloop
                    {
                    pushFollow(FOLLOW_wloop_in_blockert1223);
                    wloop27=wloop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((wloop27!=null?wloop27.st:null));

                    }
                    break;
                case 11 :
                    // PLSQL3.g:159:7: floop
                    {
                    pushFollow(FOLLOW_floop_in_blockert1234);
                    floop28=floop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((floop28!=null?floop28.st:null));

                    }
                    break;
                case 12 :
                    // PLSQL3.g:160:7: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_blockert1245);
                    procedure29=procedure();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((procedure29!=null?procedure29.st:null));

                    }
                    break;
                case 13 :
                    // PLSQL3.g:161:7: function
                    {
                    pushFollow(FOLLOW_function_in_blockert1256);
                    function30=function();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((function30!=null?function30.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockert"

    public static class blockert1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockert1"
    // PLSQL3.g:164:1: blockert1 : ( assignment | assignment1 | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function );
    public final PLSQL3Parser.blockert1_return blockert1() throws RecognitionException {
        PLSQL3Parser.blockert1_return retval = new PLSQL3Parser.blockert1_return();
        retval.start = input.LT(1);

        PLSQL3Parser.assignment_return assignment31 = null;

        PLSQL3Parser.assignment1_return assignment132 = null;

        PLSQL3Parser.printstatement_return printstatement33 = null;

        PLSQL3Parser.sql_query_return sql_query34 = null;

        PLSQL3Parser.insert_statement_return insert_statement35 = null;

        PLSQL3Parser.update_statement_return update_statement36 = null;

        PLSQL3Parser.conditionals_return conditionals37 = null;

        PLSQL3Parser.conditionalelsif_return conditionalelsif38 = null;

        PLSQL3Parser.loops_return loops39 = null;

        PLSQL3Parser.wloop_return wloop40 = null;

        PLSQL3Parser.floop_return floop41 = null;

        PLSQL3Parser.procedure_return procedure42 = null;

        PLSQL3Parser.function_return function43 = null;


        try {
            // PLSQL3.g:165:3: ( assignment | assignment1 | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function )
            int alt20=13;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // PLSQL3.g:165:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockert11275);
                    assignment31=assignment();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((assignment31!=null?assignment31.st:null));

                    }
                    break;
                case 2 :
                    // PLSQL3.g:166:7: assignment1
                    {
                    pushFollow(FOLLOW_assignment1_in_blockert11286);
                    assignment132=assignment1();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((assignment132!=null?assignment132.st:null));

                    }
                    break;
                case 3 :
                    // PLSQL3.g:167:7: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_blockert11296);
                    printstatement33=printstatement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((printstatement33!=null?printstatement33.st:null));

                    }
                    break;
                case 4 :
                    // PLSQL3.g:168:7: sql_query
                    {
                    pushFollow(FOLLOW_sql_query_in_blockert11308);
                    sql_query34=sql_query();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((sql_query34!=null?sql_query34.st:null));

                    }
                    break;
                case 5 :
                    // PLSQL3.g:169:4: insert_statement
                    {
                    pushFollow(FOLLOW_insert_statement_in_blockert11320);
                    insert_statement35=insert_statement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((insert_statement35!=null?insert_statement35.st:null));

                    }
                    break;
                case 6 :
                    // PLSQL3.g:170:4: update_statement
                    {
                    pushFollow(FOLLOW_update_statement_in_blockert11328);
                    update_statement36=update_statement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((update_statement36!=null?update_statement36.st:null));

                    }
                    break;
                case 7 :
                    // PLSQL3.g:171:7: conditionals
                    {
                    pushFollow(FOLLOW_conditionals_in_blockert11338);
                    conditionals37=conditionals();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((conditionals37!=null?conditionals37.st:null));

                    }
                    break;
                case 8 :
                    // PLSQL3.g:172:4: conditionalelsif
                    {
                    pushFollow(FOLLOW_conditionalelsif_in_blockert11347);
                    conditionalelsif38=conditionalelsif();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((conditionalelsif38!=null?conditionalelsif38.st:null));

                    }
                    break;
                case 9 :
                    // PLSQL3.g:173:7: loops
                    {
                    pushFollow(FOLLOW_loops_in_blockert11359);
                    loops39=loops();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((loops39!=null?loops39.st:null));

                    }
                    break;
                case 10 :
                    // PLSQL3.g:174:7: wloop
                    {
                    pushFollow(FOLLOW_wloop_in_blockert11370);
                    wloop40=wloop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((wloop40!=null?wloop40.st:null));

                    }
                    break;
                case 11 :
                    // PLSQL3.g:175:7: floop
                    {
                    pushFollow(FOLLOW_floop_in_blockert11381);
                    floop41=floop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((floop41!=null?floop41.st:null));

                    }
                    break;
                case 12 :
                    // PLSQL3.g:176:7: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_blockert11392);
                    procedure42=procedure();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((procedure42!=null?procedure42.st:null));

                    }
                    break;
                case 13 :
                    // PLSQL3.g:177:7: function
                    {
                    pushFollow(FOLLOW_function_in_blockert11403);
                    function43=function();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((function43!=null?function43.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockert1"

    public static class assignment_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment"
    // PLSQL3.g:182:1: assignment : var1 ':=' var2 ';' -> assignme(var1=$var1.stvar2=$var2.st);
    public final PLSQL3Parser.assignment_return assignment() throws RecognitionException {
        PLSQL3Parser.assignment_return retval = new PLSQL3Parser.assignment_return();
        retval.start = input.LT(1);

        PLSQL3Parser.var1_return var144 = null;

        PLSQL3Parser.var2_return var245 = null;


        try {
            // PLSQL3.g:183:5: ( var1 ':=' var2 ';' -> assignme(var1=$var1.stvar2=$var2.st))
            // PLSQL3.g:183:7: var1 ':=' var2 ';'
            {
            pushFollow(FOLLOW_var1_in_assignment1426);
            var144=var1();

            state._fsp--;

            match(input,45,FOLLOW_45_in_assignment1428); 
            pushFollow(FOLLOW_var2_in_assignment1430);
            var245=var2();

            state._fsp--;

            match(input,32,FOLLOW_32_in_assignment1431); 


            // TEMPLATE REWRITE
            // 183:25: -> assignme(var1=$var1.stvar2=$var2.st)
            {
                retval.st = templateLib.getInstanceOf("assignme",
              new STAttrMap().put("var1", (var144!=null?var144.st:null)).put("var2", (var245!=null?var245.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class assignment1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment1"
    // PLSQL3.g:186:1: assignment1 : var1 ':=' v10 ';' -> giveassign(t1=$var1.stt2=$v10.st);
    public final PLSQL3Parser.assignment1_return assignment1() throws RecognitionException {
        PLSQL3Parser.assignment1_return retval = new PLSQL3Parser.assignment1_return();
        retval.start = input.LT(1);

        PLSQL3Parser.var1_return var146 = null;

        PLSQL3Parser.v10_return v1047 = null;


        try {
            // PLSQL3.g:187:5: ( var1 ':=' v10 ';' -> giveassign(t1=$var1.stt2=$v10.st))
            // PLSQL3.g:187:7: var1 ':=' v10 ';'
            {
            pushFollow(FOLLOW_var1_in_assignment11457);
            var146=var1();

            state._fsp--;

            match(input,45,FOLLOW_45_in_assignment11459); 
            pushFollow(FOLLOW_v10_in_assignment11461);
            v1047=v10();

            state._fsp--;

            match(input,32,FOLLOW_32_in_assignment11463); 


            // TEMPLATE REWRITE
            // 187:25: -> giveassign(t1=$var1.stt2=$v10.st)
            {
                retval.st = templateLib.getInstanceOf("giveassign",
              new STAttrMap().put("t1", (var146!=null?var146.st:null)).put("t2", (v1047!=null?v1047.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment1"

    public static class var1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var1"
    // PLSQL3.g:190:1: var1 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.var1_return var1() throws RecognitionException {
        PLSQL3Parser.var1_return retval = new PLSQL3Parser.var1_return();
        retval.start = input.LT(1);

        Token ID48=null;

        try {
            // PLSQL3.g:191:5: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:191:7: ID
            {
            ID48=(Token)match(input,ID,FOLLOW_ID_in_var11491); 


            // TEMPLATE REWRITE
            // 191:10: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID48!=null?ID48.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var1"

    public static class var2_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var2"
    // PLSQL3.g:194:1: var2 : ( N -> {new StringTemplate($N.text)} | genericBlock -> {new StringTemplate($genericBlock.text)} | ID -> {new StringTemplate($ID.text)} | ID1 -> {new StringTemplate($ID1.text)});
    public final PLSQL3Parser.var2_return var2() throws RecognitionException {
        PLSQL3Parser.var2_return retval = new PLSQL3Parser.var2_return();
        retval.start = input.LT(1);

        Token N49=null;
        Token ID51=null;
        Token ID152=null;
        PLSQL3Parser.genericBlock_return genericBlock50 = null;


        try {
            // PLSQL3.g:195:5: ( N -> {new StringTemplate($N.text)} | genericBlock -> {new StringTemplate($genericBlock.text)} | ID -> {new StringTemplate($ID.text)} | ID1 -> {new StringTemplate($ID1.text)})
            int alt21=4;
            switch ( input.LA(1) ) {
            case N:
                {
                alt21=1;
                }
                break;
            case ID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==ID1||LA21_2==46) ) {
                    alt21=2;
                }
                else if ( (LA21_2==32) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case ID1:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // PLSQL3.g:195:7: N
                    {
                    N49=(Token)match(input,N,FOLLOW_N_in_var21508); 


                    // TEMPLATE REWRITE
                    // 195:9: -> {new StringTemplate($N.text)}
                    {
                        retval.st = new StringTemplate((N49!=null?N49.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:196:4: genericBlock
                    {
                    pushFollow(FOLLOW_genericBlock_in_var21517);
                    genericBlock50=genericBlock();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 196:17: -> {new StringTemplate($genericBlock.text)}
                    {
                        retval.st = new StringTemplate((genericBlock50!=null?input.toString(genericBlock50.start,genericBlock50.stop):null));
                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:197:4: ID
                    {
                    ID51=(Token)match(input,ID,FOLLOW_ID_in_var21526); 


                    // TEMPLATE REWRITE
                    // 197:7: -> {new StringTemplate($ID.text)}
                    {
                        retval.st = new StringTemplate((ID51!=null?ID51.getText():null));
                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:198:4: ID1
                    {
                    ID152=(Token)match(input,ID1,FOLLOW_ID1_in_var21535); 


                    // TEMPLATE REWRITE
                    // 198:8: -> {new StringTemplate($ID1.text)}
                    {
                        retval.st = new StringTemplate((ID152!=null?ID152.getText():null));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var2"

    public static class genericBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericBlock"
    // PLSQL3.g:201:1: genericBlock : ( ID ( '.' ID )* ID1 | '\"' ( . )* '\"' );
    public final PLSQL3Parser.genericBlock_return genericBlock() throws RecognitionException {
        PLSQL3Parser.genericBlock_return retval = new PLSQL3Parser.genericBlock_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:202:3: ( ID ( '.' ID )* ID1 | '\"' ( . )* '\"' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==47) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // PLSQL3.g:202:5: ID ( '.' ID )* ID1
                    {
                    match(input,ID,FOLLOW_ID_in_genericBlock1550); 
                    // PLSQL3.g:202:8: ( '.' ID )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==46) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // PLSQL3.g:202:9: '.' ID
                    	    {
                    	    match(input,46,FOLLOW_46_in_genericBlock1553); 
                    	    match(input,ID,FOLLOW_ID_in_genericBlock1555); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,ID1,FOLLOW_ID1_in_genericBlock1559); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:203:5: '\"' ( . )* '\"'
                    {
                    match(input,47,FOLLOW_47_in_genericBlock1565); 
                    // PLSQL3.g:203:8: ( . )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==47) ) {
                            alt23=2;
                        }
                        else if ( ((LA23_0>=ID && LA23_0<=46)||(LA23_0>=48 && LA23_0<=80)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // PLSQL3.g:203:8: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,47,FOLLOW_47_in_genericBlock1568); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "genericBlock"

    public static class valiableBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "valiableBlock"
    // PLSQL3.g:206:1: valiableBlock : ( ID ( '.' ID )* ID1 | '\"' ( . )* '\"' );
    public final PLSQL3Parser.valiableBlock_return valiableBlock() throws RecognitionException {
        PLSQL3Parser.valiableBlock_return retval = new PLSQL3Parser.valiableBlock_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:207:3: ( ID ( '.' ID )* ID1 | '\"' ( . )* '\"' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==47) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // PLSQL3.g:207:5: ID ( '.' ID )* ID1
                    {
                    match(input,ID,FOLLOW_ID_in_valiableBlock1581); 
                    // PLSQL3.g:207:8: ( '.' ID )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==46) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // PLSQL3.g:207:9: '.' ID
                    	    {
                    	    match(input,46,FOLLOW_46_in_valiableBlock1584); 
                    	    match(input,ID,FOLLOW_ID_in_valiableBlock1586); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,ID1,FOLLOW_ID1_in_valiableBlock1590); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:208:5: '\"' ( . )* '\"'
                    {
                    match(input,47,FOLLOW_47_in_valiableBlock1596); 
                    // PLSQL3.g:208:8: ( . )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==47) ) {
                            alt26=2;
                        }
                        else if ( ((LA26_0>=ID && LA26_0<=46)||(LA26_0>=48 && LA26_0<=80)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // PLSQL3.g:208:8: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,47,FOLLOW_47_in_valiableBlock1599); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valiableBlock"

    public static class debugBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "debugBlock"
    // PLSQL3.g:212:1: debugBlock : ID1 ;
    public final PLSQL3Parser.debugBlock_return debugBlock() throws RecognitionException {
        PLSQL3Parser.debugBlock_return retval = new PLSQL3Parser.debugBlock_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:213:3: ( ID1 )
            // PLSQL3.g:213:5: ID1
            {
            match(input,ID1,FOLLOW_ID1_in_debugBlock1613); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "debugBlock"

    public static class var3_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var3"
    // PLSQL3.g:216:1: var3 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.var3_return var3() throws RecognitionException {
        PLSQL3Parser.var3_return retval = new PLSQL3Parser.var3_return();
        retval.start = input.LT(1);

        Token ID53=null;

        try {
            // PLSQL3.g:217:5: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:217:7: ID
            {
            ID53=(Token)match(input,ID,FOLLOW_ID_in_var31628); 


            // TEMPLATE REWRITE
            // 217:10: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID53!=null?ID53.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var3"

    public static class declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // PLSQL3.g:220:1: declaration : variable ;
    public final PLSQL3Parser.declaration_return declaration() throws RecognitionException {
        PLSQL3Parser.declaration_return retval = new PLSQL3Parser.declaration_return();
        retval.start = input.LT(1);

        PLSQL3Parser.variable_return variable54 = null;


        try {
            // PLSQL3.g:221:5: ( variable )
            // PLSQL3.g:221:7: variable
            {
            pushFollow(FOLLOW_variable_in_declaration1645);
            variable54=variable();

            state._fsp--;

            ((program_scope)program_stack.peek()).globals.add((variable54!=null?variable54.st:null));

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // PLSQL3.g:224:1: variable : declarator type ( ':=' valiableBlock )? ';' -> variable(type=$type.stname=$declarator.stassign=$valiableBlock.st);
    public final PLSQL3Parser.variable_return variable() throws RecognitionException {
        PLSQL3Parser.variable_return retval = new PLSQL3Parser.variable_return();
        retval.start = input.LT(1);

        PLSQL3Parser.type_return type55 = null;

        PLSQL3Parser.declarator_return declarator56 = null;

        PLSQL3Parser.valiableBlock_return valiableBlock57 = null;


        try {
            // PLSQL3.g:225:2: ( declarator type ( ':=' valiableBlock )? ';' -> variable(type=$type.stname=$declarator.stassign=$valiableBlock.st))
            // PLSQL3.g:225:6: declarator type ( ':=' valiableBlock )? ';'
            {
            pushFollow(FOLLOW_declarator_in_variable1665);
            declarator56=declarator();

            state._fsp--;

            pushFollow(FOLLOW_type_in_variable1667);
            type55=type();

            state._fsp--;

            // PLSQL3.g:225:22: ( ':=' valiableBlock )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PLSQL3.g:225:23: ':=' valiableBlock
                    {
                    match(input,45,FOLLOW_45_in_variable1670); 
                    pushFollow(FOLLOW_valiableBlock_in_variable1672);
                    valiableBlock57=valiableBlock();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_variable1676); 


            // TEMPLATE REWRITE
            // 226:9: -> variable(type=$type.stname=$declarator.stassign=$valiableBlock.st)
            {
                retval.st = templateLib.getInstanceOf("variable",
              new STAttrMap().put("type", (type55!=null?type55.st:null)).put("name", (declarator56!=null?declarator56.st:null)).put("assign", (valiableBlock57!=null?valiableBlock57.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class declarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // PLSQL3.g:233:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.declarator_return declarator() throws RecognitionException {
        PLSQL3Parser.declarator_return retval = new PLSQL3Parser.declarator_return();
        retval.start = input.LT(1);

        Token ID58=null;

        try {
            // PLSQL3.g:234:5: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:234:9: ID
            {
            ID58=(Token)match(input,ID,FOLLOW_ID_in_declarator1725); 


            // TEMPLATE REWRITE
            // 234:12: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID58!=null?ID58.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    public static class printstatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "printstatement"
    // PLSQL3.g:238:1: printstatement : ( 'dbms_output.put_line' state ';' -> printer(state=$state.st) | 'FND_FILE.put_line' state ';' -> printer(state=$state.st) | 'FND_FILE.PUT_LINE' state ';' -> printer(state=$state.st) | 'write_debug' state ';' -> printer(state=$state.st));
    public final PLSQL3Parser.printstatement_return printstatement() throws RecognitionException {
        PLSQL3Parser.printstatement_return retval = new PLSQL3Parser.printstatement_return();
        retval.start = input.LT(1);

        PLSQL3Parser.state_return state59 = null;

        PLSQL3Parser.state_return state60 = null;

        PLSQL3Parser.state_return state61 = null;

        PLSQL3Parser.state_return state62 = null;


        try {
            // PLSQL3.g:239:5: ( 'dbms_output.put_line' state ';' -> printer(state=$state.st) | 'FND_FILE.put_line' state ';' -> printer(state=$state.st) | 'FND_FILE.PUT_LINE' state ';' -> printer(state=$state.st) | 'write_debug' state ';' -> printer(state=$state.st))
            int alt29=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt29=1;
                }
                break;
            case 49:
                {
                alt29=2;
                }
                break;
            case 50:
                {
                alt29=3;
                }
                break;
            case 51:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // PLSQL3.g:239:9: 'dbms_output.put_line' state ';'
                    {
                    match(input,48,FOLLOW_48_in_printstatement1749); 
                    pushFollow(FOLLOW_state_in_printstatement1751);
                    state59=state();

                    state._fsp--;

                    match(input,32,FOLLOW_32_in_printstatement1753); 


                    // TEMPLATE REWRITE
                    // 239:43: -> printer(state=$state.st)
                    {
                        retval.st = templateLib.getInstanceOf("printer",
                      new STAttrMap().put("state", (state59!=null?state59.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:240:6: 'FND_FILE.put_line' state ';'
                    {
                    match(input,49,FOLLOW_49_in_printstatement1772); 
                    pushFollow(FOLLOW_state_in_printstatement1774);
                    state60=state();

                    state._fsp--;

                    match(input,32,FOLLOW_32_in_printstatement1776); 


                    // TEMPLATE REWRITE
                    // 240:36: -> printer(state=$state.st)
                    {
                        retval.st = templateLib.getInstanceOf("printer",
                      new STAttrMap().put("state", (state60!=null?state60.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:241:6: 'FND_FILE.PUT_LINE' state ';'
                    {
                    match(input,50,FOLLOW_50_in_printstatement1794); 
                    pushFollow(FOLLOW_state_in_printstatement1796);
                    state61=state();

                    state._fsp--;

                    match(input,32,FOLLOW_32_in_printstatement1798); 


                    // TEMPLATE REWRITE
                    // 241:36: -> printer(state=$state.st)
                    {
                        retval.st = templateLib.getInstanceOf("printer",
                      new STAttrMap().put("state", (state61!=null?state61.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:242:4: 'write_debug' state ';'
                    {
                    match(input,51,FOLLOW_51_in_printstatement1812); 
                    pushFollow(FOLLOW_state_in_printstatement1814);
                    state62=state();

                    state._fsp--;

                    match(input,32,FOLLOW_32_in_printstatement1816); 


                    // TEMPLATE REWRITE
                    // 242:28: -> printer(state=$state.st)
                    {
                        retval.st = templateLib.getInstanceOf("printer",
                      new STAttrMap().put("state", (state62!=null?state62.st:null)));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printstatement"

    public static class state_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "state"
    // PLSQL3.g:245:1: state : debugBlock -> {new StringTemplate($debugBlock.text)};
    public final PLSQL3Parser.state_return state() throws RecognitionException {
        PLSQL3Parser.state_return retval = new PLSQL3Parser.state_return();
        retval.start = input.LT(1);

        PLSQL3Parser.debugBlock_return debugBlock63 = null;


        try {
            // PLSQL3.g:246:5: ( debugBlock -> {new StringTemplate($debugBlock.text)})
            // PLSQL3.g:247:9: debugBlock
            {
            pushFollow(FOLLOW_debugBlock_in_state1855);
            debugBlock63=debugBlock();

            state._fsp--;



            // TEMPLATE REWRITE
            // 247:20: -> {new StringTemplate($debugBlock.text)}
            {
                retval.st = new StringTemplate((debugBlock63!=null?input.toString(debugBlock63.start,debugBlock63.stop):null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "state"

    public static class sql_query_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sql_query"
    // PLSQL3.g:251:1: sql_query : 'SELECT' v1 'INTO' v2 'FROM' v3 ';' -> sqler(v1=$v1.stv2=$v2.stv3=$v3.st);
    public final PLSQL3Parser.sql_query_return sql_query() throws RecognitionException {
        PLSQL3Parser.sql_query_return retval = new PLSQL3Parser.sql_query_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return v164 = null;

        PLSQL3Parser.v2_return v265 = null;

        PLSQL3Parser.v3_return v366 = null;


        try {
            // PLSQL3.g:252:5: ( 'SELECT' v1 'INTO' v2 'FROM' v3 ';' -> sqler(v1=$v1.stv2=$v2.stv3=$v3.st))
            // PLSQL3.g:252:9: 'SELECT' v1 'INTO' v2 'FROM' v3 ';'
            {
            match(input,52,FOLLOW_52_in_sql_query1883); 
            pushFollow(FOLLOW_v1_in_sql_query1893);
            v164=v1();

            state._fsp--;

            match(input,53,FOLLOW_53_in_sql_query1903); 
            pushFollow(FOLLOW_v2_in_sql_query1913);
            v265=v2();

            state._fsp--;

            match(input,54,FOLLOW_54_in_sql_query1923); 
            pushFollow(FOLLOW_v3_in_sql_query1933);
            v366=v3();

            state._fsp--;

            match(input,32,FOLLOW_32_in_sql_query1943); 


            // TEMPLATE REWRITE
            // 259:9: -> sqler(v1=$v1.stv2=$v2.stv3=$v3.st)
            {
                retval.st = templateLib.getInstanceOf("sqler",
              new STAttrMap().put("v1", (v164!=null?v164.st:null)).put("v2", (v265!=null?v265.st:null)).put("v3", (v366!=null?v366.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_query"

    public static class insert_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "insert_statement"
    // PLSQL3.g:262:1: insert_statement : 'INSERT INTO' t1= v1 t2= v11 -> sqlin(t1=$t1.st);
    public final PLSQL3Parser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQL3Parser.insert_statement_return retval = new PLSQL3Parser.insert_statement_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;

        PLSQL3Parser.v11_return t2 = null;


        try {
            // PLSQL3.g:263:2: ( 'INSERT INTO' t1= v1 t2= v11 -> sqlin(t1=$t1.st))
            // PLSQL3.g:263:5: 'INSERT INTO' t1= v1 t2= v11
            {
            match(input,55,FOLLOW_55_in_insert_statement1984); 
            pushFollow(FOLLOW_v1_in_insert_statement1988);
            t1=v1();

            state._fsp--;

            pushFollow(FOLLOW_v11_in_insert_statement1992);
            t2=v11();

            state._fsp--;



            // TEMPLATE REWRITE
            // 264:4: -> sqlin(t1=$t1.st)
            {
                retval.st = templateLib.getInstanceOf("sqlin",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_statement"

    public static class update_statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "update_statement"
    // PLSQL3.g:267:1: update_statement : 'UPDATE' t1= v1 'SET' -> sqlup(t1=$t1.st);
    public final PLSQL3Parser.update_statement_return update_statement() throws RecognitionException {
        PLSQL3Parser.update_statement_return retval = new PLSQL3Parser.update_statement_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;


        try {
            // PLSQL3.g:268:2: ( 'UPDATE' t1= v1 'SET' -> sqlup(t1=$t1.st))
            // PLSQL3.g:268:5: 'UPDATE' t1= v1 'SET'
            {
            match(input,56,FOLLOW_56_in_update_statement2018); 
            pushFollow(FOLLOW_v1_in_update_statement2022);
            t1=v1();

            state._fsp--;

            match(input,57,FOLLOW_57_in_update_statement2024); 


            // TEMPLATE REWRITE
            // 269:4: -> sqlup(t1=$t1.st)
            {
                retval.st = templateLib.getInstanceOf("sqlup",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_statement"

    public static class v1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v1"
    // PLSQL3.g:272:1: v1 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.v1_return v1() throws RecognitionException {
        PLSQL3Parser.v1_return retval = new PLSQL3Parser.v1_return();
        retval.start = input.LT(1);

        Token ID67=null;

        try {
            // PLSQL3.g:272:4: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:273:5: ID
            {
            ID67=(Token)match(input,ID,FOLLOW_ID_in_v12051); 


            // TEMPLATE REWRITE
            // 273:8: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID67!=null?ID67.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v1"

    public static class v11_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v11"
    // PLSQL3.g:276:1: v11 : ID1 -> {new StringTemplate($ID1.text)};
    public final PLSQL3Parser.v11_return v11() throws RecognitionException {
        PLSQL3Parser.v11_return retval = new PLSQL3Parser.v11_return();
        retval.start = input.LT(1);

        Token ID168=null;

        try {
            // PLSQL3.g:276:5: ( ID1 -> {new StringTemplate($ID1.text)})
            // PLSQL3.g:277:5: ID1
            {
            ID168=(Token)match(input,ID1,FOLLOW_ID1_in_v112069); 


            // TEMPLATE REWRITE
            // 277:9: -> {new StringTemplate($ID1.text)}
            {
                retval.st = new StringTemplate((ID168!=null?ID168.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v11"

    public static class v12_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v12"
    // PLSQL3.g:281:1: v12 : ID1 -> {new StringTemplate($ID1.text)};
    public final PLSQL3Parser.v12_return v12() throws RecognitionException {
        PLSQL3Parser.v12_return retval = new PLSQL3Parser.v12_return();
        retval.start = input.LT(1);

        Token ID169=null;

        try {
            // PLSQL3.g:281:5: ( ID1 -> {new StringTemplate($ID1.text)})
            // PLSQL3.g:282:5: ID1
            {
            ID169=(Token)match(input,ID1,FOLLOW_ID1_in_v122088); 


            // TEMPLATE REWRITE
            // 282:9: -> {new StringTemplate($ID1.text)}
            {
                retval.st = new StringTemplate((ID169!=null?ID169.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v12"

    public static class v2_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v2"
    // PLSQL3.g:286:1: v2 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.v2_return v2() throws RecognitionException {
        PLSQL3Parser.v2_return retval = new PLSQL3Parser.v2_return();
        retval.start = input.LT(1);

        Token ID70=null;

        try {
            // PLSQL3.g:286:4: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:287:6: ID
            {
            ID70=(Token)match(input,ID,FOLLOW_ID_in_v22107); 


            // TEMPLATE REWRITE
            // 287:9: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID70!=null?ID70.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v2"

    public static class v3_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v3"
    // PLSQL3.g:290:1: v3 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.v3_return v3() throws RecognitionException {
        PLSQL3Parser.v3_return retval = new PLSQL3Parser.v3_return();
        retval.start = input.LT(1);

        Token ID71=null;

        try {
            // PLSQL3.g:290:4: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:291:5: ID
            {
            ID71=(Token)match(input,ID,FOLLOW_ID_in_v32125); 


            // TEMPLATE REWRITE
            // 291:8: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID71!=null?ID71.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v3"

    public static class funccall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funccall"
    // PLSQL3.g:295:1: funccall : i= k '=' j= k '();' -> funccall(i=$i.stj=$j.st);
    public final PLSQL3Parser.funccall_return funccall() throws RecognitionException {
        PLSQL3Parser.funccall_return retval = new PLSQL3Parser.funccall_return();
        retval.start = input.LT(1);

        PLSQL3Parser.k_return i = null;

        PLSQL3Parser.k_return j = null;


        try {
            // PLSQL3.g:295:10: (i= k '=' j= k '();' -> funccall(i=$i.stj=$j.st))
            // PLSQL3.g:295:13: i= k '=' j= k '();'
            {
            pushFollow(FOLLOW_k_in_funccall2142);
            i=k();

            state._fsp--;

            match(input,58,FOLLOW_58_in_funccall2144); 
            pushFollow(FOLLOW_k_in_funccall2148);
            j=k();

            state._fsp--;

            match(input,59,FOLLOW_59_in_funccall2150); 


            // TEMPLATE REWRITE
            // 296:1: -> funccall(i=$i.stj=$j.st)
            {
                retval.st = templateLib.getInstanceOf("funccall",
              new STAttrMap().put("i", (i!=null?i.st:null)).put("j", (j!=null?j.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funccall"

    public static class procall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "procall"
    // PLSQL3.g:299:1: procall : j= k '();' -> procall(j=$j.st);
    public final PLSQL3Parser.procall_return procall() throws RecognitionException {
        PLSQL3Parser.procall_return retval = new PLSQL3Parser.procall_return();
        retval.start = input.LT(1);

        PLSQL3Parser.k_return j = null;


        try {
            // PLSQL3.g:299:9: (j= k '();' -> procall(j=$j.st))
            // PLSQL3.g:299:12: j= k '();'
            {
            pushFollow(FOLLOW_k_in_procall2176);
            j=k();

            state._fsp--;

            match(input,59,FOLLOW_59_in_procall2178); 


            // TEMPLATE REWRITE
            // 300:1: -> procall(j=$j.st)
            {
                retval.st = templateLib.getInstanceOf("procall",
              new STAttrMap().put("j", (j!=null?j.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procall"

    public static class k_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "k"
    // PLSQL3.g:303:1: k : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.k_return k() throws RecognitionException {
        PLSQL3Parser.k_return retval = new PLSQL3Parser.k_return();
        retval.start = input.LT(1);

        Token ID72=null;

        try {
            // PLSQL3.g:303:3: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:304:5: ID
            {
            ID72=(Token)match(input,ID,FOLLOW_ID_in_k2203); 


            // TEMPLATE REWRITE
            // 304:8: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID72!=null?ID72.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "k"

    public static class v4_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v4"
    // PLSQL3.g:307:1: v4 : '(' a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ')' ;
    public final PLSQL3Parser.v4_return v4() throws RecognitionException {
        PLSQL3Parser.v4_return retval = new PLSQL3Parser.v4_return();
        retval.start = input.LT(1);

        PLSQL3Parser.aside_return a = null;

        PLSQL3Parser.aside1_return b = null;


        try {
            // PLSQL3.g:307:4: ( '(' a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ')' )
            // PLSQL3.g:308:5: '(' a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ')'
            {
            match(input,60,FOLLOW_60_in_v42221); 
            pushFollow(FOLLOW_aside_in_v42229);
            a=aside();

            state._fsp--;

            // PLSQL3.g:310:5: ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt30=1;
                }
                break;
            case 61:
                {
                alt30=2;
                }
                break;
            case 62:
                {
                alt30=3;
                }
                break;
            case 63:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // PLSQL3.g:311:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:311:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    // PLSQL3.g:311:11: '=' b= aside1
                    {
                    match(input,58,FOLLOW_58_in_v42247); 
                    pushFollow(FOLLOW_aside1_in_v42251);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 311:24: -> abequals(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abequals",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:312:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:312:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    // PLSQL3.g:312:12: '<' b= aside1
                    {
                    match(input,61,FOLLOW_61_in_v42279); 
                    pushFollow(FOLLOW_aside1_in_v42283);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 312:25: -> abless(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abless",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:313:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:313:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    // PLSQL3.g:313:12: '>' b= aside1
                    {
                    match(input,62,FOLLOW_62_in_v42311); 
                    pushFollow(FOLLOW_aside1_in_v42315);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 313:25: -> abright(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abright",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:314:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:314:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    // PLSQL3.g:314:12: '+' b= aside1
                    {
                    match(input,63,FOLLOW_63_in_v42343); 
                    pushFollow(FOLLOW_aside1_in_v42347);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 314:25: -> abplus(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abplus",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;

            }

            match(input,64,FOLLOW_64_in_v42374); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v4"

    public static class v10_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v10"
    // PLSQL3.g:319:1: v10 : a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ;
    public final PLSQL3Parser.v10_return v10() throws RecognitionException {
        PLSQL3Parser.v10_return retval = new PLSQL3Parser.v10_return();
        retval.start = input.LT(1);

        PLSQL3Parser.aside_return a = null;

        PLSQL3Parser.aside1_return b = null;


        try {
            // PLSQL3.g:319:4: (a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) )
            // PLSQL3.g:320:5: a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) )
            {
            pushFollow(FOLLOW_aside_in_v102388);
            a=aside();

            state._fsp--;

            // PLSQL3.g:321:5: ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt31=1;
                }
                break;
            case 61:
                {
                alt31=2;
                }
                break;
            case 62:
                {
                alt31=3;
                }
                break;
            case 63:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // PLSQL3.g:322:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:322:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    // PLSQL3.g:322:11: '=' b= aside1
                    {
                    match(input,58,FOLLOW_58_in_v102406); 
                    pushFollow(FOLLOW_aside1_in_v102410);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 322:24: -> abequals(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abequals",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:323:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:323:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    // PLSQL3.g:323:12: '<' b= aside1
                    {
                    match(input,61,FOLLOW_61_in_v102438); 
                    pushFollow(FOLLOW_aside1_in_v102442);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 323:25: -> abless(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abless",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:324:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:324:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    // PLSQL3.g:324:12: '>' b= aside1
                    {
                    match(input,62,FOLLOW_62_in_v102470); 
                    pushFollow(FOLLOW_aside1_in_v102474);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 324:25: -> abright(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abright",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:325:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:325:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    // PLSQL3.g:325:12: '+' b= aside1
                    {
                    match(input,63,FOLLOW_63_in_v102502); 
                    pushFollow(FOLLOW_aside1_in_v102506);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 325:25: -> abplus(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abplus",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v10"

    public static class aside_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aside"
    // PLSQL3.g:329:1: aside : ID -> refVar(id=$ID.text);
    public final PLSQL3Parser.aside_return aside() throws RecognitionException {
        PLSQL3Parser.aside_return retval = new PLSQL3Parser.aside_return();
        retval.start = input.LT(1);

        Token ID73=null;

        try {
            // PLSQL3.g:329:7: ( ID -> refVar(id=$ID.text))
            // PLSQL3.g:330:5: ID
            {
            ID73=(Token)match(input,ID,FOLLOW_ID_in_aside2540); 


            // TEMPLATE REWRITE
            // 330:8: -> refVar(id=$ID.text)
            {
                retval.st = templateLib.getInstanceOf("refVar",
              new STAttrMap().put("id", (ID73!=null?ID73.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aside"

    public static class aside1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aside1"
    // PLSQL3.g:334:1: aside1 : N -> iconst(value=$N.text);
    public final PLSQL3Parser.aside1_return aside1() throws RecognitionException {
        PLSQL3Parser.aside1_return retval = new PLSQL3Parser.aside1_return();
        retval.start = input.LT(1);

        Token N74=null;

        try {
            // PLSQL3.g:334:8: ( N -> iconst(value=$N.text))
            // PLSQL3.g:335:5: N
            {
            N74=(Token)match(input,N,FOLLOW_N_in_aside12567); 


            // TEMPLATE REWRITE
            // 335:7: -> iconst(value=$N.text)
            {
                retval.st = templateLib.getInstanceOf("iconst",
              new STAttrMap().put("value", (N74!=null?N74.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aside1"

    public static class arguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // PLSQL3.g:338:1: arguments : ( '(' paramdeclaration ( ',' paramdeclaration )* ')' ) -> {new StringTemplate($paramdeclaration.text)};
    public final PLSQL3Parser.arguments_return arguments() throws RecognitionException {
        PLSQL3Parser.arguments_return retval = new PLSQL3Parser.arguments_return();
        retval.start = input.LT(1);

        PLSQL3Parser.paramdeclaration_return paramdeclaration75 = null;


        try {
            // PLSQL3.g:339:5: ( ( '(' paramdeclaration ( ',' paramdeclaration )* ')' ) -> {new StringTemplate($paramdeclaration.text)})
            // PLSQL3.g:339:9: ( '(' paramdeclaration ( ',' paramdeclaration )* ')' )
            {
            // PLSQL3.g:339:9: ( '(' paramdeclaration ( ',' paramdeclaration )* ')' )
            // PLSQL3.g:339:11: '(' paramdeclaration ( ',' paramdeclaration )* ')'
            {
            match(input,60,FOLLOW_60_in_arguments2598); 
            pushFollow(FOLLOW_paramdeclaration_in_arguments2601);
            paramdeclaration75=paramdeclaration();

            state._fsp--;

            // PLSQL3.g:339:33: ( ',' paramdeclaration )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==65) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // PLSQL3.g:339:35: ',' paramdeclaration
            	    {
            	    match(input,65,FOLLOW_65_in_arguments2605); 
            	    pushFollow(FOLLOW_paramdeclaration_in_arguments2608);
            	    paramdeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,64,FOLLOW_64_in_arguments2613); 

            }



            // TEMPLATE REWRITE
            // 340:2: -> {new StringTemplate($paramdeclaration.text)}
            {
                retval.st = new StringTemplate((paramdeclaration75!=null?input.toString(paramdeclaration75.start,paramdeclaration75.stop):null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class paramdeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "paramdeclaration"
    // PLSQL3.g:343:1: paramdeclaration : name ( 'IN' | 'OUT' )? datatype ;
    public final PLSQL3Parser.paramdeclaration_return paramdeclaration() throws RecognitionException {
        PLSQL3Parser.paramdeclaration_return retval = new PLSQL3Parser.paramdeclaration_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:344:2: ( name ( 'IN' | 'OUT' )? datatype )
            // PLSQL3.g:345:6: name ( 'IN' | 'OUT' )? datatype
            {
            pushFollow(FOLLOW_name_in_paramdeclaration2642);
            name();

            state._fsp--;

            // PLSQL3.g:345:11: ( 'IN' | 'OUT' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=66 && LA33_0<=67)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PLSQL3.g:
                    {
                    if ( (input.LA(1)>=66 && input.LA(1)<=67) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_paramdeclaration2651);
            datatype();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paramdeclaration"

    public static class name_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "name"
    // PLSQL3.g:348:1: name : ID1 -> {new StringTemplate($ID1.text)};
    public final PLSQL3Parser.name_return name() throws RecognitionException {
        PLSQL3Parser.name_return retval = new PLSQL3Parser.name_return();
        retval.start = input.LT(1);

        Token ID176=null;

        try {
            // PLSQL3.g:349:2: ( ID1 -> {new StringTemplate($ID1.text)})
            // PLSQL3.g:349:4: ID1
            {
            ID176=(Token)match(input,ID1,FOLLOW_ID1_in_name2665); 


            // TEMPLATE REWRITE
            // 349:8: -> {new StringTemplate($ID1.text)}
            {
                retval.st = new StringTemplate((ID176!=null?ID176.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class datatype_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "datatype"
    // PLSQL3.g:352:1: datatype : type1 -> {new StringTemplate($type1.text)};
    public final PLSQL3Parser.datatype_return datatype() throws RecognitionException {
        PLSQL3Parser.datatype_return retval = new PLSQL3Parser.datatype_return();
        retval.start = input.LT(1);

        PLSQL3Parser.type1_return type177 = null;


        try {
            // PLSQL3.g:353:5: ( type1 -> {new StringTemplate($type1.text)})
            // PLSQL3.g:353:7: type1
            {
            pushFollow(FOLLOW_type1_in_datatype2683);
            type177=type1();

            state._fsp--;



            // TEMPLATE REWRITE
            // 353:13: -> {new StringTemplate($type1.text)}
            {
                retval.st = new StringTemplate((type177!=null?input.toString(type177.start,type177.stop):null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatype"

    public static class type1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type1"
    // PLSQL3.g:356:1: type1 : ( VARCHAR | VARCHAR2 | NUMERIC | FLOAT );
    public final PLSQL3Parser.type1_return type1() throws RecognitionException {
        PLSQL3Parser.type1_return retval = new PLSQL3Parser.type1_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:357:2: ( VARCHAR | VARCHAR2 | NUMERIC | FLOAT )
            // PLSQL3.g:
            {
            if ( (input.LA(1)>=VARCHAR && input.LA(1)<=FLOAT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type1"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // PLSQL3.g:379:1: type : ( num -> type_int() | 'number' -> type_int() | 'NUMBER' -> type_int() | 'VARCHAR' -> type_string() | 'varchar' -> type_string() | varc -> type_string() | 'VARCHAR2' -> type_string() | 'varchar2' -> type_string() | varc2 -> type_string() | typ -> type_type() | 'FLOAT' -> type_float() | 'float' -> type_float());
    public final PLSQL3Parser.type_return type() throws RecognitionException {
        PLSQL3Parser.type_return retval = new PLSQL3Parser.type_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:380:2: ( num -> type_int() | 'number' -> type_int() | 'NUMBER' -> type_int() | 'VARCHAR' -> type_string() | 'varchar' -> type_string() | varc -> type_string() | 'VARCHAR2' -> type_string() | 'varchar2' -> type_string() | varc2 -> type_string() | typ -> type_type() | 'FLOAT' -> type_float() | 'float' -> type_float())
            int alt34=12;
            switch ( input.LA(1) ) {
            case 73:
            case 74:
                {
                alt34=1;
                }
                break;
            case 68:
                {
                alt34=2;
                }
                break;
            case 69:
                {
                alt34=3;
                }
                break;
            case 70:
                {
                alt34=4;
                }
                break;
            case VARCHAR:
                {
                alt34=5;
                }
                break;
            case 77:
            case 78:
                {
                alt34=6;
                }
                break;
            case 71:
                {
                alt34=7;
                }
                break;
            case VARCHAR2:
                {
                alt34=8;
                }
                break;
            case 75:
            case 76:
                {
                alt34=9;
                }
                break;
            case ID:
                {
                alt34=10;
                }
                break;
            case 72:
                {
                alt34=11;
                }
                break;
            case FLOAT:
                {
                alt34=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // PLSQL3.g:380:6: num
                    {
                    pushFollow(FOLLOW_num_in_type2781);
                    num();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 380:10: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:381:6: 'number'
                    {
                    match(input,68,FOLLOW_68_in_type2794); 


                    // TEMPLATE REWRITE
                    // 381:14: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:382:6: 'NUMBER'
                    {
                    match(input,69,FOLLOW_69_in_type2806); 


                    // TEMPLATE REWRITE
                    // 382:14: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:383:9: 'VARCHAR'
                    {
                    match(input,70,FOLLOW_70_in_type2821); 


                    // TEMPLATE REWRITE
                    // 383:19: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 5 :
                    // PLSQL3.g:384:6: 'varchar'
                    {
                    match(input,VARCHAR,FOLLOW_VARCHAR_in_type2834); 


                    // TEMPLATE REWRITE
                    // 384:16: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 6 :
                    // PLSQL3.g:385:6: varc
                    {
                    pushFollow(FOLLOW_varc_in_type2847);
                    varc();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 385:11: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 7 :
                    // PLSQL3.g:386:9: 'VARCHAR2'
                    {
                    match(input,71,FOLLOW_71_in_type2863); 


                    // TEMPLATE REWRITE
                    // 386:20: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 8 :
                    // PLSQL3.g:387:6: 'varchar2'
                    {
                    match(input,VARCHAR2,FOLLOW_VARCHAR2_in_type2876); 


                    // TEMPLATE REWRITE
                    // 387:17: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 9 :
                    // PLSQL3.g:388:6: varc2
                    {
                    pushFollow(FOLLOW_varc2_in_type2889);
                    varc2();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 388:12: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 10 :
                    // PLSQL3.g:389:9: typ
                    {
                    pushFollow(FOLLOW_typ_in_type2905);
                    typ();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 389:13: -> type_type()
                    {
                        retval.st = templateLib.getInstanceOf("type_type");
                    }


                    }
                    break;
                case 11 :
                    // PLSQL3.g:390:9: 'FLOAT'
                    {
                    match(input,72,FOLLOW_72_in_type2921); 


                    // TEMPLATE REWRITE
                    // 390:17: -> type_float()
                    {
                        retval.st = templateLib.getInstanceOf("type_float");
                    }


                    }
                    break;
                case 12 :
                    // PLSQL3.g:391:6: 'float'
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_type2934); 


                    // TEMPLATE REWRITE
                    // 391:14: -> type_float()
                    {
                        retval.st = templateLib.getInstanceOf("type_float");
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class num_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "num"
    // PLSQL3.g:394:1: num : ( 'NUMBER(' ( . )* ')' ( . )* | 'number(' ( . )* ')' ( . )* );
    public final PLSQL3Parser.num_return num() throws RecognitionException {
        PLSQL3Parser.num_return retval = new PLSQL3Parser.num_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:395:2: ( 'NUMBER(' ( . )* ')' ( . )* | 'number(' ( . )* ')' ( . )* )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==73) ) {
                alt39=1;
            }
            else if ( (LA39_0==74) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // PLSQL3.g:395:4: 'NUMBER(' ( . )* ')' ( . )*
                    {
                    match(input,73,FOLLOW_73_in_num2955); 
                    // PLSQL3.g:395:13: ( . )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==64) ) {
                            alt35=2;
                        }
                        else if ( ((LA35_0>=ID && LA35_0<=63)||(LA35_0>=65 && LA35_0<=80)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // PLSQL3.g:395:13: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,64,FOLLOW_64_in_num2958); 
                    // PLSQL3.g:395:18: ( . )*
                    loop36:
                    do {
                        int alt36=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt36=2;
                            }
                            break;
                        case 45:
                            {
                            alt36=2;
                            }
                            break;
                        case ID:
                        case N:
                        case ID1:
                        case VARCHAR:
                        case VARCHAR2:
                        case NUMERIC:
                        case FLOAT:
                        case ID3:
                        case WS:
                        case SL_COMMENT:
                        case ML_COMMENT:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                            {
                            alt36=1;
                            }
                            break;

                        }

                        switch (alt36) {
                    	case 1 :
                    	    // PLSQL3.g:395:18: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // PLSQL3.g:396:4: 'number(' ( . )* ')' ( . )*
                    {
                    match(input,74,FOLLOW_74_in_num2965); 
                    // PLSQL3.g:396:13: ( . )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==64) ) {
                            alt37=2;
                        }
                        else if ( ((LA37_0>=ID && LA37_0<=63)||(LA37_0>=65 && LA37_0<=80)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // PLSQL3.g:396:13: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,64,FOLLOW_64_in_num2968); 
                    // PLSQL3.g:396:18: ( . )*
                    loop38:
                    do {
                        int alt38=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt38=2;
                            }
                            break;
                        case 45:
                            {
                            alt38=2;
                            }
                            break;
                        case ID:
                        case N:
                        case ID1:
                        case VARCHAR:
                        case VARCHAR2:
                        case NUMERIC:
                        case FLOAT:
                        case ID3:
                        case WS:
                        case SL_COMMENT:
                        case ML_COMMENT:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                            {
                            alt38=1;
                            }
                            break;

                        }

                        switch (alt38) {
                    	case 1 :
                    	    // PLSQL3.g:396:18: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "num"

    public static class varc2_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "varc2"
    // PLSQL3.g:399:1: varc2 : ( 'VARCHAR2(' ( . )* ')' ( . )* | 'varchar2(' ( . )* ')' ( . )* );
    public final PLSQL3Parser.varc2_return varc2() throws RecognitionException {
        PLSQL3Parser.varc2_return retval = new PLSQL3Parser.varc2_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:400:2: ( 'VARCHAR2(' ( . )* ')' ( . )* | 'varchar2(' ( . )* ')' ( . )* )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==75) ) {
                alt44=1;
            }
            else if ( (LA44_0==76) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // PLSQL3.g:400:5: 'VARCHAR2(' ( . )* ')' ( . )*
                    {
                    match(input,75,FOLLOW_75_in_varc22983); 
                    // PLSQL3.g:400:16: ( . )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==64) ) {
                            alt40=2;
                        }
                        else if ( ((LA40_0>=ID && LA40_0<=63)||(LA40_0>=65 && LA40_0<=80)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // PLSQL3.g:400:16: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,64,FOLLOW_64_in_varc22986); 
                    // PLSQL3.g:400:21: ( . )*
                    loop41:
                    do {
                        int alt41=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt41=2;
                            }
                            break;
                        case 45:
                            {
                            alt41=2;
                            }
                            break;
                        case ID:
                        case N:
                        case ID1:
                        case VARCHAR:
                        case VARCHAR2:
                        case NUMERIC:
                        case FLOAT:
                        case ID3:
                        case WS:
                        case SL_COMMENT:
                        case ML_COMMENT:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                            {
                            alt41=1;
                            }
                            break;

                        }

                        switch (alt41) {
                    	case 1 :
                    	    // PLSQL3.g:400:21: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // PLSQL3.g:401:5: 'varchar2(' ( . )* ')' ( . )*
                    {
                    match(input,76,FOLLOW_76_in_varc22994); 
                    // PLSQL3.g:401:16: ( . )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==64) ) {
                            alt42=2;
                        }
                        else if ( ((LA42_0>=ID && LA42_0<=63)||(LA42_0>=65 && LA42_0<=80)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // PLSQL3.g:401:16: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,64,FOLLOW_64_in_varc22997); 
                    // PLSQL3.g:401:21: ( . )*
                    loop43:
                    do {
                        int alt43=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt43=2;
                            }
                            break;
                        case 45:
                            {
                            alt43=2;
                            }
                            break;
                        case ID:
                        case N:
                        case ID1:
                        case VARCHAR:
                        case VARCHAR2:
                        case NUMERIC:
                        case FLOAT:
                        case ID3:
                        case WS:
                        case SL_COMMENT:
                        case ML_COMMENT:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                            {
                            alt43=1;
                            }
                            break;

                        }

                        switch (alt43) {
                    	case 1 :
                    	    // PLSQL3.g:401:21: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varc2"

    public static class varc_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "varc"
    // PLSQL3.g:404:1: varc : ( 'VARCHAR(' ( . )* ')' ( . )* | 'varchar(' ( . )* ')' ( . )* );
    public final PLSQL3Parser.varc_return varc() throws RecognitionException {
        PLSQL3Parser.varc_return retval = new PLSQL3Parser.varc_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:405:2: ( 'VARCHAR(' ( . )* ')' ( . )* | 'varchar(' ( . )* ')' ( . )* )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==77) ) {
                alt49=1;
            }
            else if ( (LA49_0==78) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // PLSQL3.g:405:5: 'VARCHAR(' ( . )* ')' ( . )*
                    {
                    match(input,77,FOLLOW_77_in_varc3011); 
                    // PLSQL3.g:405:15: ( . )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==64) ) {
                            alt45=2;
                        }
                        else if ( ((LA45_0>=ID && LA45_0<=63)||(LA45_0>=65 && LA45_0<=80)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // PLSQL3.g:405:15: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,64,FOLLOW_64_in_varc3014); 
                    // PLSQL3.g:405:20: ( . )*
                    loop46:
                    do {
                        int alt46=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt46=2;
                            }
                            break;
                        case 45:
                            {
                            alt46=2;
                            }
                            break;
                        case ID:
                        case N:
                        case ID1:
                        case VARCHAR:
                        case VARCHAR2:
                        case NUMERIC:
                        case FLOAT:
                        case ID3:
                        case WS:
                        case SL_COMMENT:
                        case ML_COMMENT:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                            {
                            alt46=1;
                            }
                            break;

                        }

                        switch (alt46) {
                    	case 1 :
                    	    // PLSQL3.g:405:20: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // PLSQL3.g:406:5: 'varchar(' ( . )* ')' ( . )*
                    {
                    match(input,78,FOLLOW_78_in_varc3022); 
                    // PLSQL3.g:406:15: ( . )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==64) ) {
                            alt47=2;
                        }
                        else if ( ((LA47_0>=ID && LA47_0<=63)||(LA47_0>=65 && LA47_0<=80)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // PLSQL3.g:406:15: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,64,FOLLOW_64_in_varc3025); 
                    // PLSQL3.g:406:20: ( . )*
                    loop48:
                    do {
                        int alt48=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt48=2;
                            }
                            break;
                        case 45:
                            {
                            alt48=2;
                            }
                            break;
                        case ID:
                        case N:
                        case ID1:
                        case VARCHAR:
                        case VARCHAR2:
                        case NUMERIC:
                        case FLOAT:
                        case ID3:
                        case WS:
                        case SL_COMMENT:
                        case ML_COMMENT:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                            {
                            alt48=1;
                            }
                            break;

                        }

                        switch (alt48) {
                    	case 1 :
                    	    // PLSQL3.g:406:20: .
                    	    {
                    	    matchAny(input); 

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varc"

    public static class typ_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typ"
    // PLSQL3.g:409:1: typ : ( ID ( '.' ID )* '%TYPE' | ID ( '.' ID )* '%type' );
    public final PLSQL3Parser.typ_return typ() throws RecognitionException {
        PLSQL3Parser.typ_return retval = new PLSQL3Parser.typ_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:410:2: ( ID ( '.' ID )* '%TYPE' | ID ( '.' ID )* '%type' )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // PLSQL3.g:410:4: ID ( '.' ID )* '%TYPE'
                    {
                    match(input,ID,FOLLOW_ID_in_typ3039); 
                    // PLSQL3.g:410:7: ( '.' ID )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==46) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // PLSQL3.g:410:8: '.' ID
                    	    {
                    	    match(input,46,FOLLOW_46_in_typ3042); 
                    	    match(input,ID,FOLLOW_ID_in_typ3044); 

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,79,FOLLOW_79_in_typ3048); 

                    }
                    break;
                case 2 :
                    // PLSQL3.g:411:4: ID ( '.' ID )* '%type'
                    {
                    match(input,ID,FOLLOW_ID_in_typ3053); 
                    // PLSQL3.g:411:7: ( '.' ID )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==46) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // PLSQL3.g:411:8: '.' ID
                    	    {
                    	    match(input,46,FOLLOW_46_in_typ3056); 
                    	    match(input,ID,FOLLOW_ID_in_typ3058); 

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,80,FOLLOW_80_in_typ3062); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typ"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA5_eotS =
        "\20\uffff";
    static final String DFA5_eofS =
        "\20\uffff";
    static final String DFA5_minS =
        "\1\4\1\55\16\uffff";
    static final String DFA5_maxS =
        "\1\70\1\73\16\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\1\1"+
        "\15\1\16";
    static final String DFA5_specialS =
        "\20\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\20\uffff\1\10\1\6\4\uffff\4\14\4\uffff\1\11\1\12\2\uffff"+
            "\4\13\1\uffff\1\7\3\uffff\4\2\1\3\2\uffff\1\4\1\5",
            "\1\15\14\uffff\1\16\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "31:1: block : ( assignment | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function | funccall | procall );";
        }
    }
    static final String DFA19_eotS =
        "\21\uffff";
    static final String DFA19_eofS =
        "\21\uffff";
    static final String DFA19_minS =
        "\1\4\1\55\13\uffff\1\4\1\uffff\1\6\1\uffff";
    static final String DFA19_maxS =
        "\1\70\1\55\13\uffff\1\57\1\uffff\1\77\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff"+
        "\1\1\1\uffff\1\2";
    static final String DFA19_specialS =
        "\21\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\20\uffff\1\10\1\6\4\uffff\4\14\4\uffff\1\11\1\12\2\uffff"+
            "\4\13\1\uffff\1\7\3\uffff\4\2\1\3\2\uffff\1\4\1\5",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\2\16\50\uffff\1\16",
            "",
            "\1\16\31\uffff\1\16\15\uffff\1\16\13\uffff\1\20\2\uffff\3"+
            "\20",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "148:1: blockert : ( assignment | assignment1 | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function );";
        }
    }
    static final String DFA20_eotS =
        "\21\uffff";
    static final String DFA20_eofS =
        "\21\uffff";
    static final String DFA20_minS =
        "\1\4\1\55\13\uffff\1\4\1\uffff\1\6\1\uffff";
    static final String DFA20_maxS =
        "\1\70\1\55\13\uffff\1\57\1\uffff\1\77\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff"+
        "\1\1\1\uffff\1\2";
    static final String DFA20_specialS =
        "\21\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\20\uffff\1\10\1\6\4\uffff\4\14\4\uffff\1\11\1\12\2\uffff"+
            "\4\13\1\uffff\1\7\3\uffff\4\2\1\3\2\uffff\1\4\1\5",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\2\16\50\uffff\1\16",
            "",
            "\1\16\31\uffff\1\16\15\uffff\1\16\13\uffff\1\20\2\uffff\3"+
            "\20",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "164:1: blockert1 : ( assignment | assignment1 | printstatement | sql_query | insert_statement | update_statement | conditionals | conditionalelsif | loops | wloop | floop | procedure | function );";
        }
    }
    static final String DFA52_eotS =
        "\6\uffff";
    static final String DFA52_eofS =
        "\6\uffff";
    static final String DFA52_minS =
        "\1\4\1\56\1\4\2\uffff\1\56";
    static final String DFA52_maxS =
        "\1\4\1\120\1\4\2\uffff\1\120";
    static final String DFA52_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA52_specialS =
        "\6\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1",
            "\1\2\40\uffff\1\3\1\4",
            "\1\5",
            "",
            "",
            "\1\2\40\uffff\1\3\1\4"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "409:1: typ : ( ID ( '.' ID )* '%TYPE' | ID ( '.' ID )* '%type' );";
        }
    }
 

    public static final BitSet FOLLOW_15_in_program48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_program52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17_in_program56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_program61 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_program66 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_declaration_in_program77 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_19_in_program88 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_block_in_program102 = new BitSet(new long[]{0x019F179878700010L});
    public static final BitSet FOLLOW_20_in_program113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_block152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_block162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_query_in_block173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_block184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_block195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionals_in_block209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalelsif_in_block217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loops_in_block228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wloop_in_block238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floop_in_block248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_block258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_block268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_block278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procall_in_block288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_loops319 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert_in_loops333 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_22_in_loops339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_v11_in_loops343 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_loops345 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_loops351 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_loops356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_loops366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_function413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_function417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_function421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30_in_function425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_function430 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_v11_in_function434 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function444 = new BitSet(new long[]{0x0000000000000590L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_type_in_function461 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_function463 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_function473 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_variable_in_function491 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_function501 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert_in_function515 = new BitSet(new long[]{0x019F1798F8600010L});
    public static final BitSet FOLLOW_31_in_function530 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_variable_in_function534 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_function536 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_function546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_wloop620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v10_in_wloop624 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_wloop626 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert_in_wloop640 = new BitSet(new long[]{0x019F17987C600010L});
    public static final BitSet FOLLOW_26_in_wloop650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_floop696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_floop700 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_floop702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_floop706 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_floop708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_floop712 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_floop714 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert_in_floop725 = new BitSet(new long[]{0x019F17987C600010L});
    public static final BitSet FOLLOW_26_in_floop734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_procedure815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40_in_procedure819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_procedure823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_42_in_procedure827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_procedure832 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_arguments_in_procedure836 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_18_in_procedure843 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_33_in_procedure845 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_variable_in_procedure850 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_19_in_procedure857 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert_in_procedure867 = new BitSet(new long[]{0x019F179C78600010L});
    public static final BitSet FOLLOW_34_in_procedure874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_conditionals953 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_v11_in_conditionals955 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_conditionals957 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert_in_conditionals975 = new BitSet(new long[]{0x019F1F987A600010L});
    public static final BitSet FOLLOW_43_in_conditionals983 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert1_in_conditionals991 = new BitSet(new long[]{0x019F17987A600010L});
    public static final BitSet FOLLOW_25_in_conditionals1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_conditionalelsif1069 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_v12_in_conditionalelsif1071 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_conditionalelsif1073 = new BitSet(new long[]{0x019F179878600010L});
    public static final BitSet FOLLOW_blockert1_in_conditionalelsif1080 = new BitSet(new long[]{0x019F17987A600010L});
    public static final BitSet FOLLOW_25_in_conditionalelsif1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockert1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment1_in_blockert1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_blockert1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_query_in_blockert1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_blockert1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_blockert1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionals_in_blockert1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalelsif_in_blockert1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loops_in_blockert1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wloop_in_blockert1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floop_in_blockert1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_blockert1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_blockert1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockert11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment1_in_blockert11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_blockert11296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_query_in_blockert11308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_blockert11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_blockert11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionals_in_blockert11338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalelsif_in_blockert11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loops_in_blockert11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wloop_in_blockert11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floop_in_blockert11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_blockert11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_blockert11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var1_in_assignment1426 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_assignment1428 = new BitSet(new long[]{0x0000800000000070L});
    public static final BitSet FOLLOW_var2_in_assignment1430 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignment1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var1_in_assignment11457 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_assignment11459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v10_in_assignment11461 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignment11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_var21508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericBlock_in_var21517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var21526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID1_in_var21535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_genericBlock1550 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_46_in_genericBlock1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_genericBlock1555 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_ID1_in_genericBlock1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_genericBlock1565 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_47_in_genericBlock1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_valiableBlock1581 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_46_in_valiableBlock1584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_valiableBlock1586 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_ID1_in_valiableBlock1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_valiableBlock1596 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_47_in_valiableBlock1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID1_in_debugBlock1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var31628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declaration1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_variable1665 = new BitSet(new long[]{0x0000000000000590L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_type_in_variable1667 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_45_in_variable1670 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_valiableBlock_in_variable1672 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_variable1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_printstatement1749 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_state_in_printstatement1751 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_printstatement1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_printstatement1772 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_state_in_printstatement1774 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_printstatement1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_printstatement1794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_state_in_printstatement1796 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_printstatement1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_printstatement1812 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_state_in_printstatement1814 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_printstatement1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_debugBlock_in_state1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_sql_query1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_sql_query1893 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_sql_query1903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v2_in_sql_query1913 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_sql_query1923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v3_in_sql_query1933 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_sql_query1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_insert_statement1984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_insert_statement1988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_v11_in_insert_statement1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_update_statement2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_update_statement2022 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_update_statement2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_v12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID1_in_v112069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID1_in_v122088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_v22107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_v32125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_k_in_funccall2142 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_funccall2144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_k_in_funccall2148 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_funccall2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_k_in_procall2176 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_procall2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_k2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_v42221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_aside_in_v42229 = new BitSet(new long[]{0xE400000000000000L});
    public static final BitSet FOLLOW_58_in_v42247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v42251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61_in_v42279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v42283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_v42311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v42315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_v42343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v42347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_v42374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aside_in_v102388 = new BitSet(new long[]{0xE400000000000000L});
    public static final BitSet FOLLOW_58_in_v102406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_v102438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_v102470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_v102502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_aside2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_aside12567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_arguments2598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_paramdeclaration_in_arguments2601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_65_in_arguments2605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_paramdeclaration_in_arguments2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_arguments2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_paramdeclaration2642 = new BitSet(new long[]{0x0000000000000780L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_paramdeclaration2644 = new BitSet(new long[]{0x0000000000000780L,0x000000000000000CL});
    public static final BitSet FOLLOW_datatype_in_paramdeclaration2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID1_in_name2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type1_in_datatype2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_type2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_type2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_type2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_type2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_type2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varc_in_type2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_type2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR2_in_type2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varc2_in_type2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typ_in_type2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_type2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_num2955 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_64_in_num2958 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_74_in_num2965 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_64_in_num2968 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_75_in_varc22983 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_64_in_varc22986 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_76_in_varc22994 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_64_in_varc22997 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_77_in_varc3011 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_64_in_varc3014 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_78_in_varc3022 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_64_in_varc3025 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ID_in_typ3039 = new BitSet(new long[]{0x0000400000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_46_in_typ3042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_typ3044 = new BitSet(new long[]{0x0000400000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_typ3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typ3053 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_46_in_typ3056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_typ3058 = new BitSet(new long[]{0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_typ3062 = new BitSet(new long[]{0x0000000000000002L});

}