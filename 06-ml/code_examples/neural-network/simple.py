import tensorflow as tf
import numpy as np

# Set up the training data
x_train = np.array([[0, 0], [0, 1], [1, 0], [1, 1]])
y_train = np.array([[0], [1], [1], [0]])

# Define the model architecture
model = tf.keras.Sequential([
  tf.keras.layers.Dense(4, input_shape=(2,), activation='sigmoid'),
  tf.keras.layers.Dense(1, activation='sigmoid')
])

# Compile the model
model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

# Train the model
model.fit(x_train, y_train, epochs=5000, verbose=0)

# Test the model
x_test = np.array([[0, 0], [0, 1], [1, 0], [1, 1]])
y_test = np.array([[0], [1], [1], [0]])
results = model.evaluate(x_test, y_test, verbose=0)
print('Test loss:', results[0])
print('Test accuracy:', results[1])
