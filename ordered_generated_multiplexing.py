from __future__ import absolute_import
from __future__ import division
from __future__ import print_function

import tensorflow as tf

slim = tf.contrib.slim


def InceptionV1(inputs, num_classes=1000, is_training=True, reuse=None, scope='InceptionV1'):

with tf.variable_scope(scope, "Model", reuse=reuse):
with slim.arg_scope(default_arg_scope(is_training)):
end_points = {}

endpoint = 'Conv2d_1a_7x7'
net = slim.conv2d(inputs, 64, [7,7], stride=2 scope=end_point)
end_points[end_point] = net

endpoint = 'MaxPool_2a_3x3'
net = slim.max_pool2d(net, [3,3], stride=2 scope=end_point)
end_points[end_point] = net

endpoint = 'Conv2d_2b_1x1'
net = slim.conv2d(net, 64, [1,1], stride=1 scope=end_point)
end_points[end_point] = net

endpoint = 'Conv2d_2c_3x3'
net = slim.conv2d(net, 192, [3,3], stride=1 scope=end_point)
end_points[end_point] = net

endpoint = 'MaxPool_3a_3x3'
net = slim.max_pool2d(net, [3,3], stride=2 scope=end_point)
end_points[end_point] = net

endpoint = 'Mixed_3b'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 64, [1, 1], scope='Mixed_3b/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,96, [1, 1], scope='Mixed_3b/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 128, [3, 3], scope='Mixed_3b/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,16, [1, 1], scope='Mixed_3b/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 32, [3, 3], scope='Mixed_3b/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_3b/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 32, [1, 1], scope='Mixed_3b/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'Mixed_3c'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 128, [1, 1], scope='Mixed_3c/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,128, [1, 1], scope='Mixed_3c/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 192, [3, 3], scope='Mixed_3c/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,32, [1, 1], scope='Mixed_3c/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 96, [3, 3], scope='Mixed_3c/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_3c/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 64, [1, 1], scope='Mixed_3c/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'MaxPool_4a_3x3'
net = slim.max_pool2d(net, [3,3], stride=2 scope=end_point)
end_points[end_point] = net

endpoint = 'Mixed_4b'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 192, [1, 1], scope='Mixed_4b/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,96, [1, 1], scope='Mixed_4b/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 208, [3, 3], scope='Mixed_4b/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,16, [1, 1], scope='Mixed_4b/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 48, [3, 3], scope='Mixed_4b/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_4b/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 64, [1, 1], scope='Mixed_4b/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'Mixed_4c'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 160, [1, 1], scope='Mixed_4c/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,112, [1, 1], scope='Mixed_4c/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 224, [3, 3], scope='Mixed_4c/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,24, [1, 1], scope='Mixed_4c/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 64, [3, 3], scope='Mixed_4c/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_4c/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 64, [1, 1], scope='Mixed_4c/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'Mixed_4d'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 128, [1, 1], scope='Mixed_4d/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,128, [1, 1], scope='Mixed_4d/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 256, [3, 3], scope='Mixed_4d/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,24, [1, 1], scope='Mixed_4d/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 64, [3, 3], scope='Mixed_4d/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_4d/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 64, [1, 1], scope='Mixed_4d/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'Mixed_4e'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 112, [1, 1], scope='Mixed_4e/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,144, [1, 1], scope='Mixed_4e/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 288, [3, 3], scope='Mixed_4e/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,32, [1, 1], scope='Mixed_4e/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 64, [3, 3], scope='Mixed_4e/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_4e/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 64, [1, 1], scope='Mixed_4e/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'Mixed_4f'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 256, [1, 1], scope='Mixed_4f/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,160, [1, 1], scope='Mixed_4f/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 320, [3, 3], scope='Mixed_4f/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,32, [1, 1], scope='Mixed_4f/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 128, [3, 3], scope='Mixed_4f/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_4f/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 128, [1, 1], scope='Mixed_4f/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'MaxPool_5a_2x2'
net = slim.max_pool2d(net, [3,3], stride=2 scope=end_point)
end_points[end_point] = net

endpoint = 'Mixed_5b'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 256, [1, 1], scope='Mixed_5b/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,160, [1, 1], scope='Mixed_5b/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 320, [3, 3], scope='Mixed_5b/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,32, [1, 1], scope='Mixed_5b/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 128, [3, 3], scope='Mixed_5b/Branch_2/Conv2d_0a_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_5b/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 128, [1, 1], scope='Mixed_5b/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'Mixed_5c'
net = selectinput(end_point, net)with tf.variable_scope(end_point):
with tf.variable_scope('Branch_0'):
branch_0 = slim.conv2d(net, 384, [1, 1], scope='Mixed_5c/Branch_0/Conv2d_0a_1x1')
with tf.variable_scope('Branch_1'):
branch_1 = slim.conv2d(net, selectdepth(end_point,192, [1, 1], scope='Mixed_5c/Branch_1/Conv2d_0a_1x1')
branch_1 = slim.conv2d(branch_1, 384, [3, 3], scope='Mixed_5c/Branch_1/Conv2d_0b_3x3')
with tf.variable_scope('Branch_2'):
branch_2 = slim.conv2d(net, selectdepth(end_point,48, [1, 1], scope='Mixed_5c/Branch_2/Conv2d_0a_1x1')
branch_2 = slim.conv2d(branch_2, 128, [3, 3], scope='Mixed_5c/Branch_2/Conv2d_0b_3x3')
with tf.variable_scope('Branch_3'):
branch_3 = slim.max_pool2d(net,  [3, 3], scope='Mixed_5c/Branch_3/MaxPool_0a_3x3')
branch_3 = slim.conv2d(branch_3, 128, [1, 1], scope='Mixed_5c/Branch_3/Conv2d_0b_1x1')
net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])
end_points[end_point] = net


endpoint = 'AvgPool_0a_7x7'
net = slim.max_pool2d(net, [null,null], stride=null scope=end_point)
end_points[end_point] = net

endpoint = 'Logits'
with tf.variable_scope(end_point):
net = slim.dropout(net, 0.8, scope='Logits/Dropout_0b')
logits = slim.conv2d(net, num_classes, [1, 1], activation_fn=None, normalizer_fn=None, scope='Conv2d_0c_1x1')

logits = tf.squeeze(logits, [1, 2], name='SpatialSqueeze')
end_points[end_point] = logits

end_points['Predictions'] = slim.softmax(logits, scope='Predictions')
return logits, end_points

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
