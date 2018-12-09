import java.io.*;
import java.util.*;
public class AntlrProgListener extends ProgBaseListener {
  ProgInfo proginfo;
  InputShape inputshape;
  LayerInfo layerinfo;
  ArrayList<LayerInfo> collectionOfLayers;
    @Override public void enterProg(ProgParser.ProgContext ctx){
      proginfo = new ProgInfo();
      collectionOfLayers = new ArrayList<LayerInfo>();
    }
  	@Override public void exitProg(ProgParser.ProgContext ctx) {
    }
    @Override public void enterInputshape(ProgParser.InputshapeContext ctx) {
      proginfo.inputshape = new InputShape();
      proginfo.inputshape.dims = new ArrayList<String>();
    }

	  @Override public void enterInputshapedimvalue(ProgParser.InputshapedimvalueContext ctx) {
      proginfo.inputshape.dims.add(ctx.getText());
    }

  	@Override public void enterProgname(ProgParser.PrognameContext ctx) {
      proginfo.name = ctx.getText();
    }

  	@Override public void enterProginputname(ProgParser.ProginputnameContext ctx) {
      proginfo.input = ctx.getText();
    }

  	@Override public void enterLayers(ProgParser.LayersContext ctx) {
      layerinfo = new LayerInfo();
    }

  	@Override public void exitLayers(ProgParser.LayersContext ctx) {
      System.out.println(layerinfo.reshapeparaminfo.shape.dims);
      //collectionOfLayers.add(layerinfo);
    }

  	@Override public void enterLayername(ProgParser.LayernameContext ctx) {
      layerinfo.name = ctx.getText();
    }

  	@Override public void enterLayertype(ProgParser.LayertypeContext ctx) {
      layerinfo.type = ctx.getText();
    }

  	@Override public void enterLayerbottom(ProgParser.LayerbottomContext ctx) {
      layerinfo.bottom = ctx.getText();
    }

  	@Override public void enterLayertop(ProgParser.LayertopContext ctx) {
      layerinfo.top = ctx.getText();
    }
    @Override public void enterParam(ProgParser.ParamContext ctx) {
      layerinfo.paraminfo = new ParamInfo();
    }
    @Override public void enterLrmultvalue(ProgParser.LrmultvalueContext ctx) {
      layerinfo.paraminfo.lr_mult = ctx.getText();
    }

    @Override public void enterDecaymultvalue(ProgParser.DecaymultvalueContext ctx) {
      layerinfo.paraminfo.decay_mult = ctx.getText();
    }
  	@Override public void enterConvolutionparam(ProgParser.ConvolutionparamContext ctx) {
      layerinfo.convolutionparaminfo = new ConvolutionParamInfo();
      layerinfo.convolutionparaminfo.weightfillerinfo = new WeightFillerInfo();
    }
    @Override public void enterConvolutionbiasterm(ProgParser.ConvolutionbiastermContext ctx) {
      layerinfo.convolutionparaminfo.bias_term = ctx.getText();
    }
    @Override public void enterConvolutionnumoutput(ProgParser.ConvolutionnumoutputContext ctx) {
      layerinfo.convolutionparaminfo.num_output = ctx.getText();
    }
    @Override public void enterConvolutionpad(ProgParser.ConvolutionpadContext ctx) {
      layerinfo.convolutionparaminfo.pad = ctx.getText();
    }
    @Override public void enterConvolutionkernelsize(ProgParser.ConvolutionkernelsizeContext ctx) {
      layerinfo.convolutionparaminfo.kernel_size = ctx.getText();
    }
    @Override public void enterConvolutionstride(ProgParser.ConvolutionstrideContext ctx) {
      layerinfo.convolutionparaminfo.stride = ctx.getText();
    }

    @Override public void enterWeightfillerparamstype(ProgParser.WeightfillerparamstypeContext ctx) {
      layerinfo.convolutionparaminfo.weightfillerinfo.type = ctx.getText();
    }
    @Override public void enterWeightfillerparamsstd(ProgParser.WeightfillerparamsstdContext ctx) {
      layerinfo.convolutionparaminfo.weightfillerinfo.std = ctx.getText();
    }
    @Override public void enterBatchnormparam(ProgParser.BatchnormparamContext ctx) {
      layerinfo.batchnormparaminfo = new BatchNormParamInfo();
    }
    @Override public void enterBatchnormparamuseglobalstats(ProgParser.BatchnormparamuseglobalstatsContext ctx) {
      layerinfo.batchnormparaminfo.use_global_stats = ctx.getText();
    }
    @Override public void enterBatchnormparameps(ProgParser.BatchnormparamepsContext ctx) {
      layerinfo.batchnormparaminfo.eps = ctx.getText();
    }
    @Override public void enterScaleparam(ProgParser.ScaleparamContext ctx) {
      layerinfo.scaleparaminfo = new ScaleParamInfo();
    }
    @Override public void enterScaleparambiasterm(ProgParser.ScaleparambiastermContext ctx) {
      layerinfo.scaleparaminfo.bias_term = ctx.getText();
    }
    @Override public void enterPoolingparam(ProgParser.PoolingparamContext ctx) {
      layerinfo.poolingparaminfo = new PoolingParamInfo();
    }
    @Override public void enterPoolingparampool(ProgParser.PoolingparampoolContext ctx) {
      layerinfo.poolingparaminfo.pool = ctx.getText();
    }
    @Override public void enterPoolingkernelsize(ProgParser.PoolingkernelsizeContext ctx) {
      layerinfo.poolingparaminfo.kernel_size = ctx.getText();
    }
    @Override public void enterPoolingparamstride(ProgParser.PoolingparamstrideContext ctx) {
      layerinfo.poolingparaminfo.stride = ctx.getText();
    }
    @Override public void enterPoolingparampad(ProgParser.PoolingparampadContext ctx) {
      layerinfo.poolingparaminfo.pad = ctx.getText();
    }
    @Override public void enterPoolingparamglobalpooling(ProgParser.PoolingparamglobalpoolingContext ctx) {
      layerinfo.poolingparaminfo.global_pooling = ctx.getText();
    }
    @Override public void enterDropoutparam(ProgParser.DropoutparamContext ctx) {
      layerinfo.dropoutparaminfo = new DropoutParamInfo();
    }
    @Override public void enterDropoutparamdropoutratio(ProgParser.DropoutparamdropoutratioContext ctx) {
      layerinfo.dropoutparaminfo.dropout_ratio = ctx.getText();
    }
    @Override public void enterReshapeparam(ProgParser.ReshapeparamContext ctx) {
      layerinfo.reshapeparaminfo = new ReshapeParamInfo();
      layerinfo.reshapeparaminfo.shape = new Shape();
      layerinfo.reshapeparaminfo.shape.dims = new ArrayList<String>();
    }
    @Override public void enterReshapedimvalue(ProgParser.ReshapedimvalueContext ctx) {
      layerinfo.reshapeparaminfo.shape.dims.add(ctx.getText());
    }





}
