require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: hello
        q!: * (привет|здравствуй|прив|здравствуйте|добрый * день|добрый * вечер|доброе * утро|хай)[!?.] *
        a: привет!
        
    state: weather
        q!: * (погода|какая * погода|какая погода *) *
        a: холодно
    
    state: currency
        q!: * ((курс|какой курс|сколько стоит *)|(валюты|валюта)) *
        a: 19000 руб
        
    state: NoMatch
        a: соре