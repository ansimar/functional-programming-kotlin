package _1_6_imperative_to_functional.imperative

import _1_6_imperative_to_functional.functional.Tuple

class DonutShop2(prize: Int, amount: Int ) {

    var donutPrize: Int = prize
    var donutAmount: Int = amount

    fun buyDonut(creditCard: CreditCard2, donutsBought: Int): Tuple<Donut2, Payment2> {
        return Tuple(Donut2(donutsBought), Payment2(creditCard, donutPrize * donutsBought))
    }

}