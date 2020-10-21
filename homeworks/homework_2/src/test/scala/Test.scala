import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99)
        }
        'test_sumOfDivBy3Or5' - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(11, 16) == 27)
            assert(Exercises.sumOfDivBy3Or5(1, 100) == 2418)
        }
        'test_primeFactor' - {
            assert(Exercises.primeFactor(199) == Seq(199))
            assert(Exercises.primeFactor(39) == Seq(3, 13))
            assert(Exercises.primeFactor(390637) == Seq(13, 151, 199))
        }
        'test_sumScalars' - {
            assert(Exercises.sumScalars(new Vector2D(1.39,1.7),new Vector2D(-1,-1),new Vector2D(5,0),new Vector2D(0,5)) == -3.09)
            assert(Exercises.sumScalars(new Vector2D(0,1.7),new Vector2D(1,1),new Vector2D(-5,0),new Vector2D(0,5.399)) == 1.7)
        }
        'test_sumCosines' - {
            assert(Exercises.sumCosines(new Vector2D(1.39,1.7),new Vector2D(-1,-1),new Vector2D(5,0),new Vector2D(0,5)) == -0.9950052571360076)
            assert(Exercises.sumCosines(new Vector2D(0,1.7),new Vector2D(1,1),new Vector2D(-5,0),new Vector2D(0,5.399)) == 0.7071067811865475)
        }
        'test_sortByHeavyweight' - {
            assert(Exercises.sumCosines(new Map(
                "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
                "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
                "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
                "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
                "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
                "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)
            )) == Seq(Tin, Platinum, Aluminum, Sodium, Nickel, Titanium, Lead, Zirconium, Chrome, Iron, Silver, Uranium, Lithium, Gold, Tungsten, Copper, Cesium, Calcium, Cobalt, Potassium, Plutonium, Magnesium, Graphite))
            assert(Exercises.sumCosines(new Map(
                "Bismuth" -> (3,   9.8), "Tungsten" ->  (2,   19.35), "Hafnium" ->  (7,  13.31),   "Iron" ->      (3,   7.874),
                "Gold" ->     (2,   19.32),  "Niobium" -> (7,  8.57), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
                "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Tellurium" ->    (2,   6.25),
                "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
                "Germanium" ->     (2,   5.33), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Zirconium" -> (3,   6.45),
                "Chrome" ->   (3,   7.18),   "Iridium" ->    (7,   22.65)
            )) == Seq(Tin, Germanium, Platinum, Tellurium, Nickel, Titanium, Zirconium, Chrome, Iron, Silver, Lithium, Gold, Tungsten, Copper, Bismuth, Calcium, Cobalt, Plutonium, Magnesium,r Niobium, Hafnium, Iridium)        }
    }
}
