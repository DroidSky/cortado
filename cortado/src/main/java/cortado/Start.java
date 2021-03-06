/*
 * Copyright 2017 Bartosz Lipinski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cortado;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

public class Start {

    private final Cortado cortado;

    Start(Cortado cortado) {
        this.cortado = cortado;
    }

    public final class Matcher extends NotCompletable<Cortado.OrAnd.Matcher>
            implements Not<Negated.Start.Matcher> {

        Matcher() {
            super(cortado);
        }

        @Override
        final Cortado.OrAnd.Matcher returned() {
            return cortado.new OrAnd().new Matcher();
        }

        @VisibleForTesting
        final Cortado getCortado() {
            return cortado;
        }

        @Override
        public final Negated.Start.Matcher not() {
            return new Negated(cortado).new Start().new Matcher();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isAssignableFrom(Class<? extends View> clazz) {
            return super.isAssignableFrom(clazz);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
            return super.withClassName(classNameMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isDisplayed() {
            return super.isDisplayed();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isCompletelyDisplayed() {
            return super.isCompletelyDisplayed();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isDisplayingAtLeast(int areaPercentage) {
            return super.isDisplayingAtLeast(areaPercentage);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isEnabled() {
            return super.isEnabled();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isFocusable() {
            return super.isFocusable();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasFocus() {
            return super.hasFocus();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isSelected() {
            return super.isSelected();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
            return super.hasSibling(siblingMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasSibling(cortado.Matcher siblingMatcher) {
            return super.hasSibling(siblingMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withContentDescription(@StringRes int resourceId) {
            return super.withContentDescription(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withContentDescription(String text) {
            return super.withContentDescription(text);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
            return super.withContentDescription(charSequenceMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withId(@IdRes int id) {
            return super.withId(id);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withId(org.hamcrest.Matcher<Integer> integerMatcher) {
            return super.withId(integerMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withResourceName(String name) {
            return super.withResourceName(name);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withResourceName(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withTagKey(int key) {
            return super.withTagKey(key);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
            return super.withTagKey(key, objectMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
            return super.withTagValue(tagValueMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withText(String text) {
            return super.withText(text);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withText(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withText(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withText(@StringRes int resourceId) {
            return super.withText(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withHint(String hintText) {
            return super.withHint(hintText);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withHint(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withHint(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withHint(@StringRes int resourceId) {
            return super.withHint(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isChecked() {
            return super.isChecked();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isNotChecked() {
            return super.isNotChecked();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasContentDescription() {
            return super.hasContentDescription();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
            return super.hasDescendant(descendantMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasDescendant(cortado.Matcher descendantMatcher) {
            return super.hasDescendant(descendantMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isClickable() {
            return super.isClickable();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
            return super.isDescendantOfA(ancestorMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isDescendantOfA(cortado.Matcher ancestorMatcher) {
            return super.isDescendantOfA(ancestorMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withEffectiveVisibility(ViewMatchers.Visibility visibility) {
            return super.withEffectiveVisibility(visibility);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withParent(org.hamcrest.Matcher<View> parentMatcher) {
            return super.withParent(parentMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withParent(cortado.Matcher parentMatcher) {
            return super.withParent(parentMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withChild(org.hamcrest.Matcher<View> childMatcher) {
            return super.withChild(childMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withChild(cortado.Matcher childMatcher) {
            return super.withChild(childMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isRoot() {
            return super.isRoot();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher supportsInputMethods() {
            return super.supportsInputMethods();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasImeAction(int imeAction) {
            return super.hasImeAction(imeAction);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
            return super.hasImeAction(imeActionMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasLinks() {
            return super.hasLinks();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withSpinnerText(@StringRes int resourceId) {
            return super.withSpinnerText(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withSpinnerText(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withSpinnerText(String text) {
            return super.withSpinnerText(text);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher isJavascriptEnabled() {
            return super.isJavascriptEnabled();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
            return super.hasErrorText(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher hasErrorText(String expectedError) {
            return super.hasErrorText(expectedError);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher withInputType(int inputType) {
            return super.withInputType(inputType);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher matching(org.hamcrest.Matcher<View> matcher) {
            return super.matching(matcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.Matcher matching(cortado.Matcher matcher) {
            return super.matching(matcher);
        }
    }

    public final class ViewInteraction extends NotCompletable<Cortado.OrAnd.ViewInteraction>
            implements Not<Negated.Start.ViewInteraction> {

        ViewInteraction() {
            super(cortado);
        }

        @Override
        final Cortado.OrAnd.ViewInteraction returned() {
            return cortado.new OrAnd().new ViewInteraction();
        }

        @VisibleForTesting
        final Cortado getCortado() {
            return cortado;
        }

        @Override
        public final Negated.Start.ViewInteraction not() {
            return new Negated(cortado).new Start().new ViewInteraction();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isAssignableFrom(Class<? extends View> clazz) {
            return super.isAssignableFrom(clazz);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
            return super.withClassName(classNameMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isDisplayed() {
            return super.isDisplayed();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isCompletelyDisplayed() {
            return super.isCompletelyDisplayed();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isDisplayingAtLeast(int areaPercentage) {
            return super.isDisplayingAtLeast(areaPercentage);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isEnabled() {
            return super.isEnabled();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isFocusable() {
            return super.isFocusable();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasFocus() {
            return super.hasFocus();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isSelected() {
            return super.isSelected();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
            return super.hasSibling(siblingMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasSibling(cortado.Matcher siblingMatcher) {
            return super.hasSibling(siblingMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withContentDescription(@StringRes int resourceId) {
            return super.withContentDescription(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withContentDescription(String text) {
            return super.withContentDescription(text);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
            return super.withContentDescription(charSequenceMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withId(@IdRes int id) {
            return super.withId(id);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withId(org.hamcrest.Matcher<Integer> integerMatcher) {
            return super.withId(integerMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withResourceName(String name) {
            return super.withResourceName(name);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withResourceName(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withTagKey(int key) {
            return super.withTagKey(key);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
            return super.withTagKey(key, objectMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
            return super.withTagValue(tagValueMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withText(String text) {
            return super.withText(text);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withText(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withText(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withText(@StringRes int resourceId) {
            return super.withText(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withHint(String hintText) {
            return super.withHint(hintText);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withHint(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withHint(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withHint(@StringRes int resourceId) {
            return super.withHint(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isChecked() {
            return super.isChecked();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isNotChecked() {
            return super.isNotChecked();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasContentDescription() {
            return super.hasContentDescription();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
            return super.hasDescendant(descendantMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasDescendant(cortado.Matcher descendantMatcher) {
            return super.hasDescendant(descendantMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isClickable() {
            return super.isClickable();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
            return super.isDescendantOfA(ancestorMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isDescendantOfA(cortado.Matcher ancestorMatcher) {
            return super.isDescendantOfA(ancestorMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withEffectiveVisibility(ViewMatchers.Visibility visibility) {
            return super.withEffectiveVisibility(visibility);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withParent(org.hamcrest.Matcher<View> parentMatcher) {
            return super.withParent(parentMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withParent(cortado.Matcher parentMatcher) {
            return super.withParent(parentMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withChild(org.hamcrest.Matcher<View> childMatcher) {
            return super.withChild(childMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withChild(cortado.Matcher childMatcher) {
            return super.withChild(childMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isRoot() {
            return super.isRoot();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction supportsInputMethods() {
            return super.supportsInputMethods();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasImeAction(int imeAction) {
            return super.hasImeAction(imeAction);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
            return super.hasImeAction(imeActionMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasLinks() {
            return super.hasLinks();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withSpinnerText(@StringRes int resourceId) {
            return super.withSpinnerText(resourceId);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
            return super.withSpinnerText(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withSpinnerText(String text) {
            return super.withSpinnerText(text);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction isJavascriptEnabled() {
            return super.isJavascriptEnabled();
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
            return super.hasErrorText(stringMatcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction hasErrorText(String expectedError) {
            return super.hasErrorText(expectedError);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction withInputType(int inputType) {
            return super.withInputType(inputType);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction matching(org.hamcrest.Matcher<View> matcher) {
            return super.matching(matcher);
        }

        @IdeSuggestion
        @Override
        public final Cortado.OrAnd.ViewInteraction matching(cortado.Matcher matcher) {
            return super.matching(matcher);
        }
    }
}
