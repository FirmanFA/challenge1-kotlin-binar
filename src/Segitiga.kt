class Segitiga:BangunDatar {

    constructor(customIconChar: Char, len:Int): super(customIconChar,len)
    constructor(customIconChar: Char): super(customIconChar, 5)
    constructor(): super(customPrintIcon = '*',5)
    constructor(len: Int): super(customPrintIcon = '*',len)


    fun printShape(){
        for (i in 1..length){
            for (j in 1..i){
                print("$icon ")
            }
            println()
        }
    }

    fun printShape(customIcon:Char){
        for (i in 0..5){
            for (j in 0..i){
                print(customIcon)
            }
            println()
        }
    }

    override fun jenisBangun(): String = "Segitiga Siku"

}