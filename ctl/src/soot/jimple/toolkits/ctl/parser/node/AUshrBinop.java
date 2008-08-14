/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AUshrBinop extends PBinop
{
    private TUshr _ushr_;

    public AUshrBinop()
    {
        // Constructor
    }

    public AUshrBinop(
        @SuppressWarnings("hiding") TUshr _ushr_)
    {
        // Constructor
        setUshr(_ushr_);

    }

    @Override
    public Object clone()
    {
        return new AUshrBinop(
            cloneNode(this._ushr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUshrBinop(this);
    }

    public TUshr getUshr()
    {
        return this._ushr_;
    }

    public void setUshr(TUshr node)
    {
        if(this._ushr_ != null)
        {
            this._ushr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ushr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ushr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ushr_ == child)
        {
            this._ushr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ushr_ == oldChild)
        {
            setUshr((TUshr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
