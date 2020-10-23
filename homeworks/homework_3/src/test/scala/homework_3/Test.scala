package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false)== falseStr)
            assert(Exercises.prettyBooleanFormatter1(2457)== "2457")

        }
        'booleanFormater2 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false)== falseStr)
            assert(Exercises.prettyBooleanFormatter2(2457)== "2457")
        }
        'booleanFormater3 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false)== falseStr)
            assert(Exercises.prettyBooleanFormatter3(2457)== "2457")
        }
        'max1 - {
            assert(Exercises.max1(Seq(3,23,4,24,-86,4,42,234,6)) == 234)
            assert(Exercises.max1(Seq(-3,-23,-4,-24,-86,-4,-42,-234,-6))== -3)
            assert(Exercises.max1(Seq())== -2147483648)
        }
        'max2 - {
            assert(Exercises.max2(Seq(3,23,4,24,-86,4,42,234,6)) == 234)
            assert(Exercises.max2(Seq(-3,-23,-4,-24,-86,-4,-42,-234,-6))== -3)
            assert(Exercises.max2(Seq())== List())
        }
        'max3 - {
            assert(Exercises.max3(Seq(3,23,4,24,-86,4,42,234,6)) == 234)
            assert(Exercises.max3(Seq(-3,-23,-4,-24,-86,-4,-42,-234,-6))== -3)
            assert(Exercises.max3(Seq())== None)
        }
        'sums - {
            assert(Exercises.sum1(Seq(3,-5)) == -2)
            assert(Exercises.sum2(Seq(0,-5))== -5)
            assert(Exercises.sum3(Seq(33,77))== 110)
        }
    }
}
