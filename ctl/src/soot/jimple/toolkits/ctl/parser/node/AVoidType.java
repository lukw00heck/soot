/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AVoidType extends PType
{
    private TVoid _void_;

    public AVoidType()
    {
        // Constructor
    }

    public AVoidType(
        @SuppressWarnings("hiding") TVoid _void_)
    {
        // Constructor
        setVoid(_void_);

    }

    @Override
    public Object clone()
    {
        return new AVoidType(
            cloneNode(this._void_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVoidType(this);
    }

    public TVoid getVoid()
    {
        return this._void_;
    }

    public void setVoid(TVoid node)
    {
        if(this._void_ != null)
        {
            this._void_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._void_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._void_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._void_ == child)
        {
            this._void_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._void_ == oldChild)
        {
            setVoid((TVoid) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
