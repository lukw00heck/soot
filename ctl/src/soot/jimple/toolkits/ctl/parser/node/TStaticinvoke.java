/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TStaticinvoke extends Token
{
    public TStaticinvoke()
    {
        super.setText("staticinvoke");
    }

    public TStaticinvoke(int line, int pos)
    {
        super.setText("staticinvoke");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStaticinvoke(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStaticinvoke(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStaticinvoke text.");
    }
}
