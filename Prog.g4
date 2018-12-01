grammar Prog;

prog:	'name:' '"' ID '"' 'input:' '"' ID '"' 'input_shape' '{' dims '}' layers+ ;
dims: ('dim:' INT)+ ;


layers: 'layer' '{' layerparams+ '}';

layerparams:
            'name:' '"' ID '"'
            |'type:' '"' ID '"'
            |'bottom:' '"' ID '"'
            |'top:' '"' ID '"'
            |'name:' '"' ID '"'
            |'param' '{' paramparams+ '}'
            |'convolution_param' '{' convolutionparamparams+ '}'
            |'batch_norm_param' '{' batchnormparamparams+ '}'
            |'pooling_param' '{' poolingparamparams+ '}'
            |'scale_param' '{' scaleparamparams+ '}'
            |'dropout_param' '{' dropoutparamparams+ '}'
            |'reshape_param' '{' reshapeparamparams+ '}' ;

paramparams:
            'lr_mult:' INT
            |'decay_mult:' INT ;

batchnormparamparams:
            'use_global_stats: ' ID
            |'eps:' INT ;

poolingparamparams:
            'pool:' ID
            |'kernel_size:' INT
            |'stride:' INT
            |'pad:' INT
            |'global_pooling:' ID;

scaleparamparams:
            'bias_term:' ID ;

convolutionparamparams:
            'bias_term:' ID
            |'num_output:' INT
            |'pad:' INT
            |'kernel_size:' INT
            |'stride:' INT
            |'weight_filler' '{' weightfillerparams+ '}' ;

weightfillerparams:
            'type:' '"' ID '"'
            |'std:' INT ;

dropoutparamparams:
            'dropout_ratio:' INT ;

reshapeparamparams:
            'shape' '{' dims '}';




ID: ([a-z] | [A-Z]) ID2 ;

INT : ([0-9] | '.')+ ;
ID2: ([a-z] | [A-Z] | [0-9] | '/' | '_')+;
WS : [ \t\r\n]+ -> skip ;
