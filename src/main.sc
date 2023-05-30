require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: hello
        q!: * (привет|здравствуй|прив|здравствуйте|добрый (~утро/~вечер/~день/~ночь)|хай)[!?.] *
        a: привет!
        
    state: weather
        q!: * (погод*/дожд*/сне*/вет*) *
        a: холодно
    
    state: currency
        q!: * ((цена|курс|сколько стоит *|стоимость|рав*|)|(валюты|валюта)|(доллар*|руб*|евро|фунт*|йен*|франк*|крон*|лир*|рупи*|реал*|песо*|злот*|гривн*|рэнд*|динар*)) *
        a: 19000 руб
        
    state: NoMatch
        event!: noMatch
        random:
            a: I don't understand you
            a: What do you mean?
            a: I don't get you