abstract class BangunDatar(customPrintIcon: Char, customLength: Int) {

    //properti icon dan panjang bangun untuk masing masing bangun
    var icon = customPrintIcon
    var length = customLength

    //tiap bangun datar wajib implementasi jenis bangun
    abstract fun jenisBangun():String

}