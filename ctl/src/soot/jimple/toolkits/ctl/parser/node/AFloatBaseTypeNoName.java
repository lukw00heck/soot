/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AFloatBaseTypeNoName extends PBaseTypeNoName
{
    private TFloat _float_;

    public AFloatBaseTypeNoName()
    {
        // Constructor
    }

    public AFloatBaseTypeNoName(
        @SuppressWarnings("hiding") TFloat _float_)
    {
        // Constructor
        setFloat(_float_);

    }

    @Override
    public Object clone()
    {
        return new AFloatBaseTypeNoName(
            cloneNode(this._float_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatBaseTypeNoName(this);
    }

    public TFloat getFloat()
    {
        return this._float_;
    }

    public void setFloat(TFloat node)
    {
        if(this._float_ != null)
        {
            this._float_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._float_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._float_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._float_ == child)
        {
            this._float_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._float_ == oldChild)
        {
            setFloat((TFloat) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
