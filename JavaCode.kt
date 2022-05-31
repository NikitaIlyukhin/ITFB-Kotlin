import java.util.*
import java.util.regex.Pattern
import kotlin.Comparator

class JavaCode {
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
    val arrayMonth = month.substring(1,month.length-1).split("|")
    //1
    fun start():String{
        return "Ok"
    }

    //2
    fun toJSON(
        collection:Collection<Int>
    ):String{
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext())
        {
            val element:Int = iterator.next()
            sb.append(element)
            if(iterator.hasNext()){
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }

    //3
    fun foo(
        name:String,
        number:Int = 42,
        toUpperCase:Boolean = false
    ):String {
        if(toUpperCase) return name.toUpperCase()+number
        else return name+number
    }
    //4
    fun iscontainsEven(collection: Collection<Int>): Boolean = collection.any {
        var res=false
        for (i in collection) {
            if( i % 2 == 0){
                res=true
                break
            }
        }
        res
    }
    //5
    fun getPattern(): String = """\d{2} ${month} \d{4}"""
    fun getDate(date: String):String{
        val arrayDate = date.split(".");
        return arrayDate[0]+" "+arrayMonth[arrayDate[1].toInt()-1]+" "+arrayDate[2]
    }
    //9
    fun getList9(): List<Int> {
        val arrayList = arrayListOf(1, 5, 2)
        Collections.sort(arrayList, { x, y -> y-x })
        return arrayList
    }

    fun getList10(): List<Int> {
        val arrayList = arrayListOf(1, 5, 2)
        arrayList.sortDescending()
        return arrayList
    }


    fun test(){
        val collection:Collection<Int> = listOf(1,2,3,5)
        println(collection.size)
    }

}