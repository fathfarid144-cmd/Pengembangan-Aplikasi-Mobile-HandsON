import kotlinx.coroutines.*

// Hands-on 1: Coroutines Dasar
// Tugas: Ambil data dari 2 sumber secara PARALEL menggunakan async/await,
// lalu gabungkan hasilnya. Total waktu eksekusi harus < 2 detik (bukan ~1800ms
// yang akan terjadi jika dijalankan secara sequential).

suspend fun fetchUserProfile(userId: String): String {
    delay(1000) // Simulasi network delay
    return "User: John Doe"
}

suspend fun fetchUserPosts(userId: String): List<String> {
    delay(800) // Simulasi network delay
    return listOf("Post 1", "Post 2", "Post 3")
}

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()

    // Menjalankan fetchUserProfile dan fetchUserPosts secara paralel dengan async
    val userProfileDeferred = async { fetchUserProfile("user123") }
    val userPostsDeferred = async { fetchUserPosts("user123") }

    // Menunggu kedua hasil selesai dengan await()
    val userProfile = userProfileDeferred.await()
    val userPosts = userPostsDeferred.await()

    println(userProfile)
    println("Posts: $userPosts")

    val endTime = System.currentTimeMillis()
    println("Waktu: ${endTime - startTime}ms")
}
