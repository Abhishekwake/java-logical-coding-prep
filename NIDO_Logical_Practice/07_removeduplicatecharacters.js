let str = "aaabbbcc";
let result = "";
for(let i = 0;i < str.length; i++){
        let found = false;
        for(let j = 0;j < result.length; j++){
            if(str[i] === result[j]){
                found=true;
                break;
            }
        }
        if(found === false){
            result = result + str[i];
        }
}
console.log(result);

// let str = "programming";
// let result = "";

// for (let i = 0; i < str.length; i++) {
//     if (!result.includes(str[i])) {
//         result = result + str[i];
//     }
// }

// console.log(result);

// Yes! ✅ We are using a flag variable here.

// In our code:

// ```
// let found = false;
// ```

// `found` is the flag. It helps us remember whether the current character is already present in `result`.

// ### How does the flag work?

// ```
// if (str[i] === result[j]) {
//     found = true;
//     break;
// }

// if (found === false) {
//     result = result + str[i];
// }
// ```

// Let's take `"aaabbc"`.

// | Character  | Flag (`found`) | Action         |
// | ---------- | -------------- | -------------- |
// | First `a`  | `false`        | Add `a`        |
// | Second `a` | `true`         | Skip duplicate |
// | Third `a`  | `true`         | Skip duplicate |
// | First `b`  | `false`        | Add `b`        |
// | Second `b` | `true`         | Skip duplicate |
// | First `c`  | `false`        | Add `c`        |

// Output: `abc`

// Remember for interviews:

// - `found = false` → We haven't found a duplicate yet.
// - `found = true` → We found a duplicate.
// - `break` → Stop checking because the duplicate has been found.

// A flag is simply a variable used to track a condition, often with a Boolean value (`true` or `false`).