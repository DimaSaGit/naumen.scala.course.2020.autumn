object Exercises {
trait Animal {
  def name: String
}

case class Cat(override val name: String) extends Animal

case class Dog(override val name: String) extends Animal



case class Shelter[+T<:Animal](list:List[Animal]){
  def +[A>:T<:Animal](other : A) = Shelter[A](list ::: List(other))
  def ++[A>:T<:Animal](other: Shelter[A]) = Shelter[A](list:::other.list)
  def getNames: List[String] = list.map(_.name)
  def feed(food: Food[T]) = {
    for(i<-list) yield food.feed(i)
  }
}




trait Food [-T<:Animal]{
  val name=""
  def feed(animal:T)= animal.name+ "eats" + this.name

}

case object Meat extends Food[Animal] {
  override val name:String = "meat"
}

case object Milk extends Food[Cat] {
  override val name:String = "milk"
}

case object Bread extends Food[Dog] {
  override val name:String = "bread"
}
}



