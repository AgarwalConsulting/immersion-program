import numpy as np
from sklearn.linear_model import LinearRegression

# Generate some random data for demonstration purposes
X = np.array([[1, 2, 3, 4, 5]]).T
y = np.array([2, 4, 5, 4, 5])

# Create a Linear Regression object and fit the data
lr = LinearRegression()
lr.fit(X, y)

# Predict using the trained model
y_pred = lr.predict(X)

# Print the slope (coefficient) and y-intercept (intercept)
print("Slope: ", lr.coef_[0])
print("Y-intercept: ", lr.intercept_)

# Print the mean squared error (MSE) and R-squared value
from sklearn.metrics import mean_squared_error, r2_score
print("Mean Squared Error (MSE): ", mean_squared_error(y, y_pred))
print("R-squared value: ", r2_score(y, y_pred))

# In this code, we first generate some random data and then create a `LinearRegression` object. We then fit the data to the model using the `fit()` method. We can then use the model to make predictions using the `predict()` method. Finally, we print out the slope (coefficient) and y-intercept (intercept) of the linear regression line, as well as the mean squared error (MSE) and R-squared value, which are commonly used metrics for evaluating the performance of a linear regression model.
