package org.ecs160.a2.Component.Gate;
import com.codename1.ui.*;
import org.ecs160.a2.Utilities.Config;
import org.ecs160.a2.Component.NodeInput;
import org.ecs160.a2.Component.Widget;

import java.util.*;

public abstract class LogicGate extends Widget {
    protected final int NORMALGATE_INPUT_MINSIZE = 2;
    protected final int NORMALGATE_INPUT_MAXSIZE = 5;

    public LogicGate(int x, int y) {
        super(x, y,
                Config.getInstance().logicGateWidth,
                Config.getInstance().logicGateHeight);
    }

    public void drawNodes(Graphics g) {
        for (NodeInput input : inputs) {
            input.draw(g);
        }
        output.draw(g);
    }

    public NodeInput getNodeInput(int i) {
        if (i < 0 || i >= inputs.size()) {
            return null;
        }
        return inputs.get(i);
    }

    public void changeInputSize(int inputSize) {
        if (inputSize < getMinInputSize() || inputSize > getMaxInputSize() || inputSize == inputs.size()) {
            return; // input size cannot be smaller than 2
        }
        this.inputs = new ArrayList<NodeInput>();
        populateInput(inputSize);
    }

    private int calcInputX(int index) {
        // TODO: Implement X COORDINATES FOR INPUT
        return this.getX();
    }
    private int calcInputY(int index) {
        // TODO: Implement Y COORDINATES FOR INPUT
        return this.getY();
    }
    private int calcOutputX(){
        // TODO: Implement X COORDINATES FOR OUTPUT
        return this.getX();
    }
    private int calcOutputY(){
        // TODO: Implement Y COORDINATES FOR OUTPUT
        return this.getY();
    }
}
