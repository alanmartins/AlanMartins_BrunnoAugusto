/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TELog extends Token
{
    public TELog()
    {
        super.setText("&&");
    }

    public TELog(int line, int pos)
    {
        super.setText("&&");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TELog(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTELog(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TELog text.");
    }
}
