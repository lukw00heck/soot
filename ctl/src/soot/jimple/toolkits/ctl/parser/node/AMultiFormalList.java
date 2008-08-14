/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AMultiFormalList extends PFormalList
{
    private PFormal _formal_;
    private TComma _comma_;
    private PFormalList _formalList_;

    public AMultiFormalList()
    {
        // Constructor
    }

    public AMultiFormalList(
        @SuppressWarnings("hiding") PFormal _formal_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PFormalList _formalList_)
    {
        // Constructor
        setFormal(_formal_);

        setComma(_comma_);

        setFormalList(_formalList_);

    }

    @Override
    public Object clone()
    {
        return new AMultiFormalList(
            cloneNode(this._formal_),
            cloneNode(this._comma_),
            cloneNode(this._formalList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiFormalList(this);
    }

    public PFormal getFormal()
    {
        return this._formal_;
    }

    public void setFormal(PFormal node)
    {
        if(this._formal_ != null)
        {
            this._formal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._formal_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PFormalList getFormalList()
    {
        return this._formalList_;
    }

    public void setFormalList(PFormalList node)
    {
        if(this._formalList_ != null)
        {
            this._formalList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._formalList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._formal_)
            + toString(this._comma_)
            + toString(this._formalList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._formal_ == child)
        {
            this._formal_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._formalList_ == child)
        {
            this._formalList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._formal_ == oldChild)
        {
            setFormal((PFormal) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._formalList_ == oldChild)
        {
            setFormalList((PFormalList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
