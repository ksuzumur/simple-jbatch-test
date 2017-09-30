package sb.chunk;

import java.io.Serializable;
import java.util.List;
import javax.batch.api.chunk.ItemWriter;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Dependent
@Named("SimpleWriter")
public class SimpleWriter implements ItemWriter {

    private static final Logger LOGGER = Logger.getLogger(SimpleWriter.class);
    @Override
    public void open(Serializable checkpoint) throws Exception {
        LOGGER.info("[SimpleWriter] open()");
    }
    
    @Override
    public void close() throws Exception {
        LOGGER.info("[SimpleWriter] close()");
    }

    @Override
    public void writeItems(List<Object> items) throws Exception {
        LOGGER.info("[SimpleWriter] writeItems() :" + items);
    }

    @Override
    public Serializable checkpointInfo() throws Exception {
        LOGGER.info("[SimpleWriter] checkPointInfo()");
        return null;
    }
}
