/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AArrayNewExpr extends PNewExpr
{
    private TNewarray _newarray_;
    private TLParen _lParen_;
    private PNonvoidType _nonvoidType_;
    private TRParen _rParen_;
    private PFixedArrayDescriptor _fixedArrayDescriptor_;

    public AArrayNewExpr()
    {
        // Constructor
    }

    public AArrayNewExpr(
        @SuppressWarnings("hiding") TNewarray _newarray_,
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PNonvoidType _nonvoidType_,
        @SuppressWarnings("hiding") TRParen _rParen_,
        @SuppressWarnings("hiding") PFixedArrayDescriptor _fixedArrayDescriptor_)
    {
        // Constructor
        setNewarray(_newarray_);

        setLParen(_lParen_);

        setNonvoidType(_nonvoidType_);

        setRParen(_rParen_);

        setFixedArrayDescriptor(_fixedArrayDescriptor_);

    }

    @Override
    public Object clone()
    {
        return new AArrayNewExpr(
            cloneNode(this._newarray_),
            cloneNode(this._lParen_),
            cloneNode(this._nonvoidType_),
            cloneNode(this._rParen_),
            cloneNode(this._fixedArrayDescriptor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayNewExpr(this);
    }

    public TNewarray getNewarray()
    {
        return this._newarray_;
    }

    public void setNewarray(TNewarray node)
    {
        if(this._newarray_ != null)
        {
            this._newarray_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._newarray_ = node;
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

    public PNonvoidType getNonvoidType()
    {
        return this._nonvoidType_;
    }

    public void setNonvoidType(PNonvoidType node)
    {
        if(this._nonvoidType_ != null)
        {
            this._nonvoidType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nonvoidType_ = node;
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

    public PFixedArrayDescriptor getFixedArrayDescriptor()
    {
        return this._fixedArrayDescriptor_;
    }

    public void setFixedArrayDescriptor(PFixedArrayDescriptor node)
    {
        if(this._fixedArrayDescriptor_ != null)
        {
            this._fixedArrayDescriptor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fixedArrayDescriptor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._newarray_)
            + toString(this._lParen_)
            + toString(this._nonvoidType_)
            + toString(this._rParen_)
            + toString(this._fixedArrayDescriptor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._newarray_ == child)
        {
            this._newarray_ = null;
            return;
        }

        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._nonvoidType_ == child)
        {
            this._nonvoidType_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        if(this._fixedArrayDescriptor_ == child)
        {
            this._fixedArrayDescriptor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._newarray_ == oldChild)
        {
            setNewarray((TNewarray) newChild);
            return;
        }

        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._nonvoidType_ == oldChild)
        {
            setNonvoidType((PNonvoidType) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        if(this._fixedArrayDescriptor_ == oldChild)
        {
            setFixedArrayDescriptor((PFixedArrayDescriptor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
