# _*_ coding: utf-8 _*_
#!/usr/bin/env python3

"""
author: GodSuperK
version: 1.0, 2.0 
date: 2018-07-13 
"""

def v_2(name):
    """version 2.0"""
    print("Hello, {}, nice to meet you!".format(input("What is your name?")))

def v_1(name):
    """version 1.0"""
    output = "Hello, " + name + ", nice to meet you!"
    print(output)

def v_3(name):
    """
    langdetect: 判断字符串的语言
        detect(str)
    """
    from langdetect import detect

    import random

    greet_list = {
            'en': [
                "Hello, {}, How are you?",
                "Hello, {}, Nice to meet you!",],
            'zh-cn': [
                '你好, {}!',
                '你好, {}, 见到你很高兴!'
                ]
            }
    print(detect(name))

    if detect(name) in greet_list:
        output = random.choice(greet_list[detect(name)]).format(name)
    
    print(output)

def  main():
    pass

if __name__ == '__main__':
    import sys, re

    all_attr = sys.modules['__main__'].__dict__
    version = re.findall('v_\d', ''.join(all_attr.keys()))
    version.sort()    
    str_func = {}
    for i,v in enumerate(version, start=1):
        str_func[str(float(i))] = all_attr.get(v)
        print(float(i))

    while True:
        input_version = input("清选择版本")
        name = input("What is your name?") 
        if input_version in str_func:
            str_func[input_version](name)

        if input("exit?") in ['y', 'Y']:
            break
    



