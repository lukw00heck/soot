/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AStaticInvokeExpr extends PInvokeExpr
{
    private TStaticinvoke _staticinvoke_;
    private PMethodSignature _methodSignature_;
    private TLParen _lParen_;
    private PArgList _argList_;
    private TRParen _rParen_;

    public AStaticInvokeExpr()
    {
        // Constructor
    }

    public AStaticInvokeExpr(
        @SuppressWarnings("hiding") TStaticinvoke _staticinvoke_,
        @SuppressWarnings("hiding") PMethodSignature _methodSignature_,
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PArgList _argList_,
        @SuppressWarnings("hiding") TRParen _rParen_)
    {
        // Constructor
        setStaticinvoke(_staticinvoke_);

        setMethodSignature(_methodSignature_);

        setLParen(_lParen_);

        setArgList(_argList_);

        setRParen(_rParen_);

    }

    @Override
    public Object clone()
    {
        return new AStaticInvokeExpr(
            cloneNode(this._staticinvoke_),
            cloneNode(this._methodSignature_),
            cloneNode(this._lParen_),
            cloneNode(this._argList_),
            cloneNode(this._rParen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStaticInvokeExpr(this);
    }

    public TStaticinvoke getStaticinvoke()
    {
        return this._staticinvoke_;
    }

    public void setStaticinvoke(TStaticinvoke node)
    {
        if(this._staticinvoke_ != null)
        {
            this._staticinvoke_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._staticinvoke_ = node;
    }

    public PMethodSignature getMethodSignature()
    {
        return this._methodSignature_;
    }

    public void setMethodSignature(PMethodSignature node)
    {
        if(this._methodSignature_ != null)
        {
            this._methodSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._methodSignature_ = node;
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PArgList getArgList()
    {
        return this._argList_;
    }

    public void setArgList(PArgList node)
    {
        if(this._argList_ != null)
        {
            this._argList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._argList_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._staticinvoke_)
            + toString(this._methodSignature_)
            + toString(this._lParen_)
            + toString(this._argList_)
            + toString(this._rParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._staticinvoke_ == child)
        {
            this._staticinvoke_ = null;
            return;
        }

        if(this._methodSignature_ == child)
        {
            this._methodSignature_ = null;
            return;
        }

        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._argList_ == child)
        {
            this._argList_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._staticinvoke_ == oldChild)
        {
            setStaticinvoke((TStaticinvoke) newChild);
            return;
        }

        if(this._methodSignature_ == oldChild)
        {
            setMethodSignature((PMethodSignature) newChild);
            return;
        }

        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._argList_ == oldChild)
        {
            setArgList((PArgList) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
