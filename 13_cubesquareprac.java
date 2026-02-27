class Demo {
    public static void main(String[] args) {
        int n1 = Cube(3);
        System.out.println(add(n1,Cube(2)));

    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int Cube(int n){
        return n*n*n;
    }
}

// ## Call Stack for Your Program:

// **Program Flow:**
// 1. `main()` starts
// 2. `main()` calls `Cube(3)`
// 3. `Cube(3)` returns to `main()`
// 4. `main()` calls `add(n1, Cube(2))`
// 5. Inside `add()`, `Cube(2)` is called first
// 6. Then `add()` runs with both values

// ## Step-by-Step Call Stack:

// **Step 1:** `main()` starts
// ```
// | main() |
// |________|
// ```

// **Step 2:** `main()` calls `Cube(3)`
// ```
// | Cube(3) |   ← Cube(3) on top
// | main()  |
// |_________|
// ```

// **Step 3:** `Cube(3)` finishes → returns 27 to `main()`
// ```
// | main() |   ← Cube removed
// |________|
// ```

// **Step 4:** `main()` calls `add(n1, Cube(2))`  
// First, `Cube(2)` is called:
// ```
// | Cube(2) |   ← Cube(2) called first
// | main()  |
// |_________|
// ```

// **Step 5:** `Cube(2)` finishes → returns 8
// ```
// | main() |   ← Cube removed
// |________|
// ```

// **Step 6:** Now `add(27, 8)` is called
// ```
// | add(27,8) |   ← add on top
// | main()    |
// |___________|
// ```

// **Step 7:** `add()` finishes → returns 35 to `main()`
// ```
// | main() |   ← add removed
// |________|
// ```

// **Step 8:** `main()` prints 35 and finishes → stack empty

// ## Visual Timeline:
// ```
// Time → 
// main() → Cube(3) → main() → Cube(2) → main() → add(27,8) → main() → end
//         ↑                  ↑                    ↑
//        Calls              Calls                Calls
//       Cube(3)            Cube(2)               add()
// ```