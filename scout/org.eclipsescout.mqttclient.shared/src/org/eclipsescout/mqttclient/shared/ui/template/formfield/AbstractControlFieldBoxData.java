/**
 * 
 */
package org.eclipsescout.mqttclient.shared.ui.template.formfield;

import java.util.Map;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.ValidationRule;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractFormFieldData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 * 
 * @generated
 */
@Generated(value = "org.eclipse.scout.sdk.workspace.dto.formdata.FormDataDtoUpdateOperation", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public abstract class AbstractControlFieldBoxData extends AbstractFormFieldData {

  private static final long serialVersionUID = 1L;

  public AbstractControlFieldBoxData() {
  }

  public Label getLabel() {
    return getFieldByClass(Label.class);
  }

  public Message getMessage() {
    return getFieldByClass(Message.class);
  }

  public Topic getTopic() {
    return getFieldByClass(Topic.class);
  }

  public static class Label extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Label() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Message extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Message() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Topic extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Topic() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }
}
