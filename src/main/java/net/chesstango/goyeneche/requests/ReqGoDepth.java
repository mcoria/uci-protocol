package net.chesstango.goyeneche.requests;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Mauricio Coria
 */
@Getter
@Setter
@Accessors(chain = true)
public final class ReqGoDepth extends ReqGo {

    private int depth;

    ReqGoDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public void execute(ReqGoExecutor reqGoExecutor) {
        reqGoExecutor.go(this);
    }

    @Override
    public String toString() {
        return String.format("go depth %d", depth);
    }
}
