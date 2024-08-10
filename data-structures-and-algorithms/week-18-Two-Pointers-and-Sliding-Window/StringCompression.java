class Solution {
    public int compress(char[] chars) {
        int streakStart = 0;
        int idxAnswer = 0;

        while (streakStart < chars.length) {
            // Current streak starts with chars[streakStart]
            char streakChar = chars[streakStart];

            // Count how many consecutive streakChar-s there are in the current streak
            // streakStart and streakEnd will be a two pointers
            int streakEnd = streakStart;
            int count = 1;
            while (streakEnd + 1 < chars.length && chars[streakEnd + 1] == streakChar) {
                streakEnd++;
                count++;
            }

            // if count == 1, then there shouldn't be any number, just the strekChar
            // else if count > 1, then there should be a char
            // followed by the number or occurences
            chars[idxAnswer] = streakChar;
            idxAnswer++;

            if (count != 1) {
                char[] countAsChars = Integer.toString(count).toCharArray();
                for (char digit: countAsChars) {
                    chars[idxAnswer] = digit;
                    idxAnswer++;
                }
            }

            streakStart = streakEnd + 1;
        }
        return idxAnswer;
    }
}