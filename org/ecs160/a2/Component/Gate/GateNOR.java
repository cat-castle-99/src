package org.ecs160.a2.Component.Gate;

import com.codename1.ui.Graphics;
import org.ecs160.a2.Component.NodeInput;
import org.ecs160.a2.Utilities.Config;

public class GateNOR extends LogicGate {
    public GateNOR(int x, int y) {
        super(x, y);
    }

    @Override
    public int getMinInputSize() {
        return NORMALGATE_INPUT_MINSIZE;
    }

    @Override
    public int getMaxInputSize() {
        return NORMALGATE_INPUT_MAXSIZE;
    }

    @Override
    public boolean getComputedOutput() {
        boolean res = false;
        for (NodeInput input : inputs) {
            res |= input.getVal();
        }
        return !res;
    }

    @Override
    public void draw(Graphics g) {
        int color = selectStatus ?
                Config.getInstance().selectedLogicGateColor :
                Config.getInstance().unselectedLogicGateColor;
        g.setColor(color);
        // TODO: Implement Gate Drawing
        g.drawRect(this.x, this.y, this.getWidth(), this.getHeight());
        drawNodes(g);
    }
}
