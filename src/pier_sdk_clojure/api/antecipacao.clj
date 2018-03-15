(ns pier-sdk-clojure.api.antecipacao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "Configura a Taxa de Antecipação de um Produto
  Este recurso permite configurar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
  [id taxa-antecipacao-request ]
  (call-api "/api/produtos/{id}/configurar-taxa-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxa-antecipacao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn configurar-taxa-antecipacao-using-post
  "Configura a Taxa de Antecipação de um Produto
  Este recurso permite configurar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "Consulta a Taxa de Antecipação de um Produto
  Este recurso permite consultar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
  [id tipo-transacao ]
  (call-api "/api/produtos/{id}/consultar-taxa-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"tipoTransacao" tipo-transacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-taxa-antecipacao-using-get
  "Consulta a Taxa de Antecipação de um Produto
  Este recurso permite consultar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn efetivar-antecipacao-using-post-with-http-info
  "Faz a efetivação da antecipação
  Método responsavel pela efetivação da antecipação, cujo desconto é calculado baseado na data da última parcela em aberto."
  ([id-conta id quantidade-parcelas ] (efetivar-antecipacao-using-post-with-http-info id-conta id quantidade-parcelas nil))
  ([id-conta id quantidade-parcelas {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/{id}/efetivar-antecipacao" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idConta" id-conta "quantidadeParcelas" quantidade-parcelas "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn efetivar-antecipacao-using-post
  "Faz a efetivação da antecipação
  Método responsavel pela efetivação da antecipação, cujo desconto é calculado baseado na data da última parcela em aberto."
  ([id-conta id quantidade-parcelas ] (efetivar-antecipacao-using-post id-conta id quantidade-parcelas nil))
  ([id-conta id quantidade-parcelas optional-params]
   (:data (efetivar-antecipacao-using-post-with-http-info id-conta id quantidade-parcelas optional-params))))

(defn efetivar-antecipacoes-using-post-with-http-info
  "Faz a efetivação da antecipação
  Método responsavel pela efetivação de todas as compras antecipáveis com todas as parcelas de uma conta."
  ([id-conta ] (efetivar-antecipacoes-using-post-with-http-info id-conta nil))
  ([id-conta {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/efetivar-antecipacao" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn efetivar-antecipacoes-using-post
  "Faz a efetivação da antecipação
  Método responsavel pela efetivação de todas as compras antecipáveis com todas as parcelas de uma conta."
  ([id-conta ] (efetivar-antecipacoes-using-post id-conta nil))
  ([id-conta optional-params]
   (:data (efetivar-antecipacoes-using-post-with-http-info id-conta optional-params))))

(defn listar-using-get12-with-http-info
  "Listar compras com parcelas antecipáveis
  Lista as compras antecipáveis de uma conta."
  ([id-conta ] (listar-using-get12-with-http-info id-conta nil))
  ([id-conta {:keys [sort page limit id-compra parcelada juros tipo-origem-transacao ]}]
   (call-api "/api/compras-antecipaveis" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idCompra" id-compra "idConta" id-conta "parcelada" parcelada "juros" juros "tipoOrigemTransacao" tipo-origem-transacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get12
  "Listar compras com parcelas antecipáveis
  Lista as compras antecipáveis de uma conta."
  ([id-conta ] (listar-using-get12 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get12-with-http-info id-conta optional-params))))

(defn simular-antecipacao-using-get-with-http-info
  "Simular antecipação de parcelas
  Simula a antecipação de parcelas de um evento, listando todos os planos de parcelamento disponíveis, cujo desconto é calculado baseado na data da última parcela em aberto."
  ([id-conta id ] (simular-antecipacao-using-get-with-http-info id-conta id nil))
  ([id-conta id {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/{id}/simular-antecipacao" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idConta" id-conta "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn simular-antecipacao-using-get
  "Simular antecipação de parcelas
  Simula a antecipação de parcelas de um evento, listando todos os planos de parcelamento disponíveis, cujo desconto é calculado baseado na data da última parcela em aberto."
  ([id-conta id ] (simular-antecipacao-using-get id-conta id nil))
  ([id-conta id optional-params]
   (:data (simular-antecipacao-using-get-with-http-info id-conta id optional-params))))

(defn simular-antecipacoes-using-get-with-http-info
  "Simular antecipação de todas as parcelas antecipáveis
  O recurso permite realizar a simulação da antecipação de todas as compras antecipáveis de todas as parcelas de uma determinada conta."
  ([id-conta ] (simular-antecipacoes-using-get-with-http-info id-conta nil))
  ([id-conta {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/simular-antecipacao" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn simular-antecipacoes-using-get
  "Simular antecipação de todas as parcelas antecipáveis
  O recurso permite realizar a simulação da antecipação de todas as compras antecipáveis de todas as parcelas de uma determinada conta."
  ([id-conta ] (simular-antecipacoes-using-get id-conta nil))
  ([id-conta optional-params]
   (:data (simular-antecipacoes-using-get-with-http-info id-conta optional-params))))
