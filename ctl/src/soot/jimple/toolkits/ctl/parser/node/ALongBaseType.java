/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class ALongBaseType extends PBaseType
{
    private TLong _long_;

    public ALongBaseType()
    {
        // Constructor
    }

    public ALongBaseType(
        @SuppressWarnings("hiding") TLong _long_)
    {
        // Constructor
        setLong(_long_);

    }

    @Override
    public Object clone()
    {
        return new ALongBaseType(
            cloneNode(this._long_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALongBaseType(this);
    }

    public TLong getLong()
    {
        return this._long_;
    }

    public void setLong(TLong node)
    {
        if(this._long_ != null)
        {
            this._long_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._long_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._long_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._long_ == child)
        {
            this._long_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._long_ == oldChild)
        {
            setLong((TLong) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
