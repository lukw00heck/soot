/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class ATransientModifier extends PModifier
{
    private TTransient _transient_;

    public ATransientModifier()
    {
        // Constructor
    }

    public ATransientModifier(
        @SuppressWarnings("hiding") TTransient _transient_)
    {
        // Constructor
        setTransient(_transient_);

    }

    @Override
    public Object clone()
    {
        return new ATransientModifier(
            cloneNode(this._transient_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATransientModifier(this);
    }

    public TTransient getTransient()
    {
        return this._transient_;
    }

    public void setTransient(TTransient node)
    {
        if(this._transient_ != null)
        {
            this._transient_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transient_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._transient_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._transient_ == child)
        {
            this._transient_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._transient_ == oldChild)
        {
            setTransient((TTransient) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
