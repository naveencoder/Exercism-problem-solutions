class DifferenceOfSquaresCalculator {


    int computeSquareOfSumTo(int input) {
        int squareOfSum;
        Integer sumOfNumbers = (input * (input + 1)) / 2;
        squareOfSum = (int) Math.pow(sumOfNumbers, 2);
        return squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquare;
        sumOfSquare = (input * (input + 1) * ((2 * input) + 1)) / 6;
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        int squareOfSum = computeSquareOfSumTo(input);
        int sumOfSquare = computeSumOfSquaresTo(input);
        if (squareOfSum > sumOfSquare) {
            return squareOfSum - sumOfSquare;
        }
        return sumOfSquare - squareOfSum;
    }

}
