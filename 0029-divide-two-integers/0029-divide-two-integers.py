class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        # Handle overflow edge case
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1

        # Determine the sign of the result
        sign = 1 if (dividend > 0) == (divisor > 0) else -1

        # Work with positive values for simplicity
        abs_dividend = abs(dividend)
        abs_divisor = abs(divisor)

        quotient = 0

        # Subtract the divisor from the dividend using bitwise shifts
        while abs_dividend >= abs_divisor:
            temp_divisor = abs_divisor
            multiple = 1
            while abs_dividend >= (temp_divisor << 1):
                temp_divisor <<= 1
                multiple <<= 1
            abs_dividend -= temp_divisor
            quotient += multiple

        # Apply the sign to the result
        return sign * quotient