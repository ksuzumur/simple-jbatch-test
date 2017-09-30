package sb.chunk;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Dependent
@Named("SimpleProcessor")
public class SimpleProcessor implements ItemProcessor {

    private static final Logger LOGGER = Logger.getLogger(SimpleProcessor.class);  
    @Override
    public Object processItem(Object item) throws Exception {
        LOGGER.info("[SimpleProcessor] processItem() :" + item);
        Thread.sleep(10000);
        return item;
    }    
}