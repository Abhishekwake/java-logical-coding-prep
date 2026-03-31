class Solution {
    public boolean checkPerfectNumber(int num) {
    if(num <=1) return false;
    int sum = 0;
    for(int i = 1;i<= num/2;i++) {
       if(num%i==0) {
         sum = sum + i;
       } 
    }
    return sum == num;
    }
}

/* 
Good — now your logic is **correct**, let’s go deeper so you actually *understand it like an interviewer expects*.

---

# 🧠 What is a Perfect Number (Deep Understanding)

A number is **perfect** if:

👉 Sum of its **proper divisors = the number itself**

**Proper divisors** = numbers that:

* divide `num` exactly (`num % i == 0`)
* **excluding the number itself**

---

# 🔍 Why loop till `num/2`?

Think logically:

👉 No number greater than `num/2` (except `num`) can divide `num`

Example: `28`

* Can 20 divide 28? ❌
* Can 15 divide 28? ❌
* Can 14 divide 28? ✅ (but 14 = 28/2)

👉 So max divisor (other than itself) = `num / 2`

That’s why:

```java
for(int i = 1; i <= num/2; i++)
```

---

# ⚙️ Step-by-Step Trace (VERY IMPORTANT)

Let’s trace your code for:

## 👉 num = 28

Initial:

```text
sum = 0
```

---

### Iterations:

| i    | num % i == 0?  | sum update         |
| ---- | -------------- | ------------------ |
| 1    | ✅ (28 % 1 = 0) | sum = 1            |
| 2    | ✅              | sum = 1 + 2 = 3    |
| 3    | ❌              | skip               |
| 4    | ✅              | sum = 3 + 4 = 7    |
| 5    | ❌              | skip               |
| 6    | ❌              | skip               |
| 7    | ✅              | sum = 7 + 7 = 14   |
| 8–13 | ❌              | skip               |
| 14   | ✅              | sum = 14 + 14 = 28 |

---

### Final:

```text
sum = 28
return true ✅
```

---

# ❗ Why `num % i == 0`?

This is the **core logic**

👉 It checks:

> “Does `i` divide `num` perfectly?”

Example:

```text
28 % 4 = 0 → valid divisor
28 % 5 = 3 → not divisor
```

So only valid divisors get added.

---

# ⚠️ Important Edge Case

```java
if(num <= 1) return false;
```

👉 Why?

* `1` has no proper divisors
* sum = 0 ≠ 1

So not perfect.

---

# 🧠 Intuition (Think Like This)

Instead of memorizing, think:

> “I need to collect all numbers that can form `num` through multiplication”

Example:

```text
28 = 1 × 28
28 = 2 × 14
28 = 4 × 7
```

👉 Take the **left side numbers (excluding 28)**:

```text
1, 2, 4, 7, 14 → sum = 28
```

---

# ⚡ Time Complexity (Interview)

Your code:

```text
O(n)
```

Because loop runs till `num/2`

---

# 🚀 Why Optimization Exists (Preview)

We don’t need to check all numbers.

👉 Divisors come in pairs:

```text
(1,28), (2,14), (4,7)
```

So we can stop at:

```text
sqrt(num)
```

👉 This reduces:

```text
O(n) → O(√n)
```

---

# 🎯 Final Mental Model

When you see:

```text
num % i == 0
```

Immediately think:

👉 “Divisor problem”
👉 “Factors / pairs”
👉 “Try sqrt optimization”

---

If you want next level:
I can show you
🔥 how interviewers twist this question
🔥 similar problems (VERY HIGH probability in startups)
*/