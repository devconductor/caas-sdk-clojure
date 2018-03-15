(ns pier-sdk-clojure.api.fatura
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-fatura-using-get1-with-http-info
  "Consulta fatura de um cliente
  Consulta fatura de um cliente pela data de vencimento."
  [data-vencimento id-conta ]
  (call-api "/api/faturas/{dataVencimento}" :get
            {:path-params   {"dataVencimento" data-vencimento }
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-fatura-using-get1
  "Consulta fatura de um cliente
  Consulta fatura de um cliente pela data de vencimento."
  [data-vencimento id-conta ]
  (:data (consultar-fatura-using-get1-with-http-info data-vencimento id-conta)))

(defn consultar-lancamentos-futuros-fatura-using-get1-with-http-info
  "Listar planos de parcelamento
  Lista os planos de parcelamento da fatura de uma conta."
  ([id data-vencimento-padrao ] (consultar-lancamentos-futuros-fatura-using-get1-with-http-info id data-vencimento-padrao nil))
  ([id data-vencimento-padrao {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/faturas/planos-parcelamento" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimentoPadrao" data-vencimento-padrao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-lancamentos-futuros-fatura-using-get1
  "Listar planos de parcelamento
  Lista os planos de parcelamento da fatura de uma conta."
  ([id data-vencimento-padrao ] (consultar-lancamentos-futuros-fatura-using-get1 id data-vencimento-padrao nil))
  ([id data-vencimento-padrao optional-params]
   (:data (consultar-lancamentos-futuros-fatura-using-get1-with-http-info id data-vencimento-padrao optional-params))))

(defn enviar-fatura-email-using-post-with-http-info
  "Envia 2ª via de fatura por E-mail
  Envia a segunda via da fatura para o e-mail informado/cadastrado."
  ([id data-vencimento ] (enviar-fatura-email-using-post-with-http-info id data-vencimento nil))
  ([id data-vencimento {:keys [email ]}]
   (call-api "/api/contas/{id}/faturas/{dataVencimento}/enviar-email" :post
             {:path-params   {"id" id "dataVencimento" data-vencimento }
              :header-params {}
              :query-params  {"email" email }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn enviar-fatura-email-using-post
  "Envia 2ª via de fatura por E-mail
  Envia a segunda via da fatura para o e-mail informado/cadastrado."
  ([id data-vencimento ] (enviar-fatura-email-using-post id data-vencimento nil))
  ([id data-vencimento optional-params]
   (:data (enviar-fatura-email-using-post-with-http-info id data-vencimento optional-params))))

(defn listar-faturas-using-get1-with-http-info
  "Listar faturas de um cliente.
  Lista faturas de um cliente."
  ([id-conta ] (listar-faturas-using-get1-with-http-info id-conta nil))
  ([id-conta {:keys [situacao-processamento sort page limit ]}]
   (call-api "/api/faturas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "situacaoProcessamento" situacao-processamento "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-faturas-using-get1
  "Listar faturas de um cliente.
  Lista faturas de um cliente."
  ([id-conta ] (listar-faturas-using-get1 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-faturas-using-get1-with-http-info id-conta optional-params))))

(defn visualizar-documento-using-get-with-http-info
  "Permite visualizar o extrato da fatura em formato PDF
  Esta operação permite visualizar o extrato da fatura de uma determinada conta, em formato PDF. Quando ela for a fatura ativa, ou seja, a do mês corrente, o pdf será composto pelo extrato de lançamentos e pela ficha de compensação bancária. Quando for de uma fatura do histórico do cliente, o PDF será composto apenas pelo extrato de transações."
  [id data-vencimento ]
  (call-api "/api/contas/{id}/faturas/{dataVencimento}/arquivo.pdf" :get
            {:path-params   {"id" id "dataVencimento" data-vencimento }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/pdf"]
             :auth-names    []}))

(defn visualizar-documento-using-get
  "Permite visualizar o extrato da fatura em formato PDF
  Esta operação permite visualizar o extrato da fatura de uma determinada conta, em formato PDF. Quando ela for a fatura ativa, ou seja, a do mês corrente, o pdf será composto pelo extrato de lançamentos e pela ficha de compensação bancária. Quando for de uma fatura do histórico do cliente, o PDF será composto apenas pelo extrato de transações."
  [id data-vencimento ]
  (:data (visualizar-documento-using-get-with-http-info id data-vencimento)))
