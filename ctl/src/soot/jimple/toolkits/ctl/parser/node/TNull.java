/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TNull extends Token
{
    public TNull()
    {
        super.setText("null");
    }

    public TNull(int line, int pos)
    {
        super.setText("null");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNull(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNull(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNull text.");
    }
}
