class Table(var x:Int, var y:Int){
  val table = scala.collection.mutable.Map[Int,Cell]()
  for(i<-0 until x*y){
    table+=i->new EmptyCell();
  }
  def getCell(ix:Int, iy:Int): Option[Cell]={
    if(ix>=x||iy>=y||ix<0||iy<0) return None
    return Option(table(ix+iy*y));

  }
  def setCell(ix:Int, iy: Int, cell:Cell):Unit ={
    table+=(ix+iy*y)->cell;
  }
}