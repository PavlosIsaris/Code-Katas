import unittest

from SuperStringReducer import SuperStringReducer


class MyTestCase(unittest.TestCase):
    def test_time_to_words_values(self):
        reducer = SuperStringReducer()
        self.assertEqual(reducer.get_super_reduced_string('aaabccddd'), 'abd')
        self.assertEqual(reducer.get_super_reduced_string('aa'), '')
        self.assertEqual(reducer.get_super_reduced_string('baab'), '')
        self.assertEqual(reducer.get_super_reduced_string(
            'zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh'),
            'tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh')
        self.assertEqual(reducer.get_super_reduced_string(
            'ppffccmmssnnhhbbmmggxxaaooeeqqeennffzzaaeeyyaaggggeessvvssggbbccnnrrjjxxuuzzbbjjrruuaaccaaoommkkkkxx'), '')
        self.assertEqual(reducer.get_super_reduced_string(
            'ggppppuurrjjooddwwyyllmmvvffddmmppxxaabbddddooppxxgghhhhvvnneeqqyyttbbffvvjjiiaammmmddddhhyywwqqiijj'), '')


if __name__ == '__main__':
    unittest.main()
