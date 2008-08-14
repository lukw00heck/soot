/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AEnumModifier extends PModifier
{
    private TEnum _enum_;

    public AEnumModifier()
    {
        // Constructor
    }

    public AEnumModifier(
        @SuppressWarnings("hiding") TEnum _enum_)
    {
        // Constructor
        setEnum(_enum_);

    }

    @Override
    public Object clone()
    {
        return new AEnumModifier(
            cloneNode(this._enum_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumModifier(this);
    }

    public TEnum getEnum()
    {
        return this._enum_;
    }

    public void setEnum(TEnum node)
    {
        if(this._enum_ != null)
        {
            this._enum_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enum_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enum_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enum_ == child)
        {
            this._enum_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enum_ == oldChild)
        {
            setEnum((TEnum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
