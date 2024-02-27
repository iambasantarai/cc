from sklearn import datasets
from keras.models import Sequential
from keras.layers import Dense
from sklearn import metrics
import numpy as np

cancer = datasets.load_breast_cancer()
x = cancer.data
y = cancer.target

split = int(len(x) * 0.7)
trainx, testx = x[:split], x[split:]
trainy, testy = y[:split], y[split:]

print("Number of features: ", len(cancer.feature_names))
# print("Features: ", *cancer.feature_names)
print("Number of classes: ", len(cancer.target_names))
print("Class Labels: ", cancer.target_names)

# Define the keras model
model = Sequential()
model.add(Dense(128, input_dim=30, activation="relu"))
model.add(Dense(128, activation="relu"))
model.add(Dense(128, activation="relu"))
model.add(Dense(1, activation="sigmoid"))

# Compile and fit the model
model.compile(loss="binary_crossentropy", optimizer="adam",
metrics=["accuracy"])

history = model.fit(trainx, trainy, epochs=10, batch_size=16, verbose=1)

# Print the final training loss and accuracy
print("Final Training Loss:", history.history['loss'][-1])
print("Final Training Accuracy:", history.history['accuracy'][-1])

# Make class predictions with the model
yp = model.predict(testx)
pred = []
for x in yp:
    pred.append(np.round(x))
pred = np.array(pred)
pred = pred.ravel()
pred = pred.astype(int)

# Uncomment if you want to print actual and predicted class labels
# print("Actual Class: ", *testy)
# print("Predicted Class: ", *yp)

# Print confusion matrix and classification measures
print("\nConfusion Matrix:")
print(metrics.confusion_matrix(testy, pred))

print("\nClassification Measures:")
print("Accuracy:", metrics.accuracy_score(testy, pred))
print("Recall:", metrics.recall_score(testy, pred))
print("Precision:", metrics.precision_score(testy, pred))
print("F1-score:", metrics.f1_score(testy, pred))
