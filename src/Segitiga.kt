import DaftarBangunSegitiga.*

class Segitiga:BangunDatar, CetakBangunDatar {

    //secara default jenis segitiga adalah segitiga sama sisi
    var jenisBangunSegitiga = SEGITIGA_DEFAULT

    //disimpan dalam string agar bisa dipakai untuk fungsi jenisBangun()
    var jenisBangunSegitigaString = ""

    //setting default constructor
    //jenis bangun = segitiga sama sisi
    //icon = '*'
    //panjang = 5


    //constructor ketika ingin mencetak bangun
    // dengan jenis segitiga tertentu, icon tertentu,
    // dan panjang tertentu
    constructor(jenisBangunSegitiga: DaftarBangunSegitiga, customIconChar: Char, len:Int): super(customIconChar,len){
        setJenisSegitiga(jenisBangunSegitiga)
    }

    //constructor ketika ingin mencetak
    // bangun dengan jenis seigitga tertentu, icon tertentu
    // namun menggunakan panjang default
    constructor(jenisBangunSegitiga: DaftarBangunSegitiga, customIconChar: Char): super(customIconChar, customLength =  5){
        setJenisSegitiga(jenisBangunSegitiga)
    }

    //constructor ketika ingni mencetak
    // bangun dengan jenis segitiga tertentu
    // dan panjang tertentu namun dengan default icon
    constructor(jenisBangunSegitiga: DaftarBangunSegitiga, len: Int): super(customPrintIcon = '*',len){
        setJenisSegitiga(jenisBangunSegitiga)
    }

    //constructor ketika ingn mencetak bangun
    // dengan jenis segitiga tertentu
    // namun icon dan panjangnya default
    constructor(jenisBangunSegitiga: DaftarBangunSegitiga): super(customPrintIcon = '*', customLength =  5){
        setJenisSegitiga(jenisBangunSegitiga)
    }

    //constructor ketika ingin mencetak bangun dengan semua setting default
    constructor(): super(customPrintIcon = '*', customLength =  5){
        setJenisSegitiga(SEGITIGA_DEFAULT)
    }


    //dibuat untuk mengatur string dari jenis segitiga yang dipilih user
    fun setJenisSegitiga(jenisBangunSegitiga: DaftarBangunSegitiga){
        this.jenisBangunSegitiga = jenisBangunSegitiga
        when(jenisBangunSegitiga){
            SEGITIGA_SAMA_SIKU -> jenisBangunSegitigaString="Segitiga Sama Siku"
            SEGITIGA_SAMA_KAKI -> jenisBangunSegitigaString="Segitiga Sama Kaki"
            SEGITIGA_SAMA_KAKI_REVERSED -> jenisBangunSegitigaString="Segitiga Sama Kaki Terbalik"
            SEGITIGA_DEFAULT -> jenisBangunSegitigaString="Segitiga Default"
        }
    }


    //mencetak bangun segitiga sesuai pilihan jenis segitiga
    override fun printShape(){
        when(jenisBangunSegitiga){

            SEGITIGA_SAMA_SIKU -> printSegitigaSiku()

            SEGITIGA_SAMA_KAKI_REVERSED -> printSegitigaSamaKakiReversed()

            SEGITIGA_SAMA_KAKI -> printSegitigaSamaKaki()

            else -> printSegitigaSamaKaki()

        }
    }

    private fun printSegitigaSamaKaki() {
        var i = 1
        while (i in 1..length){
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

    }

    private fun printSegitigaSamaKakiReversed() {
        for(i in 1..length){

            for (j in 1..i)(
                    print(" ")
                    )
            for (j in (length*2-i).downTo(i)){
                print(icon)
            }
            println()
        }
    }

    private fun printSegitigaSiku(){
        for (i in 1..length){
            for (j in 1..i){
                print("$icon ")
            }
            println()
        }
    }

    //mengatur jenis bangun berdasarkan jenis segitiga
    override fun jenisBangun(): String = jenisBangunSegitigaString

}