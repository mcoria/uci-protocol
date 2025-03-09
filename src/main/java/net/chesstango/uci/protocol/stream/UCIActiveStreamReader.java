package net.chesstango.uci.protocol.stream;

import net.chesstango.uci.protocol.UCICommand;
import net.chesstango.uci.protocol.requests.ReqQuit;

/**
 * @author Mauricio Coria
 */
public class UCIActiveStreamReader implements Runnable {
    protected volatile boolean keepReading;
    protected UCIInputStream input;
    protected UCIOutputStream output;

    @Override
    public void run() {
        UCIOutputStreamSwitch actionOutput = new UCIOutputStreamSwitch(uciMessage -> uciMessage instanceof ReqQuit, this::stopReading);
        actionOutput.setOutputStream(output);

        keepReading = true;
        UCICommand message = null;
        while (keepReading && (message = input.get()) != null) {
            actionOutput.accept(message);
        }
    }

    public void stopReading() {
        keepReading = false;
    }

    public void setInputStream(UCIInputStream input) {
        this.input = input;
    }

    public void setOutputStream(UCIOutputStream output) {
        this.output = output;
    }
}
