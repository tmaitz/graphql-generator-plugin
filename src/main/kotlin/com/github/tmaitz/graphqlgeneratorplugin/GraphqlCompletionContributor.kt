package com.github.tmaitz.graphqlgeneratorplugin

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.PlainTextTokenTypes

class GraphqlCompletionContributor : CompletionContributor() {

    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(PlainTextTokenTypes.PLAIN_TEXT),
            GraphqlCompletionProvider()
        )
        extend(
            CompletionType.BASIC,
            PlatformPatterns.not(PlatformPatterns.alwaysFalse()),
            GraphqlCompletionProvider()
        )
    }

}