grammar Prog;

prog:	'name:' '"InceptionV1"' 'input:' '"inputs"' 'input_shape' '{' dims '}' layers ;
dims: ('dim:' INT)+ ;


layers: 'layer' '{' layerparams+ '}';

layerparams:
            'name:' '"' ID '"'
            |'type:' '"' ID '"'
            |'bottom:' '"' ID '"'
            |'top:' '"' ID '"'
            |'name:' '"' ID '"'
            |'param' '{' paramparams '}'
            |'convolution_param' '{' convolutionparamparams+ '}'
            |'batch_norm_param' '{' batchnormparamparams+ '}'
            |'pooling_param' '{' poolingparamparams+ '}'
            |'scale_param' '{' scaleparamparams+ '}' ;

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
            |'pad:' INT  ;

scaleparamparams:
            'bias_term:' ID ;

convolutionparamparams:
            'bias_term:' ID
            |'num_output:' INT
            |'pad:' INT
            |'kernel_size:' INT
            |'stride:' INT
            |'weight_filler{' weightfillerparams '}' ;

weightfillerparams:
            'type:' '"' ID '"'
            |'std:' INT ;




ID: ([a-z] | [A-Z] | '_')+ ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
