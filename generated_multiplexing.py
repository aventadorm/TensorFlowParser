from __future__ import absolute_import
from __future__ import division
from __future__ import print_function

import tensorflow as tf

slim = tf.contrib.slim


def InceptionV1(inputs, num_classes=1000, is_training=True, reuse=None, scope='InceptionV1', config=None):

selectdepth = lambda k,v: int(config[k]['ratio']*v) if config and k in config and 'ratio' in config[k] else v

selectinput = lambda k, v: config[k]['input'] if config and k in config and 'input' in config[k] else v

with tf.variable_scope(scope, "Model", reuse=reuse):
with slim.arg_scope(default_arg_scope(is_training)):
end_points = {}

InceptionV1.default_image_size = 224

##############################################################################
########## below are template code hard-coded in compiler ####################
##############################################################################
# The code is applicable to any model. It is adapted from
# https://github.com/tensorflow/models/blob/master/research/slim/nets/inception_utils.py
def default_arg_scope(is_training=True,
                        weight_decay=0.00004,
                        use_batch_norm=True,
                        batch_norm_decay=0.9997,
                        batch_norm_epsilon=0.001,
                        batch_norm_updates_collections=tf.GraphKeys.UPDATE_OPS):

  batch_norm_params = {
      # Decay for the moving averages.
      'decay': batch_norm_decay,
      # epsilon to prevent 0s in variance.
      'epsilon': batch_norm_epsilon,
      # collection containing update_ops.
      'updates_collections': batch_norm_updates_collections,
      # use fused batch norm if possible.
      'fused': None,
  }
  if use_batch_norm:
    normalizer_fn = slim.batch_norm
    normalizer_params = batch_norm_params
  else:
    normalizer_fn = None
    normalizer_params = {}

  # Set training state
  with slim.arg_scope([slim.batch_norm, slim.dropout],
                        is_training=is_training):
    # Set weight_decay for weights in Conv and FC layers.
    with slim.arg_scope([slim.conv2d, slim.fully_connected],
                        weights_regularizer=slim.l2_regularizer(weight_decay)):
      # Set batch norm
      with slim.arg_scope(
          [slim.conv2d],
          normalizer_fn=normalizer_fn,
          normalizer_params=normalizer_params):
          # Set default padding and stride
            with slim.arg_scope([slim.conv2d, slim.max_pool2d],
                      stride=1, padding='SAME') as sc:
              return sc
