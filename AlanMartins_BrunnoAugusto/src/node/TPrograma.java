/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TPrograma extends Token
{
    public TPrograma()
    {
        super.setText("programa");
    }

    public TPrograma(int line, int pos)
    {
        super.setText("programa");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrograma(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrograma(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrograma text.");
    }
}
