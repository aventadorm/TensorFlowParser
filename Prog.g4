grammar Prog;

prog:	'name:' '"' progname '"' 'input:' '"' proginputname '"' inputshape layers+ ;


inputshape: 'input_shape' '{' inputshapedims+ '}';
inputshapedims: 'dim:' inputshapedimvalue ;
inputshapedimvalue: INT;
progname: ID;

proginputname: ID;

layers: 'layer' '{' layerparams+ '}';

layerparams:
            'name:' '"' layername '"'
            |'type:' '"' layertype '"'
            |'bottom:' '"' layerbottom '"'
            |'top:' '"' layertop '"'
            | param
            | convolutionparam
            | batchnormparam
            | poolingparam
            | scaleparam
            | dropoutparam
            | reshapeparam ;

layername: ID;
layertype: ID;
layerbottom: ID;
layertop: ID;
convolutionparam: 'convolution_param' '{' convolutionparamparams+ '}';
param: 'param' '{' paramparams+ '}';
paramparams:
            'lr_mult:' lrmultvalue
            |'decay_mult:' decaymultvalue ;

lrmultvalue: INT;
decaymultvalue: INT;

batchnormparam: 'batch_norm_param' '{' batchnormparamparams+ '}';
batchnormparamparams:
            'use_global_stats: ' batchnormparamuseglobalstats
            |'eps:' batchnormparameps ;
batchnormparamuseglobalstats: ID;
batchnormparameps: INT;


poolingparam: 'pooling_param' '{' poolingparamparams+ '}';

poolingparamparams:
            'pool:' poolingparampool
            |'kernel_size:' poolingkernelsize
            |'stride:' poolingparamstride
            |'pad:' poolingparampad
            |'global_pooling:' poolingparamglobalpooling;
poolingparampool: ID;
poolingkernelsize: INT;
poolingparamstride: INT;
poolingparampad: INT;
poolingparamglobalpooling: ID;

scaleparam: 'scale_param' '{' scaleparamparams+ '}';

scaleparamparams:
            'bias_term:' scaleparambiasterm ;
scaleparambiasterm: ID;
convolutionparamparams:
            'bias_term:' convolutionbiasterm
            |'num_output:' convolutionnumoutput
            |'pad:' convolutionpad
            |'kernel_size:' convolutionkernelsize
            |'stride:' convolutionstride
            |'weight_filler' '{' weightfillerparams+ '}' ;

convolutionbiasterm:
            ID;
convolutionnumoutput:
            INT;
convolutionpad:
            INT;
convolutionkernelsize:
            INT;
convolutionstride:
            INT;

weightfillerparams:
            'type:' '"' weightfillerparamstype '"'
            |'std:' weightfillerparamsstd ;

weightfillerparamstype: ID;

weightfillerparamsstd: INT;

dropoutparam: 'dropout_param' '{' dropoutparamparams+ '}';
dropoutparamparams:
            'dropout_ratio:' dropoutparamdropoutratio ;
dropoutparamdropoutratio: INT;


reshapeparam: 'reshape_param' '{' reshapeparamparams+ '}';
reshapeparamparams:
            'shape' '{' reshapedims+ '}';
reshapedims: 'dim:' reshapedimvalue ;
reshapedimvalue: INT;



ID: ([a-z] | [A-Z]) ID2 ;

INT : ([0-9] | '.')+ ;
ID2: ([a-z] | [A-Z] | [0-9] | '/' | '_')+;
WS : [ \t\r\n]+ -> skip ;
