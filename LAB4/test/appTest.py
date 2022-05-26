import unittest
from src.app import App

class AppTest(unittest.TestCase):
    def setUp(self):
        self.app = App()

    def test_sum_correctInput_correctResult(self):
        self.assertEqual(4, self.app.add(2, 2))

    def test_sum_correctInput_correctResult_float(self):
        self.assertEqual(13, self.app.add(2.5, 10.5))

    def test_add_subtraction_correctInput_correctResult(self):
        self.assertEqual(3, self.app.add(-3, 6))

    def test_subtraction_correctInput_correctResult2(self):
        self.assertEqual(32, self.app.subtract(36, 4))

    def test_multiplication_correctInput_correctResult(self):
        self.assertEqual(15, self.app.multiply(3, 5))

    def test_multiplication_correctInput_correctResult_float(self):
        self.assertEqual(5, self.app.multiply(2.5, 2))

    def test_divide_correctInput_correctResult(self):
        self.assertEqual(50, self.app.divide(100, 2))

    def test_divide_string(self):
        self.assertRaises(TypeError, self.app.divide, "eight", 8)

if __name__ == '__main__':
    unittest.main()