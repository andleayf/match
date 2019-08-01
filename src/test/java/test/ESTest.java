package test;

import com.xcy.MatchApplication;
import com.xcy.repository.MatchRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MatchApplication.class)
public class ESTest {
    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    MatchRepository matchRepository;

    @Test
    public void testConn(){
        System.out.println("matchRepository***"+matchRepository);
        System.out.println("elasticsearchTemplate***"+elasticsearchTemplate);
    }
}
