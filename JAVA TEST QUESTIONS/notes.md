Yes. Let's understand this **from zero**, because three concepts are connected:

1. **Inheritance**
2. **Method Overriding**
3. **Runtime Polymorphism**

---

# 1. First: Inheritance

Inheritance means a child class gets properties/methods from a parent class.

Example:

```java
class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {

}
```

Here:

```text
Vehicle
   ↑
   |
  Car
```

Because:

```java
class Car extends Vehicle
```

`Car` gets the `run()` method from `Vehicle`.

So you can do:

```java
Car c = new Car();

c.run();
```

Output:

```text
Vehicle is running
```

---

# 2. What is Method Overriding?

Suppose the parent says:

```java
class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}
```

But a car wants its **own implementation** of `run()`.

So Car writes the same method:

```java
class Car extends Vehicle {

    @Override
    void run() {
        System.out.println("Car is running");
    }
}
```

Now Car has **replaced/overridden** the parent's implementation.

That's called **Method Overriding**.

### Important rule

For overriding:

```text
Method name → SAME
Parameters   → SAME
Return type  → SAME/compatible
```

Example:

```java
// Parent
void run(int days)

// Child
void run(int days)
```

✅ Overriding

But:

```java
// Parent
void run(int days)

// Child
void run(int days, int km)
```

❌ Not overriding — that's **overloading**.

---

# 3. Now your example

You had:

```java
class Vehical {

    void runVehicalPrice(int days) {
        System.out.println("vehical price");
    }
}
```

Then Car:

```java
class Car extends Vehical {

    @Override
    void runVehicalPrice(int days) {

        int price = days + 1500;

        System.out.println("Car = " + price);
    }
}
```

Bike:

```java
class Bike extends Vehical {

    @Override
    void runVehicalPrice(int days) {

        int price = days * 400;

        System.out.println("Bike = " + price);
    }
}
```

The parent has a method:

```text
runVehicalPrice(int days)
```

Car says:

> "I want my own version."

Bike says:

> "I also want my own version."

That's **method overriding**.

---

# 4. Now the interesting part: Runtime

You wrote:

```java
Vehical car = new Car();
Vehical bike = new Bike();
```

This looks strange initially.

Read it like this:

```text
Vehical car = new Car();
       ↑          ↑
    reference    object
```

The **reference** is `Vehical`.

The actual **object** is `Car`.

Similarly:

```text
Vehical bike = new Bike();
```

```text
reference → Vehical
object    → Bike
```

---

# 5. Then you call the method

```java
car.runVehicalPrice(3);
```

You might think:

> "The variable is Vehical, so Java should use Vehicle's method."

But Java looks at the **actual object**.

The actual object is:

```text
Car
```

So Java calls:

```java
Car.runVehicalPrice(3)
```

Therefore:

```text
Car = 1503
```

Then:

```java
bike.runVehicalPrice(3);
```

Actual object:

```text
Bike
```

So Java calls:

```java
Bike.runVehicalPrice(3)
```

Output:

```text
Bike = 1200
```

---

# 6. Why is it called Runtime Polymorphism?

Break the word down.

### Poly

Means:

> Many

### Morph

Means:

> Forms

So **polymorphism = one thing having many forms.**

Here:

```java
Vehical car = new Car();
Vehical bike = new Bike();
```

Both are referred to as:

```text
Vehical
```

But they behave differently:

```text
car  → Car behavior
bike → Bike behavior
```

Same method call:

```java
runVehicalPrice(3)
```

Different behavior depending on the actual object.

That's polymorphism.

---

# 7. Why "Runtime"?

Because Java determines **which overridden method to execute at runtime** based on the actual object.

Look:

```java
Vehical car = new Car();
```

At compile time, Java knows:

```text
car is a Vehicle reference
```

But at runtime, the actual object is:

```text
Car
```

Therefore:

```text
Runtime → Car's method
```

That's why:

**Runtime Polymorphism = Method Overriding + Inheritance**

---

# 8. The whole thing in one picture

```text
                 Vehicle
                    |
          runVehicalPrice(int)
                    |
          ┌─────────┴─────────┐
          ↓                   ↓
         Car                 Bike
          |                   |
   overrides method    overrides method
          |                   |
     Car price            Bike price
```

Then:

```java
Vehical car = new Car();
Vehical bike = new Bike();
```

and:

```java
car.runVehicalPrice(3);
```

goes to:

```text
Car → runVehicalPrice()
```

while:

```java
bike.runVehicalPrice(3);
```

goes to:

```text
Bike → runVehicalPrice()
```

---

## The easiest interview definition

If an interviewer asks:

**"What is method overriding?"**

Say:

> **Method overriding is when a child class provides its own implementation of a method that is already defined in the parent class, with the same method signature.**

If they ask:

**"What is runtime polymorphism?"**

Say:

> **Runtime polymorphism is when the method to be executed is decided at runtime based on the actual object, usually achieved through method overriding and a parent-class reference.**

### Remember this one line:

```text
Inheritance → Parent/Child relationship
Overriding → Child changes parent's method
Polymorphism → Same method call, different behavior
Runtime → Decision happens when program runs
```

That's the core idea.
