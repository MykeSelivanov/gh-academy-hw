## 5.
10! = 2 · 3 · 4 · 5 · 6 · 7 · 8 · 9 · 10  
= 2 · 3 · 2² · 5 · (2 · 3) · 7 · 2³ · 3² · (2 · 5)  
= 2⁸ · 3⁴ · 5² · 7

---

## 11.
We give a proof by contradiction. Suppose that in fact log₂(3) is the rational number *p/q*, where *p* and *q* are 
integers. Since log₂(3) > 0, we can assume that *p* and *q* are positive. Translating the equation log₂(3) = *p/q* into 
its exponential equivalent, we obtain 3 = 2^(p/q). Raising both sides to the *q*th power yields 3^q = 2^p. Now this is a
violation of the Fundamental Theorem of Arithmetic, since it gives two different prime factorizations of the same 
number. Hence our assumption (that log₂(3) is rational) must be wrong, and we conclude that log₂(3) is irrational.

---

## 19.
The identity shown in the hint is valid, as can be readily seen by multiplying out the right-hand side (all the terms 
cancel—telescope—except for 2^a and -1). We will prove the assertion by proving its contrapositive. Suppose that *n* is 
not prime. Then by definition *n = ab* for some integers *a* and *b* each greater than 1. Since *a > 1*, 2^a - 1 (the 
first factor in the suggested identity) is greater than 1. Clearly the second factor is greater than 1. 
Thus 2^n - 1 = 2^ab - 1 is the product of two integers each greater than 1, so it is not prime.

---

## 25.
To find the greatest common divisor of two numbers whose prime factorizations are given, we just need to take the 
smaller exponent for each prime.

**a)** The first number has no prime factors of 2, so the gcd has no 2's. Since the first number has seven factors of 3,
but the second number has only five, the gcd has five factors of 3. Similarly the gcd has a factor of 5³.  
So the gcd is 3⁵ · 5³.

**b)** These numbers have no common prime factors, so the gcd is 1.  
**c)** 2^(3·17)  
**d)** 41 · 43 · 53  
**e)** These numbers have no common prime factors, so the gcd is 1.  
**f)** The gcd of any positive integer and 0 is that integer, so the answer is 1111.

---

## 37.
One can compute gcd(2^a - 1, 2^b - 1) using the Euclidean algorithm. Let us look at what happens when we do so.

If *b = 1*, then the answer is just 1, which is the same as 2^gcd(a,b) - 1 in this case. Otherwise, we reduce the 
problem to computing gcd(2^b - 1, (2^a - 1) mod (2^b - 1)).

Now from Exercise 36 we know that this second argument equals 2^a mod b - 1. Therefore the exponents involved in the 
continuing calculation are *b* and *a mod b*—exactly the same quantities that are involved in computing gcd(a, b)! It 
follows that when the process terminates, the answer must be 2^gcd(a,b) - 1, as desired.
