/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TTo extends Token
{
    public TTo()
    {
        super.setText("to");
    }

    public TTo(int line, int pos)
    {
        super.setText("to");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTo(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTo(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTo text.");
    }
}
