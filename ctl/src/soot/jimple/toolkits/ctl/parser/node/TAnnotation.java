/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TAnnotation extends Token
{
    public TAnnotation()
    {
        super.setText("annotation");
    }

    public TAnnotation(int line, int pos)
    {
        super.setText("annotation");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAnnotation(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAnnotation(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAnnotation text.");
    }
}
