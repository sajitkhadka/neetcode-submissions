func plusOne(digits []int) []int {
	carry := 1
    for i :=len(digits)-1; i>=0; i-- {
		digit := digits[i]
		digits[i] = digit + carry
		carry = 0;
		if digits[i] > 9{
			digits[i] = digits[i] % 10
			carry = 1
		}
	}
	if carry > 0{
		digits = append(digits, carry)
		digits[0], digits[len(digits)-1] = digits[len(digits)-1], digits[0]
	}
	return digits
}
