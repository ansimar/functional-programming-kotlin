package _1_6_imperative_to_functional.imperative

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class DonutShopTest {

    @Test
    fun testBuyDonut(){
        var donutShop: DonutShop = DonutShop(3, 10)
        var creditCard: CreditCard = CreditCard(30)

        donutShop.buyDonut(creditCard, 1)
        assertTrue(creditCard.amount == 27)
    }

}