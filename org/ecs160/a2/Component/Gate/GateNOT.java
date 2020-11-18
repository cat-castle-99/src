package org.ecs160.a2.Component.Gate;

import com.codename1.ui.Graphics;
import org.ecs160.a2.Utilities.Config;

public class GateNOT extends LogicGate {
    public GateNOT(int x, int y) {
        super(x, y);
    }

    @Override
    public int getMinInputSize() {
        return 1;
    }

    @Override
    public int getMaxInputSize() {
        return 1;
    }

    @Override
    public boolean getComputedOutput() {
        return !inputs.get(0).getVal();
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
