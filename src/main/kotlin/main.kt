fun main() {
    val sec = 20000
    println("был(а) ${agoToText(sec)}")
}

fun agoToText(seconds: Int): String {
    return when {
        seconds < 60 -> "только что"
        seconds < 60 * 60 -> "${seconds/60} ${textMinutes(seconds)} назад"
        seconds < 24 * 60 * 60 -> "${seconds/3600} ${textHours(seconds)} назад"
        seconds < 2 * 24 * 60 * 60 -> "сегодня"
        seconds < 3 * 24 * 60 * 60 -> "вчера"
        else -> "давно"
    }
}

fun textMinutes (seconds: Int): String {
    val minutes = seconds / 60
    return when {
        (minutes % 10 == 1) && (minutes / 11 != 1) -> "минуту"
        (minutes % 10 == 2) && (minutes / 12 != 1) -> "минуты"
        (minutes % 10 == 3) && (minutes / 13 != 1) -> "минуты"
        (minutes % 10 == 4) && (minutes / 14 != 1) -> "минуты"
        else -> "минут"
    }
}

fun textHours (seconds: Int): String {
    val hours = seconds / 3600
    return when {
        (hours % 10 == 1) && (hours / 11 != 1) -> "час"
        (hours % 10 == 2) && (hours / 12 != 1) -> "часа"
        (hours % 10 == 3) && (hours / 13 != 1) -> "часа"
        (hours % 10 == 4) && (hours / 14 != 1) -> "часа"
        else -> "часов"
    }
}

