import unittest

from TimeToWordsFormatter import TimeToWordsFormatter


class MyTestCase(unittest.TestCase):
    def test_time_to_words_values(self):
        formatter = TimeToWordsFormatter()
        self.assertEqual(formatter.time_in_words(3, 4), 'four minutes past three')
        self.assertEqual(formatter.time_in_words(6, 30), 'half past six')
        self.assertEqual(formatter.time_in_words(2, 15), 'quarter past two')
        self.assertEqual(formatter.time_in_words(1, 45), 'quarter to two')
        self.assertEqual(formatter.time_in_words(1, 1), 'one minute past one')
        self.assertEqual(formatter.time_in_words(5, 59), 'one minute to six')


if __name__ == '__main__':
    unittest.main()
