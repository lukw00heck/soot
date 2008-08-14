/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AFieldSignature extends PFieldSignature
{
    private TCmplt _cmplt_;
    private PClassName _className_;
    private TColon _first_;
    private PType _type_;
    private PName _fieldName_;
    private TCmpgt _cmpgt_;

    public AFieldSignature()
    {
        // Constructor
    }

    public AFieldSignature(
        @SuppressWarnings("hiding") TCmplt _cmplt_,
        @SuppressWarnings("hiding") PClassName _className_,
        @SuppressWarnings("hiding") TColon _first_,
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") PName _fieldName_,
        @SuppressWarnings("hiding") TCmpgt _cmpgt_)
    {
        // Constructor
        setCmplt(_cmplt_);

        setClassName(_className_);

        setFirst(_first_);

        setType(_type_);

        setFieldName(_fieldName_);

        setCmpgt(_cmpgt_);

    }

    @Override
    public Object clone()
    {
        return new AFieldSignature(
            cloneNode(this._cmplt_),
            cloneNode(this._className_),
            cloneNode(this._first_),
            cloneNode(this._type_),
            cloneNode(this._fieldName_),
            cloneNode(this._cmpgt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldSignature(this);
    }

    public TCmplt getCmplt()
    {
        return this._cmplt_;
    }

    public void setCmplt(TCmplt node)
    {
        if(this._cmplt_ != null)
        {
            this._cmplt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmplt_ = node;
    }

    public PClassName getClassName()
    {
        return this._className_;
    }

    public void setClassName(PClassName node)
    {
        if(this._className_ != null)
        {
            this._className_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._className_ = node;
    }

    public TColon getFirst()
    {
        return this._first_;
    }

    public void setFirst(TColon node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public PName getFieldName()
    {
        return this._fieldName_;
    }

    public void setFieldName(PName node)
    {
        if(this._fieldName_ != null)
        {
            this._fieldName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldName_ = node;
    }

    public TCmpgt getCmpgt()
    {
        return this._cmpgt_;
    }

    public void setCmpgt(TCmpgt node)
    {
        if(this._cmpgt_ != null)
        {
            this._cmpgt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpgt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmplt_)
            + toString(this._className_)
            + toString(this._first_)
            + toString(this._type_)
            + toString(this._fieldName_)
            + toString(this._cmpgt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmplt_ == child)
        {
            this._cmplt_ = null;
            return;
        }

        if(this._className_ == child)
        {
            this._className_ = null;
            return;
        }

        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._fieldName_ == child)
        {
            this._fieldName_ = null;
            return;
        }

        if(this._cmpgt_ == child)
        {
            this._cmpgt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmplt_ == oldChild)
        {
            setCmplt((TCmplt) newChild);
            return;
        }

        if(this._className_ == oldChild)
        {
            setClassName((PClassName) newChild);
            return;
        }

        if(this._first_ == oldChild)
        {
            setFirst((TColon) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._fieldName_ == oldChild)
        {
            setFieldName((PName) newChild);
            return;
        }

        if(this._cmpgt_ == oldChild)
        {
            setCmpgt((TCmpgt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
