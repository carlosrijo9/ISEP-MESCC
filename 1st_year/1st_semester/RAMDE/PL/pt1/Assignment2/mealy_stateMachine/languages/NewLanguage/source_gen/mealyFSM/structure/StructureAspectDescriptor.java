package mealyFSM.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptStateMachine = createDescriptorForStateMachine();
  /*package*/ final ConceptDescriptor myConceptaction = createDescriptorForaction();
  /*package*/ final ConceptDescriptor myConceptevent = createDescriptorForevent();
  /*package*/ final ConceptDescriptor myConceptstate = createDescriptorForstate();
  /*package*/ final ConceptDescriptor myConcepttransition = createDescriptorFortransition();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptStateMachine, myConceptaction, myConceptevent, myConceptstate, myConcepttransition);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.StateMachine:
        return myConceptStateMachine;
      case LanguageConceptSwitch.action:
        return myConceptaction;
      case LanguageConceptSwitch.event:
        return myConceptevent;
      case LanguageConceptSwitch.state:
        return myConceptstate;
      case LanguageConceptSwitch.transition:
        return myConcepttransition;
      default:
        return null;
    }
  }


  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForStateMachine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("mealyFSM", "StateMachine", 0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0b1L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L);
    b.origin("r:373d6e1c-0570-4758-801e-9091d69134c1(mealyFSM.structure)/3823129464717037745");
    b.version(2);
    b.associate("intialState", 0x49c166ced2b97862L).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0adL).optional(false).origin("5314642073758562402").done();
    b.aggregate("event", 0x350e7bfe0ac9d30fL).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0afL).optional(true).ordered(true).multiple(true).origin("3823129464717038351").done();
    b.aggregate("action", 0x350e7bfe0ac9d311L).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0b0L).optional(true).ordered(true).multiple(true).origin("3823129464717038353").done();
    b.aggregate("state", 0x350e7bfe0ac9d318L).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0adL).optional(true).ordered(true).multiple(true).origin("3823129464717038360").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForaction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("mealyFSM", "action", 0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0b0L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:373d6e1c-0570-4758-801e-9091d69134c1(mealyFSM.structure)/3823129464717037744");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForevent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("mealyFSM", "event", 0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0afL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:373d6e1c-0570-4758-801e-9091d69134c1(mealyFSM.structure)/3823129464717037743");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForstate() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("mealyFSM", "state", 0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0adL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:373d6e1c-0570-4758-801e-9091d69134c1(mealyFSM.structure)/3823129464717037741");
    b.version(2);
    b.aggregate("transition", 0x49c166ced2b96c4aL).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0aeL).optional(true).ordered(true).multiple(true).origin("5314642073758559306").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorFortransition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("mealyFSM", "transition", 0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0aeL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:373d6e1c-0570-4758-801e-9091d69134c1(mealyFSM.structure)/3823129464717037742");
    b.version(2);
    b.associate("event", 0x49c166ced2b97867L).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0afL).optional(true).origin("5314642073758562407").done();
    b.associate("target", 0x49c166ced2b9786aL).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0adL).optional(true).origin("5314642073758562410").done();
    b.associate("action", 0x49c166ced2b97d5cL).target(0xdc97585e752a461cL, 0x8b396a0782f6bf23L, 0x350e7bfe0ac9d0b0L).optional(true).origin("5314642073758563676").done();
    return b.create();
  }
}
