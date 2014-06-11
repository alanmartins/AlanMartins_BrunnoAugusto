/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAUnicoDeclaracao(AUnicoDeclaracao node);
    void caseAMultiploDeclaracao(AMultiploDeclaracao node);
    void caseAConstDeclaracao(AConstDeclaracao node);
    void caseAVariavelDefinicao(AVariavelDefinicao node);
    void caseAUnicoIdentificador(AUnicoIdentificador node);
    void caseAMultiploIdentificador(AMultiploIdentificador node);
    void caseAStringValor(AStringValor node);
    void caseAInteiroValor(AInteiroValor node);
    void caseARealValor(ARealValor node);
    void caseATipoRealTipo(ATipoRealTipo node);
    void caseATipoIntTipo(ATipoIntTipo node);
    void caseATipoCaractereTipo(ATipoCaractereTipo node);
    void caseAMultiIdentificador(AMultiIdentificador node);
    void caseAMultiploId(AMultiploId node);
    void caseAUnicoComando(AUnicoComando node);
    void caseAMultiploComando(AMultiploComando node);
    void caseACmdAtribuicaoDefinicaoComando(ACmdAtribuicaoDefinicaoComando node);
    void caseADeclLeiaDefinicaoComando(ADeclLeiaDefinicaoComando node);
    void caseADeclEscrevaDefinicaoComando(ADeclEscrevaDefinicaoComando node);
    void caseADeclAvalieDefinicaoComando(ADeclAvalieDefinicaoComando node);
    void caseADeclEnquantoDefinicaoComando(ADeclEnquantoDefinicaoComando node);
    void caseADeclRepitaDefinicaoComando(ADeclRepitaDefinicaoComando node);
    void caseADeclParaAteDefinicaoComando(ADeclParaAteDefinicaoComando node);
    void caseADeclParaPassoDefinicaoComando(ADeclParaPassoDefinicaoComando node);
    void caseADeclSeDefinicaoComando(ADeclSeDefinicaoComando node);
    void caseAOpcionalSenaoSe(AOpcionalSenaoSe node);
    void caseASenaoSe(ASenaoSe node);
    void caseAOpcionalSenaoCaso(AOpcionalSenaoCaso node);
    void caseASenaoCaso(ASenaoCaso node);
    void caseAMultiploCaso(AMultiploCaso node);
    void caseADefinicaoCaso(ADefinicaoCaso node);
    void caseAMultiExp(AMultiExp node);
    void caseAMultiplaExp(AMultiplaExp node);
    void caseAMenosExpExp(AMenosExpExp node);
    void caseAExpAritmeticaExp(AExpAritmeticaExp node);
    void caseATermoExpArit(ATermoExpArit node);
    void caseAMaisExpArit(AMaisExpArit node);
    void caseAMenosExpArit(AMenosExpArit node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAMultiplicacaoTermo(AMultiplicacaoTermo node);
    void caseADivisaoTermo(ADivisaoTermo node);
    void caseAIdentificadorFator(AIdentificadorFator node);
    void caseAValorFator(AValorFator node);
    void caseAExpFator(AExpFator node);
    void caseANaoExpLogica(ANaoExpLogica node);
    void caseALogicaExpLogica(ALogicaExpLogica node);
    void caseAELogica(AELogica node);
    void caseAOuLogica(AOuLogica node);
    void caseAXouLogica(AXouLogica node);
    void caseARelacionalLogica(ARelacionalLogica node);
    void caseAIgualRelacional(AIgualRelacional node);
    void caseADiferenteRelacional(ADiferenteRelacional node);
    void caseAMenorIgualRelacional(AMenorIgualRelacional node);
    void caseAMaiorIgualRelacional(AMaiorIgualRelacional node);
    void caseAMenorRelacional(AMenorRelacional node);
    void caseAMaiorRelacional(AMaiorRelacional node);

    void caseTNumInteiro(TNumInteiro node);
    void caseTNumReal(TNumReal node);
    void caseTString(TString node);
    void caseTConstante(TConstante node);
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
    void caseTIgual(TIgual node);
    void caseTIgualLog(TIgualLog node);
    void caseTDiferente(TDiferente node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaior(TMaior node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXou(TXou node);
    void caseTNao(TNao node);
    void caseTPrograma(TPrograma node);
    void caseTVariavel(TVariavel node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTFimPara(TFimPara node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTFimSe(TFimSe node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTSe(TSe node);
    void caseTEnquanto(TEnquanto node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTEntao(TEntao node);
    void caseTFaca(TFaca node);
    void caseTSenao(TSenao node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTPasso(TPasso node);
    void caseTEscreva(TEscreva node);
    void caseTLeia(TLeia node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTCaractere(TCaractere node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTBranco(TBranco node);
    void caseTId(TId node);
    void caseTComentario(TComentario node);
    void caseEOF(EOF node);
}
