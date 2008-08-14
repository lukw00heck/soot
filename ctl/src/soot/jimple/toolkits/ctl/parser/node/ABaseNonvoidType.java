/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import java.util.*;
import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABaseNonvoidType extends PNonvoidType
{
    private PBaseTypeNoName _baseTypeNoName_;
    private final LinkedList<PArrayBrackets> _arrayBrackets_ = new LinkedList<PArrayBrackets>();

    public ABaseNonvoidType()
    {
        // Constructor
    }

    public ABaseNonvoidType(
        @SuppressWarnings("hiding") PBaseTypeNoName _baseTypeNoName_,
        @SuppressWarnings("hiding") List<PArrayBrackets> _arrayBrackets_)
    {
        // Constructor
        setBaseTypeNoName(_baseTypeNoName_);

        setArrayBrackets(_arrayBrackets_);

    }

    @Override
    public Object clone()
    {
        return new ABaseNonvoidType(
            cloneNode(this._baseTypeNoName_),
            cloneList(this._arrayBrackets_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABaseNonvoidType(this);
    }

    public PBaseTypeNoName getBaseTypeNoName()
    {
        return this._baseTypeNoName_;
    }

    public void setBaseTypeNoName(PBaseTypeNoName node)
    {
        if(this._baseTypeNoName_ != null)
        {
            this._baseTypeNoName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._baseTypeNoName_ = node;
    }

    public LinkedList<PArrayBrackets> getArrayBrackets()
    {
        return this._arrayBrackets_;
    }

    public void setArrayBrackets(List<PArrayBrackets> list)
    {
        this._arrayBrackets_.clear();
        this._arrayBrackets_.addAll(list);
        for(PArrayBrackets e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._baseTypeNoName_)
            + toString(this._arrayBrackets_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._baseTypeNoName_ == child)
        {
            this._baseTypeNoName_ = null;
            return;
        }

        if(this._arrayBrackets_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._baseTypeNoName_ == oldChild)
        {
            setBaseTypeNoName((PBaseTypeNoName) newChild);
            return;
        }

        for(ListIterator<PArrayBrackets> i = this._arrayBrackets_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PArrayBrackets) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
