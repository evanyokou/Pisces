import com.yh.web.entity.Word
import com.yh.web.service.impl.WordService
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration

/**
 * Created by Ypc on 2017/06/11.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(locations = arrayOf("classpath*:config/spring-core.xml","classpath*:config/spring-mvc.xml"))
class TestUtils {
    @Autowired
    val service: WordService? = null

    @Before
    fun setUp(){
        service!!.setUp()
    }

    @Test
    fun test1(){
        val w: List<Word> = service!!.queryByName("憂")
        print("${w.get(0).name} => ${w.get(0).kana}")
    }

    @Test
    fun test2(){
        val w: List<Word> = service!!.query()
        print("${w.get(0).name} => ${w.get(0).kana}")
    }

    @Test
    fun test3(){
        val w: Page<Word> = service!!.queryByName("憂",0)
        for (item in w){
            print("${item.name} => ${item.kana}")
        }
    }
}