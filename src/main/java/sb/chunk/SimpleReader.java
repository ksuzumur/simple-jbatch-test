package sb.chunk;

import java.io.Serializable;
import javax.batch.api.chunk.ItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Dependent
@Named("SimpleReader")
public class SimpleReader implements ItemReader {   
    private int count = 1;
  
    private static final Logger LOGGER = Logger.getLogger(SimpleReader.class);  
    @Override
    public void open(Serializable checkpoint) throws Exception {
        LOGGER.info("[SimpleReader] open()");
    }

    @Override
    public Object readItem() throws Exception {
        LOGGER.info("[SimpleReader] readItem() : count = " +  count);
        if (count <= 7) {
            return "data" + count++;
        }
        if (count == 8) {

        }
        return null;
    }

    @Override
    public Serializable checkpointInfo() throws Exception {
        LOGGER.info("[SimpleReader] checkpointInfo()");
        return null;
    }

    @Override
    public void close() throws Exception {
        LOGGER.info("[SimpleReader] close()");
    }
}
