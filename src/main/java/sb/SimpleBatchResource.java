package sb;

import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.context.JobContext;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.logging.Logger;

import sb.chunk.SimpleProcessor;

@Path("/jbatch")
public class SimpleBatchResource {
    private static final Logger LOGGER = Logger.getLogger(SimpleBatchResource.class);  
	static long id;
	static JobOperator jo;
	
	public void SimpleBatchResource() {

	}
    @POST
    @Path("start")
    @Produces("text/plain")
    public String startBatch(){
        jo = BatchRuntime.getJobOperator();
        id = jo.start("SimpleBatch", null);
        LOGGER.info("[SimpleBatch] start : " + id);

        return "SimpleBatch has started. id = " + id;
    }
    
    @POST
    @Path("stop")
    @Produces("text/plain")
    public String StopBatch() {
    	jo.stop(id);
        LOGGER.info("[SimpleBatch] stop : " + id);

        return "SimpleBatch has Stopped. id = " + id;
    }
}