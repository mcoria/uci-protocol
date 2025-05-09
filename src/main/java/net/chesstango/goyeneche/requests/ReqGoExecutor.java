package net.chesstango.goyeneche.requests;

/**
 * @author Mauricio Coria
 */
public interface ReqGoExecutor {
    void go(ReqGoInfinite cmdGoInfinite);

    void go(ReqGoDepth cmdGoDepth);

    void go(ReqGoTime cmdGoTime);

    void go(ReqGoFast cmdGoFast);
}
