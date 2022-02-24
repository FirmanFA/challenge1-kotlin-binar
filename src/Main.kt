import DaftarBangunSegitiga.*

fun main(){

    //mencetak segitiga siku dengan icon dan panjang default
    val segitigaSamaSiku = Segitiga(SEGITIGA_SAMA_SIKU)
    println(segitigaSamaSiku.jenisBangun())
    println()
    segitigaSamaSiku.printShape()
    println()

    //mencetak segitiga sama kaki dengan custom icon dan panjang default
    val segitigaSamaKaki = Segitiga(SEGITIGA_SAMA_KAKI,'#')
    println(segitigaSamaKaki.jenisBangun())
    println()
    segitigaSamaKaki.printShape()
    println()

    //mencetak segitiga sama kaki terbalik dengan custom icon dan panjang custom
    val segitigaSamaKakiReversed = Segitiga(SEGITIGA_SAMA_KAKI_REVERSED,'@',7)
    println(segitigaSamaKakiReversed.jenisBangun())
    println()
    segitigaSamaKakiReversed.printShape()
    println()

    //mencetak belah ketupat dengan default
    val belahKetupat = BelahKetupat()
    println(belahKetupat.jenisBangun())
    println()
    belahKetupat.printShape()
    println()

    //mencetak silang dengan custom panjang dan default icon
    val silang = Silang(8)
    println(silang.jenisBangun())
    println()
    silang.printShape()
    println()

}