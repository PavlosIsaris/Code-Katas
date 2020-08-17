class TimeToWordsFormatter:

    def time_in_words(self, h, m):
        words = {1: "one", 2: "two", 3: "three", 4: "four", 5: "five",
                 6: "six", 7: "seven", 8: "eight", 9: "nine", 10: "ten",
                 11: "eleven", 12: "twelve", 13: "thirteen", 14: "fourteen",
                 15: "fifteen", 16: "sixteen", 17: "seventeen", 18: "eighteen",
                 19: "nineteen", 20: "twenty", 21: "twenty one", 22: "twenty two",
                 23: "twenty three", 24: "twenty four", 25: "twenty five",
                 26: "twenty six", 27: "twenty seven", 28: "twenty eight",
                 29: "twenty nine"}

        if m == 0:
            return str(words[h]) + ' o\' clock'
        if m <= 30:
            hour_word = str(words[h])
            if m == 30:
                minutes_str = 'half'
            elif m == 15:
                minutes_str = 'quarter'
            else:
                minutes_str = str(words[m]) + ' ' + self.minute_str(m)
            return minutes_str + ' past ' + hour_word
        else:
            hour_word = str(words[h + 1])
            if m == 45:
                return 'quarter to ' + hour_word
            m = abs(60 - m)
            return str(words[m]) + ' ' + self.minute_str(m) + ' to ' + hour_word


    def minute_str(self, m):
        return 'minute' if m == 1 else 'minutes'
