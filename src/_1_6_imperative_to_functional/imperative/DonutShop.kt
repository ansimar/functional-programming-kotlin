package _1_6_imperative_to_functional.imperative

class DonutShop(prize: Int, amount: Int ) {

    var donutPrize: Int = prize
    var donutAmount: Int = amount

    fun buyDonut(creditCard: CreditCard, donutsBought: Int): Donut {
        var donut = Donut(donutsBought)

        creditCard.charge(donutPrize * donutsBought) // Charges the credit car as a SIDE EFFECT

        return donut                                       // returns the donut
    }
    // Is difficult to test. The credit card involves contact the bank and register a transaction.
    // You need to mock the credit card.
    // We need to remove the side effect.
    // for this buyDonut method has to return the dount and also the representation of the payment
}