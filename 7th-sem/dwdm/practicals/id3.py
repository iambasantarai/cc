import pandas as pd
from sklearn import metrics
from sklearn.tree import DecisionTreeClassifier
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split

# Load the Iris dataset
iris = load_iris()
data = pd.DataFrame(data=iris.data, columns=iris.feature_names)
data['Species'] = iris.target_names[iris.target]

# Split the dataset into training and testing sets
split = int(len(data) * 0.7)
train, test = data.iloc[:split], data.iloc[split:]

# Features and target variable for training
X_train = train[iris.feature_names]
y_train = train['Species']

# Features and target variable for testing
X_test = test[iris.feature_names]
y_test = test['Species']

# Initialize the DecisionTreeClassifier
model = DecisionTreeClassifier(criterion="entropy", max_depth=4)

# Train the decision tree on the training data
model.fit(X_train, y_train)

# Make predictions on the test data
predicted = model.predict(X_test)

# Print confusion matrix and classification measures
print("Confusion Matrix:")
print(metrics.confusion_matrix(y_test, predicted))
print("\nClassification Measures:")
print("Accuracy:", metrics.accuracy_score(y_test, predicted))
print("Recall (Macro):", metrics.recall_score(y_test, predicted, average='macro', zero_division=1))
print("Precision (Macro):", metrics.precision_score(y_test, predicted, average='macro'))
print("F1-score (Macro):", metrics.f1_score(y_test, predicted, average='macro'))
