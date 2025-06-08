fun main(){
    val fullSeconds: Int = 5409
    val hours: Int = fullSeconds / 3600
    val remainingSecondsAfterHours: Int = fullSeconds % 3600
    val minutes: Int = remainingSecondsAfterHours / 60
    val remainingSecondsAfterMinutes: Int = remainingSecondsAfterHours % 60
    val seconds: Int = remainingSecondsAfterMinutes % 60

    val formatTime: String = "$hours:$minutes:$seconds"

    println(formatTime)

}