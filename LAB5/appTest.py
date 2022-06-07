import pytest
from app import App

sumParams = [(3,8,11), (5,5,10), (9,9,18)]
sumParams2 = [(4,9,20), (6,1,3), (8,3,66)]

productParams = [(5,5,25),(8,2,16),(9,3,27)]
productParams2 = [(4,2,7),(6,3,10),(8,4,11)]

powerParams = [(2,2,4),(5,2,25),(1,3,1)]
powerParams2 = [(3,5,20),(7,2,46),(4,4,100)]

@classmethod
def setup_class(cls):
        print('\n-adding tests start')

@classmethod
def teardown_class(cls):
        print('\n-adding tests end')

class TestSum:

    @pytest.mark.parametrize("a, b, c",sumParams)
    def test_addingTestEqual(a, b, c):
        assert sum(a, b) == c
        
    @pytest.mark.parametrize("a, b, c",sumParams2)
    def test_addingTestNotEqual(a, b, c):
        assert sum(a, b) != c

@classmethod
def setup_class(cls):
        print('\n-multiplying tests start')

@classmethod
def teardown_class(cls):
        print('\n-multiplying tests end')

class TestProduct:
    
    @pytest.mark.parametrize("a, b, c",productParams)
    def test_multiplyingTestEqual(a, b, c):
        assert product(a, b) == c

    @pytest.mark.parametrize("a, b, c",productParams2)    
    def test_multiplyingTestNotEqual(a, b, c):
        assert product(a, b) != c

@classmethod
def setup_class(cls):
        print('\n-powering tests start')

@classmethod
def teardown_class(cls):
        print('\n-powering tests end')

class TestPower:
    
    @pytest.mark.parametrize("a, b, c",powerParams)
    def test_multiplyingTestEqual(a, b, c):
        assert product(a, b) == c
        
    @pytest.mark.parametrize("a, b, c",powerParams2)
    def test_multiplyingTestNotEqual(a, b, c):
        assert product(a, b) != c            