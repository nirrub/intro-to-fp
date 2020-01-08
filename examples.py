# Higher Order Function:
# We have a function that receives another function
# as one of its arguments. Functions are first class citizens!!!

def add(a, b):
    return a + b

def work_on_two_numbers(f, a, b):
    return f(a, b)

work_on_two_numbers(add, 1, 2)






















# Mutability:
# Stuff changes all the time!!!

a = {'a': 1, 'b': 2}
a['c'] = 3
print a






















# Statement:

def change_state(state):
    state['a'] = 10
























# Referential Transparency:

def return_based_on_param(p):
    return p > 10

rt = 0

def return_based_on_state():
    return return_based_on_param(rt)


