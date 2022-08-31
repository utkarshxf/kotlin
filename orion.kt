


  //  var str= readLine()!!.toInt()
  //  var no = Calendar.getInstance().get(Calendar.YEAR)
  //  println("number no. $str and no. 2 $no" )
// for (i in 100 downTo 0 step 2) {
//   println("bebe utkarsh fuck me $i times")
  
// }
//  }
//   val a = 3
//   println("pets name")
//   var listofpets: Array<String>=Array(a){""}
//   for (i in 0 until a) {
//     listofpets[i]=readLine()!!.toString()
// }
//   println("your pets are ")
//   for (i in 0 until a) {
//     println("pet $i: ${listofpets[i]}")
//   }
// fun main() 
// {
    
 
//   val emptyArray: Array<Int> = emptyArray()

//   println(emptyArray.size) // 0
// }

//  import java.util.*
//  fun main() {
//   val a="Hellow wellcome to my code"
  // val b = " and fuck your self"
  // println("$a,$b")
  // println("$a+$b")
  // println("$a$b")
  // val t= a.split(" ")
  // for (i in t) {
  //   if(!i.contains("to") && !i.contains("my")){
  //     println("tokens: $i")
  //   }
  //   else {
  //     println("chalta hai")
  //   }   
  // }
//   // var c = "$a$b"
//   // println(c.trim())

// }
class pet(val name:String, val prize : Int){
  init{
    println("something has been created ")
  }
}
fun main(){
  val pet1=pet( "hello" ,200)
  println(pet1.name)
  var pet2 = pet("wedsd", 7000)
  println(pet2.prize)
}