import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    simple().collect{
        println(it)
    }
}

fun simple(): Flow<Int> = flow {
    for (i in 1..3){
        delay(500)
        emit(i)
    }
}