import java.io.*;
import java.util.*;

public class LayerInfo{
  String name;
  String type;
  String bottom;
  String top;
  ParamInfo paraminfo;
  ConvolutionParamInfo convolutionparaminfo;
  BatchNormParamInfo batchnormparaminfo;
  ScaleParamInfo scaleparaminfo;
  PoolingParamInfo poolingparaminfo;
  DropoutParamInfo dropoutparaminfo;
  ReshapeParamInfo reshapeparaminfo;
}
