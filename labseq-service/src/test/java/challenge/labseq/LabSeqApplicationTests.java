package challenge.labseq;

import challenge.labseq.cache.Cache;
import challenge.labseq.resource.LabseqResource;
import challenge.labseq.service.LabseqService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabSeqApplicationTests {
    @Autowired
    private LabseqResource labseqResource;
    @Autowired
    private LabseqService labseqService;
    @Autowired
    private Cache cache;

    @Test
    void contextLoads() {
        Assertions.assertThat(labseqResource).isNotNull();
        Assertions.assertThat(labseqService).isNotNull();
        Assertions.assertThat(cache).isNotNull();
    }
}
