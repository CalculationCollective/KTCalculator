fun main() {
    println("Enter the first number: ")
    val num1 = readln().toDouble()

    println("Choose between:\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division")
    val calculationType = readln()

    println("Enter the second number: ")
    val num2 = readln().toDouble()

    when (calculationType) {
        "1" -> print(num1 + num2)
        "2" -> print(num1 - num2)
        "3" -> print(num1 * num2)
        "4" -> print(num1 / num2)
        else -> {
            print("$calculationType is not a valid function")
        }
    }
}