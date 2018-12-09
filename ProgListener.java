// Generated from Prog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgParser}.
 */
public interface ProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProgParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProgParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#inputshape}.
	 * @param ctx the parse tree
	 */
	void enterInputshape(ProgParser.InputshapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#inputshape}.
	 * @param ctx the parse tree
	 */
	void exitInputshape(ProgParser.InputshapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#inputshapedims}.
	 * @param ctx the parse tree
	 */
	void enterInputshapedims(ProgParser.InputshapedimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#inputshapedims}.
	 * @param ctx the parse tree
	 */
	void exitInputshapedims(ProgParser.InputshapedimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#inputshapedimvalue}.
	 * @param ctx the parse tree
	 */
	void enterInputshapedimvalue(ProgParser.InputshapedimvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#inputshapedimvalue}.
	 * @param ctx the parse tree
	 */
	void exitInputshapedimvalue(ProgParser.InputshapedimvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#progname}.
	 * @param ctx the parse tree
	 */
	void enterProgname(ProgParser.PrognameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#progname}.
	 * @param ctx the parse tree
	 */
	void exitProgname(ProgParser.PrognameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#proginputname}.
	 * @param ctx the parse tree
	 */
	void enterProginputname(ProgParser.ProginputnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#proginputname}.
	 * @param ctx the parse tree
	 */
	void exitProginputname(ProgParser.ProginputnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#layers}.
	 * @param ctx the parse tree
	 */
	void enterLayers(ProgParser.LayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#layers}.
	 * @param ctx the parse tree
	 */
	void exitLayers(ProgParser.LayersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#layerparams}.
	 * @param ctx the parse tree
	 */
	void enterLayerparams(ProgParser.LayerparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#layerparams}.
	 * @param ctx the parse tree
	 */
	void exitLayerparams(ProgParser.LayerparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#layername}.
	 * @param ctx the parse tree
	 */
	void enterLayername(ProgParser.LayernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#layername}.
	 * @param ctx the parse tree
	 */
	void exitLayername(ProgParser.LayernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#layertype}.
	 * @param ctx the parse tree
	 */
	void enterLayertype(ProgParser.LayertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#layertype}.
	 * @param ctx the parse tree
	 */
	void exitLayertype(ProgParser.LayertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#layerbottom}.
	 * @param ctx the parse tree
	 */
	void enterLayerbottom(ProgParser.LayerbottomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#layerbottom}.
	 * @param ctx the parse tree
	 */
	void exitLayerbottom(ProgParser.LayerbottomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#layertop}.
	 * @param ctx the parse tree
	 */
	void enterLayertop(ProgParser.LayertopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#layertop}.
	 * @param ctx the parse tree
	 */
	void exitLayertop(ProgParser.LayertopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionparam}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionparam(ProgParser.ConvolutionparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionparam}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionparam(ProgParser.ConvolutionparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ProgParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ProgParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#paramparams}.
	 * @param ctx the parse tree
	 */
	void enterParamparams(ProgParser.ParamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#paramparams}.
	 * @param ctx the parse tree
	 */
	void exitParamparams(ProgParser.ParamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#lrmultvalue}.
	 * @param ctx the parse tree
	 */
	void enterLrmultvalue(ProgParser.LrmultvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#lrmultvalue}.
	 * @param ctx the parse tree
	 */
	void exitLrmultvalue(ProgParser.LrmultvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#decaymultvalue}.
	 * @param ctx the parse tree
	 */
	void enterDecaymultvalue(ProgParser.DecaymultvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#decaymultvalue}.
	 * @param ctx the parse tree
	 */
	void exitDecaymultvalue(ProgParser.DecaymultvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#batchnormparam}.
	 * @param ctx the parse tree
	 */
	void enterBatchnormparam(ProgParser.BatchnormparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#batchnormparam}.
	 * @param ctx the parse tree
	 */
	void exitBatchnormparam(ProgParser.BatchnormparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#batchnormparamparams}.
	 * @param ctx the parse tree
	 */
	void enterBatchnormparamparams(ProgParser.BatchnormparamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#batchnormparamparams}.
	 * @param ctx the parse tree
	 */
	void exitBatchnormparamparams(ProgParser.BatchnormparamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#batchnormparamuseglobalstats}.
	 * @param ctx the parse tree
	 */
	void enterBatchnormparamuseglobalstats(ProgParser.BatchnormparamuseglobalstatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#batchnormparamuseglobalstats}.
	 * @param ctx the parse tree
	 */
	void exitBatchnormparamuseglobalstats(ProgParser.BatchnormparamuseglobalstatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#batchnormparameps}.
	 * @param ctx the parse tree
	 */
	void enterBatchnormparameps(ProgParser.BatchnormparamepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#batchnormparameps}.
	 * @param ctx the parse tree
	 */
	void exitBatchnormparameps(ProgParser.BatchnormparamepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingparam}.
	 * @param ctx the parse tree
	 */
	void enterPoolingparam(ProgParser.PoolingparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingparam}.
	 * @param ctx the parse tree
	 */
	void exitPoolingparam(ProgParser.PoolingparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingparamparams}.
	 * @param ctx the parse tree
	 */
	void enterPoolingparamparams(ProgParser.PoolingparamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingparamparams}.
	 * @param ctx the parse tree
	 */
	void exitPoolingparamparams(ProgParser.PoolingparamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingparampool}.
	 * @param ctx the parse tree
	 */
	void enterPoolingparampool(ProgParser.PoolingparampoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingparampool}.
	 * @param ctx the parse tree
	 */
	void exitPoolingparampool(ProgParser.PoolingparampoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingkernelsize}.
	 * @param ctx the parse tree
	 */
	void enterPoolingkernelsize(ProgParser.PoolingkernelsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingkernelsize}.
	 * @param ctx the parse tree
	 */
	void exitPoolingkernelsize(ProgParser.PoolingkernelsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingparamstride}.
	 * @param ctx the parse tree
	 */
	void enterPoolingparamstride(ProgParser.PoolingparamstrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingparamstride}.
	 * @param ctx the parse tree
	 */
	void exitPoolingparamstride(ProgParser.PoolingparamstrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingparampad}.
	 * @param ctx the parse tree
	 */
	void enterPoolingparampad(ProgParser.PoolingparampadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingparampad}.
	 * @param ctx the parse tree
	 */
	void exitPoolingparampad(ProgParser.PoolingparampadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#poolingparamglobalpooling}.
	 * @param ctx the parse tree
	 */
	void enterPoolingparamglobalpooling(ProgParser.PoolingparamglobalpoolingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#poolingparamglobalpooling}.
	 * @param ctx the parse tree
	 */
	void exitPoolingparamglobalpooling(ProgParser.PoolingparamglobalpoolingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#scaleparam}.
	 * @param ctx the parse tree
	 */
	void enterScaleparam(ProgParser.ScaleparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#scaleparam}.
	 * @param ctx the parse tree
	 */
	void exitScaleparam(ProgParser.ScaleparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#scaleparamparams}.
	 * @param ctx the parse tree
	 */
	void enterScaleparamparams(ProgParser.ScaleparamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#scaleparamparams}.
	 * @param ctx the parse tree
	 */
	void exitScaleparamparams(ProgParser.ScaleparamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#scaleparambiasterm}.
	 * @param ctx the parse tree
	 */
	void enterScaleparambiasterm(ProgParser.ScaleparambiastermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#scaleparambiasterm}.
	 * @param ctx the parse tree
	 */
	void exitScaleparambiasterm(ProgParser.ScaleparambiastermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionparamparams}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionparamparams(ProgParser.ConvolutionparamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionparamparams}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionparamparams(ProgParser.ConvolutionparamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionbiasterm}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionbiasterm(ProgParser.ConvolutionbiastermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionbiasterm}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionbiasterm(ProgParser.ConvolutionbiastermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionnumoutput}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionnumoutput(ProgParser.ConvolutionnumoutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionnumoutput}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionnumoutput(ProgParser.ConvolutionnumoutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionpad}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionpad(ProgParser.ConvolutionpadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionpad}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionpad(ProgParser.ConvolutionpadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionkernelsize}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionkernelsize(ProgParser.ConvolutionkernelsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionkernelsize}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionkernelsize(ProgParser.ConvolutionkernelsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#convolutionstride}.
	 * @param ctx the parse tree
	 */
	void enterConvolutionstride(ProgParser.ConvolutionstrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#convolutionstride}.
	 * @param ctx the parse tree
	 */
	void exitConvolutionstride(ProgParser.ConvolutionstrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#weightfillerparams}.
	 * @param ctx the parse tree
	 */
	void enterWeightfillerparams(ProgParser.WeightfillerparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#weightfillerparams}.
	 * @param ctx the parse tree
	 */
	void exitWeightfillerparams(ProgParser.WeightfillerparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#weightfillerparamstype}.
	 * @param ctx the parse tree
	 */
	void enterWeightfillerparamstype(ProgParser.WeightfillerparamstypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#weightfillerparamstype}.
	 * @param ctx the parse tree
	 */
	void exitWeightfillerparamstype(ProgParser.WeightfillerparamstypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#weightfillerparamsstd}.
	 * @param ctx the parse tree
	 */
	void enterWeightfillerparamsstd(ProgParser.WeightfillerparamsstdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#weightfillerparamsstd}.
	 * @param ctx the parse tree
	 */
	void exitWeightfillerparamsstd(ProgParser.WeightfillerparamsstdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#dropoutparam}.
	 * @param ctx the parse tree
	 */
	void enterDropoutparam(ProgParser.DropoutparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#dropoutparam}.
	 * @param ctx the parse tree
	 */
	void exitDropoutparam(ProgParser.DropoutparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#dropoutparamparams}.
	 * @param ctx the parse tree
	 */
	void enterDropoutparamparams(ProgParser.DropoutparamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#dropoutparamparams}.
	 * @param ctx the parse tree
	 */
	void exitDropoutparamparams(ProgParser.DropoutparamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#dropoutparamdropoutratio}.
	 * @param ctx the parse tree
	 */
	void enterDropoutparamdropoutratio(ProgParser.DropoutparamdropoutratioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#dropoutparamdropoutratio}.
	 * @param ctx the parse tree
	 */
	void exitDropoutparamdropoutratio(ProgParser.DropoutparamdropoutratioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#reshapeparam}.
	 * @param ctx the parse tree
	 */
	void enterReshapeparam(ProgParser.ReshapeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#reshapeparam}.
	 * @param ctx the parse tree
	 */
	void exitReshapeparam(ProgParser.ReshapeparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#reshapeparamparams}.
	 * @param ctx the parse tree
	 */
	void enterReshapeparamparams(ProgParser.ReshapeparamparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#reshapeparamparams}.
	 * @param ctx the parse tree
	 */
	void exitReshapeparamparams(ProgParser.ReshapeparamparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#reshapedims}.
	 * @param ctx the parse tree
	 */
	void enterReshapedims(ProgParser.ReshapedimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#reshapedims}.
	 * @param ctx the parse tree
	 */
	void exitReshapedims(ProgParser.ReshapedimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgParser#reshapedimvalue}.
	 * @param ctx the parse tree
	 */
	void enterReshapedimvalue(ProgParser.ReshapedimvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#reshapedimvalue}.
	 * @param ctx the parse tree
	 */
	void exitReshapedimvalue(ProgParser.ReshapedimvalueContext ctx);
}