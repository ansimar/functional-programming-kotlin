package _1_6_imperative_to_functional.imperative

class CreditCard2(initialAmt: Int) {

    var amount: Int = initialAmt

    fun charge(prize: Int) {
        this.amount -= prize
    }

}
