package _1_6_imperative_to_functional.functional

import _1_6_imperative_to_functional.imperative.CreditCard2
import _1_6_imperative_to_functional.imperative.DonutShop2
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class DonutShopTest2 {

    @Test
    fun testBuyDonut(){
        var donutShop: DonutShop2 = DonutShop2(3, 10)
        var creditCard: CreditCard2 = CreditCard2(30)

        var tuple = donutShop.buyDonut(creditCard, 1)
        assertTrue(tuple._2.creditCard.amount == 27)
    }

}