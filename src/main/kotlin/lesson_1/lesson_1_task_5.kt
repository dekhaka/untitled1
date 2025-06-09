fun main(){
    val fullSeconds: Int = 5409
    val hours: Int = fullSeconds / SECOND_IN_HOUR
    val remainingSecondsAfterHours: Int = fullSeconds % SECOND_IN_HOUR
    val minutes: Int = remainingSecondsAfterHours / SECOND_IN_MINUTE
    val remainingSecondsAfterMinutes: Int = remainingSecondsAfterHours % SECOND_IN_MINUTE
    val seconds: Int = remainingSecondsAfterMinutes % SECOND_IN_MINUTE

    val formatTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formatTime)

}
const val SECOND_IN_MINUTE = 60
const val SECOND_IN_HOUR = 60 * SECOND_IN_MINUTE