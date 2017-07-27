/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalAsomemodelParser;
import org.xtext.services.AsomemodelGrammarAccess;

public class AsomemodelParser extends AbstractContentAssistParser {

	@Inject
	private AsomemodelGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAsomemodelParser createParser() {
		InternalAsomemodelParser result = new InternalAsomemodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
					put(grammarAccess.getMultiplicityAccess().getAlternatives_3(), "rule__Multiplicity__Alternatives_3");
					put(grammarAccess.getOrderAccess().getAlternatives(), "rule__Order__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getRepositoryServiceAccess().getGroup(), "rule__RepositoryService__Group__0");
					put(grammarAccess.getDomainInterfaceAccess().getGroup(), "rule__DomainInterface__Group__0");
					put(grammarAccess.getDataPortAccess().getGroup(), "rule__DataPort__Group__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getMultiplicityAccess().getGroup(), "rule__Multiplicity__Group__0");
					put(grammarAccess.getValueObjectAccess().getGroup(), "rule__ValueObject__Group__0");
					put(grammarAccess.getAttriAccess().getGroup(), "rule__Attri__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getRepositoryserviceAssignment_3(), "rule__Model__RepositoryserviceAssignment_3");
					put(grammarAccess.getModelAccess().getDomaininterfaceAssignment_4(), "rule__Model__DomaininterfaceAssignment_4");
					put(grammarAccess.getRepositoryServiceAccess().getNameAssignment_1(), "rule__RepositoryService__NameAssignment_1");
					put(grammarAccess.getRepositoryServiceAccess().getDataportAssignment_4(), "rule__RepositoryService__DataportAssignment_4");
					put(grammarAccess.getDomainInterfaceAccess().getNameAssignment_1(), "rule__DomainInterface__NameAssignment_1");
					put(grammarAccess.getDomainInterfaceAccess().getElementAssignment_3(), "rule__DomainInterface__ElementAssignment_3");
					put(grammarAccess.getDataPortAccess().getNameAssignment_1(), "rule__DataPort__NameAssignment_1");
					put(grammarAccess.getDataPortAccess().getCrossModelAssignment_5(), "rule__DataPort__CrossModelAssignment_5");
					put(grammarAccess.getDataPortAccess().getCrossInterfaceAssignment_7(), "rule__DataPort__CrossInterfaceAssignment_7");
					put(grammarAccess.getEntityAccess().getNameAssignment_3(), "rule__Entity__NameAssignment_3");
					put(grammarAccess.getEntityAccess().getMultiplicityAssignment_4(), "rule__Entity__MultiplicityAssignment_4");
					put(grammarAccess.getEntityAccess().getAttriAssignment_8(), "rule__Entity__AttriAssignment_8");
					put(grammarAccess.getMultiplicityAccess().getNameAssignment_1(), "rule__Multiplicity__NameAssignment_1");
					put(grammarAccess.getMultiplicityAccess().getNameAssignment_3_0(), "rule__Multiplicity__NameAssignment_3_0");
					put(grammarAccess.getValueObjectAccess().getNameAssignment_1(), "rule__ValueObject__NameAssignment_1");
					put(grammarAccess.getValueObjectAccess().getAttriAssignment_5(), "rule__ValueObject__AttriAssignment_5");
					put(grammarAccess.getAttriAccess().getNameAssignment_0(), "rule__Attri__NameAssignment_0");
					put(grammarAccess.getAttriAccess().getCrossModelAssignment_2(), "rule__Attri__CrossModelAssignment_2");
					put(grammarAccess.getAttriAccess().getCrossInterfaceAssignment_4(), "rule__Attri__CrossInterfaceAssignment_4");
					put(grammarAccess.getAttriAccess().getDatatypeAssignment_6(), "rule__Attri__DatatypeAssignment_6");
					put(grammarAccess.getAttriAccess().getMultiplicityAssignment_7(), "rule__Attri__MultiplicityAssignment_7");
					put(grammarAccess.getAttriAccess().getOrderAssignment_8(), "rule__Attri__OrderAssignment_8");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAsomemodelParser typedParser = (InternalAsomemodelParser) parser;
			typedParser.entryRuleAsomemodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AsomemodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AsomemodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
