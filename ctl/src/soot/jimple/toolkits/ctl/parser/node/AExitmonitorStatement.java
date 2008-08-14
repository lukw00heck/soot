/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AExitmonitorStatement extends PStatement
{
    private TExitmonitor _exitmonitor_;
    private PImmediate _immediate_;
    private TSemicolon _semicolon_;

    public AExitmonitorStatement()
    {
        // Constructor
    }

    public AExitmonitorStatement(
        @SuppressWarnings("hiding") TExitmonitor _exitmonitor_,
        @SuppressWarnings("hiding") PImmediate _immediate_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setExitmonitor(_exitmonitor_);

        setImmediate(_immediate_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AExitmonitorStatement(
            cloneNode(this._exitmonitor_),
            cloneNode(this._immediate_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExitmonitorStatement(this);
    }

    public TExitmonitor getExitmonitor()
    {
        return this._exitmonitor_;
    }

    public void setExitmonitor(TExitmonitor node)
    {
        if(this._exitmonitor_ != null)
        {
            this._exitmonitor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exitmonitor_ = node;
    }

    public PImmediate getImmediate()
    {
        return this._immediate_;
    }

    public void setImmediate(PImmediate node)
    {
        if(this._immediate_ != null)
        {
            this._immediate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._immediate_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exitmonitor_)
            + toString(this._immediate_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exitmonitor_ == child)
        {
            this._exitmonitor_ = null;
            return;
        }

        if(this._immediate_ == child)
        {
            this._immediate_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exitmonitor_ == oldChild)
        {
            setExitmonitor((TExitmonitor) newChild);
            return;
        }

        if(this._immediate_ == oldChild)
        {
            setImmediate((PImmediate) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
