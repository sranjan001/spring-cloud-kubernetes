package org.baeldung;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.satya.clientservice.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringContextTest {

    @Test
    public void contextLoads() {
    }
}
