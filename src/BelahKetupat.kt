class BelahKetupat: BangunDatar,CetakBangunDatar {

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


    //mencetak shape belah ketupat
    override fun printShape(){

        var i = 1
        while (i in 1 until length){
            var j=length
            while (j in length.downTo(i)){
                print(" ")
                j--
            }

            var k = 1
            while (k != 2*i){
                print(icon)
                k++
            }
            println()

            i++
        }

        for(z in 1 .. length){

            for (j in 1..z)(
                    print(" ")
                    )
            for (j in (length*2-z).downTo(z)){
                print(icon)
            }
            println()
        }
    }

    override fun jenisBangun(): String = "Belah Ketupat"

}