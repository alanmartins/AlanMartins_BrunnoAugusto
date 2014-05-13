/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTDigito(TDigito node);
    void caseTAspasSimples(TAspasSimples node);
    void caseTVirgula(TVirgula node);
    void caseTPonto(TPonto node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLColc(TLColc node);
    void caseTRColc(TRColc node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTIgLog(TIgLog node);
    void caseTDifLog(TDifLog node);
    void caseTMenor(TMenor node);
    void caseTMenorIg(TMenorIg node);
    void caseTMaior(TMaior node);
    void caseTMaiorIg(TMaiorIg node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTNao(TNao node);
    void caseTPrograma(TPrograma node);
    void caseTVar(TVar node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTSe(TSe node);
    void caseTEnquanto(TEnquanto node);
    void caseTPara(TPara node);
    void caseTEntao(TEntao node);
    void caseTFaca(TFaca node);
    void caseTSenao(TSenao node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTEscreva(TEscreva node);
    void caseTCaractere(TCaractere node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTString(TString node);
    void caseTBranco(TBranco node);
    void caseTId(TId node);
    void caseTComentario(TComentario node);
    void caseEOF(EOF node);
}
