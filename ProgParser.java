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
		RULE_prog = 0, RULE_dims = 1, RULE_inputshape = 2, RULE_inputshapedims = 3, 
		RULE_inputshapedimvalue = 4, RULE_progname = 5, RULE_proginputname = 6, 
		RULE_layers = 7, RULE_layerparams = 8, RULE_layername = 9, RULE_layertype = 10, 
		RULE_layerbottom = 11, RULE_layertop = 12, RULE_convolutionparam = 13, 
		RULE_param = 14, RULE_paramparams = 15, RULE_lrmultvalue = 16, RULE_decaymultvalue = 17, 
		RULE_batchnormparam = 18, RULE_batchnormparamparams = 19, RULE_batchnormparamuseglobalstats = 20, 
		RULE_batchnormparameps = 21, RULE_poolingparamparams = 22, RULE_scaleparam = 23, 
		RULE_scaleparamparams = 24, RULE_scaleparambiasterm = 25, RULE_convolutionparamparams = 26, 
		RULE_convolutionbiasterm = 27, RULE_convolutionnumoutput = 28, RULE_convolutionpad = 29, 
		RULE_convolutionkernelsize = 30, RULE_convolutionstride = 31, RULE_weightfillerparams = 32, 
		RULE_weightfillerparamstype = 33, RULE_weightfillerparamsstd = 34, RULE_dropoutparamparams = 35, 
		RULE_reshapeparamparams = 36;
	public static final String[] ruleNames = {
		"prog", "dims", "inputshape", "inputshapedims", "inputshapedimvalue", 
		"progname", "proginputname", "layers", "layerparams", "layername", "layertype", 
		"layerbottom", "layertop", "convolutionparam", "param", "paramparams", 
		"lrmultvalue", "decaymultvalue", "batchnormparam", "batchnormparamparams", 
		"batchnormparamuseglobalstats", "batchnormparameps", "poolingparamparams", 
		"scaleparam", "scaleparamparams", "scaleparambiasterm", "convolutionparamparams", 
		"convolutionbiasterm", "convolutionnumoutput", "convolutionpad", "convolutionkernelsize", 
		"convolutionstride", "weightfillerparams", "weightfillerparamstype", "weightfillerparamsstd", 
		"dropoutparamparams", "reshapeparamparams"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'name:'", "'\"'", "'input:'", "'dim:'", "'input_shape'", "'{'", 
		"'}'", "'layer'", "'type:'", "'bottom:'", "'top:'", "'pooling_param'", 
		"'dropout_param'", "'reshape_param'", "'convolution_param'", "'param'", 
		"'lr_mult:'", "'decay_mult:'", "'batch_norm_param'", "'use_global_stats: '", 
		"'eps:'", "'pool:'", "'kernel_size:'", "'stride:'", "'pad:'", "'global_pooling:'", 
		"'scale_param'", "'bias_term:'", "'num_output:'", "'weight_filler'", "'std:'", 
		"'dropout_ratio:'", "'shape'"
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
			setState(74);
			match(T__0);
			setState(75);
			match(T__1);
			setState(76);
			progname();
			setState(77);
			match(T__1);
			setState(78);
			match(T__2);
			setState(79);
			match(T__1);
			setState(80);
			proginputname();
			setState(81);
			match(T__1);
			setState(82);
			inputshape();
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				layers();
				}
				}
				setState(86); 
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ProgParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ProgParser.INT, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				match(T__3);
				setState(89);
				match(INT);
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
		enterRule(_localctx, 4, RULE_inputshape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__4);
			setState(95);
			match(T__5);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				inputshapedims();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(101);
			match(T__6);
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
		enterRule(_localctx, 6, RULE_inputshapedims);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__3);
			setState(104);
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
		enterRule(_localctx, 8, RULE_inputshapedimvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 10, RULE_progname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		enterRule(_localctx, 12, RULE_proginputname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 14, RULE_layers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__7);
			setState(113);
			match(T__5);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				layerparams();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__26))) != 0) );
			setState(119);
			match(T__6);
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
		public List<PoolingparamparamsContext> poolingparamparams() {
			return getRuleContexts(PoolingparamparamsContext.class);
		}
		public PoolingparamparamsContext poolingparamparams(int i) {
			return getRuleContext(PoolingparamparamsContext.class,i);
		}
		public ScaleparamContext scaleparam() {
			return getRuleContext(ScaleparamContext.class,0);
		}
		public List<DropoutparamparamsContext> dropoutparamparams() {
			return getRuleContexts(DropoutparamparamsContext.class);
		}
		public DropoutparamparamsContext dropoutparamparams(int i) {
			return getRuleContext(DropoutparamparamsContext.class,i);
		}
		public List<ReshapeparamparamsContext> reshapeparamparams() {
			return getRuleContexts(ReshapeparamparamsContext.class);
		}
		public ReshapeparamparamsContext reshapeparamparams(int i) {
			return getRuleContext(ReshapeparamparamsContext.class,i);
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
		enterRule(_localctx, 16, RULE_layerparams);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__0);
				setState(122);
				match(T__1);
				setState(123);
				layername();
				setState(124);
				match(T__1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__8);
				setState(127);
				match(T__1);
				setState(128);
				layertype();
				setState(129);
				match(T__1);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__9);
				setState(132);
				match(T__1);
				setState(133);
				layerbottom();
				setState(134);
				match(T__1);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__10);
				setState(137);
				match(T__1);
				setState(138);
				layertop();
				setState(139);
				match(T__1);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				param();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				convolutionparam();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				batchnormparam();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(T__11);
				setState(145);
				match(T__5);
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					poolingparamparams();
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0) );
				setState(151);
				match(T__6);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				scaleparam();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				match(T__12);
				setState(155);
				match(T__5);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					dropoutparamparams();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__31 );
				setState(161);
				match(T__6);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				match(T__13);
				setState(164);
				match(T__5);
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					reshapeparamparams();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__32 );
				setState(170);
				match(T__6);
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
		enterRule(_localctx, 18, RULE_layername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 20, RULE_layertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 22, RULE_layerbottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 24, RULE_layertop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 26, RULE_convolutionparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__14);
			setState(183);
			match(T__5);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				convolutionparamparams();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) );
			setState(189);
			match(T__6);
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
		enterRule(_localctx, 28, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__15);
			setState(192);
			match(T__5);
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				paramparams();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==T__17 );
			setState(198);
			match(T__6);
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
		enterRule(_localctx, 30, RULE_paramparams);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__16);
				setState(201);
				lrmultvalue();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__17);
				setState(203);
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
		enterRule(_localctx, 32, RULE_lrmultvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 34, RULE_decaymultvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 36, RULE_batchnormparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__18);
			setState(211);
			match(T__5);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				batchnormparamparams();
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 || _la==T__20 );
			setState(217);
			match(T__6);
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
		enterRule(_localctx, 38, RULE_batchnormparamparams);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__19);
				setState(220);
				batchnormparamuseglobalstats();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__20);
				setState(222);
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
		enterRule(_localctx, 40, RULE_batchnormparamuseglobalstats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 42, RULE_batchnormparameps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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

	public static class PoolingparamparamsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgParser.ID, 0); }
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
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
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__21);
				setState(230);
				match(ID);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__22);
				setState(232);
				match(INT);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(T__23);
				setState(234);
				match(INT);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(T__24);
				setState(236);
				match(INT);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(T__25);
				setState(238);
				match(ID);
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
		enterRule(_localctx, 46, RULE_scaleparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__26);
			setState(242);
			match(T__5);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				scaleparamparams();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
			setState(248);
			match(T__6);
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
		enterRule(_localctx, 48, RULE_scaleparamparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__27);
			setState(251);
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
		enterRule(_localctx, 50, RULE_scaleparambiasterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 52, RULE_convolutionparamparams);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__27);
				setState(256);
				convolutionbiasterm();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__28);
				setState(258);
				convolutionnumoutput();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(T__24);
				setState(260);
				convolutionpad();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(T__22);
				setState(262);
				convolutionkernelsize();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(T__23);
				setState(264);
				convolutionstride();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				match(T__29);
				setState(266);
				match(T__5);
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(267);
					weightfillerparams();
					}
					}
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 || _la==T__30 );
				setState(272);
				match(T__6);
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
		enterRule(_localctx, 54, RULE_convolutionbiasterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 56, RULE_convolutionnumoutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 58, RULE_convolutionpad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 60, RULE_convolutionkernelsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 62, RULE_convolutionstride);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		enterRule(_localctx, 64, RULE_weightfillerparams);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__8);
				setState(287);
				match(T__1);
				setState(288);
				weightfillerparamstype();
				setState(289);
				match(T__1);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__30);
				setState(292);
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
		enterRule(_localctx, 66, RULE_weightfillerparamstype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 68, RULE_weightfillerparamsstd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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

	public static class DropoutparamparamsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProgParser.INT, 0); }
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
		enterRule(_localctx, 70, RULE_dropoutparamparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__31);
			setState(300);
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

	public static class ReshapeparamparamsContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
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
		enterRule(_localctx, 72, RULE_reshapeparamparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__32);
			setState(303);
			match(T__5);
			setState(304);
			dims();
			setState(305);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\6\2W\n\2\r\2\16\2X\3\3\3\3\6\3]\n\3\r\3\16\3^\3\4\3\4\3\4\6\4d"+
		"\n\4\r\4\16\4e\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\6\tv\n\t\r\t\16\tw\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0096"+
		"\n\n\r\n\16\n\u0097\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00a0\n\n\r\n\16\n\u00a1"+
		"\3\n\3\n\3\n\3\n\3\n\6\n\u00a9\n\n\r\n\16\n\u00aa\3\n\3\n\5\n\u00af\n"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\6\17\u00bc\n\17"+
		"\r\17\16\17\u00bd\3\17\3\17\3\20\3\20\3\20\6\20\u00c5\n\20\r\20\16\20"+
		"\u00c6\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\6\24\u00d8\n\24\r\24\16\24\u00d9\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00f2\n\30\3\31\3\31\3\31\6\31\u00f7\n"+
		"\31\r\31\16\31\u00f8\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u010f\n\34\r\34"+
		"\16\34\u0110\3\34\3\34\5\34\u0115\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0128\n\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u0132\2L\3\2\2\2\4\\\3\2\2\2\6`\3\2"+
		"\2\2\bi\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2\22\u00ae"+
		"\3\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3"+
		"\2\2\2\34\u00b8\3\2\2\2\36\u00c1\3\2\2\2 \u00ce\3\2\2\2\"\u00d0\3\2\2"+
		"\2$\u00d2\3\2\2\2&\u00d4\3\2\2\2(\u00e1\3\2\2\2*\u00e3\3\2\2\2,\u00e5"+
		"\3\2\2\2.\u00f1\3\2\2\2\60\u00f3\3\2\2\2\62\u00fc\3\2\2\2\64\u00ff\3\2"+
		"\2\2\66\u0114\3\2\2\28\u0116\3\2\2\2:\u0118\3\2\2\2<\u011a\3\2\2\2>\u011c"+
		"\3\2\2\2@\u011e\3\2\2\2B\u0127\3\2\2\2D\u0129\3\2\2\2F\u012b\3\2\2\2H"+
		"\u012d\3\2\2\2J\u0130\3\2\2\2LM\7\3\2\2MN\7\4\2\2NO\5\f\7\2OP\7\4\2\2"+
		"PQ\7\5\2\2QR\7\4\2\2RS\5\16\b\2ST\7\4\2\2TV\5\6\4\2UW\5\20\t\2VU\3\2\2"+
		"\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\3\3\2\2\2Z[\7\6\2\2[]\7%\2\2\\Z\3\2"+
		"\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\5\3\2\2\2`a\7\7\2\2ac\7\b\2\2bd\5"+
		"\b\5\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\t\2\2h\7"+
		"\3\2\2\2ij\7\6\2\2jk\5\n\6\2k\t\3\2\2\2lm\7%\2\2m\13\3\2\2\2no\7$\2\2"+
		"o\r\3\2\2\2pq\7$\2\2q\17\3\2\2\2rs\7\n\2\2su\7\b\2\2tv\5\22\n\2ut\3\2"+
		"\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\t\2\2z\21\3\2\2\2{|\7"+
		"\3\2\2|}\7\4\2\2}~\5\24\13\2~\177\7\4\2\2\177\u00af\3\2\2\2\u0080\u0081"+
		"\7\13\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\4\2\2"+
		"\u0084\u00af\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\7\4\2\2\u0087\u0088"+
		"\5\30\r\2\u0088\u0089\7\4\2\2\u0089\u00af\3\2\2\2\u008a\u008b\7\r\2\2"+
		"\u008b\u008c\7\4\2\2\u008c\u008d\5\32\16\2\u008d\u008e\7\4\2\2\u008e\u00af"+
		"\3\2\2\2\u008f\u00af\5\36\20\2\u0090\u00af\5\34\17\2\u0091\u00af\5&\24"+
		"\2\u0092\u0093\7\16\2\2\u0093\u0095\7\b\2\2\u0094\u0096\5.\30\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u00af\3\2\2\2\u009b"+
		"\u00af\5\60\31\2\u009c\u009d\7\17\2\2\u009d\u009f\7\b\2\2\u009e\u00a0"+
		"\5H%\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00af\3\2"+
		"\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a8\7\b\2\2\u00a7\u00a9\5J&\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"{\3\2\2\2\u00ae\u0080\3\2\2\2\u00ae\u0085\3\2\2\2\u00ae\u008a\3\2\2\2"+
		"\u00ae\u008f\3\2\2\2\u00ae\u0090\3\2\2\2\u00ae\u0091\3\2\2\2\u00ae\u0092"+
		"\3\2\2\2\u00ae\u009b\3\2\2\2\u00ae\u009c\3\2\2\2\u00ae\u00a5\3\2\2\2\u00af"+
		"\23\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3"+
		"\27\3\2\2\2\u00b4\u00b5\7$\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00bb\7\b\2\2\u00ba\u00bc\5\66"+
		"\34\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\t\2\2\u00c0\35\3\2\2"+
		"\2\u00c1\u00c2\7\22\2\2\u00c2\u00c4\7\b\2\2\u00c3\u00c5\5 \21\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9\37\3\2\2\2\u00ca\u00cb"+
		"\7\23\2\2\u00cb\u00cf\5\"\22\2\u00cc\u00cd\7\24\2\2\u00cd\u00cf\5$\23"+
		"\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d1"+
		"\7%\2\2\u00d1#\3\2\2\2\u00d2\u00d3\7%\2\2\u00d3%\3\2\2\2\u00d4\u00d5\7"+
		"\25\2\2\u00d5\u00d7\7\b\2\2\u00d6\u00d8\5(\25\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\7\t\2\2\u00dc\'\3\2\2\2\u00dd\u00de\7\26\2\2\u00de\u00e2"+
		"\5*\26\2\u00df\u00e0\7\27\2\2\u00e0\u00e2\5,\27\2\u00e1\u00dd\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\u00e2)\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4+\3\2\2\2"+
		"\u00e5\u00e6\7%\2\2\u00e6-\3\2\2\2\u00e7\u00e8\7\30\2\2\u00e8\u00f2\7"+
		"$\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00f2\7%\2\2\u00eb\u00ec\7\32\2\2\u00ec"+
		"\u00f2\7%\2\2\u00ed\u00ee\7\33\2\2\u00ee\u00f2\7%\2\2\u00ef\u00f0\7\34"+
		"\2\2\u00f0\u00f2\7$\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2/\3\2\2\2"+
		"\u00f3\u00f4\7\35\2\2\u00f4\u00f6\7\b\2\2\u00f5\u00f7\5\62\32\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\t\2\2\u00fb\61\3\2\2\2\u00fc\u00fd"+
		"\7\36\2\2\u00fd\u00fe\5\64\33\2\u00fe\63\3\2\2\2\u00ff\u0100\7$\2\2\u0100"+
		"\65\3\2\2\2\u0101\u0102\7\36\2\2\u0102\u0115\58\35\2\u0103\u0104\7\37"+
		"\2\2\u0104\u0115\5:\36\2\u0105\u0106\7\33\2\2\u0106\u0115\5<\37\2\u0107"+
		"\u0108\7\31\2\2\u0108\u0115\5> \2\u0109\u010a\7\32\2\2\u010a\u0115\5@"+
		"!\2\u010b\u010c\7 \2\2\u010c\u010e\7\b\2\2\u010d\u010f\5B\"\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\7\t\2\2\u0113\u0115\3\2\2\2\u0114\u0101\3\2"+
		"\2\2\u0114\u0103\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u0107\3\2\2\2\u0114"+
		"\u0109\3\2\2\2\u0114\u010b\3\2\2\2\u0115\67\3\2\2\2\u0116\u0117\7$\2\2"+
		"\u01179\3\2\2\2\u0118\u0119\7%\2\2\u0119;\3\2\2\2\u011a\u011b\7%\2\2\u011b"+
		"=\3\2\2\2\u011c\u011d\7%\2\2\u011d?\3\2\2\2\u011e\u011f\7%\2\2\u011fA"+
		"\3\2\2\2\u0120\u0121\7\13\2\2\u0121\u0122\7\4\2\2\u0122\u0123\5D#\2\u0123"+
		"\u0124\7\4\2\2\u0124\u0128\3\2\2\2\u0125\u0126\7!\2\2\u0126\u0128\5F$"+
		"\2\u0127\u0120\3\2\2\2\u0127\u0125\3\2\2\2\u0128C\3\2\2\2\u0129\u012a"+
		"\7$\2\2\u012aE\3\2\2\2\u012b\u012c\7%\2\2\u012cG\3\2\2\2\u012d\u012e\7"+
		"\"\2\2\u012e\u012f\7%\2\2\u012fI\3\2\2\2\u0130\u0131\7#\2\2\u0131\u0132"+
		"\7\b\2\2\u0132\u0133\5\4\3\2\u0133\u0134\7\t\2\2\u0134K\3\2\2\2\24X^e"+
		"w\u0097\u00a1\u00aa\u00ae\u00bd\u00c6\u00ce\u00d9\u00e1\u00f1\u00f8\u0110"+
		"\u0114\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}