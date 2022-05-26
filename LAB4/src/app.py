class App:
    def sum(self, a, b):
        checkVariables(a, b)
        return a + b

    def subtraction(self, a, b):
        checkVariables(a, b)
        return a - b

    def multiplication(self, a, b):
        checkVariables(a, b)
        return a * b

    def divide(self, a, b):
        checkVariables(a, b)
        return a / b

def checkVariables(a, b):
    if not isinstance(a, (int, float)) or not isinstance(b, (int, float)):
        raise TypeError("Złe dane!")