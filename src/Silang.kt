class Silang: BangunDatar, CetakBangunDatar {


    //setting default constructor
    //icon = '*'
    //panjang = 5


    //constructor ketika ingin mencetak bangun
    // dengan icon tertentu,
    // dan panjang tertentu
    constructor(customIconChar: Char, len:Int): super(customIconChar,len)

    //constructor ketika ingin mencetak
    // bangun dengan icon tertentu
    // namun menggunakan panjang default
    constructor(customIconChar: Char): super(customIconChar, customLength =  5)

    //constructor ketika ingni mencetak
    // bangun panjang tertentu
    // namun dengan default icon
    constructor(len: Int): super(customPrintIcon = '*',len)

    //constructor ketika ingin mencetak bangun dengan semua setting default
    constructor(): super(customPrintIcon = '*', customLength =  5)

    override fun printShape(){
        for(i in 1..length){

            for (j in 1..i)(
                    print(" ")
                    )
            print(icon)
            for (j in (length*2-i).downTo(i)){
                print(" ")
            }
            println(icon)
        }
        for (i in 1..length+1){
            print(" ")
        }
        println(icon)
        var i = 1
        while (i in 1..length){
            var j=length
            while (j in length.downTo(i)){
                print(" ")
                j--
            }
            print(icon)

            var k = 1
            while (k != 2*i){
                print(" ")
                k++
            }
            println(icon)

            i++
        }
    }

    override fun jenisBangun(): String = "Silang"

}