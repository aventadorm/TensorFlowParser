grammar Prog;

prog:	'name:' '"' progname '"' 'input:' '"' proginputname '"' inputshape layers+ ;
dims: ('dim:' INT)+ ;

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
            |'pooling_param' '{' poolingparamparams+ '}'
            | scaleparam
            |'dropout_param' '{' dropoutparamparams+ '}'
            |'reshape_param' '{' reshapeparamparams+ '}' ;

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

poolingparamparams:
            'pool:' ID
            |'kernel_size:' INT
            |'stride:' INT
            |'pad:' INT
            |'global_pooling:' ID;
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


dropoutparamparams:
            'dropout_ratio:' INT ;

reshapeparamparams:
            'shape' '{' dims '}';




ID: ([a-z] | [A-Z]) ID2 ;

INT : ([0-9] | '.')+ ;
ID2: ([a-z] | [A-Z] | [0-9] | '/' | '_')+;
WS : [ \t\r\n]+ -> skip ;
