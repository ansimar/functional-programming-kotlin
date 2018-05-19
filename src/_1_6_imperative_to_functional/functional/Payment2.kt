package _1_6_imperative_to_functional.imperative

class Payment2(creditCard: CreditCard2, amount: Int) {

    val creditCard: CreditCard2 = creditCard
    val amount: Int = amount

    init {
        creditCard.amount -= amount
    }

}