//8. Напишите функцию, которая принимает количество минут и частоту
//кадров (FPS) и возвращает, сколько за это время кадров показывает
//компьютер при этом FPS.

fun calculateTotalFrames(minutes: Int, fps: Int): Int {
    // Сначала переводим минуты в секунды
    val seconds = minutes * 60
    // Затем рассчитываем общее количество кадров
    return seconds * fps
}

fun main() {
    // Примеры значений для проверки
    val minutes = 5
    val fps = 30

    val t = calculateTotalFrames(minutes, fps)
    println("За $minutes минут(ы) при $fps FPS будет показано $t кадров.")
}