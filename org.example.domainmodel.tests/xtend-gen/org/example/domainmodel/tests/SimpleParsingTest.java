package org.example.domainmodel.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.domainmodel.DomainmodelInjectorProvider;
import org.example.domainmodel.domainmodel.AbstractElement;
import org.example.domainmodel.domainmodel.Domainmodel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DomainmodelInjectorProvider.class)
@SuppressWarnings("all")
public class SimpleParsingTest {
  @Inject
  @Extension
  private ParseHelper<Domainmodel> _parseHelper;
  
  @Test
  public void testParse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package mypack {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("import toimport");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("datatype Kennzeichen  ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("datatype Name");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("entity Fahrzeug { ");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("hersteller:  Name");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("entity Auto extends Fahrzeug {");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("nummer:Kennzeichen");
      _builder.newLine();
      _builder.append("       ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Domainmodel model = this._parseHelper.parse(_builder);
      EList<AbstractElement> _elements = model.getElements();
      int _size = _elements.size();
      Assert.assertEquals(1, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
