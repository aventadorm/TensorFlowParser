// Generated from Prog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, ID=34, INT=35, ID2=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_inputshape = 1, RULE_inputshapedims = 2, RULE_inputshapedimvalue = 3, 
		RULE_progname = 4, RULE_proginputname = 5, RULE_layers = 6, RULE_layerparams = 7, 
		RULE_layername = 8, RULE_layertype = 9, RULE_layerbottom = 10, RULE_layertop = 11, 
		RULE_convolutionparam = 12, RULE_param = 13, RULE_paramparams = 14, RULE_lrmultvalue = 15, 
		RULE_decaymultvalue = 16, RULE_batchnormparam = 17, RULE_batchnormparamparams = 18, 
		RULE_batchnormparamuseglobalstats = 19, RULE_batchnormparameps = 20, RULE_poolingparam = 21, 
		RULE_poolingparamparams = 22, RULE_poolingparampool = 23, RULE_poolingkernelsize = 24, 
		RULE_poolingparamstride = 25, RULE_poolingparampad = 26, RULE_poolingparamglobalpooling = 27, 
		RULE_scaleparam = 28, RULE_scaleparamparams = 29, RULE_scaleparambiasterm = 30, 
		RULE_convolutionparamparams = 31, RULE_convolutionbiasterm = 32, RULE_convolutionnumoutput = 33, 
		RULE_convolutionpad = 34, RULE_convolutionkernelsize = 35, RULE_convolutionstride = 36, 
		RULE_weightfillerparams = 37, RULE_weightfillerparamstype = 38, RULE_weightfillerparamsstd = 39, 
		RULE_dropoutparam = 40, RULE_dropoutparamparams = 41, RULE_dropoutparamdropoutratio = 42, 
		RULE_reshapeparam = 43, RULE_reshapeparamparams = 44, RULE_reshapedims = 45, 
		RULE_reshapedimvalue = 46;
	public static final String[] ruleNames = {
		"prog", "inputshape", "inputshapedims", "inputshapedimvalue", "progname", 
		"proginputname", "layers", "layerparams", "layername", "layertype", "layerbottom", 
		"layertop", "convolutionparam", "param", "paramparams", "lrmultvalue", 
		"decaymultvalue", "batchnormparam", "batchnormparamparams", "batchnormparamuseglobalstats", 
		"batchnormparameps", "poolingparam", "poolingparamparams", "poolingparampool", 
		"poolingkernelsize", "poolingparamstride", "poolingparampad", "poolingparamglobalpooling", 
		"scaleparam", "scaleparamparams", "scaleparambiasterm", "convolutionparamparams", 
		"convolutionbiasterm", "convolutionnumoutput", "convolutionpad", "convolutionkernelsize", 
		"convolutionstride", "weightfillerparams", "weightfillerparamstype", "weightfillerparamsstd", 
		"dropoutparam", "dropoutparamparams", "dropoutparamdropoutratio", "reshapeparam", 
		"reshapeparamparams", "reshapedims", "reshapedimvalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'name:'", "'\"'", "'input:'", "'input_shape'", "'{'", "'}'", "'dim:'", 
		"'layer'", "'type:'", "'bottom:'", "'top:'", "'convolution_param'", "'param'", 
		"'lr_mult:'", "'decay_mult:'", "'batch_norm_param'", "'use_global_stats: '", 
		"'eps:'", "'pooling_param'", "'pool:'", "'kernel_size:'", "'stride:'", 
		"'pad:'", "'global_pooling:'", "'scale_param'", "'bias_term:'", "'num_output:'", 
		"'weight_filler'", "'std:'", "'dropout_param'", "'dropout_ratio:'", "'reshape_param'", 
		"'shape'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"ID2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Prog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public PrognameContext progname() {
			return getRuleContext(PrognameContext.class,0);
		}
		public ProginputnameContext proginputname() {
			return getRuleContext(ProginputnameContext.class,0);
		}
		public InputshapeContext inputshape() {
			return getRuleContext(InputshapeContext.class,0);
		}
		public List<LayersContext> layers() {
			return getRuleContexts(LayersContext.class);
		}
		public LayersContext layers(int i) {
			return getRuleContext(LayersContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__0);
			setState(95);
			match(T__1);
			setState(96);
			progname();
			setState(97);
			match(T__1);
			setState(98);
			match(T__2);
			setState(99);
			match(T__1);
			setState(100);
			proginputname();
			setState(101);
			match(T__1);
			setState(102);
			inputshape();
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				layers();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputshapeContext extends ParserRuleContext {
		public List<InputshapedimsContext> inputshapedims() {
			return getRuleContexts(InputshapedimsContext.class);
		}
		public InputshapedimsContext inputshapedims(int i) {
			return getRuleContext(InputshapedimsContext.class,i);
		}
		public InputshapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputshape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterInputshape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitInputshape(this);
		}
	}

	public final InputshapeContext inputshape() throws RecognitionException {
		InputshapeContext _localctx = new InputshapeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inputshape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__3);
			setState(109);
			match(T__4);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				inputshapedims();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(115);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputshapedimsContext extends ParserRuleContext {
		public InputshapedimvalueContext inputshapedimvalue() {
			return getRuleContext(InputshapedimvalueContext.class,0);
		}
		public InputshapedimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputshapedims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterInputshapedims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitInputshapedims(this);
		}
	}

	public final InputshapedimsContext inputshapedims() throws RecognitionException {
		InputshapedimsContext _localctx = new InputshapedimsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputshapedims);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__6);
			setState(118);
			inputshapedimvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputshapedimvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public InputshapedimvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputshapedimvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterInputshapedimvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitInputshapedimvalue(this);
		}
	}

	public final InputshapedimvalueContext inputshapedimvalue() throws RecognitionException {
		InputshapedimvalueContext _localctx = new InputshapedimvalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inputshapedimvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrognameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public PrognameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterProgname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitProgname(this);
		}
	}

	public final PrognameContext progname() throws RecognitionException {
		PrognameContext _localctx = new PrognameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_progname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProginputnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public ProginputnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proginputname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterProginputname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitProginputname(this);
		}
	}

	public final ProginputnameContext proginputname() throws RecognitionException {
		ProginputnameContext _localctx = new ProginputnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proginputname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayersContext extends ParserRuleContext {
		public List<LayerparamsContext> layerparams() {
			return getRuleContexts(LayerparamsContext.class);
		}
		public LayerparamsContext layerparams(int i) {
			return getRuleContext(LayerparamsContext.class,i);
		}
		public LayersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLayers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLayers(this);
		}
	}

	public final LayersContext layers() throws RecognitionException {
		LayersContext _localctx = new LayersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_layers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(T__4);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				layerparams();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__24) | (1L << T__29) | (1L << T__31))) != 0) );
			setState(133);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayerparamsContext extends ParserRuleContext {
		public LayernameContext layername() {
			return getRuleContext(LayernameContext.class,0);
		}
		public LayertypeContext layertype() {
			return getRuleContext(LayertypeContext.class,0);
		}
		public LayerbottomContext layerbottom() {
			return getRuleContext(LayerbottomContext.class,0);
		}
		public LayertopContext layertop() {
			return getRuleContext(LayertopContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ConvolutionparamContext convolutionparam() {
			return getRuleContext(ConvolutionparamContext.class,0);
		}
		public BatchnormparamContext batchnormparam() {
			return getRuleContext(BatchnormparamContext.class,0);
		}
		public PoolingparamContext poolingparam() {
			return getRuleContext(PoolingparamContext.class,0);
		}
		public ScaleparamContext scaleparam() {
			return getRuleContext(ScaleparamContext.class,0);
		}
		public DropoutparamContext dropoutparam() {
			return getRuleContext(DropoutparamContext.class,0);
		}
		public ReshapeparamContext reshapeparam() {
			return getRuleContext(ReshapeparamContext.class,0);
		}
		public LayerparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLayerparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLayerparams(this);
		}
	}

	public final LayerparamsContext layerparams() throws RecognitionException {
		LayerparamsContext _localctx = new LayerparamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_layerparams);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__0);
				setState(136);
				match(T__1);
				setState(137);
				layername();
				setState(138);
				match(T__1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__8);
				setState(141);
				match(T__1);
				setState(142);
				layertype();
				setState(143);
				match(T__1);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(T__9);
				setState(146);
				match(T__1);
				setState(147);
				layerbottom();
				setState(148);
				match(T__1);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(T__10);
				setState(151);
				match(T__1);
				setState(152);
				layertop();
				setState(153);
				match(T__1);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				param();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				convolutionparam();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				batchnormparam();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				poolingparam();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				scaleparam();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
				dropoutparam();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				reshapeparam();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayernameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public LayernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layername; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLayername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLayername(this);
		}
	}

	public final LayernameContext layername() throws RecognitionException {
		LayernameContext _localctx = new LayernameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_layername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayertypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public LayertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLayertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLayertype(this);
		}
	}

	public final LayertypeContext layertype() throws RecognitionException {
		LayertypeContext _localctx = new LayertypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_layertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayerbottomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public LayerbottomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerbottom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLayerbottom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLayerbottom(this);
		}
	}

	public final LayerbottomContext layerbottom() throws RecognitionException {
		LayerbottomContext _localctx = new LayerbottomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_layerbottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayertopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public LayertopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layertop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLayertop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLayertop(this);
		}
	}

	public final LayertopContext layertop() throws RecognitionException {
		LayertopContext _localctx = new LayertopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_layertop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionparamContext extends ParserRuleContext {
		public List<ConvolutionparamparamsContext> convolutionparamparams() {
			return getRuleContexts(ConvolutionparamparamsContext.class);
		}
		public ConvolutionparamparamsContext convolutionparamparams(int i) {
			return getRuleContext(ConvolutionparamparamsContext.class,i);
		}
		public ConvolutionparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionparam(this);
		}
	}

	public final ConvolutionparamContext convolutionparam() throws RecognitionException {
		ConvolutionparamContext _localctx = new ConvolutionparamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_convolutionparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__11);
			setState(173);
			match(T__4);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				convolutionparamparams();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0) );
			setState(179);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public List<ParamparamsContext> paramparams() {
			return getRuleContexts(ParamparamsContext.class);
		}
		public ParamparamsContext paramparams(int i) {
			return getRuleContext(ParamparamsContext.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__12);
			setState(182);
			match(T__4);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				paramparams();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 || _la==T__14 );
			setState(188);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamparamsContext extends ParserRuleContext {
		public LrmultvalueContext lrmultvalue() {
			return getRuleContext(LrmultvalueContext.class,0);
		}
		public DecaymultvalueContext decaymultvalue() {
			return getRuleContext(DecaymultvalueContext.class,0);
		}
		public ParamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterParamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitParamparams(this);
		}
	}

	public final ParamparamsContext paramparams() throws RecognitionException {
		ParamparamsContext _localctx = new ParamparamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramparams);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__13);
				setState(191);
				lrmultvalue();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__14);
				setState(193);
				decaymultvalue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LrmultvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public LrmultvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lrmultvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterLrmultvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitLrmultvalue(this);
		}
	}

	public final LrmultvalueContext lrmultvalue() throws RecognitionException {
		LrmultvalueContext _localctx = new LrmultvalueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lrmultvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecaymultvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public DecaymultvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decaymultvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterDecaymultvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitDecaymultvalue(this);
		}
	}

	public final DecaymultvalueContext decaymultvalue() throws RecognitionException {
		DecaymultvalueContext _localctx = new DecaymultvalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decaymultvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchnormparamContext extends ParserRuleContext {
		public List<BatchnormparamparamsContext> batchnormparamparams() {
			return getRuleContexts(BatchnormparamparamsContext.class);
		}
		public BatchnormparamparamsContext batchnormparamparams(int i) {
			return getRuleContext(BatchnormparamparamsContext.class,i);
		}
		public BatchnormparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchnormparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterBatchnormparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitBatchnormparam(this);
		}
	}

	public final BatchnormparamContext batchnormparam() throws RecognitionException {
		BatchnormparamContext _localctx = new BatchnormparamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_batchnormparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__15);
			setState(201);
			match(T__4);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				batchnormparamparams();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==T__17 );
			setState(207);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchnormparamparamsContext extends ParserRuleContext {
		public BatchnormparamuseglobalstatsContext batchnormparamuseglobalstats() {
			return getRuleContext(BatchnormparamuseglobalstatsContext.class,0);
		}
		public BatchnormparamepsContext batchnormparameps() {
			return getRuleContext(BatchnormparamepsContext.class,0);
		}
		public BatchnormparamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchnormparamparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterBatchnormparamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitBatchnormparamparams(this);
		}
	}

	public final BatchnormparamparamsContext batchnormparamparams() throws RecognitionException {
		BatchnormparamparamsContext _localctx = new BatchnormparamparamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_batchnormparamparams);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__16);
				setState(210);
				batchnormparamuseglobalstats();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__17);
				setState(212);
				batchnormparameps();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchnormparamuseglobalstatsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public BatchnormparamuseglobalstatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchnormparamuseglobalstats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterBatchnormparamuseglobalstats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitBatchnormparamuseglobalstats(this);
		}
	}

	public final BatchnormparamuseglobalstatsContext batchnormparamuseglobalstats() throws RecognitionException {
		BatchnormparamuseglobalstatsContext _localctx = new BatchnormparamuseglobalstatsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_batchnormparamuseglobalstats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchnormparamepsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public BatchnormparamepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchnormparameps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterBatchnormparameps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitBatchnormparameps(this);
		}
	}

	public final BatchnormparamepsContext batchnormparameps() throws RecognitionException {
		BatchnormparamepsContext _localctx = new BatchnormparamepsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_batchnormparameps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingparamContext extends ParserRuleContext {
		public List<PoolingparamparamsContext> poolingparamparams() {
			return getRuleContexts(PoolingparamparamsContext.class);
		}
		public PoolingparamparamsContext poolingparamparams(int i) {
			return getRuleContext(PoolingparamparamsContext.class,i);
		}
		public PoolingparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingparam(this);
		}
	}

	public final PoolingparamContext poolingparam() throws RecognitionException {
		PoolingparamContext _localctx = new PoolingparamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_poolingparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__18);
			setState(220);
			match(T__4);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				poolingparamparams();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0) );
			setState(226);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingparamparamsContext extends ParserRuleContext {
		public PoolingparampoolContext poolingparampool() {
			return getRuleContext(PoolingparampoolContext.class,0);
		}
		public PoolingkernelsizeContext poolingkernelsize() {
			return getRuleContext(PoolingkernelsizeContext.class,0);
		}
		public PoolingparamstrideContext poolingparamstride() {
			return getRuleContext(PoolingparamstrideContext.class,0);
		}
		public PoolingparampadContext poolingparampad() {
			return getRuleContext(PoolingparampadContext.class,0);
		}
		public PoolingparamglobalpoolingContext poolingparamglobalpooling() {
			return getRuleContext(PoolingparamglobalpoolingContext.class,0);
		}
		public PoolingparamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingparamparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingparamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingparamparams(this);
		}
	}

	public final PoolingparamparamsContext poolingparamparams() throws RecognitionException {
		PoolingparamparamsContext _localctx = new PoolingparamparamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_poolingparamparams);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__19);
				setState(229);
				poolingparampool();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__20);
				setState(231);
				poolingkernelsize();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__21);
				setState(233);
				poolingparamstride();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(T__22);
				setState(235);
				poolingparampad();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__23);
				setState(237);
				poolingparamglobalpooling();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingparampoolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public PoolingparampoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingparampool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingparampool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingparampool(this);
		}
	}

	public final PoolingparampoolContext poolingparampool() throws RecognitionException {
		PoolingparampoolContext _localctx = new PoolingparampoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_poolingparampool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingkernelsizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public PoolingkernelsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingkernelsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingkernelsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingkernelsize(this);
		}
	}

	public final PoolingkernelsizeContext poolingkernelsize() throws RecognitionException {
		PoolingkernelsizeContext _localctx = new PoolingkernelsizeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_poolingkernelsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingparamstrideContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public PoolingparamstrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingparamstride; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingparamstride(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingparamstride(this);
		}
	}

	public final PoolingparamstrideContext poolingparamstride() throws RecognitionException {
		PoolingparamstrideContext _localctx = new PoolingparamstrideContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_poolingparamstride);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingparampadContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public PoolingparampadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingparampad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingparampad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingparampad(this);
		}
	}

	public final PoolingparampadContext poolingparampad() throws RecognitionException {
		PoolingparampadContext _localctx = new PoolingparampadContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_poolingparampad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PoolingparamglobalpoolingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public PoolingparamglobalpoolingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingparamglobalpooling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterPoolingparamglobalpooling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitPoolingparamglobalpooling(this);
		}
	}

	public final PoolingparamglobalpoolingContext poolingparamglobalpooling() throws RecognitionException {
		PoolingparamglobalpoolingContext _localctx = new PoolingparamglobalpoolingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_poolingparamglobalpooling);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleparamContext extends ParserRuleContext {
		public List<ScaleparamparamsContext> scaleparamparams() {
			return getRuleContexts(ScaleparamparamsContext.class);
		}
		public ScaleparamparamsContext scaleparamparams(int i) {
			return getRuleContext(ScaleparamparamsContext.class,i);
		}
		public ScaleparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterScaleparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitScaleparam(this);
		}
	}

	public final ScaleparamContext scaleparam() throws RecognitionException {
		ScaleparamContext _localctx = new ScaleparamContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scaleparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__24);
			setState(251);
			match(T__4);
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				scaleparamparams();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__25 );
			setState(257);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleparamparamsContext extends ParserRuleContext {
		public ScaleparambiastermContext scaleparambiasterm() {
			return getRuleContext(ScaleparambiastermContext.class,0);
		}
		public ScaleparamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleparamparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterScaleparamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitScaleparamparams(this);
		}
	}

	public final ScaleparamparamsContext scaleparamparams() throws RecognitionException {
		ScaleparamparamsContext _localctx = new ScaleparamparamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_scaleparamparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__25);
			setState(260);
			scaleparambiasterm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleparambiastermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public ScaleparambiastermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleparambiasterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterScaleparambiasterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitScaleparambiasterm(this);
		}
	}

	public final ScaleparambiastermContext scaleparambiasterm() throws RecognitionException {
		ScaleparambiastermContext _localctx = new ScaleparambiastermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scaleparambiasterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionparamparamsContext extends ParserRuleContext {
		public ConvolutionbiastermContext convolutionbiasterm() {
			return getRuleContext(ConvolutionbiastermContext.class,0);
		}
		public ConvolutionnumoutputContext convolutionnumoutput() {
			return getRuleContext(ConvolutionnumoutputContext.class,0);
		}
		public ConvolutionpadContext convolutionpad() {
			return getRuleContext(ConvolutionpadContext.class,0);
		}
		public ConvolutionkernelsizeContext convolutionkernelsize() {
			return getRuleContext(ConvolutionkernelsizeContext.class,0);
		}
		public ConvolutionstrideContext convolutionstride() {
			return getRuleContext(ConvolutionstrideContext.class,0);
		}
		public List<WeightfillerparamsContext> weightfillerparams() {
			return getRuleContexts(WeightfillerparamsContext.class);
		}
		public WeightfillerparamsContext weightfillerparams(int i) {
			return getRuleContext(WeightfillerparamsContext.class,i);
		}
		public ConvolutionparamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionparamparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionparamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionparamparams(this);
		}
	}

	public final ConvolutionparamparamsContext convolutionparamparams() throws RecognitionException {
		ConvolutionparamparamsContext _localctx = new ConvolutionparamparamsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_convolutionparamparams);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__25);
				setState(265);
				convolutionbiasterm();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__26);
				setState(267);
				convolutionnumoutput();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(T__22);
				setState(269);
				convolutionpad();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(T__20);
				setState(271);
				convolutionkernelsize();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(T__21);
				setState(273);
				convolutionstride();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(T__27);
				setState(275);
				match(T__4);
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					weightfillerparams();
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 || _la==T__28 );
				setState(281);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionbiastermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public ConvolutionbiastermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionbiasterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionbiasterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionbiasterm(this);
		}
	}

	public final ConvolutionbiastermContext convolutionbiasterm() throws RecognitionException {
		ConvolutionbiastermContext _localctx = new ConvolutionbiastermContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_convolutionbiasterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionnumoutputContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public ConvolutionnumoutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionnumoutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionnumoutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionnumoutput(this);
		}
	}

	public final ConvolutionnumoutputContext convolutionnumoutput() throws RecognitionException {
		ConvolutionnumoutputContext _localctx = new ConvolutionnumoutputContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_convolutionnumoutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionpadContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public ConvolutionpadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionpad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionpad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionpad(this);
		}
	}

	public final ConvolutionpadContext convolutionpad() throws RecognitionException {
		ConvolutionpadContext _localctx = new ConvolutionpadContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_convolutionpad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionkernelsizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public ConvolutionkernelsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionkernelsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionkernelsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionkernelsize(this);
		}
	}

	public final ConvolutionkernelsizeContext convolutionkernelsize() throws RecognitionException {
		ConvolutionkernelsizeContext _localctx = new ConvolutionkernelsizeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_convolutionkernelsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvolutionstrideContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public ConvolutionstrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convolutionstride; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterConvolutionstride(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitConvolutionstride(this);
		}
	}

	public final ConvolutionstrideContext convolutionstride() throws RecognitionException {
		ConvolutionstrideContext _localctx = new ConvolutionstrideContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_convolutionstride);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightfillerparamsContext extends ParserRuleContext {
		public WeightfillerparamstypeContext weightfillerparamstype() {
			return getRuleContext(WeightfillerparamstypeContext.class,0);
		}
		public WeightfillerparamsstdContext weightfillerparamsstd() {
			return getRuleContext(WeightfillerparamsstdContext.class,0);
		}
		public WeightfillerparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightfillerparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterWeightfillerparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitWeightfillerparams(this);
		}
	}

	public final WeightfillerparamsContext weightfillerparams() throws RecognitionException {
		WeightfillerparamsContext _localctx = new WeightfillerparamsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_weightfillerparams);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__8);
				setState(296);
				match(T__1);
				setState(297);
				weightfillerparamstype();
				setState(298);
				match(T__1);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(T__28);
				setState(301);
				weightfillerparamsstd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightfillerparamstypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public WeightfillerparamstypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightfillerparamstype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterWeightfillerparamstype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitWeightfillerparamstype(this);
		}
	}

	public final WeightfillerparamstypeContext weightfillerparamstype() throws RecognitionException {
		WeightfillerparamstypeContext _localctx = new WeightfillerparamstypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_weightfillerparamstype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightfillerparamsstdContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public WeightfillerparamsstdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightfillerparamsstd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterWeightfillerparamsstd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitWeightfillerparamsstd(this);
		}
	}

	public final WeightfillerparamsstdContext weightfillerparamsstd() throws RecognitionException {
		WeightfillerparamsstdContext _localctx = new WeightfillerparamsstdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_weightfillerparamsstd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropoutparamContext extends ParserRuleContext {
		public List<DropoutparamparamsContext> dropoutparamparams() {
			return getRuleContexts(DropoutparamparamsContext.class);
		}
		public DropoutparamparamsContext dropoutparamparams(int i) {
			return getRuleContext(DropoutparamparamsContext.class,i);
		}
		public DropoutparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropoutparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterDropoutparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitDropoutparam(this);
		}
	}

	public final DropoutparamContext dropoutparam() throws RecognitionException {
		DropoutparamContext _localctx = new DropoutparamContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dropoutparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__29);
			setState(309);
			match(T__4);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				dropoutparamparams();
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__30 );
			setState(315);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropoutparamparamsContext extends ParserRuleContext {
		public DropoutparamdropoutratioContext dropoutparamdropoutratio() {
			return getRuleContext(DropoutparamdropoutratioContext.class,0);
		}
		public DropoutparamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropoutparamparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterDropoutparamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitDropoutparamparams(this);
		}
	}

	public final DropoutparamparamsContext dropoutparamparams() throws RecognitionException {
		DropoutparamparamsContext _localctx = new DropoutparamparamsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dropoutparamparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__30);
			setState(318);
			dropoutparamdropoutratio();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropoutparamdropoutratioContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public DropoutparamdropoutratioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropoutparamdropoutratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterDropoutparamdropoutratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitDropoutparamdropoutratio(this);
		}
	}

	public final DropoutparamdropoutratioContext dropoutparamdropoutratio() throws RecognitionException {
		DropoutparamdropoutratioContext _localctx = new DropoutparamdropoutratioContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dropoutparamdropoutratio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReshapeparamContext extends ParserRuleContext {
		public List<ReshapeparamparamsContext> reshapeparamparams() {
			return getRuleContexts(ReshapeparamparamsContext.class);
		}
		public ReshapeparamparamsContext reshapeparamparams(int i) {
			return getRuleContext(ReshapeparamparamsContext.class,i);
		}
		public ReshapeparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reshapeparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterReshapeparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitReshapeparam(this);
		}
	}

	public final ReshapeparamContext reshapeparam() throws RecognitionException {
		ReshapeparamContext _localctx = new ReshapeparamContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_reshapeparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__31);
			setState(323);
			match(T__4);
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				reshapeparamparams();
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__32 );
			setState(329);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReshapeparamparamsContext extends ParserRuleContext {
		public List<ReshapedimsContext> reshapedims() {
			return getRuleContexts(ReshapedimsContext.class);
		}
		public ReshapedimsContext reshapedims(int i) {
			return getRuleContext(ReshapedimsContext.class,i);
		}
		public ReshapeparamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reshapeparamparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterReshapeparamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitReshapeparamparams(this);
		}
	}

	public final ReshapeparamparamsContext reshapeparamparams() throws RecognitionException {
		ReshapeparamparamsContext _localctx = new ReshapeparamparamsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_reshapeparamparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__32);
			setState(332);
			match(T__4);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				reshapedims();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(338);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReshapedimsContext extends ParserRuleContext {
		public ReshapedimvalueContext reshapedimvalue() {
			return getRuleContext(ReshapedimvalueContext.class,0);
		}
		public ReshapedimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reshapedims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterReshapedims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitReshapedims(this);
		}
	}

	public final ReshapedimsContext reshapedims() throws RecognitionException {
		ReshapedimsContext _localctx = new ReshapedimsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_reshapedims);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__6);
			setState(341);
			reshapedimvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReshapedimvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
		public ReshapedimvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reshapedimvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterReshapedimvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitReshapedimvalue(this);
		}
	}

	public final ReshapedimvalueContext reshapedimvalue() throws RecognitionException {
		ReshapedimvalueContext _localctx = new ReshapedimvalueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_reshapedimvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\6\2k\n\2\r\2\16\2l\3\3\3\3\3\3\6\3r\n\3\r\3\16\3s\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\6\b\u0084\n\b\r\b\16\b\u0085\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\6\16\u00b2\n\16\r\16\16\16\u00b3"+
		"\3\16\3\16\3\17\3\17\3\17\6\17\u00bb\n\17\r\17\16\17\u00bc\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00c5\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\6\23\u00ce\n\23\r\23\16\23\u00cf\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00d8"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\6\27\u00e1\n\27\r\27\16\27\u00e2"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f1"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\6\36\u0100\n\36\r\36\16\36\u0101\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u0118\n!\r!\16!\u0119\3!\3!\5!\u011e"+
		"\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0131"+
		"\n\'\3(\3(\3)\3)\3*\3*\3*\6*\u013a\n*\r*\16*\u013b\3*\3*\3+\3+\3+\3,\3"+
		",\3-\3-\3-\6-\u0148\n-\r-\16-\u0149\3-\3-\3.\3.\3.\6.\u0151\n.\r.\16."+
		"\u0152\3.\3.\3/\3/\3/\3\60\3\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\2\2\u014e\2`"+
		"\3\2\2\2\4n\3\2\2\2\6w\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16\u0080"+
		"\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00a8\3\2\2\2\26\u00aa\3"+
		"\2\2\2\30\u00ac\3\2\2\2\32\u00ae\3\2\2\2\34\u00b7\3\2\2\2\36\u00c4\3\2"+
		"\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00d7\3\2\2\2(\u00d9"+
		"\3\2\2\2*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00f0\3\2\2\2\60\u00f2\3\2\2\2"+
		"\62\u00f4\3\2\2\2\64\u00f6\3\2\2\2\66\u00f8\3\2\2\28\u00fa\3\2\2\2:\u00fc"+
		"\3\2\2\2<\u0105\3\2\2\2>\u0108\3\2\2\2@\u011d\3\2\2\2B\u011f\3\2\2\2D"+
		"\u0121\3\2\2\2F\u0123\3\2\2\2H\u0125\3\2\2\2J\u0127\3\2\2\2L\u0130\3\2"+
		"\2\2N\u0132\3\2\2\2P\u0134\3\2\2\2R\u0136\3\2\2\2T\u013f\3\2\2\2V\u0142"+
		"\3\2\2\2X\u0144\3\2\2\2Z\u014d\3\2\2\2\\\u0156\3\2\2\2^\u0159\3\2\2\2"+
		"`a\7\3\2\2ab\7\4\2\2bc\5\n\6\2cd\7\4\2\2de\7\5\2\2ef\7\4\2\2fg\5\f\7\2"+
		"gh\7\4\2\2hj\5\4\3\2ik\5\16\b\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2m\3\3\2\2\2no\7\6\2\2oq\7\7\2\2pr\5\6\4\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2uv\7\b\2\2v\5\3\2\2\2wx\7\t\2\2xy\5\b\5\2y\7\3"+
		"\2\2\2z{\7%\2\2{\t\3\2\2\2|}\7$\2\2}\13\3\2\2\2~\177\7$\2\2\177\r\3\2"+
		"\2\2\u0080\u0081\7\n\2\2\u0081\u0083\7\7\2\2\u0082\u0084\5\20\t\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\b\2\2\u0088\17\3\2\2\2\u0089\u008a"+
		"\7\3\2\2\u008a\u008b\7\4\2\2\u008b\u008c\5\22\n\2\u008c\u008d\7\4\2\2"+
		"\u008d\u00a5\3\2\2\2\u008e\u008f\7\13\2\2\u008f\u0090\7\4\2\2\u0090\u0091"+
		"\5\24\13\2\u0091\u0092\7\4\2\2\u0092\u00a5\3\2\2\2\u0093\u0094\7\f\2\2"+
		"\u0094\u0095\7\4\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7\4\2\2\u0097\u00a5"+
		"\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5\30\r\2"+
		"\u009b\u009c\7\4\2\2\u009c\u00a5\3\2\2\2\u009d\u00a5\5\34\17\2\u009e\u00a5"+
		"\5\32\16\2\u009f\u00a5\5$\23\2\u00a0\u00a5\5,\27\2\u00a1\u00a5\5:\36\2"+
		"\u00a2\u00a5\5R*\2\u00a3\u00a5\5X-\2\u00a4\u0089\3\2\2\2\u00a4\u008e\3"+
		"\2\2\2\u00a4\u0093\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7"+
		"\7$\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9\25\3\2\2\2\u00aa\u00ab"+
		"\7$\2\2\u00ab\27\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad\31\3\2\2\2\u00ae\u00af"+
		"\7\16\2\2\u00af\u00b1\7\7\2\2\u00b0\u00b2\5@!\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\7\b\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00ba"+
		"\7\7\2\2\u00b9\u00bb\5\36\20\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\7\b\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\20\2\2\u00c1\u00c5\5 \21\2\u00c2"+
		"\u00c3\7\21\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c0\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c7\7%\2\2\u00c7!\3\2\2\2\u00c8\u00c9"+
		"\7%\2\2\u00c9#\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cd\7\7\2\2\u00cc"+
		"\u00ce\5&\24\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\b\2\2\u00d2"+
		"%\3\2\2\2\u00d3\u00d4\7\23\2\2\u00d4\u00d8\5(\25\2\u00d5\u00d6\7\24\2"+
		"\2\u00d6\u00d8\5*\26\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\'"+
		"\3\2\2\2\u00d9\u00da\7$\2\2\u00da)\3\2\2\2\u00db\u00dc\7%\2\2\u00dc+\3"+
		"\2\2\2\u00dd\u00de\7\25\2\2\u00de\u00e0\7\7\2\2\u00df\u00e1\5.\30\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\b\2\2\u00e5-\3\2\2\2\u00e6\u00e7"+
		"\7\26\2\2\u00e7\u00f1\5\60\31\2\u00e8\u00e9\7\27\2\2\u00e9\u00f1\5\62"+
		"\32\2\u00ea\u00eb\7\30\2\2\u00eb\u00f1\5\64\33\2\u00ec\u00ed\7\31\2\2"+
		"\u00ed\u00f1\5\66\34\2\u00ee\u00ef\7\32\2\2\u00ef\u00f1\58\35\2\u00f0"+
		"\u00e6\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3\61\3"+
		"\2\2\2\u00f4\u00f5\7%\2\2\u00f5\63\3\2\2\2\u00f6\u00f7\7%\2\2\u00f7\65"+
		"\3\2\2\2\u00f8\u00f9\7%\2\2\u00f9\67\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb"+
		"9\3\2\2\2\u00fc\u00fd\7\33\2\2\u00fd\u00ff\7\7\2\2\u00fe\u0100\5<\37\2"+
		"\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\b\2\2\u0104;\3\2\2\2\u0105"+
		"\u0106\7\34\2\2\u0106\u0107\5> \2\u0107=\3\2\2\2\u0108\u0109\7$\2\2\u0109"+
		"?\3\2\2\2\u010a\u010b\7\34\2\2\u010b\u011e\5B\"\2\u010c\u010d\7\35\2\2"+
		"\u010d\u011e\5D#\2\u010e\u010f\7\31\2\2\u010f\u011e\5F$\2\u0110\u0111"+
		"\7\27\2\2\u0111\u011e\5H%\2\u0112\u0113\7\30\2\2\u0113\u011e\5J&\2\u0114"+
		"\u0115\7\36\2\2\u0115\u0117\7\7\2\2\u0116\u0118\5L\'\2\u0117\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\7\b\2\2\u011c\u011e\3\2\2\2\u011d\u010a\3\2"+
		"\2\2\u011d\u010c\3\2\2\2\u011d\u010e\3\2\2\2\u011d\u0110\3\2\2\2\u011d"+
		"\u0112\3\2\2\2\u011d\u0114\3\2\2\2\u011eA\3\2\2\2\u011f\u0120\7$\2\2\u0120"+
		"C\3\2\2\2\u0121\u0122\7%\2\2\u0122E\3\2\2\2\u0123\u0124\7%\2\2\u0124G"+
		"\3\2\2\2\u0125\u0126\7%\2\2\u0126I\3\2\2\2\u0127\u0128\7%\2\2\u0128K\3"+
		"\2\2\2\u0129\u012a\7\13\2\2\u012a\u012b\7\4\2\2\u012b\u012c\5N(\2\u012c"+
		"\u012d\7\4\2\2\u012d\u0131\3\2\2\2\u012e\u012f\7\37\2\2\u012f\u0131\5"+
		"P)\2\u0130\u0129\3\2\2\2\u0130\u012e\3\2\2\2\u0131M\3\2\2\2\u0132\u0133"+
		"\7$\2\2\u0133O\3\2\2\2\u0134\u0135\7%\2\2\u0135Q\3\2\2\2\u0136\u0137\7"+
		" \2\2\u0137\u0139\7\7\2\2\u0138\u013a\5T+\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\7\b\2\2\u013eS\3\2\2\2\u013f\u0140\7!\2\2\u0140\u0141"+
		"\5V,\2\u0141U\3\2\2\2\u0142\u0143\7%\2\2\u0143W\3\2\2\2\u0144\u0145\7"+
		"\"\2\2\u0145\u0147\7\7\2\2\u0146\u0148\5Z.\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\7\b\2\2\u014cY\3\2\2\2\u014d\u014e\7#\2\2\u014e\u0150"+
		"\7\7\2\2\u014f\u0151\5\\/\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\b"+
		"\2\2\u0155[\3\2\2\2\u0156\u0157\7\t\2\2\u0157\u0158\5^\60\2\u0158]\3\2"+
		"\2\2\u0159\u015a\7%\2\2\u015a_\3\2\2\2\24ls\u0085\u00a4\u00b3\u00bc\u00c4"+
		"\u00cf\u00d7\u00e2\u00f0\u0101\u0119\u011d\u0130\u013b\u0149\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}