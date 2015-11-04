/**
 * Created by Administrator on 2015/11/4.
 */

def paths = System.getenv()

paths.each { k, v ->
    println(k + ":" + v)
}