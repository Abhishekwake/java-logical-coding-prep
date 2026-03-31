public static int calculate(int n) {
    int temp = n;
    int count = 0;

    // count digits
    while (temp > 0) {
        count++;
        temp /= 10;
    }

    int sum = 0;
    temp = n;

    // calculate
    while (temp > 0) {
        int digit = temp % 10;

        sum += Math.pow(digit, count); // use count as power

        count--;   // decrease power
        temp /= 10;
    }

    return sum;
}