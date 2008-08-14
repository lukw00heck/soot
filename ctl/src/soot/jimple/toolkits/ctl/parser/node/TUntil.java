/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TUntil extends Token
{
    public TUntil()
    {
        super.setText("U");
    }

    public TUntil(int line, int pos)
    {
        super.setText("U");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUntil(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUntil(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUntil text.");
    }
}
