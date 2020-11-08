trait Cell {
  def toString: String
}
class EmptyCell() extends Cell {
  override def toString(): String = "empty"
}

class NumberCell(var x:Int) extends Cell {
  override def toString(): String = x.toString
}

class StringCell(var s:String) extends Cell {
  override def toString(): String = s
}

class ReferenceCell(var x:Int, var y:Int, var table:Table) extends Cell {
  override def toString(): String = {
    if(x>=table.x||x<0||y>=table.y||y<0) return "outOfRange"
    var extractedCell = table.getCell(x,y).get;

    if(extractedCell.isInstanceOf[ReferenceCell]){

      val firstCell=extractedCell.asInstanceOf[ReferenceCell]
      extractedCell=firstCell

      var currentCell=extractedCell.asInstanceOf[ReferenceCell]
      while(currentCell.isInstanceOf[ReferenceCell]){
        var linkedCell=currentCell.table.getCell(currentCell.x,currentCell.y).get;
        if(linkedCell.isInstanceOf[ReferenceCell]){
          var nextCell=linkedCell.asInstanceOf[ReferenceCell].table.getCell(linkedCell.asInstanceOf[ReferenceCell].x,linkedCell.asInstanceOf[ReferenceCell].y).get

          if(nextCell.isInstanceOf[ReferenceCell]&&nextCell.asInstanceOf[ReferenceCell]==firstCell)
            return "cyclic"
          else
            currentCell=linkedCell.asInstanceOf[ReferenceCell]
        }
        else
          return(linkedCell.toString)
      }
    }
    else
      return(extractedCell.toString)
    return("can`t be")
  }
}