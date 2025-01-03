package net.chesstango.uci.protocol;

import net.chesstango.uci.protocol.stream.UCIOutputStream;

/**
 * @author Mauricio Coria
 * <p>
 * El servicio recibe mensajes UCI por ser UCIOutputStream y
 * y escribe toda respuesta en el OutputStream que recibe como referencia.
 * <p>
 * La interfaz podria servir para implementar engine como gui.
 */
public interface UCIService extends UCIOutputStream {
    void open();

    void close();

    void setResponseOutputStream(UCIOutputStream output);

}
